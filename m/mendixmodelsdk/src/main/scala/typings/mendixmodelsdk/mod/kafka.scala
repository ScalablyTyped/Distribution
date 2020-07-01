package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "kafka")
@js.native
object kafka extends js.Object {
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
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
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  @js.native
  class KafkaAttribute protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.KafkaAttribute {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  @js.native
  class KafkaEntity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.KafkaEntity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * In version 8.11.0: introduced
    */
  @js.native
  class KafkaMappedValue protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.KafkaMappedValue {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  @js.native
  class KafkaNavigationProperty protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.KafkaNavigationProperty {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  @js.native
  class KafkaRemoteEntitySource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.kafka.KafkaRemoteEntitySource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object ConsumedKafkaService extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates a new ConsumedKafkaService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService = js.native
  }
  
  /* static members */
  @js.native
  object KafkaAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaAttribute = js.native
    /**
      * Creates and returns a new KafkaAttribute instance in the SDK and on the server.
      * The new KafkaAttribute will be automatically stored in the 'attributes' property
      * of the parent KafkaEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.kafkaMod.kafka.KafkaEntity): typings.mendixmodelsdk.kafkaMod.kafka.KafkaAttribute = js.native
  }
  
  /* static members */
  @js.native
  object KafkaEntity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaEntity = js.native
  }
  
  /* static members */
  @js.native
  object KafkaMappedValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
    /**
      * Creates and returns a new KafkaMappedValue instance in the SDK and on the server.
      * The new KafkaMappedValue will be automatically stored in the 'value' property
      * of the parent domainmodels.Attribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    def createIn(container: Attribute): typings.mendixmodelsdk.kafkaMod.kafka.KafkaMappedValue = js.native
  }
  
  /* static members */
  @js.native
  object KafkaNavigationProperty extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaNavigationProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaNavigationProperty = js.native
    /**
      * Creates and returns a new KafkaNavigationProperty instance in the SDK and on the server.
      * The new KafkaNavigationProperty will be automatically stored in the 'navigationProperties' property
      * of the parent KafkaEntity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.kafkaMod.kafka.KafkaEntity): typings.mendixmodelsdk.kafkaMod.kafka.KafkaNavigationProperty = js.native
  }
  
  /* static members */
  @js.native
  object KafkaRemoteEntitySource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.kafkaMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
    /**
      * Creates and returns a new KafkaRemoteEntitySource instance in the SDK and on the server.
      * The new KafkaRemoteEntitySource will be automatically stored in the 'source' property
      * of the parent domainmodels.Entity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    def createIn(container: Entity): typings.mendixmodelsdk.kafkaMod.kafka.KafkaRemoteEntitySource = js.native
  }
  
}

