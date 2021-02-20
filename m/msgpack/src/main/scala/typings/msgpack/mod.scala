package typings.msgpack

import org.scalablytyped.runtime.Shortcut
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("msgpack", JSImport.Namespace)
  @js.native
  val ^ : MsgPackStatic = js.native
  
  @js.native
  trait MsgPackCallbackResult extends StObject {
    
    var ok: Boolean = js.native
    
    var status: Double = js.native
  }
  object MsgPackCallbackResult {
    
    @scala.inline
    def apply(ok: Boolean, status: Double): MsgPackCallbackResult = {
      val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsgPackCallbackResult]
    }
    
    @scala.inline
    implicit class MsgPackCallbackResultMutableBuilder[Self <: MsgPackCallbackResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type MsgPackDownloadCallback = js.Function3[
    /* data */ js.Any, 
    /* option */ MsgPackDownloadOption, 
    /* result */ MsgPackCallbackResult, 
    Unit
  ]
  
  @js.native
  trait MsgPackDownloadOption extends StObject {
    
    var after: js.UndefOr[
        js.Function3[
          /* xhr */ XMLHttpRequest, 
          /* option */ this.type, 
          /* result */ MsgPackCallbackResult, 
          Unit
        ]
      ] = js.native
    
    var before: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* option */ this.type, Unit]] = js.native
    
    /**
      * timeout sec.
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * use WebWorker if true.
      */
    var worker: js.UndefOr[Boolean] = js.native
  }
  object MsgPackDownloadOption {
    
    @scala.inline
    def apply(): MsgPackDownloadOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MsgPackDownloadOption]
    }
    
    @scala.inline
    implicit class MsgPackDownloadOptionMutableBuilder[Self <: MsgPackDownloadOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(
        value: (/* xhr */ XMLHttpRequest, MsgPackDownloadOption, /* result */ MsgPackCallbackResult) => Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: (/* xhr */ XMLHttpRequest, MsgPackDownloadOption) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
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
    def pack(data: js.Any): js.Any = js.native
    def pack(data: js.Any, toString: Boolean): js.Any = js.native
    
    /**
      * @param data string or ByteArray.
      *
      * @return string or ByteArray or undefined. unpack failed if undefined.
      */
    def unpack(data: js.Any): js.Any = js.native
    
    def upload(url: String, option: MsgPackUploadOption, callback: MsgPackUploadCallback): Unit = js.native
    
    var worker: String = js.native
  }
  
  type MsgPackUploadCallback = js.Function3[
    /* data */ String, 
    /* option */ MsgPackUploadOption, 
    /* result */ MsgPackCallbackResult, 
    Unit
  ]
  
  @js.native
  trait MsgPackUploadOption extends StObject {
    
    var after: js.UndefOr[
        js.Function3[
          /* xhr */ XMLHttpRequest, 
          /* option */ this.type, 
          /* result */ MsgPackCallbackResult, 
          Unit
        ]
      ] = js.native
    
    var before: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* option */ this.type, Unit]] = js.native
    
    /**
      * string or ByteArray
      */
    var data: js.Any = js.native
    
    /**
      * timeout sec.
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * use WebWorker if true.
      */
    var worker: js.UndefOr[Boolean] = js.native
  }
  object MsgPackUploadOption {
    
    @scala.inline
    def apply(data: js.Any): MsgPackUploadOption = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsgPackUploadOption]
    }
    
    @scala.inline
    implicit class MsgPackUploadOptionMutableBuilder[Self <: MsgPackUploadOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: (/* xhr */ XMLHttpRequest, MsgPackUploadOption, /* result */ MsgPackCallbackResult) => Unit): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: (/* xhr */ XMLHttpRequest, MsgPackUploadOption) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  type _To = MsgPackStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MsgPackStatic = ^
}
