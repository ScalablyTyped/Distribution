package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.instancesMod.IList
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

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageClientAction")
@js.native
class PageClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
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
  
  /**
    * In version 7.17.0: introduced
    */
  def pagesForSpecializations: IList[PageForSpecialization] = js.native
}
object PageClientAction {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInActionButtonUnderAction(container: ActionButton): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInActionItemUnderAction(container: ActionItem): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 8.14.0
    */
  /* static member */
  @scala.inline
  def createInBottomBarItemUnderAction(container: BottomBarItem): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent DataViewActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  /* static member */
  @scala.inline
  def createInDataViewActionButtonUnderAction(container: DataViewActionButton): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDivContainerUnderOnClickAction(container: DivContainer): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderOnClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInGridActionButtonUnderAction(container: GridActionButton): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInListViewUnderClickAction(container: ListView): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewUnderPullDownAction(container: ListView): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderPullDownAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInMenuItemUnderAction(container: MenuItem): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderOnEnterKeyPressAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderAction(container: WidgetValue): PageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[PageClientAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
