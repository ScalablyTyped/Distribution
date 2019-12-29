package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.22.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.ODataNavigationProperty")
@js.native
class ODataNavigationProperty protected ()
  extends typings.mendixmodelsdk.distGenRestMod.rest.ODataNavigationProperty {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.ODataNavigationProperty")
@js.native
object ODataNavigationProperty extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataNavigationProperty instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.rest.ODataNavigationProperty = js.native
  /**
    * Creates and returns a new ODataNavigationProperty instance in the SDK and on the server.
    * The new ODataNavigationProperty will be automatically stored in the 'navigationProperties' property
    * of the parent ODataEntity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.distGenRestMod.rest.ODataEntity): typings.mendixmodelsdk.distGenRestMod.rest.ODataNavigationProperty = js.native
}

