package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.openfin.GoldenLayout.ItemConfig
  - typings.openfin.GoldenLayout.ComponentConfig
  - typings.openfin.GoldenLayout.ReactComponentConfig
*/
trait ItemConfigType extends js.Object
object ItemConfigType {
  
  @scala.inline
  def ItemConfig(`type`: String): ItemConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemConfigType]
  }
  
  @scala.inline
  def ComponentConfig(componentName: String, `type`: String): ItemConfigType = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemConfigType]
  }
  
  @scala.inline
  def ReactComponentConfig(component: String, `type`: String): ItemConfigType = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemConfigType]
  }
}
