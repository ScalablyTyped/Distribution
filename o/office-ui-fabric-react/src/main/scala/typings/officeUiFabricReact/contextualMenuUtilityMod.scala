package typings.officeUiFabricReact

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/contextualMenu/contextualMenuUtility", JSImport.Namespace)
@js.native
object contextualMenuUtilityMod extends js.Object {
  def getIsChecked(item: IContextualMenuItem): Boolean | Null = js.native
  def hasSubmenu(item: IContextualMenuItem): Boolean = js.native
  def isItemDisabled(item: IContextualMenuItem): Boolean = js.native
}

