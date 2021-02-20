package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.ShowPageAction
import typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/on-click-event relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.PageSettings")
@js.native
class PageSettings protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.PageSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PageSettings {
  
  @JSImport("mendixmodelsdk", "pages.PageSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'selectPageSettings' property
    * of the parent AssociationWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInAssociationWidgetUnderSelectPageSettings")
  @js.native
  def createInAssociationWidgetUnderSelectPageSettings(container: typings.mendixmodelsdk.pagesMod.pages.AssociationWidget): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInCreateObjectClientActionUnderPageSettings")
  @js.native
  def createInCreateObjectClientActionUnderPageSettings(container: typings.mendixmodelsdk.pagesMod.pages.CreateObjectClientAction): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent DataGridAddButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInDataGridAddButtonUnderPageSettings")
  @js.native
  def createInDataGridAddButtonUnderPageSettings(container: typings.mendixmodelsdk.pagesMod.pages.DataGridAddButton): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInGridEditButtonUnderPageSettings")
  @js.native
  def createInGridEditButtonUnderPageSettings(container: typings.mendixmodelsdk.pagesMod.pages.GridEditButton): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridNewButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInGridNewButtonUnderPageSettings")
  @js.native
  def createInGridNewButtonUnderPageSettings(container: typings.mendixmodelsdk.pagesMod.pages.GridNewButton): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'loginPageSettings' property
    * of the parent navigation.NavigationProfile element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInNavigationProfileUnderLoginPageSettings")
  @js.native
  def createInNavigationProfileUnderLoginPageSettings(container: NavigationProfile): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInNewButtonUnderPageSettings")
  @js.native
  def createInNewButtonUnderPageSettings(container: typings.mendixmodelsdk.pagesMod.pages.NewButton): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageClientAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInPageClientActionUnderPageSettings")
  @js.native
  def createInPageClientActionUnderPageSettings(container: typings.mendixmodelsdk.pagesMod.pages.PageClientAction): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageForSpecialization element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInPageForSpecializationUnderPageSettings")
  @js.native
  def createInPageForSpecializationUnderPageSettings(container: typings.mendixmodelsdk.pagesMod.pages.PageForSpecialization): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'gotoPageSettings' property
    * of the parent ReferenceSelector element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInReferenceSelectorUnderGotoPageSettings")
  @js.native
  def createInReferenceSelectorUnderGotoPageSettings(container: typings.mendixmodelsdk.pagesMod.pages.ReferenceSelector): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent microflows.ShowPageAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.createInShowPageActionUnderPageSettings")
  @js.native
  def createInShowPageActionUnderPageSettings(container: ShowPageAction): typings.mendixmodelsdk.pagesMod.pages.PageSettings = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.PageSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
