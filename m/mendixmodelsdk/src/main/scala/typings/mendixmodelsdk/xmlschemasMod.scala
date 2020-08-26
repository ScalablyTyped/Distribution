package typings.mendixmodelsdk

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typings.mendixmodelsdk.mappingsMod.mappings.Element
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import typings.mendixmodelsdk.webservicesMod.webservices.WsdlDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/xmlschemas", JSImport.Namespace)
@js.native
object xmlschemasMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
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
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    abstract class MxSchema protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FMxSchema: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMxSchema: FolderBase = js.native
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
      @JSName("model")
      var model_FXmlElement: IModel = js.native
    }
    
    @js.native
    class XmlPrimitiveType () extends AbstractEnum
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema because Already inherited
    - typings.mendixmodelsdk.xmlschemasMod.xmlschemas.IXmlSchema because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class XmlSchema protected () extends MxSchema {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FXmlSchema: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MXmlSchema: FolderBase = js.native
      def entries: IList[XmlSchemaEntry] = js.native
      def filePath: String = js.native
      def filePath_=(newValue: String): Unit = js.native
    }
    
    @js.native
    class XmlSchemaEntry protected ()
      extends typings.mendixmodelsdk.internalMod.Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FXmlSchemaEntry: IModel = js.native
      def containerAsWsdlDescription: WsdlDescription = js.native
      def containerAsXmlSchema: XmlSchema = js.native
      def contents: String = js.native
      def contents_=(newValue: String): Unit = js.native
      def localizedContentsFormat: String = js.native
      def localizedContentsFormat_=(newValue: String): Unit = js.native
      def localizedLocationFormat: String = js.native
      def localizedLocationFormat_=(newValue: String): Unit = js.native
      def location: String = js.native
      def location_=(newValue: String): Unit = js.native
      def targetNamespace: String = js.native
      def targetNamespace_=(newValue: String): Unit = js.native
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

