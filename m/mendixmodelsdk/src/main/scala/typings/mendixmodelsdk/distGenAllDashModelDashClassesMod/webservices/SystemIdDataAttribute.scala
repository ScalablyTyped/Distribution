package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.SystemIdDataAttribute")
@js.native
class SystemIdDataAttribute protected ()
  extends typings.mendixmodelsdk.distGenWebservicesMod.webservices.SystemIdDataAttribute {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.SystemIdDataAttribute")
@js.native
object SystemIdDataAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservices.SystemIdDataAttribute = js.native
  /**
    * Creates and returns a new SystemIdDataAttribute instance in the SDK and on the server.
    * The new SystemIdDataAttribute will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservices.DataEntityBase): typings.mendixmodelsdk.distGenWebservicesMod.webservices.SystemIdDataAttribute = js.native
}

