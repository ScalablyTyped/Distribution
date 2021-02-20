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
import typings.mendixmodelsdk.workflowsMod.workflows.IWorkflowTaskOutcome
import org.scalablytyped.runtime.StObject
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
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction")
@js.native
class SetTaskOutcomeClientAction protected () extends ClientAction {
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
  def outcome: IWorkflowTaskOutcome | Null = js.native
  
  def outcomeQualifiedName: String | Null = js.native
  
  def outcome_=(newValue: IWorkflowTaskOutcome | Null): Unit = js.native
}
object SetTaskOutcomeClientAction {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.create")
  @js.native
  def create(model: IModel): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInActionButtonUnderAction")
  @js.native
  def createInActionButtonUnderAction(container: ActionButton): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInActionItemUnderAction")
  @js.native
  def createInActionItemUnderAction(container: ActionItem): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInAssociationWidgetUnderOnChangeAction")
  @js.native
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInAttributeWidgetUnderOnChangeAction")
  @js.native
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInAttributeWidgetUnderOnEnterAction")
  @js.native
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInAttributeWidgetUnderOnLeaveAction")
  @js.native
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInDivContainerUnderOnClickAction")
  @js.native
  def createInDivContainerUnderOnClickAction(container: DivContainer): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInDynamicImageViewerUnderClickAction")
  @js.native
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInGridActionButtonUnderAction")
  @js.native
  def createInGridActionButtonUnderAction(container: GridActionButton): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInListViewUnderClickAction")
  @js.native
  def createInListViewUnderClickAction(container: ListView): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInListViewUnderPullDownAction")
  @js.native
  def createInListViewUnderPullDownAction(container: ListView): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInMenuItemUnderAction")
  @js.native
  def createInMenuItemUnderAction(container: MenuItem): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInReferenceSetSelectorUnderOnChangeAction")
  @js.native
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInStaticImageViewerUnderClickAction")
  @js.native
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInTextBoxUnderOnEnterKeyPressAction")
  @js.native
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.createInWidgetValueUnderAction")
  @js.native
  def createInWidgetValueUnderAction(container: WidgetValue): SetTaskOutcomeClientAction = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
