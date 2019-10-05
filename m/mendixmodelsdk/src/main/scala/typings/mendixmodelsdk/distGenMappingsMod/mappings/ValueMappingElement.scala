package typings.mendixmodelsdk.distGenMappingsMod.mappings

import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ValueMappingElement")
@js.native
abstract class ValueMappingElement protected () extends MappingElement {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var attribute: IAttribute | Null = js.native
  val attributeQualifiedName: String | Null = js.native
  var converter: IMicroflow | Null = js.native
  val converterQualifiedName: String | Null = js.native
  /**
    * In version 6.4.1: deleted
    */
  var expectedContentTypes: String = js.native
  var fractionDigits: Double = js.native
  var isContent: Boolean = js.native
  var isKey: Boolean = js.native
  var isXmlAttribute: Boolean = js.native
  var maxLength: Double = js.native
  var totalDigits: Double = js.native
  /**
    * In version 7.9.0: introduced
    */
  var `type`: DataType = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  var xmlDataType: String = js.native
  /**
    * In version 6.1.0: introduced
    */
  var xmlPrimitiveType: XmlPrimitiveType = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ValueMappingElement")
@js.native
object ValueMappingElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

