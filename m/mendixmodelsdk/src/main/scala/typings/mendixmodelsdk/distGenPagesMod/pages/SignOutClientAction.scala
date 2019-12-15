package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.1.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SignOutClientAction")
@js.native
class SignOutClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSignOutClientAction: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SignOutClientAction")
@js.native
object SignOutClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  def createInActionButtonUnderAction(container: ActionButton): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  def createInActionItemUnderAction(container: ActionItem): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  def createInListViewUnderClickAction(container: ListView): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  def createInMenuItemUnderAction(container: MenuItem): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): SignOutClientAction = js.native
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): SignOutClientAction = js.native
}

