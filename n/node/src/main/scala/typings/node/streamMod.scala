package typings.node

import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Chunk
import typings.node.anon.End
import typings.node.childProcessMod.StdioNull
import typings.node.eventsMod.EventEmitter
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
import typings.std.AsyncIterable
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("stream", JSImport.Namespace)
  @js.native
  class ^ () extends internal
  
  // Note: Duplex extends both Readable and Writable.
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
  - typings.node.eventsMod.EventEmitter because Already inherited
  - typings.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
  - typings.node.childProcessMod.StdioNull because Already inherited
  - typings.node.streamMod.internal because Already inherited
  - typings.node.NodeJS.WritableStream because var conflicts: writable. Inlined 
  - typings.node.streamMod.Stream because Already inherited
  - typings.node.streamMod.Writable because Inheritance from two classes. Inlined writable, writableEnded, writableFinished, writableHighWaterMark, writableLength, writableObjectMode, writableCorked, _write, _writev, _destroy, _destroy, _final, write, write, write, write, setDefaultEncoding, end, end, end, end, end, end, cork, uncork, destroy, destroy, addListener_close, addListener_drain, addListener_error, addListener_finish, addListener_pipe, addListener_unpipe, addListener, addListener, emit_close, emit_drain, emit_error, emit_finish, emit_pipe, emit_unpipe, emit, emit, on_close, on_drain, on_error, on_finish, on_pipe, on_unpipe, on, on, once_close, once_drain, once_error, once_finish, once_pipe, once_unpipe, once, once, prependListener_close, prependListener_drain, prependListener_error, prependListener_finish, prependListener_pipe, prependListener_unpipe, prependListener, prependListener, prependOnceListener_close, prependOnceListener_drain, prependOnceListener_error, prependOnceListener_finish, prependOnceListener_pipe, prependOnceListener_unpipe, prependOnceListener, prependOnceListener, removeListener_close, removeListener_drain, removeListener_error, removeListener_finish, removeListener_pipe, removeListener_unpipe, removeListener, removeListener */ @JSImport("stream", "Duplex")
  @js.native
  class Duplex () extends Readable {
    def this(opts: DuplexOptions) = this()
    
    def _final(callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _write(chunk: js.Any, encoding: BufferEncoding, callback: js.Function1[js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    @JSName("addListener")
    def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def cork(): Unit = js.native
    
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
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
    
    val writableObjectMode: Boolean = js.native
    
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: js.UndefOr[scala.Nothing],
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding, cb: js.Function1[js.UndefOr[Error | Null], Unit]): Boolean = js.native
  }
  
  @JSImport("stream", "PassThrough")
  @js.native
  class PassThrough () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("stream", "Readable")
  @js.native
  class Readable ()
    extends Stream
       with ReadableStream {
    def this(opts: ReadableOptions) = this()
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
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
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
  }
  object Readable {
    
    @JSImport("stream", "Readable.from")
    @js.native
    def from(iterable: AsyncIterable[_]): Readable = js.native
    @JSImport("stream", "Readable.from")
    @js.native
    def from(iterable: AsyncIterable[_], options: ReadableOptions): Readable = js.native
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    /* static member */
    @JSImport("stream", "Readable.from")
    @js.native
    def from(iterable: Iterable[_]): Readable = js.native
    @JSImport("stream", "Readable.from")
    @js.native
    def from(iterable: Iterable[_], options: ReadableOptions): Readable = js.native
  }
  
  @JSImport("stream", "Stream")
  @js.native
  class Stream ()
    extends internal
       with StdioNull {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("stream", "Transform")
  @js.native
  class Transform () extends Duplex {
    def this(opts: TransformOptions) = this()
    
    def _flush(callback: TransformCallback): Unit = js.native
    
    def _transform(chunk: js.Any, encoding: BufferEncoding, callback: TransformCallback): Unit = js.native
  }
  
  @JSImport("stream", "Writable")
  @js.native
  class Writable ()
    extends Stream
       with WritableStream {
    def this(opts: WritableOptions) = this()
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _write(
      chunk: js.Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Unit = js.native
    
    var _writev: js.UndefOr[
        js.Function2[
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
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
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def cork(): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_drain(event: drain): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_finish(event: finish): Boolean = js.native
    @JSName("emit")
    def emit_pipe(event: pipe, src: Readable): Boolean = js.native
    @JSName("emit")
    def emit_unpipe(event: unpipe, src: Readable): Boolean = js.native
    
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def end(chunk: js.Any, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def setDefaultEncoding(encoding: BufferEncoding): this.type = js.native
    
    def uncork(): Unit = js.native
    
    val writableCorked: Double = js.native
    
    val writableEnded: Boolean = js.native
    
    val writableFinished: Boolean = js.native
    
    val writableHighWaterMark: Double = js.native
    
    val writableLength: Double = js.native
    
    val writableObjectMode: Boolean = js.native
    
    def write(chunk: js.Any): Boolean = js.native
    def write(chunk: js.Any, cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
    def write(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    def write(
      chunk: js.Any,
      encoding: BufferEncoding,
      cb: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
    ): Boolean = js.native
  }
  
  @JSImport("stream", "finished")
  @js.native
  def finished(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  @JSImport("stream", "finished")
  @js.native
  def finished(
    stream: ReadWriteStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = js.native
  @JSImport("stream", "finished")
  @js.native
  def finished(stream: ReadableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  @JSImport("stream", "finished")
  @js.native
  def finished(
    stream: ReadableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = js.native
  @JSImport("stream", "finished")
  @js.native
  def finished(stream: WritableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  @JSImport("stream", "finished")
  @js.native
  def finished(
    stream: WritableStream,
    options: FinishedOptions,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]
  ): js.Function0[Unit] = js.native
  
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): WritableStream = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline(
    streams: js.Array[ReadableStream | WritableStream | ReadWriteStream],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): WritableStream = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: T): T = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: T, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): T = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: T): T = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: ReadWriteStream, stream4: T): T = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T
  ): T = js.native
  @JSImport("stream", "pipeline")
  @js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.node.streamMod.WritableOptions because var conflicts: autoDestroy, destroy, highWaterMark, objectMode. Inlined decodeStrings, defaultEncoding, emitClose, write, writev, `final` */ @js.native
  trait DuplexOptions extends ReadableOptions {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.native
    
    var decodeStrings: js.UndefOr[Boolean] = js.native
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
    
    @JSName("destroy")
    var destroy_DuplexOptions: js.UndefOr[
        js.ThisFunction2[
          /* this */ Duplex, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    var emitClose: js.UndefOr[Boolean] = js.native
    
    var `final`: js.UndefOr[
        js.ThisFunction1[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    @JSName("read")
    var read_DuplexOptions: js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]] = js.native
    
    var readableHighWaterMark: js.UndefOr[Double] = js.native
    
    var readableObjectMode: js.UndefOr[Boolean] = js.native
    
    var writableCorked: js.UndefOr[Double] = js.native
    
    var writableHighWaterMark: js.UndefOr[Double] = js.native
    
    var writableObjectMode: js.UndefOr[Boolean] = js.native
    
    var write: js.UndefOr[
        js.ThisFunction3[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    var writev: js.UndefOr[
        js.ThisFunction2[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
  }
  object DuplexOptions {
    
    @scala.inline
    def apply(): DuplexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplexOptions]
    }
    
    @scala.inline
    implicit class DuplexOptionsMutableBuilder[Self <: DuplexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      @scala.inline
      def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      @scala.inline
      def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ Duplex, 
              /* error */ Error | Null, 
              /* callback */ js.Function1[/* error */ Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      @scala.inline
      def setFinal(
        value: js.ThisFunction1[
              (/* this */ Duplex) | (/* this */ Writable), 
              /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
      
      @scala.inline
      def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      @scala.inline
      def setWritableCorked(value: Double): Self = StObject.set(x, "writableCorked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableCorkedUndefined: Self = StObject.set(x, "writableCorked", js.undefined)
      
      @scala.inline
      def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
      
      @scala.inline
      def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
      
      @scala.inline
      def setWrite(
        value: js.ThisFunction3[
              (/* this */ Duplex) | (/* this */ Writable), 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      @scala.inline
      def setWritev(
        value: js.ThisFunction2[
              (/* this */ Duplex) | (/* this */ Writable), 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  @js.native
  trait FinishedOptions extends StObject {
    
    var error: js.UndefOr[Boolean] = js.native
    
    var readable: js.UndefOr[Boolean] = js.native
    
    var writable: js.UndefOr[Boolean] = js.native
  }
  object FinishedOptions {
    
    @scala.inline
    def apply(): FinishedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FinishedOptions]
    }
    
    @scala.inline
    implicit class FinishedOptionsMutableBuilder[Self <: FinishedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  @js.native
  trait Pipe extends StObject {
    
    def close(): Unit = js.native
    
    def hasRef(): Boolean = js.native
    
    def ref(): Unit = js.native
    
    def unref(): Unit = js.native
  }
  object Pipe {
    
    @scala.inline
    def apply(close: () => Unit, hasRef: () => Boolean, ref: () => Unit, unref: () => Unit): Pipe = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
      __obj.asInstanceOf[Pipe]
    }
    
    @scala.inline
    implicit class PipeMutableBuilder[Self <: Pipe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasRef(value: () => Boolean): Self = StObject.set(x, "hasRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRef(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnref(value: () => Unit): Self = StObject.set(x, "unref", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ReadableOptions extends StObject {
    
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Readable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    var encoding: js.UndefOr[BufferEncoding] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var objectMode: js.UndefOr[Boolean] = js.native
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.native
  }
  object ReadableOptions {
    
    @scala.inline
    def apply(): ReadableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadableOptions]
    }
    
    @scala.inline
    implicit class ReadableOptionsMutableBuilder[Self <: ReadableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ Readable, 
              /* error */ Error | Null, 
              /* callback */ js.Function1[/* error */ Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
  
  type TransformCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* data */ js.UndefOr[js.Any], Unit]
  
  @js.native
  trait TransformOptions extends DuplexOptions {
    
    @JSName("destroy")
    var destroy_TransformOptions: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    @JSName("final")
    var final_TransformOptions: js.UndefOr[
        js.ThisFunction1[
          /* this */ Transform, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    var flush: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]] = js.native
    
    @JSName("read")
    var read_TransformOptions: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]] = js.native
    
    var transform: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ TransformCallback, 
          Unit
        ]
      ] = js.native
    
    @JSName("write")
    var write_TransformOptions: js.UndefOr[
        js.ThisFunction3[
          /* this */ Transform, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    @JSName("writev")
    var writev_TransformOptions: js.UndefOr[
        js.ThisFunction2[
          /* this */ Transform, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
  }
  object TransformOptions {
    
    @scala.inline
    def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* error */ Error | Null, 
              /* callback */ js.Function1[/* error */ Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setFinal(
        value: js.ThisFunction1[
              /* this */ Transform, 
              /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      @scala.inline
      def setFlush(value: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit]): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      @scala.inline
      def setRead(value: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setTransform(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ TransformCallback, 
              Unit
            ]
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setWrite(
        value: js.ThisFunction3[
              /* this */ Transform, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      @scala.inline
      def setWritev(
        value: js.ThisFunction2[
              /* this */ Transform, 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  @js.native
  trait WritableOptions extends StObject {
    
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    var decodeStrings: js.UndefOr[Boolean] = js.native
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Writable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
      ] = js.native
    
    var emitClose: js.UndefOr[Boolean] = js.native
    
    var `final`: js.UndefOr[
        js.ThisFunction1[
          /* this */ Writable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
    
    var objectMode: js.UndefOr[Boolean] = js.native
    
    var write: js.UndefOr[
        js.ThisFunction3[
          /* this */ Writable, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
    
    var writev: js.UndefOr[
        js.ThisFunction2[
          /* this */ Writable, 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.native
  }
  object WritableOptions {
    
    @scala.inline
    def apply(): WritableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WritableOptions]
    }
    
    @scala.inline
    implicit class WritableOptionsMutableBuilder[Self <: WritableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      @scala.inline
      def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      @scala.inline
      def setDestroy(
        value: js.ThisFunction2[
              /* this */ Writable, 
              /* error */ Error | Null, 
              /* callback */ js.Function1[/* error */ Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      @scala.inline
      def setFinal(
        value: js.ThisFunction1[
              /* this */ Writable, 
              /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setWrite(
        value: js.ThisFunction3[
              /* this */ Writable, 
              /* chunk */ js.Any, 
              /* encoding */ BufferEncoding, 
              /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
      
      @scala.inline
      def setWritev(
        value: js.ThisFunction2[
              /* this */ Writable, 
              /* chunks */ js.Array[Chunk], 
              /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
    }
  }
  
  @js.native
  trait internal extends EventEmitter {
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
}
