package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.ShowPageAction
import typings.mendixmodelsdk.microflowsMod.microflows.TextTemplate
import typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/on-click-event relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings")
@js.native
class PageSettings protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAssociationWidget: AssociationWidget = js.native
  
  def containerAsCreateObjectClientAction: CreateObjectClientAction = js.native
  
  def containerAsDataGridAddButton: DataGridAddButton = js.native
  
  def containerAsGridEditButton: GridEditButton = js.native
  
  def containerAsGridNewButton: GridNewButton = js.native
  
  def containerAsNavigationProfile: NavigationProfile = js.native
  
  def containerAsNewButton: NewButton = js.native
  
  def containerAsPageClientAction: PageClientAction = js.native
  
  def containerAsPageForSpecialization: PageForSpecialization = js.native
  
  def containerAsReferenceSelector: ReferenceSelector = js.native
  
  def containerAsShowPageAction: ShowPageAction = js.native
  
  /**
    * In version 8.12.0: deleted
    */
  def formTitle: Text | Null = js.native
  def formTitle_=(newValue: Text | Null): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def location: FormLocation = js.native
  def location_=(newValue: FormLocation): Unit = js.native
  
  def page: IPage | Null = js.native
  
  def pageQualifiedName: String | Null = js.native
  
  def page_=(newValue: IPage | Null): Unit = js.native
  
  /**
    * In version 8.12.0: introduced
    */
  def titleOverride: TextTemplate | Null = js.native
  def titleOverride_=(newValue: TextTemplate | Null): Unit = js.native
}
object PageSettings {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.create")
  @js.native
  def create(model: IModel): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'selectPageSettings' property
    * of the parent AssociationWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInAssociationWidgetUnderSelectPageSettings")
  @js.native
  def createInAssociationWidgetUnderSelectPageSettings(container: AssociationWidget): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInCreateObjectClientActionUnderPageSettings")
  @js.native
  def createInCreateObjectClientActionUnderPageSettings(container: CreateObjectClientAction): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent DataGridAddButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInDataGridAddButtonUnderPageSettings")
  @js.native
  def createInDataGridAddButtonUnderPageSettings(container: DataGridAddButton): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInGridEditButtonUnderPageSettings")
  @js.native
  def createInGridEditButtonUnderPageSettings(container: GridEditButton): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridNewButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInGridNewButtonUnderPageSettings")
  @js.native
  def createInGridNewButtonUnderPageSettings(container: GridNewButton): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'loginPageSettings' property
    * of the parent navigation.NavigationProfile element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInNavigationProfileUnderLoginPageSettings")
  @js.native
  def createInNavigationProfileUnderLoginPageSettings(container: NavigationProfile): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInNewButtonUnderPageSettings")
  @js.native
  def createInNewButtonUnderPageSettings(container: NewButton): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageClientAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInPageClientActionUnderPageSettings")
  @js.native
  def createInPageClientActionUnderPageSettings(container: PageClientAction): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageForSpecialization element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInPageForSpecializationUnderPageSettings")
  @js.native
  def createInPageForSpecializationUnderPageSettings(container: PageForSpecialization): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'gotoPageSettings' property
    * of the parent ReferenceSelector element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInReferenceSelectorUnderGotoPageSettings")
  @js.native
  def createInReferenceSelectorUnderGotoPageSettings(container: ReferenceSelector): PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent microflows.ShowPageAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.createInShowPageActionUnderPageSettings")
  @js.native
  def createInShowPageActionUnderPageSettings(container: ShowPageAction): PageSettings = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
