package typings.mendixmodelsdk.distGenNavigationMod.navigation

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.22.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntityConfig")
@js.native
class OfflineEntityConfig protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  var constraint: String = js.native
  val containerAsNavigationProfileBase: NavigationProfileBase = js.native
  var entity: IEntity = js.native
  val entityQualifiedName: String = js.native
  @JSName("model")
  var model_OfflineEntityConfig: IModel = js.native
  var shouldDownload: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntityConfig")
@js.native
object OfflineEntityConfig extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): OfflineEntityConfig = js.native
  /**
    * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
    * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
    * of the parent NavigationProfileBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: NavigationProfileBase): OfflineEntityConfig = js.native
}

