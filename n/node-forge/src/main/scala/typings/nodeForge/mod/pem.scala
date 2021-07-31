package typings.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pem {
  
  @JSImport("node-forge", "pem")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(str: String): js.Array[ObjectPEM] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[ObjectPEM]]
  
  @scala.inline
  def encode(msg: ObjectPEM): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def encode(msg: ObjectPEM, options: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(msg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait EncodeOptions extends StObject {
    
    var maxline: js.UndefOr[Double] = js.undefined
  }
  object EncodeOptions {
    
    @scala.inline
    def apply(): EncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeOptions]
    }
    
    @scala.inline
    implicit class EncodeOptionsMutableBuilder[Self <: EncodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxline(value: Double): Self = StObject.set(x, "maxline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxlineUndefined: Self = StObject.set(x, "maxline", js.undefined)
    }
  }
  
  trait ObjectPEM extends StObject {
    
    var body: Bytes
    
    var contentDomain: js.UndefOr[js.Any] = js.undefined
    
    var dekInfo: js.UndefOr[js.Any] = js.undefined
    
    var headers: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var procType: js.UndefOr[js.Any] = js.undefined
    
    var `type`: String
  }
  object ObjectPEM {
    
    @scala.inline
    def apply(body: Bytes, `type`: String): ObjectPEM = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectPEM]
    }
    
    @scala.inline
    implicit class ObjectPEMMutableBuilder[Self <: ObjectPEM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Bytes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDomain(value: js.Any): Self = StObject.set(x, "contentDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDomainUndefined: Self = StObject.set(x, "contentDomain", js.undefined)
      
      @scala.inline
      def setDekInfo(value: js.Any): Self = StObject.set(x, "dekInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDekInfoUndefined: Self = StObject.set(x, "dekInfo", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setProcType(value: js.Any): Self = StObject.set(x, "procType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcTypeUndefined: Self = StObject.set(x, "procType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
