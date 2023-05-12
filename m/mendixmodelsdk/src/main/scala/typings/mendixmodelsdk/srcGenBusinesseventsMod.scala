package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeType
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
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

object srcGenBusinesseventsMod {
  
  @JSImport("mendixmodelsdk/src/gen/businessevents", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object businessevents {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `BusinessEvents`.
      */
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.BusinessEventDefinition")
    @js.native
    open class BusinessEventDefinition protected () extends Element[IModel] {
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
        */
      def channels: IList[Channel] = js.native
      
      def containerAsBusinessEventService: BusinessEventService = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def eventNamePrefix: String = js.native
      def eventNamePrefix_=(newValue: String): Unit = js.native
      
      def serviceName: String = js.native
      def serviceName_=(newValue: String): Unit = js.native
      
      def summary: String = js.native
      def summary_=(newValue: String): Unit = js.native
    }
    object BusinessEventDefinition {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.BusinessEventDefinition")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BusinessEventDefinition instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): BusinessEventDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[BusinessEventDefinition]
      
      /**
        * Creates and returns a new BusinessEventDefinition instance in the SDK and on the server.
        * The new BusinessEventDefinition will be automatically stored in the 'definition' property
        * of the parent BusinessEventService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createIn(container: BusinessEventService): BusinessEventDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[BusinessEventDefinition]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.BusinessEventDefinition.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.BusinessEventDefinition.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
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
    - typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.IBusinessEventService because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.BusinessEventService")
    @js.native
    open class BusinessEventService protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MBusinessEventService: FolderBase = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def definition: BusinessEventDefinition | Null = js.native
      def definition_=(newValue: BusinessEventDefinition | Null): Unit = js.native
      
      def document: String = js.native
      def document_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def operationImplementations: IList[ServiceOperation] = js.native
    }
    object BusinessEventService {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.BusinessEventService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new BusinessEventService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): BusinessEventService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[BusinessEventService]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.BusinessEventService.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.BusinessEventService.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.Channel")
    @js.native
    open class Channel protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def channelName: String = js.native
      def channelName_=(newValue: String): Unit = js.native
      
      def containerAsBusinessEventDefinition: BusinessEventDefinition = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def messages: IList[Message] = js.native
    }
    object Channel {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.Channel")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Channel instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Channel]
      
      /**
        * Creates and returns a new Channel instance in the SDK and on the server.
        * The new Channel will be automatically stored in the 'channels' property
        * of the parent BusinessEventDefinition element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createIn(container: BusinessEventDefinition): Channel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Channel]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.Channel.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.Channel.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.24.0: deleted
      * In version 9.11.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ConsumedBusinessEvent")
    @js.native
    open class ConsumedBusinessEvent protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 9.13.0: introduced
        */
      def channelId: String = js.native
      def channelId_=(newValue: String): Unit = js.native
      
      def containerAsConsumedBusinessEventService: ConsumedBusinessEventService = js.native
      
      def entity: IEntity = js.native
      
      def entityQualifiedName: String = js.native
      
      def entity_=(newValue: IEntity): Unit = js.native
      
      def eventName: String = js.native
      def eventName_=(newValue: String): Unit = js.native
      
      def microflow: IMicroflow = js.native
      
      def microflowQualifiedName: String = js.native
      
      def microflow_=(newValue: IMicroflow): Unit = js.native
    }
    object ConsumedBusinessEvent {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ConsumedBusinessEvent")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ConsumedBusinessEvent instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ConsumedBusinessEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ConsumedBusinessEvent]
      
      /**
        * Creates and returns a new ConsumedBusinessEvent instance in the SDK and on the server.
        * The new ConsumedBusinessEvent will be automatically stored in the 'businessEvents' property
        * of the parent ConsumedBusinessEventService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.11.0 to 9.23.0
        */
      /* static member */
      inline def createIn(container: ConsumedBusinessEventService): ConsumedBusinessEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ConsumedBusinessEvent]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ConsumedBusinessEvent.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ConsumedBusinessEvent.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.24.0: deleted
      * In version 9.8.0: introduced
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
    - typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.IConsumedBusinessEventService because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ConsumedBusinessEventService")
    @js.native
    open class ConsumedBusinessEventService protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      /**
        * In version 9.11.0: introduced
        */
      def businessEvents: IList[ConsumedBusinessEvent] = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MConsumedBusinessEventService: FolderBase = js.native
      
      /**
        * In version 9.11.0: introduced
        */
      def contract: String = js.native
      def contract_=(newValue: String): Unit = js.native
      
      /**
        * In version 9.11.0: introduced
        */
      def version: String = js.native
      def version_=(newValue: String): Unit = js.native
    }
    object ConsumedBusinessEventService {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ConsumedBusinessEventService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ConsumedBusinessEventService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): ConsumedBusinessEventService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ConsumedBusinessEventService]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ConsumedBusinessEventService.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ConsumedBusinessEventService.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.Message")
    @js.native
    open class Message protected () extends Element[IModel] {
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
        */
      def attributes: IList[MessageAttribute] = js.native
      
