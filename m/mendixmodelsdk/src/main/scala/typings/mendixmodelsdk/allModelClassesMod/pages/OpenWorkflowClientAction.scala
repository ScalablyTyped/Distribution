package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.OpenWorkflowClientAction")
@js.native
class OpenWorkflowClientAction protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object OpenWorkflowClientAction {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.OpenWorkflowClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInActionButtonUnderAction(container: typings.mendixmodelsdk.pagesMod.pages.ActionButton): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInActionItemUnderAction(container: typings.mendixmodelsdk.pagesMod.pages.ActionItem): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAssociationWidgetUnderOnChangeAction(container: typings.mendixmodelsdk.pagesMod.pages.AssociationWidget): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderOnChangeAction(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderOnEnterAction(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderOnLeaveAction(container: typings.mendixmodelsdk.pagesMod.pages.AttributeWidget): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDivContainerUnderOnClickAction(container: typings.mendixmodelsdk.pagesMod.pages.DivContainer): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderOnClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDynamicImageViewerUnderClickAction(container: typings.mendixmodelsdk.pagesMod.pages.DynamicImageViewer): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGridActionButtonUnderAction(container: typings.mendixmodelsdk.pagesMod.pages.GridActionButton): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewUnderClickAction(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewUnderPullDownAction(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderPullDownAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInMenuItemUnderAction(container: MenuItem): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInReferenceSetSelectorUnderOnChangeAction(container: typings.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInStaticImageViewerUnderClickAction(container: typings.mendixmodelsdk.pagesMod.pages.StaticImageViewer): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTextBoxUnderOnEnterKeyPressAction(container: typings.mendixmodelsdk.pagesMod.pages.TextBox): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderOnEnterKeyPressAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /**
    * Creates and returns a new OpenWorkflowClientAction instance in the SDK and on the server.
    * The new OpenWorkflowClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderAction(container: WidgetValue): typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.OpenWorkflowClientAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.OpenWorkflowClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.OpenWorkflowClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
