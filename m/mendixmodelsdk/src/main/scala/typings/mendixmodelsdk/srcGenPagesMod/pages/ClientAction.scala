package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.ClientAction")
@js.native
open class ClientAction protected () extends Element[IModel] {
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
object ClientAction {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
