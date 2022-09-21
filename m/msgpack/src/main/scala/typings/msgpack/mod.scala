package typings.msgpack

import org.scalablytyped.runtime.Shortcut
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("msgpack", JSImport.Namespace)
  @js.native
  val ^ : MsgPackStatic = js.native
  
  trait MsgPackCallbackResult extends StObject {
    
    var ok: Boolean
    
    var status: Double
  }
  object MsgPackCallbackResult {
    
    inline def apply(ok: Boolean, status: Double): MsgPackCallbackResult = {
      val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsgPackCallbackResult]
    }
    
    extension [Self <: MsgPackCallbackResult](x: Self) {
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type MsgPackDownloadCallback = js.Function3[
    /* data */ Any, 
    /* option */ MsgPackDownloadOption, 
    /* result */ MsgPackCallbackResult, 
    Unit
  ]
  
  trait MsgPackDownloadOption extends StObject {
    
    var after: js.UndefOr[
        js.Function3[
          /* xhr */ XMLHttpRequest, 
          /* option */ this.type, 
          /* result */ MsgPackCallbackResult, 
          Unit
        ]
      ] = js.undefined
    
    var before: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* option */ this.type, Unit]] = js.undefined
    
    /**
      * timeout sec.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * use WebWorker if true.
      */
    var worker: js.UndefOr[Boolean] = js.undefined
  }
  object MsgPackDownloadOption {
    
    inline def apply(): MsgPackDownloadOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MsgPackDownloadOption]
    }
    
    extension [Self <: MsgPackDownloadOption](x: Self) {
      
      inline def setAfter(
        value: (/* xhr */ XMLHttpRequest, MsgPackDownloadOption, /* result */ MsgPackCallbackResult) => Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: (/* xhr */ XMLHttpRequest, MsgPackDownloadOption) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  @js.native
  trait MsgPackStatic extends StObject {
    
    def download(url: String, option: MsgPackDownloadOption, callback: MsgPackDownloadCallback): Unit = js.native
    
    /**
      * @param data string or ByteArray.
      * @param toString return string value if true.
      *
      * @return string or ByteArray or false. pack failed if false.
      */
    def pack(data: Any): Any = js.native
    def pack(data: Any, toString: Boolean): Any = js.native
    
    /**
      * @param data string or ByteArray.
      *
      * @return string or ByteArray or undefined. unpack failed if undefined.
      */
    def unpack(data: Any): Any = js.native
    
    def upload(url: String, option: MsgPackUploadOption, callback: MsgPackUploadCallback): Unit = js.native
    
    var worker: String = js.native
  }
  
  type MsgPackUploadCallback = js.Function3[
    /* data */ String, 
    /* option */ MsgPackUploadOption, 
    /* result */ MsgPackCallbackResult, 
    Unit
  ]
  
  trait MsgPackUploadOption extends StObject {
    
    var after: js.UndefOr[
        js.Function3[
          /* xhr */ XMLHttpRequest, 
          /* option */ this.type, 
          /* result */ MsgPackCallbackResult, 
          Unit
        ]
      ] = js.undefined
    
    var before: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* option */ this.type, Unit]] = js.undefined
    
    /**
      * string or ByteArray
      */
    var data: Any
    
    /**
      * timeout sec.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * use WebWorker if true.
      */
    var worker: js.UndefOr[Boolean] = js.undefined
  }
  object MsgPackUploadOption {
    
    inline def apply(data: Any): MsgPackUploadOption = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsgPackUploadOption]
    }
    
    extension [Self <: MsgPackUploadOption](x: Self) {
      
      inline def setAfter(value: (/* xhr */ XMLHttpRequest, MsgPackUploadOption, /* result */ MsgPackCallbackResult) => Unit): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: (/* xhr */ XMLHttpRequest, MsgPackUploadOption) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  type _To = MsgPackStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MsgPackStatic = ^
}
