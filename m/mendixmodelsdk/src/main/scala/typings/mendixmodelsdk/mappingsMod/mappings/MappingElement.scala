package typings.mendixmodelsdk.mappingsMod.mappings

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingElement")
@js.native
abstract class MappingElement protected ()
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
  var model_FMappingElement: IModel = js.native
  def containerAsMappingDocument: MappingDocument = js.native
  def containerAsObjectMappingElement: ObjectMappingElement = js.native
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  def elementType: ElementType = js.native
  def elementType_=(newValue: ElementType): Unit = js.native
  /**
    * In version 6.6.0: introduced
    */
  def exposedName: String = js.native
  def exposedName_=(newValue: String): Unit = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  def jsonPath: String = js.native
  def jsonPath_=(newValue: String): Unit = js.native
  def maxOccurs: Double = js.native
  def maxOccurs_=(newValue: Double): Unit = js.native
  def minOccurs: Double = js.native
  def minOccurs_=(newValue: Double): Unit = js.native
  def nillable: Boolean = js.native
  def nillable_=(newValue: Boolean): Unit = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: deleted
    */
  def path: String = js.native
  def path_=(newValue: String): Unit = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  def xmlPath: String = js.native
  def xmlPath_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingElement")
@js.native
object MappingElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

