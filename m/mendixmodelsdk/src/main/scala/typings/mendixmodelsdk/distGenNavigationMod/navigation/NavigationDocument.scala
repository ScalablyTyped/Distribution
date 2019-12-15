package typings.mendixmodelsdk.distGenNavigationMod.navigation

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projects.Project
import typings.mendixmodelsdk.distGenProjectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IProjectDocument because Already inherited
- typings.mendixmodelsdk.distGenNavigationMod.navigation.INavigationDocument because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined profiles */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationDocument")
@js.native
class NavigationDocument protected () extends ProjectDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  @JSName("model")
  var model_FNavigationDocument: IModel = js.native
  /**
    * In version 7.2.0: introduced
    */
  @JSName("profiles")
  val profiles_FNavigationDocument: IList[INavigationProfileBase] = js.native
  @JSName("containerAsProject")
  def containerAsProject_MNavigationDocument(): Project = js.native
  /**
    * In version 7.2.0: deleted
    */
  def desktopProfile(): NavigationProfile = js.native
  def desktopProfile(newValue: NavigationProfile): js.Any = js.native
  /**
    * In version 7.2.0: deleted
    * In version 7.0.2: introduced
    */
  def hybridPhoneProfile(): NavigationProfile = js.native
  def hybridPhoneProfile(newValue: NavigationProfile): js.Any = js.native
  /**
    * In version 7.0.0: deleted
    * In version 6.10.4: introduced
    */
  def hybridPhoneProfile6(): NavigationProfile = js.native
  def hybridPhoneProfile6(newValue: NavigationProfile): js.Any = js.native
  /**
    * In version 7.2.0: deleted
    * In version 7.0.2: introduced
    */
  def hybridTabletProfile(): NavigationProfile = js.native
  def hybridTabletProfile(newValue: NavigationProfile): js.Any = js.native
  /**
    * In version 7.0.0: deleted
    * In version 6.10.4: introduced
    */
  def hybridTabletProfile6(): NavigationProfile = js.native
  def hybridTabletProfile6(newValue: NavigationProfile): js.Any = js.native
  /**
    * In version 7.0.2: deleted
    */
  def offlinePhoneProfile(): NavigationProfile = js.native
  def offlinePhoneProfile(newValue: NavigationProfile): js.Any = js.native
  /**
    * In version 7.2.0: deleted
    */
  def phoneProfile(): NavigationProfile = js.native
  def phoneProfile(newValue: NavigationProfile): js.Any = js.native
  /**
    * In version 7.2.0: introduced
    */
  def profiles(): IList[NavigationProfileBase] = js.native
  /**
    * In version 7.2.0: deleted
    */
  def tabletProfile(): NavigationProfile = js.native
  def tabletProfile(newValue: NavigationProfile): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationDocument")
@js.native
object NavigationDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new NavigationDocument unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  def createIn(container: IProject): NavigationDocument = js.native
}

