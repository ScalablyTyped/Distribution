package typings.mendixmodelsdk.mappingsMod.mappings

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ValueMappingElement")
@js.native
abstract class ValueMappingElement protected () extends MappingElement {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def attribute: IAttribute | Null = js.native
  
  def attributeQualifiedName: String | Null = js.native
  
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def converter: IMicroflow | Null = js.native
  
  def converterQualifiedName: String | Null = js.native
  
  def converter_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 6.4.1: deleted
    */
  def expectedContentTypes: String = js.native
  def expectedContentTypes_=(newValue: String): Unit = js.native
  
  def fractionDigits: Double = js.native
  def fractionDigits_=(newValue: Double): Unit = js.native
  
  def isContent: Boolean = js.native
  def isContent_=(newValue: Boolean): Unit = js.native
  
  def isKey: Boolean = js.native
  def isKey_=(newValue: Boolean): Unit = js.native
  
  def isXmlAttribute: Boolean = js.native
  def isXmlAttribute_=(newValue: Boolean): Unit = js.native
  
  def maxLength: Double = js.native
  def maxLength_=(newValue: Double): Unit = js.native
  
  def totalDigits: Double = js.native
  def totalDigits_=(newValue: Double): Unit = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def `type`: DataType = js.native
  def type_=(newValue: DataType): Unit = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def xmlDataType: String = js.native
  def xmlDataType_=(newValue: String): Unit = js.native
  
  /**
    * In version 6.1.0: introduced
    */
  def xmlPrimitiveType: XmlPrimitiveType = js.native
  def xmlPrimitiveType_=(newValue: XmlPrimitiveType): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ValueMappingElement")
@js.native
object ValueMappingElement extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
