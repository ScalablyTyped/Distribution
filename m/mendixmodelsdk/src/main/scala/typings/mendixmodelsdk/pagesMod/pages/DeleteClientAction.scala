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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.17.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DeleteClientAction")
@js.native
class DeleteClientAction protected () extends ClientAction {
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
}
object DeleteClientAction {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DeleteClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInActionButtonUnderAction(container: ActionButton): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInActionItemUnderAction(container: ActionItem): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 8.14.0
    */
  /* static member */
  @scala.inline
  def createInBottomBarItemUnderAction(container: BottomBarItem): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDivContainerUnderOnClickAction(container: DivContainer): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderOnClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGridActionButtonUnderAction(container: GridActionButton): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewUnderClickAction(container: ListView): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewUnderPullDownAction(container: ListView): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderPullDownAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInMenuItemUnderAction(container: MenuItem): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderOnEnterKeyPressAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /**
    * Creates and returns a new DeleteClientAction instance in the SDK and on the server.
    * The new DeleteClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderAction(container: WidgetValue): DeleteClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[DeleteClientAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DeleteClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DeleteClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
