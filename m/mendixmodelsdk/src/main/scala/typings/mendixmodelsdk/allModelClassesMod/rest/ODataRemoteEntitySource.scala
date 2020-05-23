package typings.mendixmodelsdk.allModelClassesMod.rest

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.10.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.ODataRemoteEntitySource")
@js.native
class ODataRemoteEntitySource protected ()
  extends typings.mendixmodelsdk.restMod.rest.ODataRemoteEntitySource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.ODataRemoteEntitySource")
@js.native
object ODataRemoteEntitySource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.restMod.rest.ODataRemoteEntitySource = js.native
  /**
    * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
    * The new ODataRemoteEntitySource will be automatically stored in the 'source' property
    * of the parent domainmodels.Entity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: Entity): typings.mendixmodelsdk.restMod.rest.ODataRemoteEntitySource = js.native
}

