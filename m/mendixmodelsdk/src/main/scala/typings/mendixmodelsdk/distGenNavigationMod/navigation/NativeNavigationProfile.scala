package typings.mendixmodelsdk.distGenNavigationMod.navigation

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenNativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenPagesMod.pages.IPage
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.22.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenNavigationMod.navigation.INavigationProfileBase because Already inherited
- typings.mendixmodelsdk.distGenNavigationMod.navigation.INativeNavigationProfile because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NativeNavigationProfile")
@js.native
class NativeNavigationProfile protected () extends NavigationProfileBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: introduced
    */
  val bottomBarItems: IList[BottomBarItem] = js.native
  @JSName("containerAsNavigationDocument")
  val containerAsNavigationDocument_NativeNavigationProfile: NavigationDocument = js.native
  var homePage: IPage | Null = js.native
  val homePageQualifiedName: String | Null = js.native
  /**
    * In version 8.0.0: introduced
    */
  val roleBasedNativeHomePages: IList[RoleBasedNativeHomePage] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NativeNavigationProfile")
@js.native
object NativeNavigationProfile extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NativeNavigationProfile = js.native
  /**
    * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
    * The new NativeNavigationProfile will be automatically stored in the 'profiles' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: NavigationDocument): NativeNavigationProfile = js.native
}

