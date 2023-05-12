package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Architecture extends StObject {
  
  var architecture: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[typings.node.processMod.global.NodeJS.Platform] = js.undefined
  
  var `type`: String
  
  var version: js.UndefOr[String] = js.undefined
}
object Architecture {
  
  inline def apply(`type`: String): Architecture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Architecture] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setName(value: typings.node.processMod.global.NodeJS.Platform): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
