package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.19.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping")
@js.native
class MicroflowParameterMapping protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsMicroflowSettings: MicroflowSettings = js.native
  @JSName("model")
  var model_MicroflowParameterMapping: IModel = js.native
  var parameter: IMicroflowParameter = js.native
  val parameterQualifiedName: String = js.native
  var useAllPages: Boolean = js.native
  var widget: EntityWidget | Null = js.native
  val widgetLocalName: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping")
@js.native
object MicroflowParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MicroflowParameterMapping = js.native
  /**
    * Creates and returns a new MicroflowParameterMapping instance in the SDK and on the server.
    * The new MicroflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createIn(container: MicroflowSettings): MicroflowParameterMapping = js.native
}

