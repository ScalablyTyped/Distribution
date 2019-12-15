package typings.mendixmodelsdk.distGenWebservicesMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 6.7.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.SystemIdDataAttribute")
@js.native
class SystemIdDataAttribute protected () extends DataMember {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSystemIdDataAttribute: IModel = js.native
  /**
    * In version 8.5.0: introduced
    */
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def entity(): IEntity | Null = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName(): String | Null = js.native
  @JSName("entity")
  def entity_Any(): js.Any = js.native
  /**
    * In version 8.5.0: introduced
    */
  def summary(): String = js.native
  def summary(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.SystemIdDataAttribute")
@js.native
object SystemIdDataAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SystemIdDataAttribute = js.native
  /**
    * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
    * The new SystemIdDataAttribute will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 and higher
    */
  def createIn(container: DataEntityBase): SystemIdDataAttribute = js.native
}

