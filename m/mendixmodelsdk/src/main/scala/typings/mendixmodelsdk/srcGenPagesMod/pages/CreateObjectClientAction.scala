package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EntityRef
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
  * In version 7.17.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.CreateObjectClientAction")
@js.native
open class CreateObjectClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def entityRef: EntityRef | Null = js.native
  def entityRef_=(newValue: EntityRef | Null): Unit = js.native
  
  /**
    * In version 8.14.0: deleted
    * In version 8.11.0: introduced
    */
  def numberOfPagesToClose: Double = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.14.0: introduced
    */
  def numberOfPagesToClose2: String = js.native
  def numberOfPagesToClose2_=(newValue: String): Unit = js.native
  
  def numberOfPagesToClose_=(newValue: Double): Unit = js.native
  
  def pageSettings: PageSettings = js.native
  def pageSettings_=(newValue: PageSettings): Unit = js.native
}
object CreateObjectClientAction {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.CreateObjectClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInActionButtonUnderAction(container: ActionButton): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInActionItemUnderAction(container: ActionItem): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 8.14.0
    */
  /* static member */
  inline def createInBottomBarItemUnderAction(container: BottomBarItem): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  inline def createInDivContainerUnderOnClickAction(container: DivContainer): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderOnClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  inline def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInGridActionButtonUnderAction(container: GridActionButton): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInListViewUnderClickAction(container: ListView): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInListViewUnderPullDownAction(container: ListView): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderPullDownAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInMenuItemUnderAction(container: MenuItem): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  /* static member */
  inline def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderOnEnterKeyPressAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderAction(container: WidgetValue): CreateObjectClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[CreateObjectClientAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.CreateObjectClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.CreateObjectClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
