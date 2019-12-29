package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.19.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.NanoflowParameterMapping")
@js.native
class NanoflowParameterMapping protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.NanoflowParameterMapping {
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
@JSImport("mendixmodelsdk", "pages.NanoflowParameterMapping")
@js.native
object NanoflowParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NanoflowParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.NanoflowParameterMapping = js.native
  /**
    * Creates and returns a new NanoflowParameterMapping instance in the SDK and on the server.
    * The new NanoflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInCallNanoflowClientActionUnderParameterMappings(container: typings.mendixmodelsdk.distGenPagesMod.pages.CallNanoflowClientAction): typings.mendixmodelsdk.distGenPagesMod.pages.NanoflowParameterMapping = js.native
  /**
    * Creates and returns a new NanoflowParameterMapping instance in the SDK and on the server.
    * The new NanoflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent NanoflowSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInNanoflowSourceUnderParameterMappings(container: typings.mendixmodelsdk.distGenPagesMod.pages.NanoflowSource): typings.mendixmodelsdk.distGenPagesMod.pages.NanoflowParameterMapping = js.native
}

