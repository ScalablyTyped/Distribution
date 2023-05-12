package typings.multipipe

import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pass a variable number of streams and each will be piped to the next one.
    *
    * A stream will be returned that wraps passed in streams in a way that errors will be forwarded and you can write to and/or read from it.
    *
    * Pass an object as the second to last or last argument to pass as options to the underlying stream constructors.
    *
    * Pass a function as last argument to be called on error or finish of the last stream.
    */
  inline def apply(): PassThrough = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[PassThrough]
  inline def apply(callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): PassThrough = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[PassThrough]
  inline def apply(options: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): PassThrough = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PassThrough]
  inline def apply(options: DuplexOptions): PassThrough = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[PassThrough]
  inline def apply(options: DuplexOptions, callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): PassThrough = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[PassThrough]
  inline def apply(source: ReadableStream, destination: WritableStream): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    destination: WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    destination: WritableStream,
    options: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(source: ReadableStream, destination: WritableStream, options: DuplexOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    destination: WritableStream,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(source: ReadableStream, t1: ReadWriteStream, t2: ReadWriteStream, destination: WritableStream): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    destination: WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    destination: WritableStream
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    destination: WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    destination: WritableStream
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    destination: WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    destination: WritableStream
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    destination: WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    t6: ReadWriteStream,
    destination: WritableStream
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    t6: ReadWriteStream,
    destination: WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    t6: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    t6: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    t6: ReadWriteStream,
    t7: ReadWriteStream,
    destination: WritableStream
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], t7.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    t6: ReadWriteStream,
    t7: ReadWriteStream,
    destination: WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], t7.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    t6: ReadWriteStream,
    t7: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], t7.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    t1: ReadWriteStream,
    t2: ReadWriteStream,
    t3: ReadWriteStream,
    t4: ReadWriteStream,
    t5: ReadWriteStream,
    t6: ReadWriteStream,
    t7: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], t3.asInstanceOf[js.Any], t4.asInstanceOf[js.Any], t5.asInstanceOf[js.Any], t6.asInstanceOf[js.Any], t7.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(source: ReadableStream, transform: ReadWriteStream, destination: WritableStream): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    transform: ReadWriteStream,
    destination: WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    transform: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    source: ReadableStream,
    transform: ReadWriteStream,
    destination: WritableStream,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(stream: js.Array[Stream]): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(stream: js.Array[Stream], callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    stream: js.Array[Stream],
    options: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(stream: js.Array[Stream], options: DuplexOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    stream: js.Array[Stream],
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(stream: ReadWriteStream): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    stream: ReadWriteStream,
    options: Unit,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(stream: ReadWriteStream, options: DuplexOptions): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    stream: ReadWriteStream,
    options: DuplexOptions,
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Any]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("multipipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
