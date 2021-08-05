package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.IJsonStructure
import typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition
import typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import typings.mendixmodelsdk.webservicesMod.webservices.IImportedWebService
import typings.mendixmodelsdk.xmlschemasMod.xmlschemas.IXmlSchema
import typings.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappingsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/mappings", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object mappings {
    
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
    object Element {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.Element")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.Element.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.Element.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType")
    @js.native
    class ElementType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ElementType {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.All")
      @js.native
      def All: ElementType = js.native
      inline def All_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.Array")
      @js.native
      def Array: ElementType = js.native
      inline def Array_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.Choice")
      @js.native
      def Choice: ElementType = js.native
      inline def Choice_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Choice")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.Inheritance")
      @js.native
      def Inheritance: ElementType = js.native
      inline def Inheritance_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Inheritance")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.NamedArray")
      @js.native
      def NamedArray: ElementType = js.native
      inline def NamedArray_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NamedArray")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.Object")
      @js.native
      def Object: ElementType = js.native
      inline def Object_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.Sequence")
      @js.native
      def Sequence: ElementType = js.native
      inline def Sequence_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.Undefined")
      @js.native
      def Undefined: ElementType = js.native
      inline def Undefined_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Undefined")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.Value")
      @js.native
      def Value: ElementType = js.native
      inline def Value_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Value")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ElementType.Wrapper")
      @js.native
      def Wrapper: ElementType = js.native
      inline def Wrapper_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wrapper")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/mapping-documents relevant section in reference guide}
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
    - typings.mendixmodelsdk.mappingsMod.mappings.IMappingDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
    @js.native
    abstract class MappingDocument protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMappingDocument: FolderBase = js.native
      
      def importedWebService: IImportedWebService | Null = js.native
      
      def importedWebServiceQualifiedName: String | Null = js.native
      
      def importedWebService_=(newValue: IImportedWebService | Null): Unit = js.native
      
      /**
        * In version 6.4.0: introduced
        */
      def jsonStructure: IJsonStructure | Null = js.native
      
      def jsonStructureQualifiedName: String | Null = js.native
      
      def jsonStructure_=(newValue: IJsonStructure | Null): Unit = js.native
      
      /**
        * In version 7.6.0: introduced
        */
      def messageDefinition: IMessageDefinition | Null = js.native
      
      def messageDefinitionQualifiedName: String | Null = js.native
      
      def messageDefinition_=(newValue: IMessageDefinition | Null): Unit = js.native
      
      def operationName: String = js.native
      def operationName_=(newValue: String): Unit = js.native
      
      /**
        * In version 7.14.0: introduced
        */
      def publicName: String = js.native
      def publicName_=(newValue: String): Unit = js.native
      
      def rootElementName: String = js.native
      def rootElementName_=(newValue: String): Unit = js.native
      
      def rootMappingElements: IList[ObjectMappingElement] = js.native
      
      def serviceName: String = js.native
      def serviceName_=(newValue: String): Unit = js.native
      
      def xmlSchema: IXmlSchema | Null = js.native
      
      def xmlSchemaQualifiedName: String | Null = js.native
      
      def xmlSchema_=(newValue: IXmlSchema | Null): Unit = js.native
    }
    object MappingDocument {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingElement")
    @js.native
    abstract class MappingElement protected ()
      extends typings.mendixmodelsdk.internalMod.Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMappingDocument: MappingDocument = js.native
      
      def containerAsObjectMappingElement: ObjectMappingElement = js.native
      
      def documentation: String = js.native
      def documentation_=(newValue: String): Unit = js.native
      
      def elementType: ElementType = js.native
      def elementType_=(newValue: ElementType): Unit = js.native
      
      /**
        * In version 6.6.0: introduced
        */
      def exposedName: String = js.native
      def exposedName_=(newValue: String): Unit = js.native
      
      /**
        * The value of this property is conceptually of type mappings.ElementPath.
        *
        * In version 7.6.0: introduced
        */
      def jsonPath: String = js.native
      def jsonPath_=(newValue: String): Unit = js.native
      
      def maxOccurs: Double = js.native
      def maxOccurs_=(newValue: Double): Unit = js.native
      
      def minOccurs: Double = js.native
      def minOccurs_=(newValue: Double): Unit = js.native
      
      def nillable: Boolean = js.native
      def nillable_=(newValue: Boolean): Unit = js.native
      
      /**
        * The value of this property is conceptually of type mappings.ElementPath.
        *
        * In version 7.6.0: deleted
        */
      def path: String = js.native
      def path_=(newValue: String): Unit = js.native
      
      /**
        * The value of this property is conceptually of type mappings.ElementPath.
        *
        * In version 7.6.0: introduced
        */
      def xmlPath: String = js.native
      def xmlPath_=(newValue: String): Unit = js.native
    }
    object MappingElement {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall")
    @js.native
    class MappingMicroflowCall protected ()
      extends typings.mendixmodelsdk.internalMod.Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsObjectMappingElement: ObjectMappingElement = js.native
      
      def microflow: IMicroflow | Null = js.native
      
      def microflowQualifiedName: String | Null = js.native
      
      def microflow_=(newValue: IMicroflow | Null): Unit = js.native
      
      def parameterMappings: IList[MappingMicroflowParameter] = js.native
    }
    object MappingMicroflowCall {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MappingMicroflowCall = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MappingMicroflowCall]
      
      /**
        * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
        * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
        * of the parent ObjectMappingElement element passed as argument.
        */
      /* static member */
      inline def createIn(container: ObjectMappingElement): MappingMicroflowCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MappingMicroflowCall]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter")
    @js.native
    class MappingMicroflowParameter protected ()
      extends typings.mendixmodelsdk.internalMod.Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMappingMicroflowCall: MappingMicroflowCall = js.native
      
      /**
        * The value of this property is conceptually of type mappings.ElementPath.
        *
        * In version 7.6.0: introduced
        */
      def jsonValueElementPath: String = js.native
      def jsonValueElementPath_=(newValue: String): Unit = js.native
      
      def levelOfParent: Double = js.native
      def levelOfParent_=(newValue: Double): Unit = js.native
      
      def parameter: IMicroflowParameter | Null = js.native
      
      def parameterQualifiedName: String | Null = js.native
      
      def parameter_=(newValue: IMicroflowParameter | Null): Unit = js.native
      
      /**
        * The value of this property is conceptually of type mappings.ElementPath.
        *
        * In version 7.6.0: deleted
        */
      def valueElementPath: String = js.native
      def valueElementPath_=(newValue: String): Unit = js.native
      
      /**
        * The value of this property is conceptually of type mappings.ElementPath.
        *
        * In version 7.6.0: introduced
        */
      def xmlValueElementPath: String = js.native
      def xmlValueElementPath_=(newValue: String): Unit = js.native
    }
    object MappingMicroflowParameter {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MappingMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MappingMicroflowParameter]
      
      /**
        * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
        * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
        * of the parent MappingMicroflowCall element passed as argument.
        */
      /* static member */
      inline def createIn(container: MappingMicroflowCall): MappingMicroflowParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MappingMicroflowParameter]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingBackupEnum")
    @js.native
    class ObjectHandlingBackupEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ObjectHandlingBackupEnum {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingBackupEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingBackupEnum.Create")
      @js.native
      def Create: ObjectHandlingBackupEnum = js.native
      inline def Create_=(x: ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingBackupEnum.Error")
      @js.native
      def Error: ObjectHandlingBackupEnum = js.native
      inline def Error_=(x: ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingBackupEnum.Ignore")
      @js.native
      def Ignore: ObjectHandlingBackupEnum = js.native
      inline def Ignore_=(x: ObjectHandlingBackupEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ignore")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingEnum")
    @js.native
    class ObjectHandlingEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ObjectHandlingEnum {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingEnum.Create")
      @js.native
      def Create: ObjectHandlingEnum = js.native
      inline def Create_=(x: ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Create")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingEnum.Custom")
      @js.native
      def Custom: ObjectHandlingEnum = js.native
      inline def Custom_=(x: ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingEnum.Find")
      @js.native
      def Find: ObjectHandlingEnum = js.native
      inline def Find_=(x: ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Find")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectHandlingEnum.Parameter")
      @js.native
      def Parameter: ObjectHandlingEnum = js.native
      inline def Parameter_=(x: ObjectHandlingEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectMappingElement")
    @js.native
    abstract class ObjectMappingElement protected () extends MappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def association: IAssociationBase | Null = js.native
      
      def associationQualifiedName: String | Null = js.native
      
      def association_=(newValue: IAssociationBase | Null): Unit = js.native
      
      def children: IList[MappingElement] = js.native
      
      def entity: IEntity | Null = js.native
      
      def entityQualifiedName: String | Null = js.native
      
      def entity_=(newValue: IEntity | Null): Unit = js.native
      
      /**
        * In version 6.4.0: introduced
        */
      def isDefaultType: Boolean = js.native
      def isDefaultType_=(newValue: Boolean): Unit = js.native
      
      def mappingMicroflowCall: MappingMicroflowCall | Null = js.native
      def mappingMicroflowCall_=(newValue: MappingMicroflowCall | Null): Unit = js.native
      
      def objectHandling: ObjectHandlingEnum = js.native
      
      def objectHandlingBackup: ObjectHandlingBackupEnum = js.native
      
      /**
        * In version 7.17.0: introduced
        */
      def objectHandlingBackupAllowOverride: Boolean = js.native
      def objectHandlingBackupAllowOverride_=(newValue: Boolean): Unit = js.native
      
      def objectHandlingBackup_=(newValue: ObjectHandlingBackupEnum): Unit = js.native
      
      def objectHandling_=(newValue: ObjectHandlingEnum): Unit = js.native
    }
    object ObjectMappingElement {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ObjectMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
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
    object ValueMappingElement {
      
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ValueMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ValueMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.ValueMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/mapping-documents relevant section in reference guide}
      */
    @js.native
    trait IMappingDocument
      extends StObject
         with IDocument
  }
}
