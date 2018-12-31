package typings
package mendixmodelsdkLib.distGenAllDashModelDashClassesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "xmlschemas")
@js.native
object xmlschemasNs extends js.Object {
  @js.native
  abstract class MxSchema protected ()
    extends mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.MxSchema {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  class XmlElement protected ()
    extends mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class XmlPrimitiveType ()
    extends mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlPrimitiveType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
  @js.native
  class XmlSchema protected ()
    extends mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlSchema {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  @js.native
  class XmlSchemaEntry protected ()
    extends mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.XmlSchemaEntry {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  object MxSchema extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenXmlschemasMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 6.6.0: introduced
    */
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
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
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

