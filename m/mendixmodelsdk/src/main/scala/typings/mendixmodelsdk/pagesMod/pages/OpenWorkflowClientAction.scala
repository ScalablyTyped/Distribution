package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenWorkflowClientAction")
@js.native
class OpenWorkflowClientAction protected () extends ClientAction {
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
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenWorkflowClientAction")
@js.native
object OpenWorkflowClientAction extends js.Object {
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInActionButtonUnderAction(container: ActionButton): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInActionItemUnderAction(container: ActionItem): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInListViewUnderClickAction(container: ListView): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInMenuItemUnderAction(container: MenuItem): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): OpenWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): OpenWorkflowClientAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
