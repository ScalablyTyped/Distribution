package typings.mdns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Flags extends StObject {
    
    var flags: Any
  }
  object Flags {
    
    inline def apply(flags: Any): Flags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    extension [Self <: Flags](x: Self) {
      
      inline def setFlags(value: Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var protocol: String
    
    var subtypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Name {
    
    inline def apply(name: String, protocol: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSubtypes(value: js.Array[String]): Self = StObject.set(x, "subtypes", value.asInstanceOf[js.Any])
      
      inline def setSubtypesUndefined: Self = StObject.set(x, "subtypes", js.undefined)
      
      inline def setSubtypesVarargs(value: String*): Self = StObject.set(x, "subtypes", js.Array(value*))
    }
  }
}