      def canPublish: Boolean = js.native
      def canPublish_=(newValue: Boolean): Unit = js.native
      
      def canSubscribe: Boolean = js.native
      def canSubscribe_=(newValue: Boolean): Unit = js.native
      
      def containerAsChannel: Channel = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def messageName: String = js.native
      def messageName_=(newValue: String): Unit = js.native
    }
    object Message {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.Message")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Message instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Message]
      
      /**
        * Creates and returns a new Message instance in the SDK and on the server.
        * The new Message will be automatically stored in the 'messages' property
        * of the parent Channel element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createIn(container: Channel): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Message]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.Message.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.Message.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.MessageAttribute")
    @js.native
    open class MessageAttribute protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attributeName: String = js.native
      def attributeName_=(newValue: String): Unit = js.native
      
      def attributeType: AttributeType = js.native
      def attributeType_=(newValue: AttributeType): Unit = js.native
      
      def containerAsMessage: Message = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
    }
    object MessageAttribute {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.MessageAttribute")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MessageAttribute instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MessageAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MessageAttribute]
      
      /**
        * Creates and returns a new MessageAttribute instance in the SDK and on the server.
        * The new MessageAttribute will be automatically stored in the 'attributes' property
        * of the parent Message element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createIn(container: Message): MessageAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MessageAttribute]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.MessageAttribute.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.MessageAttribute.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.24.0: deleted
      * In version 9.11.0: introduced
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
    - typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.IPublishedBusinessEventService because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedBusinessEventService")
    @js.native
    open class PublishedBusinessEventService protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      def channels: IList[PublishedChannel] = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MPublishedBusinessEventService: FolderBase = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      /**
        * In version 9.13.0: introduced
        */
      def eventNamePrefix: String = js.native
      def eventNamePrefix_=(newValue: String): Unit = js.native
      
      def serviceName: String = js.native
      def serviceName_=(newValue: String): Unit = js.native
      
      def summary: String = js.native
      def summary_=(newValue: String): Unit = js.native
      
      def version: String = js.native
      def version_=(newValue: String): Unit = js.native
    }
    object PublishedBusinessEventService {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedBusinessEventService")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new PublishedBusinessEventService unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): PublishedBusinessEventService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedBusinessEventService]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedBusinessEventService.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedBusinessEventService.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.24.0: deleted
      * In version 9.11.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedChannel")
    @js.native
    open class PublishedChannel protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def channelId: String = js.native
      def channelId_=(newValue: String): Unit = js.native
      
      def channelName: String = js.native
      def channelName_=(newValue: String): Unit = js.native
      
      def containerAsPublishedBusinessEventService: PublishedBusinessEventService = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def messages: IList[PublishedMessage] = js.native
    }
    object PublishedChannel {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedChannel")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new PublishedChannel instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): PublishedChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedChannel]
      
