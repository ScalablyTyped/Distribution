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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object CallWorkflowClientAction {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CallWorkflowClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInActionButtonUnderAction(container: ActionButton): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInActionItemUnderAction(container: ActionItem): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInDivContainerUnderOnClickAction(container: DivContainer): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderOnClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInGridActionButtonUnderAction(container: GridActionButton): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInListViewUnderClickAction(container: ListView): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInListViewUnderPullDownAction(container: ListView): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderPullDownAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInMenuItemUnderAction(container: MenuItem): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderOnEnterKeyPressAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /**
    * Creates and returns a new CallWorkflowClientAction instance in the SDK and on the server.
    * The new CallWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderAction(container: WidgetValue): CallWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CallWorkflowClientAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CallWorkflowClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.CallWorkflowClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
