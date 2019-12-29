package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

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

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.MicroflowClientAction")
@js.native
class MicroflowClientAction protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.MicroflowClientAction")
@js.native
object MicroflowClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    */
  def createInActionButtonUnderAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.ActionButton): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    */
  def createInActionItemUnderAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.ActionItem): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.AssociationWidget): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent DataViewActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  def createInDataViewActionButtonUnderAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataViewActionButton): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.DivContainer): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.DynamicImageViewer): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    */
  def createInGridActionButtonUnderAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.GridActionButton): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    */
  def createInListViewUnderClickAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListView): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.ListView): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    */
  def createInMenuItemUnderAction(container: MenuItem): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSelector): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    */
  def createInStaticImageViewerUnderClickAction(container: typings.mendixmodelsdk.distGenPagesMod.pages.StaticImageViewer): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
  /**
    * Creates and returns a new MicroflowClientAction instance in the SDK and on the server.
    * The new MicroflowClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): typings.mendixmodelsdk.distGenPagesMod.pages.MicroflowClientAction = js.native
}

