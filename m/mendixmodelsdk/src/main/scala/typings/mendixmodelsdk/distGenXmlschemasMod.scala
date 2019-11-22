package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.mappings.Element
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription
import typings.mendixmodelsdk.distGenXmlschemasMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.IMxSchema
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.MxSchema
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlElement
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlPrimitiveType
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlSchema
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.XmlSchemaEntry
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/xmlschemas", JSImport.Namespace)
@js.native
object distGenXmlschemasMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object xmlschemas extends js.Object {
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
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.IMxSchema because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
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
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.IMxSchema because Already inherited
    - typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.IXmlSchema because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
  
}

