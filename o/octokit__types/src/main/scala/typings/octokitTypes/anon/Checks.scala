package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checks extends StObject {
  
  var checks: String
  
  var contents: String
  
  var metadata: String
}
object Checks {
  
  inline def apply(checks: String, contents: String, metadata: String): Checks = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checks]
  }
  
  extension [Self <: Checks](x: Self) {
    
    inline def setChecks(value: String): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
