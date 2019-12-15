package typings.mendixmodelsdk.distGenMappingsMod.mappings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall")
@js.native
class MappingMicroflowCall protected ()
  extends typings.mendixmodelsdk.distSdkInternalMod.Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMappingMicroflowCall: IModel = js.native
  def containerAsObjectMappingElement(): ObjectMappingElement = js.native
  def microflow(): IMicroflow | Null = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  @JSName("microflow")
  def microflow_Any(): js.Any = js.native
  def parameterMappings(): IList[MappingMicroflowParameter] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall")
@js.native
object MappingMicroflowCall extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MappingMicroflowCall = js.native
  /**
    * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
    * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
    * of the parent ObjectMappingElement element passed as argument.
    */
  def createIn(container: ObjectMappingElement): MappingMicroflowCall = js.native
}

