package typings.mendixmodelsdk.distGenXmlschemasMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.Element
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.WsdlDescription
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.IMxSchema
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.MxSchema
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlElement
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchema
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/xmlschemas", "xmlschemas")
@js.native
object xmlschemasNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `XmlSchemas`.
    */
  @js.native
  trait IMxSchema extends IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
  @js.native
  trait IXmlSchema extends IMxSchema
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.IMxSchema because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  abstract class MxSchema protected () extends Document {
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
  class XmlElement protected () extends Element {
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
  class XmlPrimitiveType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemasNs.IXmlSchema because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class XmlSchema protected () extends MxSchema {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    val entries: IList[XmlSchemaEntry] = js.native
    var filePath: String = js.native
  }
  
  @js.native
  class XmlSchemaEntry protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsWsdlDescription: WsdlDescription = js.native
    val containerAsXmlSchema: XmlSchema = js.native
    var contents: String = js.native
    var localizedContentsFormat: String = js.native
    var localizedLocationFormat: String = js.native
    var location: String = js.native
    @JSName("model")
    var model_XmlSchemaEntry: IModel = js.native
    var targetNamespace: String = js.native
  }
  
  /* static members */
  @js.native
  object MxSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object XmlElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): XmlElement = js.native
  }
  
  /* static members */
  @js.native
  object XmlPrimitiveType extends js.Object {
    var AnyType: XmlPrimitiveType = js.native
    var Binary: XmlPrimitiveType = js.native
    var Boolean: XmlPrimitiveType = js.native
    var Date: XmlPrimitiveType = js.native
    var DateTime: XmlPrimitiveType = js.native
    var Decimal: XmlPrimitiveType = js.native
    var Float: XmlPrimitiveType = js.native
    var Integer: XmlPrimitiveType = js.native
    var Long: XmlPrimitiveType = js.native
    var String: XmlPrimitiveType = js.native
    var Time: XmlPrimitiveType = js.native
    var Unknown: XmlPrimitiveType = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new XmlSchema unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): XmlSchema = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchemaEntry extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
      * of the parent webservices.WsdlDescription element passed as argument.
      */
    def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'entries' property
      * of the parent XmlSchema element passed as argument.
      */
    def createInXmlSchemaUnderEntries(container: XmlSchema): XmlSchemaEntry = js.native
  }
  
}

