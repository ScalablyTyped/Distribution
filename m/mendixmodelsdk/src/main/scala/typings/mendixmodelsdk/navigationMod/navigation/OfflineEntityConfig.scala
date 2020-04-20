package typings.mendixmodelsdk.navigationMod.navigation

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.navigationMod.StructureVersionInfo
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
  @JSName("model")
  var model_FOfflineEntityConfig: IModel = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def constraint: String = js.native
  def constraint(newValue: String): js.Any = js.native
  def containerAsNavigationProfileBase: NavigationProfileBase = js.native
  def entity: IEntity = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName: String = js.native
  def shouldDownload: Boolean = js.native
  def shouldDownload(newValue: Boolean): js.Any = js.native
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

