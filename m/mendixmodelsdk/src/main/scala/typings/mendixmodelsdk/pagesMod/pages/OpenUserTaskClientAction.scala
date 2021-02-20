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
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction")
@js.native
class OpenUserTaskClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object OpenUserTaskClientAction {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.create")
  @js.native
  def create(model: IModel): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInActionButtonUnderAction")
  @js.native
  def createInActionButtonUnderAction(container: ActionButton): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInActionItemUnderAction")
  @js.native
  def createInActionItemUnderAction(container: ActionItem): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInAssociationWidgetUnderOnChangeAction")
  @js.native
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInAttributeWidgetUnderOnChangeAction")
  @js.native
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInAttributeWidgetUnderOnEnterAction")
  @js.native
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInAttributeWidgetUnderOnLeaveAction")
  @js.native
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInDivContainerUnderOnClickAction")
  @js.native
  def createInDivContainerUnderOnClickAction(container: DivContainer): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInDynamicImageViewerUnderClickAction")
  @js.native
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInGridActionButtonUnderAction")
  @js.native
  def createInGridActionButtonUnderAction(container: GridActionButton): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInListViewUnderClickAction")
  @js.native
  def createInListViewUnderClickAction(container: ListView): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInListViewUnderPullDownAction")
  @js.native
  def createInListViewUnderPullDownAction(container: ListView): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInMenuItemUnderAction")
  @js.native
  def createInMenuItemUnderAction(container: MenuItem): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInReferenceSetSelectorUnderOnChangeAction")
  @js.native
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInStaticImageViewerUnderClickAction")
  @js.native
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInTextBoxUnderOnEnterKeyPressAction")
  @js.native
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): OpenUserTaskClientAction = js.native
  
  /**
    * Creates and returns a new OpenUserTaskClientAction instance in the SDK and on the server.
    * The new OpenUserTaskClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.createInWidgetValueUnderAction")
  @js.native
  def createInWidgetValueUnderAction(container: WidgetValue): OpenUserTaskClientAction = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.OpenUserTaskClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
