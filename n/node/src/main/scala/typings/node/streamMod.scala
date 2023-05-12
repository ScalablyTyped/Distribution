package typings.node

import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.anon.End
import typings.node.anon.PickReadableOptionsencodi
import typings.node.anon.PickWritableOptionsdecode
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.Abortable
import typings.node.nodeColonbufferMod.Blob
import typings.node.nodeStrings.close
import typings.node.nodeStrings.data
import typings.node.nodeStrings.drain
import typings.node.nodeStrings.end
import typings.node.nodeStrings.error
import typings.node.nodeStrings.finish
import typings.node.nodeStrings.pause
import typings.node.nodeStrings.pipe
import typings.node.nodeStrings.readable
import typings.node.nodeStrings.resume
import typings.node.nodeStrings.unpipe
import typings.std.AsyncGeneratorFunction
import typings.std.AsyncIterable
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("stream", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject
  @JSImport("stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Duplex streams are streams that implement both the `Readable` and `Writable` interfaces.
    *
    * Examples of `Duplex` streams include:
    *
    * * `TCP sockets`
    * * `zlib streams`
    * * `crypto streams`
    * @since v0.9.4
    */
  @JSImport("stream", "Duplex")
  @js.native
  open class Duplex () extends StObject {
    def this(opts: DuplexOptions) = this()
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _write(
      chunk: Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1.  close
      * 2.  data
      * 3.  drain
      * 4.  end
      * 5.  error
      * 6.  finish
      * 7.  pause
      * 8.  pipe
      * 9.  readable
      * 10. resume
      * 11. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /**
      * If `false` then the stream will automatically end the writable side when the
      * readable side ends. Set initially by the `allowHalfOpen` constructor option,
      * which defaults to `true`.
      *
      * This can be changed manually to change the half-open behavior of an existing`Duplex` stream instance, but must be changed before the `'end'` event is
      * emitted.
      * @since v0.9.4
      */
    var allowHalfOpen: Boolean = js.native
    
    val closed: Boolean = js.native
    
    def cork(): Unit = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: Any): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): this.type = js.native
    def end(cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any): this.type = js.native
    def end(chunk: Any, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any, encoding: BufferEncoding): this.type = js.native
    def end(chunk: Any, encoding: BufferEncoding, cb: js.Function0[Unit]): this.type = js.native
    
    val errored: js.Error | Null = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    def uncork(): Unit = js.native
    
    val writable: Boolean = js.native
    
    val writableCorked: Double = js.native
    
    val writableEnded: Boolean = js.native
    
    val writableFinished: Boolean = js.native
    
    val writableHighWaterMark: Double = js.native
    
    val writableLength: Double = js.native
    
    val writableNeedDrain: Boolean = js.native
    
    val writableObjectMode: Boolean = js.native
    
    def write(chunk: Any): Boolean = js.native
    def write(chunk: Any, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(chunk: Any, encoding: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(chunk: Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Boolean = js.native
  }
  object Duplex {
    
    @JSImport("stream", "Duplex")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(src: String): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    inline def from(src: js.Iterable[Any]): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    inline def from(src: js.Object): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    inline def from(src: js.Promise[Any]): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    inline def from(src: js.typedarray.ArrayBuffer): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    inline def from(src: Blob): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    /**
      * A utility method for creating duplex streams.
      *
      * - `Stream` converts writable stream into writable `Duplex` and readable stream
      *   to `Duplex`.
      * - `Blob` converts into readable `Duplex`.
      * - `string` converts into readable `Duplex`.
      * - `ArrayBuffer` converts into readable `Duplex`.
      * - `AsyncIterable` converts into a readable `Duplex`. Cannot yield `null`.
      * - `AsyncGeneratorFunction` converts into a readable/writable transform
      *   `Duplex`. Must take a source `AsyncIterable` as first parameter. Cannot yield
      *   `null`.
      * - `AsyncFunction` converts into a writable `Duplex`. Must return
      *   either `null` or `undefined`
      * - `Object ({ writable, readable })` converts `readable` and
      *   `writable` into `Stream` and then combines them into `Duplex` where the
      *   `Duplex` will write to the `writable` and read from the `readable`.
      * - `Promise` converts into readable `Duplex`. Value `null` is ignored.
      *
      * @since v16.8.0
      */
    /* static member */
    inline def from(src: Stream): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    inline def from(src: AsyncGeneratorFunction): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    inline def from(src: AsyncIterable[Any]): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(src.asInstanceOf[js.Any]).asInstanceOf[Duplex]
  }
  
  /**
    * The `stream.PassThrough` class is a trivial implementation of a `Transform` stream that simply passes the input bytes across to the output. Its purpose is
    * primarily for examples and testing, but there are some use cases where`stream.PassThrough` is useful as a building block for novel sorts of streams.
    */
  @JSImport("stream", "PassThrough")
  @js.native
  open class PassThrough () extends StObject {
    def this(opts: TransformOptions) = this()
  }
  
  /**
    * @since v0.9.4
    */
  @JSImport("stream", "Readable")
  @js.native
  open class Readable ()
    extends StObject
       with ReadableStream {
    def this(opts: ReadableOptions) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. data
      * 3. end
      * 4. error
      * 5. pause
      * 6. readable
      * 7. resume
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Is `true` after `'close'` has been emitted.
      * @since v18.0.0
      */
    val closed: Boolean = js.native
    
    /**
      * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the readable
      * stream will release any internal resources and subsequent calls to `push()`will be ignored.
      *
      * Once `destroy()` has been called any further calls will be a no-op and no
      * further errors except from `_destroy()` may be emitted as `'error'`.
      *
      * Implementors should not override this method, but instead implement `readable._destroy()`.
      * @since v8.0.0
      * @param error Error which will be passed as payload in `'error'` event
      */
    def destroy(): this.type = js.native
    def destroy(error: js.Error): this.type = js.native
    
    /**
      * Is `true` after `readable.destroy()` has been called.
      * @since v8.0.0
      */
    var destroyed: Boolean = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    /**
      * Returns error if the stream has been destroyed with an error.
      * @since v18.0.0
      */
    val errored: js.Error | Null = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: Any): Boolean = js.native
    def push(chunk: Any, encoding: BufferEncoding): Boolean = js.native
    
    /**
      * Returns whether the stream was destroyed or errored before emitting `'end'`.
      * @since v16.8.0
      * @experimental
      */
    val readableAborted: Boolean = js.native
    
    /**
      * Returns whether `'data'` has been emitted.
      * @since v16.7.0, v14.18.0
      * @experimental
      */
    val readableDidRead: Boolean = js.native
    
    /**
      * Getter for the property `encoding` of a given `Readable` stream. The `encoding`property can be set using the `readable.setEncoding()` method.
      * @since v12.7.0
      */
    val readableEncoding: BufferEncoding | Null = js.native
    
    /**
      * Becomes `true` when `'end'` event is emitted.
      * @since v12.9.0
      */
    val readableEnded: Boolean = js.native
    
    /**
      * This property reflects the current state of a `Readable` stream as described
      * in the `Three states` section.
      * @since v9.4.0
      */
    val readableFlowing: Boolean | Null = js.native
    
    /**
      * Returns the value of `highWaterMark` passed when creating this `Readable`.
      * @since v9.3.0
      */
    val readableHighWaterMark: Double = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue
      * ready to be read. The value provides introspection data regarding
      * the status of the `highWaterMark`.
      * @since v9.4.0
      */
    val readableLength: Double = js.native
    
    /**
      * Getter for the property `objectMode` of a given `Readable` stream.
      * @since v12.3.0
      */
    val readableObjectMode: Boolean = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Passing `chunk` as `null` signals the end of the stream (EOF) and behaves the
      * same as `readable.push(null)`, after which no more data can be written. The EOF
      * signal is put at the end of the buffer and any buffered data will still be
      * flushed.
      *
      * The `readable.unshift()` method pushes a chunk of data back into the internal
      * buffer. This is useful in certain situations where a stream is being consumed by
      * code that needs to "un-consume" some amount of data that it has optimistically
      * pulled out of the source, so that the data can be passed on to some other party.
      *
      * The `stream.unshift(chunk)` method cannot be called after the `'end'` event
      * has been emitted or a runtime error will be thrown.
      *
      * Developers using `stream.unshift()` often should consider switching to
      * use of a `Transform` stream instead. See the `API for stream implementers` section for more information.
      *
      * ```js
      * // Pull off a header delimited by \n\n.
      * // Use unshift() if we get too much.
      * // Call the callback with (error, header, stream).
      * const { StringDecoder } = require('node:string_decoder');
      * function parseHeader(stream, callback) {
      *   stream.on('error', callback);
      *   stream.on('readable', onReadable);
      *   const decoder = new StringDecoder('utf8');
      *   let header = '';
      *   function onReadable() {
      *     let chunk;
      *     while (null !== (chunk = stream.read())) {
      *       const str = decoder.write(chunk);
      *       if (str.includes('\n\n')) {
      *         // Found the header boundary.
      *         const split = str.split(/\n\n/);
      *         header += split.shift();
      *         const remaining = split.join('\n\n');
      *         const buf = Buffer.from(remaining, 'utf8');
      *         stream.removeListener('error', callback);
      *         // Remove the 'readable' listener before unshifting.
      *         stream.removeListener('readable', onReadable);
      *         if (buf.length)
      *           stream.unshift(buf);
      *         // Now the body of the message can be read from the stream.
      *         callback(null, header, stream);
      *         return;
      *       }
      *       // Still reading the header.
      *       header += str;
      *     }
      *   }
      * }
      * ```
      *
      * Unlike {@link push}, `stream.unshift(chunk)` will not
      * end the reading process by resetting the internal reading state of the stream.
      * This can cause unexpected results if `readable.unshift()` is called during a
      * read (i.e. from within a {@link _read} implementation on a
      * custom stream). Following the call to `readable.unshift()` with an immediate {@link push} will reset the reading state appropriately,
      * however it is best to simply avoid calling `readable.unshift()` while in the
      * process of performing a read.
      * @since v0.9.11
      * @param chunk Chunk of data to unshift onto the read queue. For streams not operating in object mode, `chunk` must be a string, `Buffer`, `Uint8Array`, or `null`. For object mode
      * streams, `chunk` may be any JavaScript value.
      * @param encoding Encoding of string chunks. Must be a valid `Buffer` encoding, such as `'utf8'` or `'ascii'`.
      */
    def unshift(chunk: Any): Unit = js.native
    def unshift(chunk: Any, encoding: BufferEncoding): Unit = js.native
  }
  object Readable {
    
    @JSImport("stream", "Readable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    /* static member */
    inline def from(iterable: js.Iterable[Any]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Readable]
    inline def from(iterable: js.Iterable[Any], options: ReadableOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
    inline def from(iterable: AsyncIterable[Any]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[Readable]
    inline def from(iterable: AsyncIterable[Any], options: ReadableOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
    /**
      * A utility method for creating a `Readable` from a web `ReadableStream`.
      * @since v17.0.0
      * @experimental
      */
    /* static member */
    inline def fromWeb(readableStream: typings.node.streamWebMod.ReadableStream[Any]): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWeb")(readableStream.asInstanceOf[js.Any]).asInstanceOf[Readable]
    inline def fromWeb(readableStream: typings.node.streamWebMod.ReadableStream[Any], options: PickReadableOptionsencodi): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWeb")(readableStream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable]
    
    inline def isDisturbed(stream: ReadableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisturbed")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    /**
      * Returns whether the stream has been read from or cancelled.
      * @since v16.8.0
      */
    /* static member */
    inline def isDisturbed(stream: Readable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisturbed")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * A utility method for creating a web `ReadableStream` from a `Readable`.
      * @since v17.0.0
      * @experimental
      */
    /* static member */
    inline def toWeb(streamReadable: Readable): typings.node.streamWebMod.ReadableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toWeb")(streamReadable.asInstanceOf[js.Any]).asInstanceOf[typings.node.streamWebMod.ReadableStream[Any]]
  }
  
  @JSImport("stream", "Stream")
  @js.native
  open class Stream () extends StObject {
    def this(opts: ReadableOptions) = this()
  }
  
  /**
    * Transform streams are `Duplex` streams where the output is in some way
    * related to the input. Like all `Duplex` streams, `Transform` streams
    * implement both the `Readable` and `Writable` interfaces.
    *
    * Examples of `Transform` streams include:
    *
    * * `zlib streams`
    * * `crypto streams`
    * @since v0.9.4
    */
  @JSImport("stream", "Transform")
  @js.native
  open class Transform () extends StObject {
    def this(opts: TransformOptions) = this()
    
    def _flush(callback: TransformCallback): Unit = js.native
    
    def _transform(chunk: Any, encoding: BufferEncoding, callback: TransformCallback): Unit = js.native
  }
  
  /**
    * @since v0.9.4
    */
  @JSImport("stream", "Writable")
  @js.native
  open class Writable ()
    extends StObject
       with WritableStream {
    def this(opts: WritableOptions) = this()
    
    var _construct: js.UndefOr[
        js.Function1[/* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], Unit]
      ] = js.native
    
    def _destroy(error: js.Error, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _write(
      chunk: Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. drain
      * 3. error
      * 4. finish
      * 5. pipe
      * 6. unpipe
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /**
      * Is `true` after `'close'` has been emitted.
      * @since v18.0.0
      */
    val closed: Boolean = js.native
    
    /**
      * The `writable.cork()` method forces all written data to be buffered in memory.
      * The buffered data will be flushed when either the {@link uncork} or {@link end} methods are called.
      *
      * The primary intent of `writable.cork()` is to accommodate a situation in which
      * several small chunks are written to the stream in rapid succession. Instead of
      * immediately forwarding them to the underlying destination, `writable.cork()`buffers all the chunks until `writable.uncork()` is called, which will pass them
      * all to `writable._writev()`, if present. This prevents a head-of-line blocking
      * situation where data is being buffered while waiting for the first small chunk
      * to be processed. However, use of `writable.cork()` without implementing`writable._writev()` may have an adverse effect on throughput.
      *
      * See also: `writable.uncork()`, `writable._writev()`.
      * @since v0.11.2
      */
    def cork(): Unit = js.native
    
    /**
      * Destroy the stream. Optionally emit an `'error'` event, and emit a `'close'`event (unless `emitClose` is set to `false`). After this call, the writable
      * stream has ended and subsequent calls to `write()` or `end()` will result in
      * an `ERR_STREAM_DESTROYED` error.
      * This is a destructive and immediate way to destroy a stream. Previous calls to`write()` may not have drained, and may trigger an `ERR_STREAM_DESTROYED` error.
      * Use `end()` instead of destroy if data should flush before close, or wait for
      * the `'drain'` event before destroying the stream.
      *
      * Once `destroy()` has been called any further calls will be a no-op and no
      * further errors except from `_destroy()` may be emitted as `'error'`.
      *
      * Implementors should not override this method,
      * but instead implement `writable._destroy()`.
      * @since v8.0.0
      * @param error Optional, an error to emit with `'error'` event.
      */
    def destroy(): this.type = js.native
    def destroy(error: js.Error): this.type = js.native
    
    /**
      * Is `true` after `writable.destroy()` has been called.
      * @since v8.0.0
      */
    var destroyed: Boolean = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(chunk: Any): this.type = js.native
    def end(chunk: Any, cb: js.Function0[Unit]): this.type = js.native
    def end(chunk: Any, encoding: BufferEncoding): this.type = js.native
    def end(chunk: Any, encoding: BufferEncoding, cb: js.Function0[Unit]): this.type = js.native
    
    /**
      * Returns error if the stream has been destroyed with an error.
      * @since v18.0.0
      */
    val errored: js.Error | Null = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /**
      * The `writable.setDefaultEncoding()` method sets the default `encoding` for a `Writable` stream.
      * @since v0.11.15
      * @param encoding The new default encoding
      */
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    /**
      * The `writable.uncork()` method flushes all data buffered since {@link cork} was called.
      *
      * When using `writable.cork()` and `writable.uncork()` to manage the buffering
      * of writes to a stream, defer calls to `writable.uncork()` using`process.nextTick()`. Doing so allows batching of all`writable.write()` calls that occur within a given Node.js event
      * loop phase.
      *
      * ```js
      * stream.cork();
      * stream.write('some ');
      * stream.write('data ');
      * process.nextTick(() => stream.uncork());
      * ```
      *
      * If the `writable.cork()` method is called multiple times on a stream, the
      * same number of calls to `writable.uncork()` must be called to flush the buffered
      * data.
      *
      * ```js
      * stream.cork();
      * stream.write('some ');
      * stream.cork();
      * stream.write('data ');
      * process.nextTick(() => {
      *   stream.uncork();
      *   // The data will not be flushed until uncork() is called a second time.
      *   stream.uncork();
      * });
      * ```
      *
      * See also: `writable.cork()`.
      * @since v0.11.2
      */
    def uncork(): Unit = js.native
    
    /**
      * Number of times `writable.uncork()` needs to be
      * called in order to fully uncork the stream.
      * @since v13.2.0, v12.16.0
      */
    val writableCorked: Double = js.native
    
    /**
      * Is `true` after `writable.end()` has been called. This property
      * does not indicate whether the data has been flushed, for this use `writable.writableFinished` instead.
      * @since v12.9.0
      */
    val writableEnded: Boolean = js.native
    
    /**
      * Is set to `true` immediately before the `'finish'` event is emitted.
      * @since v12.6.0
      */
    val writableFinished: Boolean = js.native
    
    /**
      * Return the value of `highWaterMark` passed when creating this `Writable`.
      * @since v9.3.0
      */
    val writableHighWaterMark: Double = js.native
    
    /**
      * This property contains the number of bytes (or objects) in the queue
      * ready to be written. The value provides introspection data regarding
      * the status of the `highWaterMark`.
      * @since v9.4.0
      */
    val writableLength: Double = js.native
    
    /**
      * Is `true` if the stream's buffer has been full and stream will emit `'drain'`.
      * @since v15.2.0, v14.17.0
      */
    val writableNeedDrain: Boolean = js.native
    
    /**
      * Getter for the property `objectMode` of a given `Writable` stream.
      * @since v12.3.0
      */
    val writableObjectMode: Boolean = js.native
    
    /**
      * The `writable.write()` method writes some data to the stream, and calls the
      * supplied `callback` once the data has been fully handled. If an error
      * occurs, the `callback` will be called with the error as its
      * first argument. The `callback` is called asynchronously and before `'error'` is
      * emitted.
      *
      * The return value is `true` if the internal buffer is less than the`highWaterMark` configured when the stream was created after admitting `chunk`.
      * If `false` is returned, further attempts to write data to the stream should
      * stop until the `'drain'` event is emitted.
      *
      * While a stream is not draining, calls to `write()` will buffer `chunk`, and
      * return false. Once all currently buffered chunks are drained (accepted for
      * delivery by the operating system), the `'drain'` event will be emitted.
      * Once `write()` returns false, do not write more chunks
      * until the `'drain'` event is emitted. While calling `write()` on a stream that
      * is not draining is allowed, Node.js will buffer all written chunks until
      * maximum memory usage occurs, at which point it will abort unconditionally.
      * Even before it aborts, high memory usage will cause poor garbage collector
      * performance and high RSS (which is not typically released back to the system,
      * even after the memory is no longer required). Since TCP sockets may never
      * drain if the remote peer does not read the data, writing a socket that is
      * not draining may lead to a remotely exploitable vulnerability.
      *
      * Writing data while the stream is not draining is particularly
      * problematic for a `Transform`, because the `Transform` streams are paused
      * by default until they are piped or a `'data'` or `'readable'` event handler
      * is added.
      *
      * If the data to be written can be generated or fetched on demand, it is
      * recommended to encapsulate the logic into a `Readable` and use {@link pipe}. However, if calling `write()` is preferred, it is
      * possible to respect backpressure and avoid memory issues using the `'drain'` event:
      *
      * ```js
      * function write(data, cb) {
      *   if (!stream.write(data)) {
      *     stream.once('drain', cb);
      *   } else {
      *     process.nextTick(cb);
      *   }
      * }
      *
      * // Wait for cb to be called before doing any other write.
      * write('hello', () => {
      *   console.log('Write completed, do more writes now.');
      * });
      * ```
      *
      * A `Writable` stream in object mode will always ignore the `encoding` argument.
      * @since v0.9.4
      * @param chunk Optional data to write. For streams not operating in object mode, `chunk` must be a string, `Buffer` or `Uint8Array`. For object mode streams, `chunk` may be any
      * JavaScript value other than `null`.
      * @param [encoding='utf8'] The encoding, if `chunk` is a string.
      * @param callback Callback for when this chunk of data is flushed.
      * @return `false` if the stream wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
      */
    def write(chunk: Any): Boolean = js.native
    def write(chunk: Any, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
    def write(chunk: Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
    ): Boolean = js.native
  }
  object Writable {
    
    @JSImport("stream", "Writable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A utility method for creating a `Writable` from a web `WritableStream`.
      * @since v17.0.0
      * @experimental
      */
    /* static member */
    inline def fromWeb(writableStream: typings.node.streamWebMod.WritableStream[Any]): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWeb")(writableStream.asInstanceOf[js.Any]).asInstanceOf[Writable]
    inline def fromWeb(writableStream: typings.node.streamWebMod.WritableStream[Any], options: PickWritableOptionsdecode): Writable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWeb")(writableStream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Writable]
    
    /**
      * A utility method for creating a web `WritableStream` from a `Writable`.
      * @since v17.0.0
      * @experimental
      */
    /* static member */
    inline def toWeb(streamWritable: Writable): typings.node.streamWebMod.WritableStream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toWeb")(streamWritable.asInstanceOf[js.Any]).asInstanceOf[typings.node.streamWebMod.WritableStream[Any]]
  }
  
  /**
    * A stream to attach a signal to.
    *
    * Attaches an AbortSignal to a readable or writeable stream. This lets code
    * control stream destruction using an `AbortController`.
    *
    * Calling `abort` on the `AbortController` corresponding to the passed`AbortSignal` will behave the same way as calling `.destroy(new AbortError())`on the stream, and `controller.error(new
    * AbortError())` for webstreams.
    *
    * ```js
    * const fs = require('node:fs');
    *
    * const controller = new AbortController();
    * const read = addAbortSignal(
    *   controller.signal,
    *   fs.createReadStream(('object.json')),
    * );
    * // Later, abort the operation closing the stream
    * controller.abort();
    * ```
    *
    * Or using an `AbortSignal` with a readable stream as an async iterable:
    *
    * ```js
    * const controller = new AbortController();
    * setTimeout(() => controller.abort(), 10_000); // set a timeout
    * const stream = addAbortSignal(
    *   controller.signal,
    *   fs.createReadStream(('object.json')),
    * );
    * (async () => {
    *   try {
    *     for await (const chunk of stream) {
    *       await process(chunk);
    *     }
    *   } catch (e) {
    *     if (e.name === 'AbortError') {
    *       // The operation was cancelled
    *     } else {
    *       throw e;
    *     }
    *   }
    * })();
    * ```
    *
    * Or using an `AbortSignal` with a ReadableStream:
    *
    * ```js
    * const controller = new AbortController();
    * const rs = new ReadableStream({
    *   start(controller) {
    *     controller.enqueue('hello');
    *     controller.enqueue('world');
    *     controller.close();
    *   },
    * });
    *
    * addAbortSignal(controller.signal, rs);
    *
    * finished(rs, (err) => {
    *   if (err) {
    *     if (err.name === 'AbortError') {
    *       // The operation was cancelled
    *     }
    *   }
    * });
    *
    * const reader = rs.getReader();
    *
    * reader.read().then(({ value, done }) => {
    *   console.log(value); // hello
    *   console.log(done); // false
    *   controller.abort();
    * });
    * ```
    * @since v15.4.0
    * @param signal A signal representing possible cancellation
    * @param stream a stream to attach a signal to
    */
  inline def addAbortSignal[T /* <: Stream */](signal: AbortSignal, stream: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addAbortSignal")(signal.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[T]
  
  object consumers {
    
    @JSImport("stream", "consumers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def arrayBuffer(stream: ReadableStream): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    inline def arrayBuffer(stream: typings.node.nodeColonstreamMod.Readable): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    inline def arrayBuffer(stream: AsyncIterator[Any, Any, Unit]): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
    
    inline def blob(stream: ReadableStream): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
    inline def blob(stream: typings.node.nodeColonstreamMod.Readable): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
    inline def blob(stream: AsyncIterator[Any, Any, Unit]): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
    
    inline def buffer(stream: ReadableStream): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def buffer(stream: typings.node.nodeColonstreamMod.Readable): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    inline def buffer(stream: AsyncIterator[Any, Any, Unit]): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
    
    inline def json(stream: ReadableStream): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def json(stream: typings.node.nodeColonstreamMod.Readable): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def json(stream: AsyncIterator[Any, Any, Unit]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def text(stream: ReadableStream): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def text(stream: typings.node.nodeColonstreamMod.Readable): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def text(stream: AsyncIterator[Any, Any, Unit]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  inline def finished(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def finished(
    stream: ReadWriteStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def finished(stream: ReadableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  /**
    * A readable and/or writable stream/webstream.
    *
    * A function to get notified when a stream is no longer readable, writable
    * or has experienced an error or a premature close event.
    *
    * ```js
    * const { finished } = require('node:stream');
    * const fs = require('node:fs');
    *
    * const rs = fs.createReadStream('archive.tar');
    *
    * finished(rs, (err) => {
    *   if (err) {
    *     console.error('Stream failed.', err);
    *   } else {
    *     console.log('Stream is done reading.');
    *   }
    * });
    *
    * rs.resume(); // Drain the stream.
    * ```
    *
    * Especially useful in error handling scenarios where a stream is destroyed
    * prematurely (like an aborted HTTP request), and will not emit `'end'`or `'finish'`.
    *
    * The `finished` API provides `promise version`.
    *
    * `stream.finished()` leaves dangling event listeners (in particular`'error'`, `'end'`, `'finish'` and `'close'`) after `callback` has been
    * invoked. The reason for this is so that unexpected `'error'` events (due to
    * incorrect stream implementations) do not cause unexpected crashes.
    * If this is unwanted behavior then the returned cleanup function needs to be
    * invoked in the callback:
    *
    * ```js
    * const cleanup = finished(rs, (err) => {
    *   cleanup();
    *   // ...
    * });
    * ```
    * @since v10.0.0
    * @param stream A readable and/or writable stream.
    * @param callback A callback function that takes an optional error argument.
    * @return A cleanup function which removes all registered listeners.
    */
  inline def finished(
    stream: ReadableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def finished(stream: WritableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def finished(
    stream: WritableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  /**
    * Returns the default highWaterMark used by streams.
    * Defaults to `16384` (16 KiB), or `16` for `objectMode`.
    * @since v19.9.0
    * @param objectMode
    */
  inline def getDefaultHighWaterMark(objectMode: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultHighWaterMark")(objectMode.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isErrored(stream: ReadableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrored")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isErrored(stream: WritableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrored")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  /**
    * Returns whether the stream has encountered an error.
    * @since v17.3.0, v16.14.0
    * @experimental
    */
  inline def isErrored(stream: Readable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrored")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isErrored(stream: Writable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrored")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isReadable(stream: ReadableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  /**
    * Returns whether the stream is readable.
    * @since v17.4.0, v16.14.0
    * @experimental
    */
  inline def isReadable(stream: Readable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pipeline(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[WritableStream]
  inline def pipeline(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[WritableStream]
  inline def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  inline def pipeline(
    streams: js.Array[ReadableStream | WritableStream | ReadWriteStream],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): WritableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[WritableStream]
  /**
    * A module method to pipe between streams and generators forwarding errors and
    * properly cleaning up and provide a callback when the pipeline is complete.
    *
    * ```js
    * const { pipeline } = require('node:stream');
    * const fs = require('node:fs');
    * const zlib = require('node:zlib');
    *
    * // Use the pipeline API to easily pipe a series of streams
    * // together and get notified when the pipeline is fully done.
    *
    * // A pipeline to gzip a potentially huge tar file efficiently:
    *
    * pipeline(
    *   fs.createReadStream('archive.tar'),
    *   zlib.createGzip(),
    *   fs.createWriteStream('archive.tar.gz'),
    *   (err) => {
    *     if (err) {
    *       console.error('Pipeline failed.', err);
    *     } else {
    *       console.log('Pipeline succeeded.');
    *     }
    *   },
    * );
    * ```
    *
    * The `pipeline` API provides a `promise version`.
    *
    * `stream.pipeline()` will call `stream.destroy(err)` on all streams except:
    *
    * * `Readable` streams which have emitted `'end'` or `'close'`.
    * * `Writable` streams which have emitted `'finish'` or `'close'`.
    *
    * `stream.pipeline()` leaves dangling event listeners on the streams
    * after the `callback` has been invoked. In the case of reuse of streams after
    * failure, this can cause event listener leaks and swallowed errors. If the last
    * stream is readable, dangling event listeners will be removed so that the last
    * stream can be consumed later.
    *
    * `stream.pipeline()` closes all the streams when an error is raised.
    * The `IncomingRequest` usage with `pipeline` could lead to an unexpected behavior
    * once it would destroy the socket without sending the expected response.
    * See the example below:
    *
    * ```js
    * const fs = require('node:fs');
    * const http = require('node:http');
    * const { pipeline } = require('node:stream');
    *
    * const server = http.createServer((req, res) => {
    *   const fileStream = fs.createReadStream('./fileNotExist.txt');
    *   pipeline(fileStream, res, (err) => {
    *     if (err) {
    *       console.log(err); // No such file
    *       // this message can't be sent once `pipeline` already destroyed the socket
    *       return res.end('error!!!');
    *     }
    *   });
    * });
    * ```
    * @since v10.0.0
    * @param callback Called when the pipeline is fully done.
    */
  inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B, callback: PipelineCallback[B]): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B, callback: PipelineCallback[B]): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B, callback: PipelineCallback[B]): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    destination: B,
    callback: PipelineCallback[B]
  ): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, transform4: T4, destination: B): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](
    source: A,
    transform1: T1,
    transform2: T2,
    transform3: T3,
    transform4: T4,
    destination: B,
    callback: PipelineCallback[B]
  ): /* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: B extends node.NodeJS.WritableStream ? B : node.NodeJS.WritableStream */ js.Any]
  
  object promises {
    
    @JSImport("stream", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    inline def finished(stream: ReadWriteStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: ReadWriteStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: ReadableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: ReadableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: WritableStream): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def finished(stream: WritableStream, options: FinishedOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("finished")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def pipeline(
      stream1: ReadableStream,
      stream2: ReadWriteStream,
      streams: (ReadWriteStream | WritableStream | PipelineOptions)*
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
    inline def pipeline(
      stream1: ReadableStream,
      stream2: WritableStream,
      streams: (ReadWriteStream | WritableStream | PipelineOptions)*
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")((scala.List(stream1.asInstanceOf[js.Any], stream2.asInstanceOf[js.Any])).`++`(streams.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
    inline def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream], options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, B /* <: PipelineDestination[A, Any] */](source: A, destination: B, options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, B /* <: PipelineDestination[T1, Any] */](source: A, transform1: T1, destination: B, options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, B /* <: PipelineDestination[T2, Any] */](source: A, transform1: T1, transform2: T2, destination: B, options: PipelineOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, B /* <: PipelineDestination[T3, Any] */](
      source: A,
      transform1: T1,
      transform2: T2,
      transform3: T3,
      destination: B,
      options: PipelineOptions
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](source: A, transform1: T1, transform2: T2, transform3: T3, transform4: T4, destination: B): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def pipeline[A /* <: PipelineSource[Any] */, T1 /* <: PipelineTransform[A, Any] */, T2 /* <: PipelineTransform[T1, Any] */, T3 /* <: PipelineTransform[T2, Any] */, T4 /* <: PipelineTransform[T3, Any] */, B /* <: PipelineDestination[T4, Any] */](
      source: A,
      transform1: T1,
      transform2: T2,
      transform3: T3,
      transform4: T4,
      destination: B,
      options: PipelineOptions
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(source.asInstanceOf[js.Any], transform1.asInstanceOf[js.Any], transform2.asInstanceOf[js.Any], transform3.asInstanceOf[js.Any], transform4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * Sets the default highWaterMark used by streams.
    * @since v19.9.0
    * @param objectMode
    * @param value highWaterMark value
    */
  inline def setDefaultHighWaterMark(objectMode: Boolean, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultHighWaterMark")(objectMode.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.eventsMod.Abortable because Already inherited
  - typings.node.streamMod.StreamOptions because Already inherited
  - typings.node.streamMod.WritableOptions because var conflicts: autoDestroy, construct, destroy, emitClose, highWaterMark, objectMode, signal. Inlined decodeStrings, defaultEncoding, write, writev, `final` */ trait DuplexOptions
    extends StObject
       with ReadableOptions {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    @JSName("construct")
    var construct_DuplexOptions: js.UndefOr[
        js.ThisFunction1[
          /* this */ Duplex, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
    
    @JSName("destroy")
    var destroy_DuplexOptions: js.UndefOr[
        js.ThisFunction2[
          /* this */ Duplex, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var `final`: js.UndefOr[
        js.ThisFunction1[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    @JSName("read")
    var read_DuplexOptions: js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]] = js.undefined
    
    var readableHighWaterMark: js.UndefOr[Double] = js.undefined
    
    var readableObjectMode: js.UndefOr[Boolean] = js.undefined
    
    var writableCorked: js.UndefOr[Double] = js.undefined
    
    var writableHighWaterMark: js.UndefOr[Double] = js.undefined
    
    var writableObjectMode: js.UndefOr[Boolean] = js.undefined
    
    var write: js.UndefOr[
        js.ThisFunction3[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var writev: js.UndefOr[
        js.ThisFunction2[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object DuplexOptions {
    
    inline def apply(): DuplexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplexOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DuplexOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setConstruct(
        value: js.ThisFunction1[
              /* this */ Duplex, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
      
      inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      inline def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setDestroy(
        value: js.ThisFunction2[
              /* this */ Duplex, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setFinal(
        value: js.ThisFunction1[
              (/* this */ Duplex) | (/* this */ Writable), 
              /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      inline def setRead(value: js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      inline def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
      
      inline def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      inline def setWritableCorked(value: Double): Self = StObject.set(x, "writableCorked", value.asInstanceOf[js.Any])
      
      inline def setWritableCorkedUndefined: Self = StObject.set(x, "writableCorked", js.undefined)
      
      inline def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
      
      inline def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
      
      inline def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
      
      inline def setWrite(
        value: js.ThisFunction3[
              (/* this */ Duplex) | (/* this */ Writable), 
              /* chunk */ Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      inline def setWritev(
        value: js.ThisFunction2[
              (/* this */ Duplex) | (/* this */ Writable), 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      inline def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  trait FinishedOptions
    extends StObject
       with Abortable {
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object FinishedOptions {
    
    inline def apply(): FinishedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FinishedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FinishedOptions] (val x: Self) extends AnyVal {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  trait Pipe extends StObject {
    
    def close(): Unit
    
    def hasRef(): Boolean
    
    def ref(): Unit
    
    def unref(): Unit
  }
  object Pipe {
    
    inline def apply(close: () => Unit, hasRef: () => Boolean, ref: () => Unit, unref: () => Unit): Pipe = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Pipe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pipe] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setHasRef(value: () => Boolean): Self = StObject.set(x, "hasRef", js.Any.fromFunction0(value))
      
      inline def setRef(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      inline def setUnref(value: () => Unit): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends node.stream.PipelineDestinationPromiseFunction<any, infer P> ? (err : node.NodeJS.ErrnoException | null, value : P): void : (err : node.NodeJS.ErrnoException | null): void
    }}}
    */
  type PipelineCallback[S /* <: PipelineDestination[Any, Any] */] = js.Function1[/* err */ ErrnoException | Null, Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends node.stream.PipelineTransformSource<infer ST> ? node.NodeJS.WritableStream | node.stream.PipelineDestinationIterableFunction<ST> | node.stream.PipelineDestinationPromiseFunction<ST, P> : never
    }}}
    */
  @js.native
  trait PipelineDestination[S /* <: PipelineTransformSource[Any] */, P] extends StObject
  
  type PipelineDestinationIterableFunction[T] = js.Function1[/* source */ AsyncIterable[T], AsyncIterable[Any]]
  
  type PipelineDestinationPromiseFunction[T, P] = js.Function1[/* source */ AsyncIterable[T], js.Promise[P]]
  
  trait PipelineOptions extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object PipelineOptions {
    
    inline def apply(): PipelineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PipelineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PipelineOptions] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends node.stream.PipelineDestinationPromiseFunction<any, infer P> ? std.Promise<P> : std.Promise<void>
    }}}
    */
  type PipelinePromise[S /* <: PipelineDestination[Any, Any] */] = js.Promise[Unit]
  
  type PipelineSource[T] = js.Iterable[T] | AsyncIterable[T] | ReadableStream | PipelineSourceFunction[T]
  
  type PipelineSourceFunction[T] = js.Function0[js.Iterable[T] | AsyncIterable[T]]
  
  type PipelineTransform[S /* <: PipelineTransformSource[Any] */, U] = ReadWriteStream | (js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: S extends (args : ...any): std.Iterable<infer ST> | std.AsyncIterable<infer ST> ? std.AsyncIterable<ST> : S */ /* source */ js.Any, 
    AsyncIterable[U]
  ])
  
  type PipelineTransformSource[T] = PipelineSource[T] | (PipelineTransform[Any, T])
  
  trait ReadableOptions
    extends StObject
       with StreamOptions[Readable] {
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.undefined
  }
  object ReadableOptions {
    
    inline def apply(): ReadableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadableOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setRead(value: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
  
  trait StreamOptions[T /* <: Stream */]
    extends StObject
       with Abortable {
    
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    var construct: js.UndefOr[
        js.ThisFunction1[
          /* this */ T, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ T, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var emitClose: js.UndefOr[Boolean] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object StreamOptions {
    
    inline def apply[T /* <: Stream */](): StreamOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamOptions[?], T /* <: Stream */] (val x: Self & StreamOptions[T]) extends AnyVal {
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      inline def setConstruct(
        value: js.ThisFunction1[
              /* this */ T, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
      
      inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      inline def setDestroy(
        value: js.ThisFunction2[
              /* this */ T, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      inline def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  type TransformCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Any], Unit]
  
  trait TransformOptions
    extends StObject
       with DuplexOptions {
    
    @JSName("construct")
    var construct_TransformOptions: js.UndefOr[
        js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    @JSName("destroy")
    var destroy_TransformOptions: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    @JSName("final")
    var final_TransformOptions: js.UndefOr[
        js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var flush: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]] = js.undefined
    
    @JSName("read")
    var read_TransformOptions: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]] = js.undefined
    
    var transform: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ TransformCallback, 
          Unit
        ]
      ] = js.undefined
    
    @JSName("write")
    var write_TransformOptions: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    @JSName("writev")
    var writev_TransformOptions: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object TransformOptions {
    
    inline def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      inline def setConstruct(
        value: js.ThisFunction1[
              /* this */ Transform, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
      
      inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      inline def setDestroy(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setFinal(
        value: js.ThisFunction1[
              /* this */ Transform, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      inline def setFlush(value: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setRead(value: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setTransform(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ TransformCallback, 
              Unit
            ]
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setWrite(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      inline def setWritev(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      inline def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  trait WritableOptions
    extends StObject
       with StreamOptions[Writable] {
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var `final`: js.UndefOr[
        js.ThisFunction1[
          /* this */ Writable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var write: js.UndefOr[
        js.ThisFunction3[
          /* this */ Writable, 
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var writev: js.UndefOr[
        js.ThisFunction2[
          /* this */ Writable, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object WritableOptions {
    
    inline def apply(): WritableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WritableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WritableOptions] (val x: Self) extends AnyVal {
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      inline def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setFinal(
        value: js.ThisFunction1[
              /* this */ Writable, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      inline def setWrite(
        value: js.ThisFunction3[
              /* this */ Writable, 
              /* chunk */ Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      inline def setWritev(
        value: js.ThisFunction2[
              /* this */ Writable, 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      inline def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  @js.native
  trait internal extends StObject {
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
}
