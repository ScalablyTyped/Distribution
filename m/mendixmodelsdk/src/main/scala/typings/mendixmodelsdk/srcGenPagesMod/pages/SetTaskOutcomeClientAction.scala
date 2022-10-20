package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IUserTaskOutcome
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.SetTaskOutcomeClientAction")
@js.native
open class SetTaskOutcomeClientAction protected () extends ClientAction {
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
    * In version 9.19.0: deleted
    */
  def outcome: IUserTaskOutcome | Null = js.native
  
  def outcomeQualifiedName: String | Null = js.native
  
  /**
    * In version 9.19.0: introduced
    */
  def outcomeValue: String = js.native
  def outcomeValue_=(newValue: String): Unit = js.native
  
  def outcome_=(newValue: IUserTaskOutcome | Null): Unit = js.native
}
object SetTaskOutcomeClientAction {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SetTaskOutcomeClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInActionButtonUnderAction(container: ActionButton): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInActionItemUnderAction(container: ActionItem): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInDivContainerUnderOnClickAction(container: DivContainer): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderOnClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInGridActionButtonUnderAction(container: GridActionButton): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInListViewUnderClickAction(container: ListView): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInListViewUnderPullDownAction(container: ListView): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderPullDownAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInMenuItemUnderAction(container: MenuItem): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderOnEnterKeyPressAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderAction(container: WidgetValue): SetTaskOutcomeClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeClientAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SetTaskOutcomeClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SetTaskOutcomeClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
