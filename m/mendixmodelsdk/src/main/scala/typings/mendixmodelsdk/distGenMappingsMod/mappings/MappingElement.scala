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
  val containerAsMappingDocument: MappingDocument = js.native
  val containerAsObjectMappingElement: ObjectMappingElement = js.native
  var documentation: String = js.native
  var elementType: ElementType = js.native
  /**
    * In version 6.6.0: introduced
    */
  var exposedName: String = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  var jsonPath: String = js.native
  var maxOccurs: Double = js.native
  var minOccurs: Double = js.native
  @JSName("model")
  var model_MappingElement: IModel = js.native
  var nillable: Boolean = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: deleted
    */
  var path: String = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  var xmlPath: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingElement")
@js.native
object MappingElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

