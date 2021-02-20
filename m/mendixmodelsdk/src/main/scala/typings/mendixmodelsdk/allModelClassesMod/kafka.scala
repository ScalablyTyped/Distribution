package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kafka {
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.ConsumedKafkaService")
  @js.native
  class ConsumedKafkaService protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ConsumedKafkaService {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.ConsumedKafkaService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ConsumedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.ConsumedKafkaService.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.ConsumedKafkaService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.ConsumedKafkaService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaMappedValue")
  @js.native
  class KafkaMappedValue protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object KafkaMappedValue {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaMappedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaMappedValue.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * The new KafkaMappedValue will be automatically stored in the 'value' property
      * of the parent domainmodels.Attribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaMappedValue.createIn")
    @js.native
    def createIn(container: Attribute): typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaMappedValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaMappedValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaRemoteEntitySource")
  @js.native
  class KafkaRemoteEntitySource protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object KafkaRemoteEntitySource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaRemoteEntitySource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaRemoteEntitySource.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
      * of the parent domainmodels.Entity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaRemoteEntitySource.createIn")
    @js.native
    def createIn(container: Entity): typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaRemoteEntitySource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.KafkaRemoteEntitySource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.14.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaResource")
  @js.native
  class PublishedKafkaResource protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaResource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedKafkaResource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaResource.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaResource = js.native
    
    /**
      * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
      * The new PublishedKafkaResource will be automatically stored in the 'resources' property
      * of the parent PublishedKafkaService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.14.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaResource.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaService): typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaResource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaResource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaResource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.14.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaService")
  @js.native
  class PublishedKafkaService protected ()
    extends typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaService {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object PublishedKafkaService {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PublishedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaService.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaService = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "kafka.PublishedKafkaService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
