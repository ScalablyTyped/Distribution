package typings.mendixmodelsdk.distGenNavigationMod.navigation

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
- typings.mendixmodelsdk.distGenNavigationMod.navigation.INavigationDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined profiles */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationDocument")
@js.native
class NavigationDocument protected () extends ProjectDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  @JSName("containerAsProject")
  val containerAsProject_NavigationDocument: Project = js.native
  /**
    * In version 7.2.0: deleted
    */
  var desktopProfile: NavigationProfile = js.native
  /**
    * In version 7.2.0: deleted
    * In version 7.0.2: introduced
    */
  var hybridPhoneProfile: NavigationProfile = js.native
  /**
    * In version 7.0.0: deleted
    * In version 6.10.4: introduced
    */
  var hybridPhoneProfile6: NavigationProfile = js.native
  /**
    * In version 7.2.0: deleted
    * In version 7.0.2: introduced
    */
  var hybridTabletProfile: NavigationProfile = js.native
  /**
    * In version 7.0.0: deleted
    * In version 6.10.4: introduced
    */
  var hybridTabletProfile6: NavigationProfile = js.native
  /**
    * In version 7.0.2: deleted
    */
  var offlinePhoneProfile: NavigationProfile = js.native
  /**
    * In version 7.2.0: deleted
    */
  var phoneProfile: NavigationProfile = js.native
  /**
    * In version 7.2.0: introduced
    */
  val profiles: IList[INavigationProfileBase | NavigationProfileBase] = js.native
  /**
    * In version 7.2.0: deleted
    */
  var tabletProfile: NavigationProfile = js.native
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

