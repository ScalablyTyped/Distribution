package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.Element
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlDescription
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "xmlschemas")
@js.native
object xmlschemasNs extends js.Object {
  @js.native
  abstract class MxSchema protected ()
    extends typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.MxSchema {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  class XmlElement protected ()
    extends typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class XmlPrimitiveType ()
    extends typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
  @js.native
  class XmlSchema protected ()
    extends typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchema {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class XmlSchemaEntry protected ()
    extends typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object MxSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenXmlschemasMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object XmlElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenXmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlElement = js.native
  }
  
  /* static members */
  @js.native
  object XmlPrimitiveType extends js.Object {
    var AnyType: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Binary: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Boolean: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Date: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var DateTime: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Decimal: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Float: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Integer: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Long: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var String: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Time: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Unknown: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenXmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates a new XmlSchema unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchema = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchemaEntry extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenXmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
      * of the parent webservices.WsdlDescription element passed as argument.
      */
    def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'entries' property
      * of the parent XmlSchema element passed as argument.
      */
    def createInXmlSchemaUnderEntries(container: typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchema): typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry = js.native
  }
  
}

