package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionSetProperties extends StObject {
  
  def Clone(): IActionSetProperties = js.native
  
  var Properties: IDefaultProperties = js.native
}
object IActionSetProperties {
  
  @scala.inline
  def apply(Clone: () => IActionSetProperties, Properties: IDefaultProperties): IActionSetProperties = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Properties = Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetProperties]
  }
  
  @scala.inline
  implicit class IActionSetPropertiesMutableBuilder[Self <: IActionSetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IActionSetProperties): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProperties(value: IDefaultProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
  }
}
