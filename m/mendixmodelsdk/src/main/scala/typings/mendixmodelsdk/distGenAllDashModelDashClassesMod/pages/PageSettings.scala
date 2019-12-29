package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ShowPageAction
import typings.mendixmodelsdk.distGenNavigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/opening-pages relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PageSettings")
@js.native
class PageSettings protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PageSettings")
@js.native
object PageSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'selectPageSettings' property
    * of the parent AssociationWidget element passed as argument.
    */
  def createInAssociationWidgetUnderSelectPageSettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.AssociationWidget): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInCreateObjectClientActionUnderPageSettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.CreateObjectClientAction): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent DataGridAddButton element passed as argument.
    */
  def createInDataGridAddButtonUnderPageSettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.DataGridAddButton): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInGridEditButtonUnderPageSettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.GridEditButton): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridNewButton element passed as argument.
    */
  def createInGridNewButtonUnderPageSettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.GridNewButton): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'loginPageSettings' property
    * of the parent navigation.NavigationProfile element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInNavigationProfileUnderLoginPageSettings(container: NavigationProfile): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInNewButtonUnderPageSettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.NewButton): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageClientAction element passed as argument.
    */
  def createInPageClientActionUnderPageSettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.PageClientAction): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageForSpecialization element passed as argument.
    */
  def createInPageForSpecializationUnderPageSettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.PageForSpecialization): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'gotoPageSettings' property
    * of the parent ReferenceSelector element passed as argument.
    */
  def createInReferenceSelectorUnderGotoPageSettings(container: typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSelector): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent microflows.ShowPageAction element passed as argument.
    */
  def createInShowPageActionUnderPageSettings(container: ShowPageAction): typings.mendixmodelsdk.distGenPagesMod.pages.PageSettings = js.native
}

