package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASTGenerator extends StObject {
  
  var `type`: String
  
  var version: Semver
}
object ASTGenerator {
  
  inline def apply(`type`: String, version: Semver): ASTGenerator = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTGenerator]
  }
  
  extension [Self <: ASTGenerator](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Semver): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
