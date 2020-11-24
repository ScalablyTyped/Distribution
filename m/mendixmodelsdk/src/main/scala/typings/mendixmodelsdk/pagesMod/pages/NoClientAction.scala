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

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NoClientAction")
@js.native
class NoClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NoClientAction")
@js.native
object NoClientAction extends js.Object {
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    */
  def createInActionButtonUnderAction(container: ActionButton): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    */
  def createInActionItemUnderAction(container: ActionItem): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 8.14.0
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'action' property
    * of the parent DataViewActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  def createInDataViewActionButtonUnderAction(container: DataViewActionButton): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    */
  def createInListViewUnderClickAction(container: ListView): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    */
  def createInMenuItemUnderAction(container: MenuItem): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): NoClientAction = js.native
  
  /**
    * Creates and returns a new NoClientAction instance in the SDK and on the server.
    * The new NoClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): NoClientAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
