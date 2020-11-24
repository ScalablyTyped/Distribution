package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientAction")
@js.native
abstract class ClientAction protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsActionButton: ActionButton = js.native
  
  def containerAsActionItem: ActionItem = js.native
  
  def containerAsAssociationWidget: AssociationWidget = js.native
  
  def containerAsAttributeWidget: AttributeWidget = js.native
  
  def containerAsBottomBarItem: BottomBarItem = js.native
  
  def containerAsDataViewActionButton: DataViewActionButton = js.native
  
  def containerAsDivContainer: DivContainer = js.native
  
  def containerAsDynamicImageViewer: DynamicImageViewer = js.native
  
  def containerAsGridActionButton: GridActionButton = js.native
  
  def containerAsListView: ListView = js.native
  
  def containerAsMenuItem: MenuItem = js.native
  
  def containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  
  def containerAsStaticImageViewer: StaticImageViewer = js.native
  
  def containerAsTextBox: TextBox = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
  
  /**
    * In version 8.12.0: introduced
    */
  def disabledDuringExecution: Boolean = js.native
  def disabledDuringExecution_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientAction")
@js.native
object ClientAction extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
