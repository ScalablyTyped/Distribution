package typings.mongoose.mod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * section querycursor.js
  * https://mongoosejs.com/docs/api.html#querycursor-js
  *
  * Callback signatures are from: https://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#close
  * QueryCursor can only be accessed by query#cursor(), we only
  *   expose its interface to enable type-checking.
  */
@js.native
trait QueryCursor[T /* <: Document */] extends Readable {
  
  /** Marks this cursor as closed. Will stop streaming and subsequent calls to next() will error. */
  def close(): js.Promise[_] = js.native
  def close(callback: js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]): js.Promise[_] = js.native
  
  /**
    * Execute fn for every document in the cursor. If fn returns a promise,
    * will wait for the promise to resolve before iterating on to the next one.
    * Returns a promise that resolves when done.
    * @param fn Function to be executed for every document in the cursor
    * @param callback Executed when all docs have been processed
    */
  def eachAsync(fn: js.Function1[/* doc */ T, _]): js.Promise[T] = js.native
  def eachAsync(fn: js.Function1[/* doc */ T, _], callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[T] = js.native
  /**
    * Execute fn for every document in the cursor. If fn returns a promise,
    * will wait for the promise to resolve before iterating on to the next one.
    * Returns a promise that resolves when done.
    * @param fn Function to be executed for every document in the cursor
    * @param options Async options (e. g. parallel function execution)
    * @param callback Executed when all docs have been processed
    */
  def eachAsync(fn: js.Function1[/* doc */ T, _], options: EachAsyncOptions): js.Promise[T] = js.native
  def eachAsync(
    fn: js.Function1[/* doc */ T, _],
    options: EachAsyncOptions,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): js.Promise[T] = js.native
  
  /**
    * Registers a transform function which subsequently maps documents retrieved
    * via the streams interface or .next()
    */
  def map(fn: js.Function1[/* doc */ T, T]): this.type = js.native
  
  /**
    * Get the next document from this cursor. Will return null when there are
    * no documents left.
    */
  def next(): js.Promise[_] = js.native
  def next(callback: js.Function2[/* err */ js.Any, /* doc */ js.UndefOr[T], Unit]): js.Promise[_] = js.native
}
