package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.ShowPageAction
import typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
import typings.mendixmodelsdk.workflowsMod.workflows.UserTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/opening-pages relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings")
@js.native
class PageSettings protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FPageSettings: IModel = js.native
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
  def containerAsUserTask: UserTask = js.native
  def formTitle(): js.Any = js.native
  def formTitle(newValue: Text): js.Any = js.native
  @JSName("formTitle")
  def formTitle_Union: Text | Null = js.native
  /**
    * In version 8.0.0: deleted
    */
  def location: FormLocation = js.native
  def location(newValue: FormLocation): js.Any = js.native
  def page(): js.Any = js.native
  def page(newValue: IPage): js.Any = js.native
  def pageQualifiedName: String | Null = js.native
  @JSName("page")
  def page_Union: IPage | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageSettings")
@js.native
object PageSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'selectPageSettings' property
    * of the parent AssociationWidget element passed as argument.
    */
  def createInAssociationWidgetUnderSelectPageSettings(container: AssociationWidget): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInCreateObjectClientActionUnderPageSettings(container: CreateObjectClientAction): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent DataGridAddButton element passed as argument.
    */
  def createInDataGridAddButtonUnderPageSettings(container: DataGridAddButton): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridEditButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInGridEditButtonUnderPageSettings(container: GridEditButton): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent GridNewButton element passed as argument.
    */
  def createInGridNewButtonUnderPageSettings(container: GridNewButton): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'loginPageSettings' property
    * of the parent navigation.NavigationProfile element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInNavigationProfileUnderLoginPageSettings(container: NavigationProfile): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.16.0
    */
  def createInNewButtonUnderPageSettings(container: NewButton): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageClientAction element passed as argument.
    */
  def createInPageClientActionUnderPageSettings(container: PageClientAction): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent PageForSpecialization element passed as argument.
    */
  def createInPageForSpecializationUnderPageSettings(container: PageForSpecialization): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'gotoPageSettings' property
    * of the parent ReferenceSelector element passed as argument.
    */
  def createInReferenceSelectorUnderGotoPageSettings(container: ReferenceSelector): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'pageSettings' property
    * of the parent microflows.ShowPageAction element passed as argument.
    */
  def createInShowPageActionUnderPageSettings(container: ShowPageAction): PageSettings = js.native
  /**
    * Creates and returns a new PageSettings instance in the SDK and on the server.
    * The new PageSettings will be automatically stored in the 'page' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  def createInUserTaskUnderPage(container: UserTask): PageSettings = js.native
}