      /**
        * Creates and returns a new PublishedChannel instance in the SDK and on the server.
        * The new PublishedChannel will be automatically stored in the 'channels' property
        * of the parent PublishedBusinessEventService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.11.0 to 9.23.0
        */
      /* static member */
      inline def createIn(container: PublishedBusinessEventService): PublishedChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedChannel]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedChannel.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedChannel.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.24.0: deleted
      * In version 9.11.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedMessage")
    @js.native
    open class PublishedMessage protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attributes: IList[PublishedMessageAttribute] = js.native
      
      def containerAsPublishedChannel: PublishedChannel = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def entity: IEntity = js.native
      
      def entityQualifiedName: String = js.native
      
      def entity_=(newValue: IEntity): Unit = js.native
      
      /**
        * In version 9.12.0: introduced
        */
      def eventName: String = js.native
      def eventName_=(newValue: String): Unit = js.native
      
      /**
        * In version 9.12.0: deleted
        */
      def exposedName: String = js.native
      def exposedName_=(newValue: String): Unit = js.native
      
      def summary: String = js.native
      def summary_=(newValue: String): Unit = js.native
    }
    object PublishedMessage {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedMessage")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new PublishedMessage instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): PublishedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedMessage]
      
      /**
        * Creates and returns a new PublishedMessage instance in the SDK and on the server.
        * The new PublishedMessage will be automatically stored in the 'messages' property
        * of the parent PublishedChannel element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.11.0 to 9.23.0
        */
      /* static member */
      inline def createIn(container: PublishedChannel): PublishedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedMessage]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedMessage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedMessage.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.24.0: deleted
      * In version 9.11.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedMessageAttribute")
    @js.native
    open class PublishedMessageAttribute protected () extends Element[IModel] {
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
      
      /**
        * In version 9.14.0: introduced
        */
      def attributeType: AttributeType = js.native
      def attributeType_=(newValue: AttributeType): Unit = js.native
      
      def attribute_=(newValue: IAttribute): Unit = js.native
      
      def containerAsPublishedMessage: PublishedMessage = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def exposedName: String = js.native
      def exposedName_=(newValue: String): Unit = js.native
    }
    object PublishedMessageAttribute {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedMessageAttribute")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new PublishedMessageAttribute instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): PublishedMessageAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedMessageAttribute]
      
      /**
        * Creates and returns a new PublishedMessageAttribute instance in the SDK and on the server.
        * The new PublishedMessageAttribute will be automatically stored in the 'attributes' property
        * of the parent PublishedMessage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.11.0 to 9.23.0
        */
      /* static member */
      inline def createIn(container: PublishedMessage): PublishedMessageAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedMessageAttribute]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedMessageAttribute.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.PublishedMessageAttribute.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ServiceOperation")
    @js.native
    open class ServiceOperation protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsBusinessEventService: BusinessEventService = js.native
      
      def entity: IEntity = js.native
      
      def entityQualifiedName: String = js.native
      
      def entity_=(newValue: IEntity): Unit = js.native
      
      def messageName: String = js.native
      def messageName_=(newValue: String): Unit = js.native
      
      def microflow: IMicroflow | Null = js.native
      
      def microflowQualifiedName: String | Null = js.native
      
      def microflow_=(newValue: IMicroflow | Null): Unit = js.native
      
      def operation: String = js.native
      def operation_=(newValue: String): Unit = js.native
    }
    object ServiceOperation {
      
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ServiceOperation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ServiceOperation instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ServiceOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ServiceOperation]
      
      /**
        * Creates and returns a new ServiceOperation instance in the SDK and on the server.
        * The new ServiceOperation will be automatically stored in the 'operationImplementations' property
        * of the parent BusinessEventService element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createIn(container: BusinessEventService): ServiceOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ServiceOperation]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ServiceOperation.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/businessevents", "businessevents.ServiceOperation.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @js.native
    trait IBusinessEventService
      extends StObject
         with IDocument
    
    /**
      * In version 9.24.0: deleted
      * In version 9.8.0: introduced
      */
    @js.native
    trait IConsumedBusinessEventService
      extends StObject
         with IDocument
    
    /**
      * In version 9.24.0: deleted
      * In version 9.11.0: introduced
      */
    @js.native
    trait IPublishedBusinessEventService
      extends StObject
         with IDocument
  }
}
