package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.22.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.NativeNavigationProfile")
@js.native
class NativeNavigationProfile protected ()
  extends typings.mendixmodelsdk.distGenNavigationMod.navigation.NativeNavigationProfile {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.NativeNavigationProfile")
@js.native
object NativeNavigationProfile extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenNavigationMod.navigation.NativeNavigationProfile = js.native
  /**
    * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
    * The new NativeNavigationProfile will be automatically stored in the 'profiles' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.distGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.distGenNavigationMod.navigation.NativeNavigationProfile = js.native
}

