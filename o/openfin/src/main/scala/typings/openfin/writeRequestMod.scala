package typings.openfin

import typings.openfin.anon.Html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeRequestMod {
  
  trait WriteAnyRequestType extends StObject {
    
    var data: Html
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object WriteAnyRequestType {
    
    @scala.inline
    def apply(data: Html): WriteAnyRequestType = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteAnyRequestType]
    }
    
    @scala.inline
    implicit class WriteAnyRequestTypeMutableBuilder[Self <: WriteAnyRequestType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Html): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait WriteRequestType extends StObject {
    
    var data: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object WriteRequestType {
    
    @scala.inline
    def apply(data: String): WriteRequestType = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteRequestType]
    }
    
    @scala.inline
    implicit class WriteRequestTypeMutableBuilder[Self <: WriteRequestType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
