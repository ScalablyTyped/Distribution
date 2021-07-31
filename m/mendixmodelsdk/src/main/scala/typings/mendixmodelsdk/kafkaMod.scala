package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.constantsMod.constants.IConstant
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IMappedValue
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IMaterializedRemoteEntitySource
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.MappedValue
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.MaterializedRemoteEntitySource
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteEntitySourceDocument
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.restMod.rest.MetadataReference
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kafkaMod {
  
  @JSImport("mendixmodelsdk/dist/gen/kafka", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
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
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument because Already inherited
    - typings.mendixmodelsdk.kafkaMod.kafka.IConsumedKafkaService because var conflicts: applicationId, containerAsFolderBase, endpointId, environmentType, icon, id, isLoaded, minimumMxVersion, model, recommendedMxVersion, serviceName, structureTypeName, unit, version. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.ConsumedKafkaService")
    @js.native
    class ConsumedKafkaService protected () extends RemoteEntitySourceDocument {
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
      
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.ConsumedKafkaService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ConsumedKafkaService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @scala.inline
      def createIn(container: IFolderBase): ConsumedKafkaService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ConsumedKafkaService]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.ConsumedKafkaService.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.ConsumedKafkaService.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 8.11.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.domainmodelsMod.domainmodels.IValueType because Already inherited
    - typings.mendixmodelsdk.domainmodelsMod.domainmodels.IMappedValue because Already inherited
    - typings.mendixmodelsdk.kafkaMod.kafka.IKafkaMappedValue because var conflicts: containerAsAttribute, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.KafkaMappedValue")
    @js.native
    class KafkaMappedValue protected () extends MappedValue {
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
      
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.KafkaMappedValue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @scala.inline
      def create(model: IModel): KafkaMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[KafkaMappedValue]
      
      /**
        * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
        * The new KafkaMappedValue will be automatically stored in the 'value' property
        * of the parent domainmodels.Attribute element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.11.0 and higher
        */
      /* static member */
      @scala.inline
      def createIn(container: Attribute): KafkaMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[KafkaMappedValue]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.KafkaMappedValue.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.KafkaMappedValue.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.11.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntitySource because Already inherited
    - typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySource because Already inherited
    - typings.mendixmodelsdk.domainmodelsMod.domainmodels.IMaterializedRemoteEntitySource because Already inherited
    - typings.mendixmodelsdk.kafkaMod.kafka.IKafkaRemoteEntitySource because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.KafkaRemoteEntitySource")
    @js.native
    class KafkaRemoteEntitySource protected () extends MaterializedRemoteEntitySource {
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
      
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.KafkaRemoteEntitySource")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @scala.inline
      def create(model: IModel): KafkaRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[KafkaRemoteEntitySource]
      
      /**
        * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
        * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
        * of the parent domainmodels.Entity element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.11.0 and higher
        */
      /* static member */
      @scala.inline
      def createIn(container: Entity): KafkaRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[KafkaRemoteEntitySource]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.KafkaRemoteEntitySource.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.KafkaRemoteEntitySource.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.14.0: introduced
      */
    @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.PublishedKafkaResource")
    @js.native
    class PublishedKafkaResource protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
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
      
      def topicName: String = js.native
      def topicName_=(newValue: String): Unit = js.native
    }
    object PublishedKafkaResource {
      
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.PublishedKafkaResource")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @scala.inline
      def create(model: IModel): PublishedKafkaResource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedKafkaResource]
      
      /**
        * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
        * The new PublishedKafkaResource will be automatically stored in the 'resources' property
        * of the parent PublishedKafkaService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.14.0 and higher
        */
      /* static member */
      @scala.inline
      def createIn(container: PublishedKafkaService): PublishedKafkaResource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedKafkaResource]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.PublishedKafkaResource.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.PublishedKafkaResource.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 8.14.0: introduced
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
    - typings.mendixmodelsdk.kafkaMod.kafka.IPublishedKafkaService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.PublishedKafkaService")
    @js.native
    class PublishedKafkaService protected () extends Document {
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
      
      def brokerUrl: IConstant = js.native
      
      def brokerUrlQualifiedName: String = js.native
      
      def brokerUrl_=(newValue: IConstant): Unit = js.native
      
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
      
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.PublishedKafkaService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new PublishedKafkaService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @scala.inline
      def createIn(container: IFolderBase): PublishedKafkaService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedKafkaService]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.PublishedKafkaService.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/kafka", "kafka.PublishedKafkaService.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
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
         with IMappedValue
    
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
