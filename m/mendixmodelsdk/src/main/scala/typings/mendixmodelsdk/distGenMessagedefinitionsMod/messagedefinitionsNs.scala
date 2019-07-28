package typings.mendixmodelsdk.distGenMessagedefinitionsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.Element
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AssociationElement
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AttributeElement
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityElement
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAssociation
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAttribute
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntityBase
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedMember
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinition
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinitionCollection
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.MessageDefinition
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.MessageDefinitionCollection
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions")
@js.native
object messagedefinitionsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `MessageDefinitions`.
    */
  /**
    * In version 7.10.0: introduced
    */
  @js.native
  class AssociationElement protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class AttributeElement protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class EntityElement protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.IEntityMessageDefinition because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class EntityMessageDefinition protected () extends MessageDefinition {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsMessageDefinitionCollection")
    val containerAsMessageDefinitionCollection_EntityMessageDefinition: MessageDefinitionCollection = js.native
    var exposedEntity: ExposedEntity | Null = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class ExposedAssociation protected () extends ExposedEntityBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var association: IAssociationBase = js.native
    val associationQualifiedName: String = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class ExposedAttribute protected () extends ExposedMember {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var attribute: IAttribute = js.native
    val attributeQualifiedName: String = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class ExposedEntity protected () extends ExposedEntityBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  abstract class ExposedEntityBase protected () extends ExposedMember {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity = js.native
    val entityQualifiedName: String = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  abstract class ExposedMember protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.15.0: introduced
      */
    var documentation: String = js.native
    /**
      * In version 7.15.0: introduced
      */
    var example: String = js.native
    var originalName: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @js.native
  trait IEntityMessageDefinition extends IMessageDefinition
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  trait IMessageDefinition
    extends IElement
       with IByNameReferrable {
    val containerAsMessageDefinitionCollection: IMessageDefinitionCollection = js.native
    @JSName("model")
    val model_IMessageDefinition: IModel = js.native
    val name: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @js.native
  trait IMessageDefinitionCollection extends IDocument {
    val messageDefinitions: IList[IMessageDefinition] = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinition because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsMessageDefinitionCollection, name */ @js.native
  abstract class MessageDefinition protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsMessageDefinitionCollection: IMessageDefinitionCollection | MessageDefinitionCollection = js.native
    var documentation: String = js.native
    @JSName("model")
    var model_MessageDefinition: IModel = js.native
    var name: String = js.native
    val qualifiedName: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinitionCollection because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined messageDefinitions */ @js.native
  class MessageDefinitionCollection protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    val messageDefinitions: IList[IMessageDefinition | MessageDefinition] = js.native
  }
  
  /* static members */
  @js.native
  object AssociationElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AssociationElement = js.native
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    def createInElementUnderChildren(container: Element): AssociationElement = js.native
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): AssociationElement = js.native
  }
  
  /* static members */
  @js.native
  object AttributeElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): AttributeElement = js.native
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): AttributeElement = js.native
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): AttributeElement = js.native
  }
  
  /* static members */
  @js.native
  object EntityElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EntityElement = js.native
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): EntityElement = js.native
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): EntityElement = js.native
  }
  
  /* static members */
  @js.native
  object EntityMessageDefinition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EntityMessageDefinition = js.native
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
      * of the parent MessageDefinitionCollection element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createIn(container: MessageDefinitionCollection): EntityMessageDefinition = js.native
  }
  
  /* static members */
  @js.native
  object ExposedAssociation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExposedAssociation = js.native
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): ExposedAssociation = js.native
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): ExposedAssociation = js.native
  }
  
  /* static members */
  @js.native
  object ExposedAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExposedAttribute = js.native
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): ExposedAttribute = js.native
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): ExposedAttribute = js.native
  }
  
  /* static members */
  @js.native
  object ExposedEntity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExposedEntity = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): ExposedEntity = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
      * of the parent EntityMessageDefinition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInEntityMessageDefinitionUnderExposedEntity(container: EntityMessageDefinition): ExposedEntity = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): ExposedEntity = js.native
  }
  
  /* static members */
  @js.native
  object ExposedEntityBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ExposedMember extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MessageDefinition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MessageDefinitionCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): MessageDefinitionCollection = js.native
  }
  
}

