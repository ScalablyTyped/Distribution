package typings.mendixmodelsdk.distGenRestMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
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
  * In version 7.18.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataEntity")
@js.native
class ODataEntity protected () extends Element {
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
  val attributes: IList[ODataAttribute] = js.native
  val containerAsConsumedODataService: ConsumedODataService = js.native
  var entity: IEntity = js.native
  val entityQualifiedName: String = js.native
  /**
    * In version 7.19.0: introduced
    */
  var entitySet: String = js.native
  /**
    * In version 7.22.0: introduced
    */
  val keyNames: IList[String] = js.native
  @JSName("model")
  var model_ODataEntity: IModel = js.native
  var name: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  val navigationProperties: IList[ODataNavigationProperty] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataEntity")
@js.native
object ODataEntity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ODataEntity = js.native
  /**
    * Creates and returns a new ODataEntity instance in the SDK and on the server.
    * The new ODataEntity will be automatically stored in the 'entities' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createIn(container: ConsumedODataService): ODataEntity = js.native
}

