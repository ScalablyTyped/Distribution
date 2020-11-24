package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowClientAction")
@js.native
class MicroflowClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def microflowSettings: MicroflowSettings = js.native
  def microflowSettings_=(newValue: MicroflowSettings): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowClientAction")
@js.native
object MicroflowClientAction extends js.Object {
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    */
  def createInActionButtonUnderAction(container: ActionButton): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    */
  def createInActionItemUnderAction(container: ActionItem): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 8.14.0
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent DataViewActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  def createInDataViewActionButtonUnderAction(container: DataViewActionButton): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    */
  def createInListViewUnderClickAction(container: ListView): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    */
  def createInMenuItemUnderAction(container: MenuItem): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): MicroflowClientAction = js.native
  
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): MicroflowClientAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
