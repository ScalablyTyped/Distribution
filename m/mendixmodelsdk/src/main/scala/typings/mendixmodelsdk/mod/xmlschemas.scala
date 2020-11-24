package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.webservices.WsdlDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "xmlschemas")
@js.native
object xmlschemas extends js.Object {
  
  @js.native
  abstract class MxSchema protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.MxSchema {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object MxSchema extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  class XmlElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object XmlElement extends js.Object {
    
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: typings.mendixmodelsdk.mappingsMod.mappings.Element): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class XmlPrimitiveType ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlPrimitiveType
  /* static members */
  @js.native
  object XmlPrimitiveType extends js.Object {
    
    var AnyType: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var Binary: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var Boolean: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var Date: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var DateTime: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var Decimal: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var Float: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var Integer: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var Long: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var String: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var Time: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    var Unknown: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/xml-schemas relevant section in reference guide}
    */
  @js.native
  class XmlSchema protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlSchema {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object XmlSchema extends js.Object {
    
    /**
      * Creates a new XmlSchema unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchema = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class XmlSchemaEntry protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlSchemaEntry {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object XmlSchemaEntry extends js.Object {
    
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
      * of the parent webservices.WsdlDescription element passed as argument.
      */
    def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'entries' property
      * of the parent XmlSchema element passed as argument.
      */
    def createInXmlSchemaUnderEntries(container: typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchema): typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
  }
}
