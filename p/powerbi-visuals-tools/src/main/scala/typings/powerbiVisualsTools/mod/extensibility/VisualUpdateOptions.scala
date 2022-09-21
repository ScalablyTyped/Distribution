package typings.powerbiVisualsTools.mod.extensibility

import typings.powerbiVisualsTools.mod.VisualUpdateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualUpdateOptions extends StObject {
  
  var `type`: VisualUpdateType
}
object VisualUpdateOptions {
  
  inline def apply(`type`: VisualUpdateType): VisualUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualUpdateOptions]
  }
  
  extension [Self <: VisualUpdateOptions](x: Self) {
    
    inline def setType(value: VisualUpdateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
