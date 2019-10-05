package typings.mendixmodelsdk.mendixmodelsdkMod.navigation

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.22.0: introduced
  */
@JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig")
@js.native
class OfflineEntityConfig protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation.OfflineEntityConfig {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig")
@js.native
object OfflineEntityConfig extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenNavigationMod.navigation.OfflineEntityConfig = js.native
  /**
    * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
    * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
    * of the parent NavigationProfileBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.distGenNavigationMod.navigation.NavigationProfileBase): typings.mendixmodelsdk.distGenNavigationMod.navigation.OfflineEntityConfig = js.native
}

