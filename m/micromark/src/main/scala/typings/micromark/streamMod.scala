package typings.micromark

import typings.std.ReadableStream
import typings.std.ReadableStreamDefaultReader
import typings.std.ReadableWritablePair
import typings.std.WritableStream
import typings.std.WritableStreamDefaultWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("micromark/dev/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stream(): MinimalDuplex = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")().asInstanceOf[MinimalDuplex]
  inline def stream(options: typings.micromarkUtilTypes.mod.Options): MinimalDuplex = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(options.asInstanceOf[js.Any]).asInstanceOf[MinimalDuplex]
  
  type Callback = js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  
  type Encoding = typings.micromarkUtilTypes.mod.Encoding
  
  /* Inlined std.Omit<std.ReadableStream<any> & std.WritableStream<any>, 'read' | 'setEncoding' | 'pause' | 'resume' | 'isPaused' | 'unpipe' | 'unshift' | 'wrap'> */
  trait MinimalDuplex extends StObject {
    
    def abort(): js.Promise[Unit]
    @JSName("abort")
    var abort_Original: js.Function0[js.Promise[Unit]]
    
    def cancel(): js.Promise[Unit]
    @JSName("cancel")
    var cancel_Original: js.Function0[js.Promise[Unit]]
    
    def close(): js.Promise[Unit]
    @JSName("close")
    var close_Original: js.Function0[js.Promise[Unit]]
    
    def getReader(): ReadableStreamDefaultReader[Any]
    @JSName("getReader")
    var getReader_Original: js.Function0[ReadableStreamDefaultReader[Any]]
    
    def getWriter(): WritableStreamDefaultWriter[Any]
    @JSName("getWriter")
    var getWriter_Original: js.Function0[WritableStreamDefaultWriter[Any]]
    
    var locked: Boolean
    
    def pipeThrough[T](transform: ReadableWritablePair[T, Any]): ReadableStream[T]
    @JSName("pipeThrough")
    var pipeThrough_Original: js.Function1[/* transform */ ReadableWritablePair[Any, Any], ReadableStream[Any]]
    
    def pipeTo(destination: WritableStream[Any]): js.Promise[Unit]
    @JSName("pipeTo")
    var pipeTo_Original: js.Function1[/* destination */ WritableStream[Any], js.Promise[Unit]]
    
    def tee(): js.Tuple2[ReadableStream[Any], ReadableStream[Any]]
    @JSName("tee")
    var tee_Original: js.Function0[js.Tuple2[ReadableStream[Any], ReadableStream[Any]]]
  }
  object MinimalDuplex {
    
    inline def apply(
      abort: () => js.Promise[Unit],
      cancel: () => js.Promise[Unit],
      close: () => js.Promise[Unit],
      getReader: () => ReadableStreamDefaultReader[Any],
      getWriter: () => WritableStreamDefaultWriter[Any],
      locked: Boolean,
      pipeThrough: /* transform */ ReadableWritablePair[Any, Any] => ReadableStream[Any],
      pipeTo: /* destination */ WritableStream[Any] => js.Promise[Unit],
      tee: () => js.Tuple2[ReadableStream[Any], ReadableStream[Any]]
    ): MinimalDuplex = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), getReader = js.Any.fromFunction0(getReader), getWriter = js.Any.fromFunction0(getWriter), locked = locked.asInstanceOf[js.Any], pipeThrough = js.Any.fromFunction1(pipeThrough), pipeTo = js.Any.fromFunction1(pipeTo), tee = js.Any.fromFunction0(tee))
      __obj.asInstanceOf[MinimalDuplex]
    }
    
    extension [Self <: MinimalDuplex](x: Self) {
      
      inline def setAbort(value: () => js.Promise[Unit]): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setGetReader(value: () => ReadableStreamDefaultReader[Any]): Self = StObject.set(x, "getReader", js.Any.fromFunction0(value))
      
      inline def setGetWriter(value: () => WritableStreamDefaultWriter[Any]): Self = StObject.set(x, "getWriter", js.Any.fromFunction0(value))
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setPipeThrough(value: /* transform */ ReadableWritablePair[Any, Any] => ReadableStream[Any]): Self = StObject.set(x, "pipeThrough", js.Any.fromFunction1(value))
      
      inline def setPipeTo(value: /* destination */ WritableStream[Any] => js.Promise[Unit]): Self = StObject.set(x, "pipeTo", js.Any.fromFunction1(value))
      
      inline def setTee(value: () => js.Tuple2[ReadableStream[Any], ReadableStream[Any]]): Self = StObject.set(x, "tee", js.Any.fromFunction0(value))
    }
  }
  
  type Options = typings.micromarkUtilTypes.mod.Options
  
  type Value = typings.micromarkUtilTypes.mod.Value
}
