package typings.micromark

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devStreamMod {
  
  @JSImport("micromark/dev/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stream(): MinimalDuplex = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")().asInstanceOf[MinimalDuplex]
  inline def stream(options: typings.micromarkUtilTypes.mod.Options): MinimalDuplex = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(options.asInstanceOf[js.Any]).asInstanceOf[MinimalDuplex]
  
  type Callback = js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  
  type Encoding = typings.micromarkUtilTypes.mod.Encoding
  
  /* Inlined std.Omit<node.NodeJS.ReadableStream & node.NodeJS.WritableStream, 'read' | 'setEncoding' | 'pause' | 'resume' | 'isPaused' | 'unpipe' | 'unshift' | 'wrap'> */
  trait MinimalDuplex extends StObject {
    
    def addListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type
    @JSName("addListener")
    var addListener_Original: js.Function2[
        /* eventName */ String, 
        /* listener */ js.Function1[/* repeated */ Any, Unit], 
        this.type
      ]
    
    def emit(eventName: String, args: Any*): Boolean
    @JSName("emit")
    var emit_Original: js.Function2[/* eventName */ String, /* repeated */ Any, Boolean]
    
    def end(): this.type
    @JSName("end")
    var end_Original: js.Function0[this.type]
    
    def eventNames(): js.Array[String | js.Symbol]
    @JSName("eventNames")
    var eventNames_Original: js.Function0[js.Array[String | js.Symbol]]
    
    def getMaxListeners(): Double
    @JSName("getMaxListeners")
    var getMaxListeners_Original: js.Function0[Double]
    
    def listenerCount(eventName: String): Double
    @JSName("listenerCount")
    var listenerCount_Original: js.Function1[/* eventName */ String, Double]
    
    def listeners(eventName: String): js.Array[js.Function]
    @JSName("listeners")
    var listeners_Original: js.Function1[/* eventName */ String, js.Array[js.Function]]
    
    def off(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type
    @JSName("off")
    var off_Original: js.Function2[
        /* eventName */ String, 
        /* listener */ js.Function1[/* repeated */ Any, Unit], 
        this.type
      ]
    
    def on(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type
    @JSName("on")
    var on_Original: js.Function2[
        /* eventName */ String, 
        /* listener */ js.Function1[/* repeated */ Any, Unit], 
        this.type
      ]
    
    def once(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type
    @JSName("once")
    var once_Original: js.Function2[
        /* eventName */ String, 
        /* listener */ js.Function1[/* repeated */ Any, Unit], 
        this.type
      ]
    
    def pipe[T /* <: WritableStream */](destination: T): T
    @JSName("pipe")
    var pipe_Original: js.Function1[/* destination */ WritableStream, WritableStream]
    
    def prependListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type
    @JSName("prependListener")
    var prependListener_Original: js.Function2[
        /* eventName */ String, 
        /* listener */ js.Function1[/* repeated */ Any, Unit], 
        this.type
      ]
    
    def prependOnceListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type
    @JSName("prependOnceListener")
    var prependOnceListener_Original: js.Function2[
        /* eventName */ String, 
        /* listener */ js.Function1[/* repeated */ Any, Unit], 
        this.type
      ]
    
    def rawListeners(eventName: String): js.Array[js.Function]
    @JSName("rawListeners")
    var rawListeners_Original: js.Function1[/* eventName */ String, js.Array[js.Function]]
    
    var readable: Boolean
    
    def removeAllListeners(): this.type
    @JSName("removeAllListeners")
    var removeAllListeners_Original: js.Function0[this.type]
    
    def removeListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type
    @JSName("removeListener")
    var removeListener_Original: js.Function2[
        /* eventName */ String, 
        /* listener */ js.Function1[/* repeated */ Any, Unit], 
        this.type
      ]
    
    def setMaxListeners(n: Double): this.type
    @JSName("setMaxListeners")
    var setMaxListeners_Original: js.Function1[/* n */ Double, this.type]
    
    var writable: Boolean
    
    def write(buffer: js.typedarray.Uint8Array): Boolean
    @JSName("write")
    var write_Original: js.Function1[/* buffer */ js.typedarray.Uint8Array, Boolean]
  }
  object MinimalDuplex {
    
    inline def apply(
      addListener: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex,
      emit: (/* eventName */ String, /* repeated */ Any) => Boolean,
      end: () => MinimalDuplex,
      eventNames: () => js.Array[String | js.Symbol],
      getMaxListeners: () => Double,
      listenerCount: /* eventName */ String => Double,
      listeners: /* eventName */ String => js.Array[js.Function],
      off: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex,
      on: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex,
      once: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex,
      pipe: /* destination */ WritableStream => WritableStream,
      prependListener: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex,
      prependOnceListener: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex,
      rawListeners: /* eventName */ String => js.Array[js.Function],
      readable: Boolean,
      removeAllListeners: () => MinimalDuplex,
      removeListener: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex,
      setMaxListeners: /* n */ Double => MinimalDuplex,
      writable: Boolean,
      write: /* buffer */ js.typedarray.Uint8Array => Boolean
    ): MinimalDuplex = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), end = js.Any.fromFunction0(end), eventNames = js.Any.fromFunction0(eventNames), getMaxListeners = js.Any.fromFunction0(getMaxListeners), listenerCount = js.Any.fromFunction1(listenerCount), listeners = js.Any.fromFunction1(listeners), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pipe = js.Any.fromFunction1(pipe), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), rawListeners = js.Any.fromFunction1(rawListeners), readable = readable.asInstanceOf[js.Any], removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), setMaxListeners = js.Any.fromFunction1(setMaxListeners), writable = writable.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[MinimalDuplex]
    }
    
    extension [Self <: MinimalDuplex](x: Self) {
      
      inline def setAddListener(
        value: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setEmit(value: (/* eventName */ String, /* repeated */ Any) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setEnd(value: () => MinimalDuplex): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setEventNames(value: () => js.Array[String | js.Symbol]): Self = StObject.set(x, "eventNames", js.Any.fromFunction0(value))
      
      inline def setGetMaxListeners(value: () => Double): Self = StObject.set(x, "getMaxListeners", js.Any.fromFunction0(value))
      
      inline def setListenerCount(value: /* eventName */ String => Double): Self = StObject.set(x, "listenerCount", js.Any.fromFunction1(value))
      
      inline def setListeners(value: /* eventName */ String => js.Array[js.Function]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      inline def setOff(
        value: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex
      ): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(
        value: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(
        value: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex
      ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setPipe(value: /* destination */ WritableStream => WritableStream): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
      
      inline def setPrependListener(
        value: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex
      ): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      inline def setPrependOnceListener(
        value: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex
      ): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      inline def setRawListeners(value: /* eventName */ String => js.Array[js.Function]): Self = StObject.set(x, "rawListeners", js.Any.fromFunction1(value))
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllListeners(value: () => MinimalDuplex): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      inline def setRemoveListener(
        value: (/* eventName */ String, /* listener */ js.Function1[/* repeated */ Any, Unit]) => MinimalDuplex
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      inline def setSetMaxListeners(value: /* n */ Double => MinimalDuplex): Self = StObject.set(x, "setMaxListeners", js.Any.fromFunction1(value))
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: /* buffer */ js.typedarray.Uint8Array => Boolean): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  type Options = typings.micromarkUtilTypes.mod.Options
  
  type Value = typings.micromarkUtilTypes.mod.Value
}
