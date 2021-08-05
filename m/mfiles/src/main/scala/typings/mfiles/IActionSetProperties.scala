package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionSetProperties extends StObject {
  
  def Clone(): IActionSetProperties
  
  var Properties: IDefaultProperties
}
object IActionSetProperties {
  
  inline def apply(Clone: () => IActionSetProperties, Properties: IDefaultProperties): IActionSetProperties = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Properties = Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetProperties]
  }
  
  extension [Self <: IActionSetProperties](x: Self) {
    
    inline def setClone(value: () => IActionSetProperties): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setProperties(value: IDefaultProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
  }
}
