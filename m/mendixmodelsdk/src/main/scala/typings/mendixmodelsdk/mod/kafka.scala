package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kafka {
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.ConsumedKafkaService")
  @js.native
  class ConsumedKafkaService protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.ConsumedKafkaService {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ConsumedKafkaService {
    
    @JSImport("mendixmodelsdk", "kafka.ConsumedKafkaService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ConsumedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService]
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.ConsumedKafkaService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.ConsumedKafkaService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue")
  @js.native
  class KafkaMappedValue protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.KafkaMappedValue {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object KafkaMappedValue {
    
    @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue]
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * The new KafkaMappedValue will be automatically stored in the 'value' property
      * of the parent domainmodels.Attribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    /* static member */
    inline def createIn(container: Attribute): typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue]
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaMappedValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource")
  @js.native
  class KafkaRemoteEntitySource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.KafkaRemoteEntitySource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object KafkaRemoteEntitySource {
    
    @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource]
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
      * of the parent domainmodels.Entity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    /* static member */
    inline def createIn(container: Entity): typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource]
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.KafkaRemoteEntitySource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.14.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource")
  @js.native
  class PublishedKafkaResource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.PublishedKafkaResource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedKafkaResource {
    
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaResource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaResource]
    
    /**
      * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
      * The new PublishedKafkaResource will be automatically stored in the 'resources' property
      * of the parent PublishedKafkaService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.14.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaService): typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaResource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaResource]
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaResource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.14.0: introduced
    */
  @JSImport("mendixmodelsdk", "kafka.PublishedKafkaService")
  @js.native
  class PublishedKafkaService protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.PublishedKafkaService {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object PublishedKafkaService {
    
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PublishedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.kafkaMod.kafka.PublishedKafkaService]
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "kafka.PublishedKafkaService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
