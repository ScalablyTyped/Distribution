package typings.mendixmodelsdk.distGenMappingsMod.mappings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingElement")
@js.native
abstract class MappingElement protected ()
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
  var model_FMappingElement: IModel = js.native
  def containerAsMappingDocument(): MappingDocument = js.native
  def containerAsObjectMappingElement(): ObjectMappingElement = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def elementType(): ElementType = js.native
  def elementType(newValue: ElementType): js.Any = js.native
  /**
    * In version 6.6.0: introduced
    */
  def exposedName(): String = js.native
  def exposedName(newValue: String): js.Any = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  def jsonPath(): String = js.native
  def jsonPath(newValue: String): js.Any = js.native
  def maxOccurs(): Double = js.native
  def maxOccurs(newValue: Double): js.Any = js.native
  def minOccurs(): Double = js.native
  def minOccurs(newValue: Double): js.Any = js.native
  def nillable(): Boolean = js.native
  def nillable(newValue: Boolean): js.Any = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: deleted
    */
  def path(): String = js.native
  def path(newValue: String): js.Any = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  def xmlPath(): String = js.native
  def xmlPath(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingElement")
@js.native
object MappingElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

