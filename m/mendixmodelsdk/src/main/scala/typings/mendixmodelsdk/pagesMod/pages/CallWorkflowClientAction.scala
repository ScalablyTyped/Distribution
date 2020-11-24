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
import typings.mendixmodelsdk.workflowsMod.workflows.IWorkflow
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
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.CallWorkflowClientAction")
@js.native
class CallWorkflowClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def closePage: Boolean = js.native
  def closePage_=(newValue: Boolean): Unit = js.native
  
  def commit: Boolean = js.native
  def commit_=(newValue: Boolean): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def workflow: IWorkflow | Null = js.native
  
  def workflowQualifiedName: String | Null = js.native
  
  def workflow_=(newValue: IWorkflow | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.CallWorkflowClientAction")
@js.native
object CallWorkflowClientAction extends js.Object {
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInActionButtonUnderAction(container: ActionButton): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInActionItemUnderAction(container: ActionItem): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInListViewUnderClickAction(container: ListView): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInMenuItemUnderAction(container: MenuItem): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): CallWorkflowClientAction = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): CallWorkflowClientAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
