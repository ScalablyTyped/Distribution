package typings.mendixmodelsdk.distGenMappingsMod.mappings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
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
  @JSName("model")
  var model_FValueMappingElement: IModel = js.native
  def attribute(): IAttribute | Null = js.native
  def attribute(newValue: IAttribute): js.Any = js.native
  def attributeQualifiedName(): String | Null = js.native
  @JSName("attribute")
  def attribute_Any(): js.Any = js.native
  def converter(): IMicroflow | Null = js.native
  def converter(newValue: IMicroflow): js.Any = js.native
  def converterQualifiedName(): String | Null = js.native
  @JSName("converter")
  def converter_Any(): js.Any = js.native
  /**
    * In version 6.4.1: deleted
    */
  def expectedContentTypes(): String = js.native
  def expectedContentTypes(newValue: String): js.Any = js.native
  def fractionDigits(): Double = js.native
  def fractionDigits(newValue: Double): js.Any = js.native
  def isContent(): Boolean = js.native
  def isContent(newValue: Boolean): js.Any = js.native
  def isKey(): Boolean = js.native
  def isKey(newValue: Boolean): js.Any = js.native
  def isXmlAttribute(): Boolean = js.native
  def isXmlAttribute(newValue: Boolean): js.Any = js.native
  def maxLength(): Double = js.native
  def maxLength(newValue: Double): js.Any = js.native
  def totalDigits(): Double = js.native
  def totalDigits(newValue: Double): js.Any = js.native
  /**
    * In version 7.9.0: introduced
    */
  def `type`(): DataType = js.native
  def `type`(newValue: DataType): js.Any = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def xmlDataType(): String = js.native
  def xmlDataType(newValue: String): js.Any = js.native
  /**
    * In version 6.1.0: introduced
    */
  def xmlPrimitiveType(): XmlPrimitiveType = js.native
  def xmlPrimitiveType(newValue: XmlPrimitiveType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ValueMappingElement")
@js.native
object ValueMappingElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

