package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.1.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.SignOutClientAction")
@js.native
open class SignOutClientAction protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.SignOutClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object SignOutClientAction {
  
  @JSImport("mendixmodelsdk", "pages.SignOutClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  /* static member */
  inline def createInActionButtonUnderAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ActionButton): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  /* static member */
  inline def createInActionItemUnderAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ActionItem): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  inline def createInAssociationWidgetUnderOnChangeAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.AssociationWidget): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnChangeAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnEnterAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnLeaveAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 8.14.0
    */
  /* static member */
  inline def createInBottomBarItemUnderAction(container: BottomBarItem): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  inline def createInDivContainerUnderOnClickAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.DivContainer): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderOnClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  inline def createInDynamicImageViewerUnderClickAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.DynamicImageViewer): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  /* static member */
  inline def createInGridActionButtonUnderAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.GridActionButton): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  /* static member */
  inline def createInListViewUnderClickAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ListView): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInListViewUnderPullDownAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ListView): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderPullDownAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  /* static member */
  inline def createInMenuItemUnderAction(container: MenuItem): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderOnChangeAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 and higher
    */
  /* static member */
  inline def createInStaticImageViewerUnderClickAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.StaticImageViewer): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  /* static member */
  inline def createInTextBoxUnderOnEnterKeyPressAction(container: typings.mendixmodelsdk.srcGenPagesMod.pages.TextBox): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderOnEnterKeyPressAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /**
    * Creates and returns a new SignOutClientAction instance in the SDK and on the server.
    * The new SignOutClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderAction(container: WidgetValue): typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.SignOutClientAction]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.SignOutClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.SignOutClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
