package typings.parcelTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsafeMod {
  
  trait AST extends StObject {
    
    var program: Any
    
    var `type`: String
    
    var version: String
  }
  object AST {
    
    inline def apply(program: Any, `type`: String, version: String): AST = {
      val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AST]
    }
    
    extension [Self <: AST](x: Self) {
      
      inline def setProgram(value: Any): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigResult = Any
}
