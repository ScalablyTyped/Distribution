package typings.mendixmodelsdk.mappingsMod.mappings

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter")
@js.native
class MappingMicroflowParameter protected ()
  extends typings.mendixmodelsdk.internalMod.Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsMappingMicroflowCall: MappingMicroflowCall = js.native
  
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  def jsonValueElementPath: String = js.native
  def jsonValueElementPath_=(newValue: String): Unit = js.native
  
  def levelOfParent: Double = js.native
  def levelOfParent_=(newValue: Double): Unit = js.native
  
  def parameter: IMicroflowParameter | Null = js.native
  
  def parameterQualifiedName: String | Null = js.native
  
  def parameter_=(newValue: IMicroflowParameter | Null): Unit = js.native
  
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: deleted
    */
  def valueElementPath: String = js.native
  def valueElementPath_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  def xmlValueElementPath: String = js.native
  def xmlValueElementPath_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter")
@js.native
object MappingMicroflowParameter extends js.Object {
  
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
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
