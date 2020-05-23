package typings.mendixmodelsdk.allModelClassesMod.rest

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.9.0: added public
  * In version 7.18.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.ODataEntity")
@js.native
class ODataEntity protected ()
  extends typings.mendixmodelsdk.restMod.rest.ODataEntity {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.ODataEntity")
@js.native
object ODataEntity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.restMod.rest.ODataEntity = js.native
  /**
    * Creates and returns a new ODataEntity instance in the SDK and on the server.
    * The new ODataEntity will be automatically stored in the 'entities' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.restMod.rest.ConsumedODataService): typings.mendixmodelsdk.restMod.rest.ODataEntity = js.native
}

