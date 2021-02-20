package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationBase
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.kafkaMod.kafka.ConsumedKafkaService
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rest {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/consumed-odata-service-properties relevant section in reference guide}
    *
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.18.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.ConsumedODataService")
  @js.native
  class ConsumedODataService protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.ConsumedODataService {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ConsumedODataService {
    
    @JSImport("mendixmodelsdk", "rest.ConsumedODataService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ConsumedODataService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ConsumedODataService.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.restMod.rest.ConsumedODataService = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ConsumedODataService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ConsumedODataService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/cors-settings relevant section in reference guide}
    *
    * In version 7.18.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.CorsConfiguration")
  @js.native
  class CorsConfiguration protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.CorsConfiguration {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CorsConfiguration {
    
    @JSImport("mendixmodelsdk", "rest.CorsConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.CorsConfiguration.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.CorsConfiguration = js.native
    
    /**
      * Creates and returns a new CorsConfiguration instance in the SDK and on the server.
      * The new CorsConfiguration will be automatically stored in the 'corsConfiguration' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.18.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.CorsConfiguration.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.restMod.rest.PublishedRestService): typings.mendixmodelsdk.restMod.rest.CorsConfiguration = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.CorsConfiguration.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.CorsConfiguration.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.MetadataReference")
  @js.native
  class MetadataReference protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.MetadataReference {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MetadataReference {
    
    @JSImport("mendixmodelsdk", "rest.MetadataReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MetadataReference instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.MetadataReference.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.MetadataReference = js.native
    
    /**
      * Creates and returns a new MetadataReference instance in the SDK and on the server.
      * The new MetadataReference will be automatically stored in the 'metadataReferences' property
      * of the parent ConsumedODataService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.6.0 to 8.7.0
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.MetadataReference.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.restMod.rest.ConsumedODataService): typings.mendixmodelsdk.restMod.rest.MetadataReference = js.native
    
    /**
      * Creates and returns a new MetadataReference instance in the SDK and on the server.
      * The new MetadataReference will be automatically stored in the 'metadataReferences' property
      * of the parent kafka.ConsumedKafkaService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.MetadataReference.createInConsumedKafkaServiceUnderMetadataReferences")
    @js.native
    def createInConsumedKafkaServiceUnderMetadataReferences(container: ConsumedKafkaService): typings.mendixmodelsdk.restMod.rest.MetadataReference = js.native
    
    /**
      * Creates and returns a new MetadataReference instance in the SDK and on the server.
      * The new MetadataReference will be automatically stored in the 'metadataReferences' property
      * of the parent ConsumedODataService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.6.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.MetadataReference.createInConsumedODataServiceUnderMetadataReferences")
    @js.native
    def createInConsumedODataServiceUnderMetadataReferences(container: typings.mendixmodelsdk.restMod.rest.ConsumedODataService): typings.mendixmodelsdk.restMod.rest.MetadataReference = js.native
    
    /**
      * Creates and returns a new MetadataReference instance in the SDK and on the server.
      * The new MetadataReference will be automatically stored in the 'metadataReferences' property
      * of the parent MetadataReference element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.8.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.MetadataReference.createInMetadataReferenceUnderMetadataReferences")
    @js.native
    def createInMetadataReferenceUnderMetadataReferences(container: typings.mendixmodelsdk.restMod.rest.MetadataReference): typings.mendixmodelsdk.restMod.rest.MetadataReference = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.MetadataReference.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.MetadataReference.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.ODataKey")
  @js.native
  class ODataKey protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.ODataKey {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ODataKey {
    
    @JSImport("mendixmodelsdk", "rest.ODataKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ODataKey instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataKey.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.ODataKey = js.native
    
    /**
      * Creates and returns a new ODataKey instance in the SDK and on the server.
      * The new ODataKey will be automatically stored in the 'key' property
      * of the parent ODataRemoteEntitySource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.11.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataKey.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.restMod.rest.ODataRemoteEntitySource): typings.mendixmodelsdk.restMod.rest.ODataKey = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataKey.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataKey.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.ODataKeyPart")
  @js.native
  class ODataKeyPart protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.ODataKeyPart {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ODataKeyPart {
    
    @JSImport("mendixmodelsdk", "rest.ODataKeyPart")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ODataKeyPart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataKeyPart.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.ODataKeyPart = js.native
    
    /**
      * Creates and returns a new ODataKeyPart instance in the SDK and on the server.
      * The new ODataKeyPart will be automatically stored in the 'parts' property
      * of the parent ODataKey element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataKeyPart.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.restMod.rest.ODataKey): typings.mendixmodelsdk.restMod.rest.ODataKeyPart = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataKeyPart.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataKeyPart.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.10.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.ODataMappedValue")
  @js.native
  class ODataMappedValue protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.ODataMappedValue {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ODataMappedValue {
    
    @JSImport("mendixmodelsdk", "rest.ODataMappedValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ODataMappedValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataMappedValue.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.ODataMappedValue = js.native
    
    /**
      * Creates and returns a new ODataMappedValue instance in the SDK and on the server.
      * The new ODataMappedValue will be automatically stored in the 'value' property
      * of the parent domainmodels.Attribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.10.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataMappedValue.createIn")
    @js.native
    def createIn(container: Attribute): typings.mendixmodelsdk.restMod.rest.ODataMappedValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataMappedValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataMappedValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.10.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource")
  @js.native
  class ODataRemoteAssociationSource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.ODataRemoteAssociationSource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ODataRemoteAssociationSource {
    
    @JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.ODataRemoteAssociationSource = js.native
    
    /**
      * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
      * The new ODataRemoteAssociationSource will be automatically stored in the 'source' property
      * of the parent domainmodels.AssociationBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.10.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource.createIn")
    @js.native
    def createIn(container: AssociationBase): typings.mendixmodelsdk.restMod.rest.ODataRemoteAssociationSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataRemoteAssociationSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.10.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.ODataRemoteEntitySource")
  @js.native
  class ODataRemoteEntitySource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.ODataRemoteEntitySource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ODataRemoteEntitySource {
    
    @JSImport("mendixmodelsdk", "rest.ODataRemoteEntitySource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataRemoteEntitySource.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.ODataRemoteEntitySource = js.native
    
    /**
      * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
      * The new ODataRemoteEntitySource will be automatically stored in the 'source' property
      * of the parent domainmodels.Entity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.10.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataRemoteEntitySource.createIn")
    @js.native
    def createIn(container: Entity): typings.mendixmodelsdk.restMod.rest.ODataRemoteEntitySource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataRemoteEntitySource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataRemoteEntitySource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "rest.ODataVersion")
  @js.native
  class ODataVersion protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.ODataVersion {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ODataVersion {
    
    @JSImport("mendixmodelsdk", "rest.ODataVersion")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataVersion.OData2")
    @js.native
    def OData2: typings.mendixmodelsdk.restMod.rest.ODataVersion = js.native
    @scala.inline
    def OData2_=(x: typings.mendixmodelsdk.restMod.rest.ODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData2")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataVersion.OData3")
    @js.native
    def OData3: typings.mendixmodelsdk.restMod.rest.ODataVersion = js.native
    @scala.inline
    def OData3_=(x: typings.mendixmodelsdk.restMod.rest.ODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData3")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.ODataVersion.OData4")
    @js.native
    def OData4: typings.mendixmodelsdk.restMod.rest.ODataVersion = js.native
    @scala.inline
    def OData4_=(x: typings.mendixmodelsdk.restMod.rest.ODataVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OData4")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/published-odata-services relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "rest.PublishedODataService")
  @js.native
  class PublishedODataService protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.PublishedODataService {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object PublishedODataService {
    
    @JSImport("mendixmodelsdk", "rest.PublishedODataService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PublishedODataService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedODataService.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.restMod.rest.PublishedODataService = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedODataService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedODataService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/published-odata-resource relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "rest.PublishedRestResource")
  @js.native
  class PublishedRestResource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.PublishedRestResource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedRestResource {
    
    @JSImport("mendixmodelsdk", "rest.PublishedRestResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestResource.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.PublishedRestResource = js.native
    
    /**
      * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
      * The new PublishedRestResource will be automatically stored in the 'resources' property
      * of the parent PublishedODataService element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestResource.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.restMod.rest.PublishedODataService): typings.mendixmodelsdk.restMod.rest.PublishedRestResource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestResource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestResource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/published-rest-services relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.PublishedRestService")
  @js.native
  class PublishedRestService protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.PublishedRestService {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object PublishedRestService {
    
    @JSImport("mendixmodelsdk", "rest.PublishedRestService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PublishedRestService unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestService.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.restMod.rest.PublishedRestService = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestService.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestService.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/published-rest-operation relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.7.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.PublishedRestServiceOperation")
  @js.native
  class PublishedRestServiceOperation protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.PublishedRestServiceOperation {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedRestServiceOperation {
    
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceOperation.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.PublishedRestServiceOperation = js.native
    
    /**
      * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
      * The new PublishedRestServiceOperation will be automatically stored in the 'operations' property
      * of the parent PublishedRestServiceResource element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceOperation.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.restMod.rest.PublishedRestServiceResource): typings.mendixmodelsdk.restMod.rest.PublishedRestServiceOperation = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceOperation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceOperation.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/published-rest-resource relevant section in reference guide}
    *
    * In version 7.11.0: removed experimental
    * In version 7.7.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.PublishedRestServiceResource")
  @js.native
  class PublishedRestServiceResource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.PublishedRestServiceResource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PublishedRestServiceResource {
    
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceResource.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.PublishedRestServiceResource = js.native
    
    /**
      * Creates and returns a new PublishedRestServiceResource instance in the SDK and on the server.
      * The new PublishedRestServiceResource will be automatically stored in the 'resources' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceResource.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.restMod.rest.PublishedRestService): typings.mendixmodelsdk.restMod.rest.PublishedRestServiceResource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceResource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.PublishedRestServiceResource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "rest.RestAuthenticationType")
  @js.native
  class RestAuthenticationType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.RestAuthenticationType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object RestAuthenticationType {
    
    @JSImport("mendixmodelsdk", "rest.RestAuthenticationType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestAuthenticationType.Basic")
    @js.native
    def Basic: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType = js.native
    @scala.inline
    def Basic_=(x: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Basic")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestAuthenticationType.Guest")
    @js.native
    def Guest: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType = js.native
    @scala.inline
    def Guest_=(x: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Guest")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestAuthenticationType.Microflow")
    @js.native
    def Microflow: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType = js.native
    @scala.inline
    def Microflow_=(x: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Microflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestAuthenticationType.None")
    @js.native
    def None: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType = js.native
    @scala.inline
    def None_=(x: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestAuthenticationType.Session")
    @js.native
    def Session: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType = js.native
    @scala.inline
    def Session_=(x: typings.mendixmodelsdk.restMod.rest.RestAuthenticationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Session")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.11.0: removed experimental
    * In version 7.8.0: introduced
    */
  @JSImport("mendixmodelsdk", "rest.RestOperationParameter")
  @js.native
  class RestOperationParameter protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.RestOperationParameter {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object RestOperationParameter {
    
    @JSImport("mendixmodelsdk", "rest.RestOperationParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameter.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.restMod.rest.RestOperationParameter = js.native
    
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * The new RestOperationParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedRestServiceOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameter.createInPublishedRestServiceOperationUnderParameters")
    @js.native
    def createInPublishedRestServiceOperationUnderParameters(container: typings.mendixmodelsdk.restMod.rest.PublishedRestServiceOperation): typings.mendixmodelsdk.restMod.rest.RestOperationParameter = js.native
    
    /**
      * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
      * The new RestOperationParameter will be automatically stored in the 'parameters' property
      * of the parent PublishedRestService element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameter.createInPublishedRestServiceUnderParameters")
    @js.native
    def createInPublishedRestServiceUnderParameters(container: typings.mendixmodelsdk.restMod.rest.PublishedRestService): typings.mendixmodelsdk.restMod.rest.RestOperationParameter = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.restMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.restMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "rest.RestOperationParameterType")
  @js.native
  class RestOperationParameterType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.rest.RestOperationParameterType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object RestOperationParameterType {
    
    @JSImport("mendixmodelsdk", "rest.RestOperationParameterType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameterType.Body")
    @js.native
    def Body: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType = js.native
    @scala.inline
    def Body_=(x: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameterType.Form")
    @js.native
    def Form: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType = js.native
    @scala.inline
    def Form_=(x: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameterType.Header")
    @js.native
    def Header: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType = js.native
    @scala.inline
    def Header_=(x: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameterType.Path")
    @js.native
    def Path: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType = js.native
    @scala.inline
    def Path_=(x: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "rest.RestOperationParameterType.Query")
    @js.native
    def Query: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType = js.native
    @scala.inline
    def Query_=(x: typings.mendixmodelsdk.restMod.rest.RestOperationParameterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Query")(x.asInstanceOf[js.Any])
  }
}
