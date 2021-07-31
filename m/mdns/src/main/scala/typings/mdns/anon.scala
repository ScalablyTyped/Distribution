package typings.mdns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Flags extends StObject {
    
    var flags: js.Any
  }
  object Flags {
    
    @scala.inline
    def apply(flags: js.Any): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    @scala.inline
    implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: js.Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var protocol: String
    
    var subtypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Name {
    
    @scala.inline
    def apply(name: String, protocol: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtypesUndefined: Self = StObject.set(x, "subtypes", js.undefined)
      
      @scala.inline
      def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value :_*))
    }
  }
}
