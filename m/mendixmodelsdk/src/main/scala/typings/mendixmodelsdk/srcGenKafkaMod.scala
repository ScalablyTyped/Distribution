package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Attribute
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.CachedMappedValue
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.ICachedMappedValue
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IMaterializedRemoteEntitySource
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IRemoteEntitySourceDocument
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MaterializedRemoteEntitySource
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.RemoteEntitySourceDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenRestMod.rest.MetadataReference
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenKafkaMod {
  
  @JSImport("mendixmodelsdk/src/gen/kafka", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object kafka {
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.11.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IRemoteEntitySourceDocument because Already inherited
    - typings.mendixmodelsdk.srcGenKafkaMod.kafka.IConsumedKafkaService because var conflicts: applicationId, containerAsFolderBase, endpointId, environmentType, icon, id, isLoaded, metadataHash, minimumMxVersion, model, recommendedMxVersion, serviceName, structureTypeName, unit, validated, validatedEntities, version. Inlined  */ @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.ConsumedKafkaService")
    @js.native
    open class ConsumedKafkaService protected () extends RemoteEntitySourceDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      def brokerPassword: IConstant | Null = js.native
      
      def brokerPasswordQualifiedName: String | Null = js.native
      
      def brokerPassword_=(newValue: IConstant | Null): Unit = js.native
      
      def brokerUrl: IConstant | Null = js.native
      
      def brokerUrlQualifiedName: String | Null = js.native
      
      def brokerUrl_=(newValue: IConstant | Null): Unit = js.native
      
      def brokerUsername: IConstant | Null = js.native
      
      def brokerUsernameQualifiedName: String | Null = js.native
      
      def brokerUsername_=(newValue: IConstant | Null): Unit = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MConsumedKafkaService: FolderBase = js.native
      
      def metadataReferences: IList[MetadataReference] = js.native
      
      /**
        * In version 8.12.0: introduced
        */
      def serviceFeed: String = js.native
      def serviceFeed_=(newValue: String): Unit = js.native
      
      /**
        * In version 8.14.0: deleted
        */
      def serviceId: String = js.native
      def serviceId_=(newValue: String): Unit = js.native
    }
    object ConsumedKafkaService {
      
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.ConsumedKafkaService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ConsumedKafkaService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): ConsumedKafkaService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ConsumedKafkaService]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.ConsumedKafkaService.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.ConsumedKafkaService.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 8.11.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IValueType because Already inherited
    - typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IMappedValue because Already inherited
    - typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.ICachedMappedValue because Already inherited
    - typings.mendixmodelsdk.srcGenKafkaMod.kafka.IKafkaMappedValue because var conflicts: containerAsAttribute, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.KafkaMappedValue")
    @js.native
    open class KafkaMappedValue protected () extends CachedMappedValue {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      @JSName("containerAsAttribute")
      def containerAsAttribute_MKafkaMappedValue: Attribute = js.native
      
      def remoteName: String = js.native
      def remoteName_=(newValue: String): Unit = js.native
    }
    object KafkaMappedValue {
      
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.KafkaMappedValue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): KafkaMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[KafkaMappedValue]
      
      /**
        * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
        * The new KafkaMappedValue will be automatically stored in the 'value' property
        * of the parent domainmodels.Attribute element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.0.2 and higher
        */
      /* static member */
      inline def createIn(container: Attribute): KafkaMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[KafkaMappedValue]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.KafkaMappedValue.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.KafkaMappedValue.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.11.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntitySource because Already inherited
    - typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IRemoteEntitySource because Already inherited
    - typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IMaterializedRemoteEntitySource because Already inherited
    - typings.mendixmodelsdk.srcGenKafkaMod.kafka.IKafkaRemoteEntitySource because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.KafkaRemoteEntitySource")
    @js.native
    open class KafkaRemoteEntitySource protected () extends MaterializedRemoteEntitySource {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      @JSName("containerAsEntity")
      def containerAsEntity_MKafkaRemoteEntitySource: Entity = js.native
      
      def remoteName: String = js.native
      def remoteName_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def sourceDocument: IConsumedKafkaService | Null = js.native
      
      def sourceDocumentQualifiedName: String | Null = js.native
      
      def sourceDocument_=(newValue: IConsumedKafkaService | Null): Unit = js.native
      
      /**
        * In version 8.12.0: introduced
        */
      def topicName: String = js.native
      def topicName_=(newValue: String): Unit = js.native
    }
    object KafkaRemoteEntitySource {
      
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.KafkaRemoteEntitySource")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): KafkaRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[KafkaRemoteEntitySource]
      
      /**
        * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
        * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
        * of the parent domainmodels.Entity element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.11.0 and higher
        */
      /* static member */
      inline def createIn(container: Entity): KafkaRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[KafkaRemoteEntitySource]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.KafkaRemoteEntitySource.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.KafkaRemoteEntitySource.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.14.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaResource")
    @js.native
    open class PublishedKafkaResource protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        *
        * In version 9.0.1: introduced
        */
      def attributes: IList[PublishedKafkaResourceAttribute] = js.native
      
      def containerAsPublishedKafkaService: PublishedKafkaService = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def entity: IEntity = js.native
      
      def entityQualifiedName: String = js.native
      
      def entity_=(newValue: IEntity): Unit = js.native
      
      def exposedName: String = js.native
      def exposedName_=(newValue: String): Unit = js.native
      
      def summary: String = js.native
      def summary_=(newValue: String): Unit = js.native
      
      /**
        * In version 9.0.3: deleted
        */
      def topicName: String = js.native
      def topicName_=(newValue: String): Unit = js.native
    }
    object PublishedKafkaResource {
      
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaResource")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): PublishedKafkaResource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedKafkaResource]
      
      /**
        * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
        * The new PublishedKafkaResource will be automatically stored in the 'resources' property
        * of the parent PublishedKafkaService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.14.0 and higher
        */
      /* static member */
      inline def createIn(container: PublishedKafkaService): PublishedKafkaResource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedKafkaResource]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaResource.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaResource.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.0.1: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaResourceAttribute")
    @js.native
    open class PublishedKafkaResourceAttribute protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attribute: IAttribute = js.native
      
      def attributeQualifiedName: String = js.native
      
      def attribute_=(newValue: IAttribute): Unit = js.native
      
      def containerAsPublishedKafkaResource: PublishedKafkaResource = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      /**
        * In version 9.0.2: introduced
        */
      def exposedName: String = js.native
      def exposedName_=(newValue: String): Unit = js.native
      
      def summary: String = js.native
      def summary_=(newValue: String): Unit = js.native
    }
    object PublishedKafkaResourceAttribute {
      
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaResourceAttribute")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new PublishedKafkaResourceAttribute instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): PublishedKafkaResourceAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedKafkaResourceAttribute]
      
      /**
        * Creates and returns a new PublishedKafkaResourceAttribute instance in the SDK and on the server.
        * The new PublishedKafkaResourceAttribute will be automatically stored in the 'attributes' property
        * of the parent PublishedKafkaResource element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.0.1 and higher
        */
      /* static member */
      inline def createIn(container: PublishedKafkaResource): PublishedKafkaResourceAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedKafkaResourceAttribute]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaResourceAttribute.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaResourceAttribute.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.14.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.srcGenKafkaMod.kafka.IPublishedKafkaService because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaService")
    @js.native
    open class PublishedKafkaService protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      def brokerPassword: IConstant | Null = js.native
      
      def brokerPasswordQualifiedName: String | Null = js.native
      
      def brokerPassword_=(newValue: IConstant | Null): Unit = js.native
      
      /**
        * In version 9.0.1: added optional
        */
      def brokerUrl: IConstant | Null = js.native
      
      def brokerUrlQualifiedName: String | Null = js.native
      
      def brokerUrl_=(newValue: IConstant | Null): Unit = js.native
      
      def brokerUsername: IConstant | Null = js.native
      
      def brokerUsernameQualifiedName: String | Null = js.native
      
      def brokerUsername_=(newValue: IConstant | Null): Unit = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MPublishedKafkaService: FolderBase = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def metadata: String = js.native
      def metadata_=(newValue: String): Unit = js.native
      
      def namespace: String = js.native
      def namespace_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def resources: IList[PublishedKafkaResource] = js.native
      
      def serviceFeed: String = js.native
      def serviceFeed_=(newValue: String): Unit = js.native
      
      def serviceName: String = js.native
      def serviceName_=(newValue: String): Unit = js.native
      
      def summary: String = js.native
      def summary_=(newValue: String): Unit = js.native
      
      def version: String = js.native
      def version_=(newValue: String): Unit = js.native
    }
    object PublishedKafkaService {
      
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new PublishedKafkaService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): PublishedKafkaService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedKafkaService]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaService.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/kafka", "kafka.PublishedKafkaService.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Kafka`.
      */
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.11.0: introduced
      */
    @js.native
    trait IConsumedKafkaService
      extends StObject
         with IRemoteEntitySourceDocument
    
    /**
      * In version 8.11.0: introduced
      */
    @js.native
    trait IKafkaMappedValue
      extends StObject
         with ICachedMappedValue
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.11.0: introduced
      */
    @js.native
    trait IKafkaRemoteEntitySource
      extends StObject
         with IMaterializedRemoteEntitySource
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.14.0: introduced
      */
    @js.native
    trait IPublishedKafkaService
      extends StObject
         with IDocument
  }
}
