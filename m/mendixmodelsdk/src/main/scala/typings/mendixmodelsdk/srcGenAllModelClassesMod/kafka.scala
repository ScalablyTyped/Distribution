package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Attribute
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
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
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.ConsumedKafkaService")
  @js.native
  open class ConsumedKafkaService protected ()
    extends typings.mendixmodelsdk.srcGenKafkaMod.kafka.ConsumedKafkaService {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ConsumedKafkaService {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.ConsumedKafkaService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ConsumedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenKafkaMod.kafka.ConsumedKafkaService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.ConsumedKafkaService]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.ConsumedKafkaService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.ConsumedKafkaService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.KafkaMappedValue")
  @js.native
  open class KafkaMappedValue protected ()
    extends typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaMappedValue {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.KafkaMappedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaMappedValue]
    
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * The new KafkaMappedValue will be automatically stored in the 'value' property
      * of the parent domainmodels.Attribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.0.2 and higher
      */
    /* static member */
    inline def createIn(container: Attribute): typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaMappedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaMappedValue]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.KafkaMappedValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.KafkaMappedValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.11.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.KafkaRemoteEntitySource")
  @js.native
  open class KafkaRemoteEntitySource protected ()
    extends typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaRemoteEntitySource {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.KafkaRemoteEntitySource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaRemoteEntitySource]
    
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
      * of the parent domainmodels.Entity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    /* static member */
    inline def createIn(container: Entity): typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaRemoteEntitySource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.KafkaRemoteEntitySource]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.KafkaRemoteEntitySource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.KafkaRemoteEntitySource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.14.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaResource")
  @js.native
  open class PublishedKafkaResource protected ()
    extends typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResource {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResource]
    
    /**
      * Creates and returns a new PublishedKafkaResource instance in the SDK and on the server.
      * The new PublishedKafkaResource will be automatically stored in the 'resources' property
      * of the parent PublishedKafkaService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.14.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaService): typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResource]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaResource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaResource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.0.1: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaResourceAttribute")
  @js.native
  open class PublishedKafkaResourceAttribute protected ()
    extends typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResourceAttribute {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedKafkaResourceAttribute {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaResourceAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedKafkaResourceAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResourceAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResourceAttribute]
    
    /**
      * Creates and returns a new PublishedKafkaResourceAttribute instance in the SDK and on the server.
      * The new PublishedKafkaResourceAttribute will be automatically stored in the 'attributes' property
      * of the parent PublishedKafkaResource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.0.1 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResource): typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResourceAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaResourceAttribute]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaResourceAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaResourceAttribute.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.14.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaService")
  @js.native
  open class PublishedKafkaService protected ()
    extends typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaService {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object PublishedKafkaService {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PublishedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenKafkaMod.kafka.PublishedKafkaService]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "kafka.PublishedKafkaService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenKafkaMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
