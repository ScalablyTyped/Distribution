package typings.mendixmodelsdk.mappingsMod.mappings

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter")
@js.native
class MappingMicroflowParameter protected ()
  extends typings.mendixmodelsdk.internalMod.Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMappingMicroflowParameter: IModel = js.native
  def containerAsMappingMicroflowCall(): MappingMicroflowCall = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  def jsonValueElementPath(): String = js.native
  def jsonValueElementPath(newValue: String): js.Any = js.native
  def levelOfParent(): Double = js.native
  def levelOfParent(newValue: Double): js.Any = js.native
  def parameter(): js.Any = js.native
  def parameter(newValue: IMicroflowParameter): js.Any = js.native
  def parameterQualifiedName(): String | Null = js.native
  @JSName("parameter")
  def parameter_Union(): IMicroflowParameter | Null = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: deleted
    */
  def valueElementPath(): String = js.native
  def valueElementPath(newValue: String): js.Any = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  def xmlValueElementPath(): String = js.native
  def xmlValueElementPath(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter")
@js.native
object MappingMicroflowParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MappingMicroflowParameter = js.native
  /**
    * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
    * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
    * of the parent MappingMicroflowCall element passed as argument.
    */
  def createIn(container: MappingMicroflowCall): MappingMicroflowParameter = js.native
}

