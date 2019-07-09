package typings
package mendixmodelsdkLib.distGenXmlschemasMod

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
  trait IMxSchema
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
  @js.native
  trait IXmlSchema extends IMxSchema
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.IMxSchema because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  abstract class MxSchema protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  class XmlElement protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class XmlPrimitiveType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.IXmlSchema because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class XmlSchema protected () extends MxSchema {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    val entries: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[XmlSchemaEntry] = js.native
    var filePath: java.lang.String = js.native
  }
  
  @js.native
  class XmlSchemaEntry protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsWsdlDescription: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlDescription = js.native
    val containerAsXmlSchema: XmlSchema = js.native
    var contents: java.lang.String = js.native
    var localizedContentsFormat: java.lang.String = js.native
    var localizedLocationFormat: java.lang.String = js.native
    var location: java.lang.String = js.native
    @JSName("model")
    var model_XmlSchemaEntry: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var targetNamespace: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object MxSchema extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenXmlschemasMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object XmlElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenXmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element): mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure): mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlElement = js.native
  }
  
  /* static members */
  @js.native
  object XmlPrimitiveType extends js.Object {
    var AnyType: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Binary: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Boolean: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Date: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var DateTime: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Decimal: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Float: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Integer: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Long: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var String: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Time: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
    var Unknown: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchema extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenXmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates a new XmlSchema unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlSchema = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchemaEntry extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenXmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
      * of the parent webservices.WsdlDescription element passed as argument.
      */
    def createInWsdlDescriptionUnderSchemaEntries(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.WsdlDescription): mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'entries' property
      * of the parent XmlSchema element passed as argument.
      */
    def createInXmlSchemaUnderEntries(container: mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlSchema): mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry = js.native
  }
  
}

