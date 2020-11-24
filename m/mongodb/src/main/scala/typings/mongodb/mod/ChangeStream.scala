package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ChangeStream")
@js.native
class ChangeStream[TSchema /* <: StringDictionary[js.Any] */] protected () extends TypedEventEmitter[ChangeStreamEvents[TSchema]] {
  def this(parent: Collection[DefaultSchema], pipeline: js.Array[js.Object]) = this()
  def this(parent: Db, pipeline: js.Array[js.Object]) = this()
  def this(parent: MongoClient, pipeline: js.Array[js.Object]) = this()
  def this(parent: Collection[DefaultSchema], pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  def this(parent: Db, pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  def this(parent: MongoClient, pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#close */
  def close(): js.Promise[_] = js.native
  def close(callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#hasNext */
  def hasNext(): js.Promise[_] = js.native
  def hasNext(callback: MongoCallback[_]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#isClosed */
  def isClosed(): Boolean = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#next */
  def next(): js.Promise[_] = js.native
  def next(callback: MongoCallback[_]): Unit = js.native
  
  var resumeToken: ResumeToken = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#stream */
  def stream(): Cursor[Default] = js.native
  def stream(options: `4`): Cursor[Default] = js.native
}
