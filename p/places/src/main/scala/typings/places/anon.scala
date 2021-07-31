package typings.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Prefix extends StObject {
    
    var prefix: js.Any
    
    var root: String
  }
  object Prefix {
    
    @scala.inline
    def apply(prefix: js.Any, root: String): Prefix = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prefix]
    }
    
    @scala.inline
    implicit class PrefixMutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: js.Any): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
