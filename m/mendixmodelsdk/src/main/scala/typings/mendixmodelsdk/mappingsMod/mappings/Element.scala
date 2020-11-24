package typings.mendixmodelsdk.mappingsMod.mappings

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typings.mendixmodelsdk.mappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
  */
/**
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.Element")
@js.native
abstract class Element protected ()
  extends typings.mendixmodelsdk.internalMod.Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def children: IList[Element] = js.native
  
  def containerAsElement: Element = js.native
  
  def containerAsEntityMessageDefinition: EntityMessageDefinition = js.native
  
  def containerAsJsonStructure: JsonStructure = js.native
  
  def elementType: ElementType = js.native
  def elementType_=(newValue: ElementType): Unit = js.native
  
  def errorMessage: String = js.native
  def errorMessage_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.6.0: introduced
    */
  def exposedItemName: String = js.native
  def exposedItemName_=(newValue: String): Unit = js.native
  
  def exposedName: String = js.native
  def exposedName_=(newValue: String): Unit = js.native
  
  def fractionDigits: Double = js.native
  def fractionDigits_=(newValue: Double): Unit = js.native
  
  def isDefaultType: Boolean = js.native
  def isDefaultType_=(newValue: Boolean): Unit = js.native
  
  def maxLength: Double = js.native
  def maxLength_=(newValue: Double): Unit = js.native
  
  def maxOccurs: Double = js.native
  def maxOccurs_=(newValue: Double): Unit = js.native
  
  def minOccurs: Double = js.native
  def minOccurs_=(newValue: Double): Unit = js.native
  
  def nillable: Boolean = js.native
  def nillable_=(newValue: Boolean): Unit = js.native
  
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    */
  def path: String = js.native
  def path_=(newValue: String): Unit = js.native
  
  def primitiveType: XmlPrimitiveType = js.native
  def primitiveType_=(newValue: XmlPrimitiveType): Unit = js.native
  
  def totalDigits: Double = js.native
  def totalDigits_=(newValue: Double): Unit = js.native
  
  def warningMessage: String = js.native
  def warningMessage_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.Element")
@js.native
object Element extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
