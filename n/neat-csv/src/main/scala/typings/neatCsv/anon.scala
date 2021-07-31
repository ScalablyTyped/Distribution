package typings.neatCsv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Header extends StObject {
    
    var header: String
    
    var index: Double
  }
  object Header {
    
    @scala.inline
    def apply(header: String, index: Double): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var header: String
    
    var index: Double
    
    var value: js.Any
  }
  object Index {
    
    @scala.inline
    def apply(header: String, index: Double, value: js.Any): Index = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
