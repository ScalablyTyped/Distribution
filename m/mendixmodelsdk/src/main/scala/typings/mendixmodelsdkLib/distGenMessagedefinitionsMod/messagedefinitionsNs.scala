package typings
package mendixmodelsdkLib.distGenMessagedefinitionsMod

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
  class AssociationElement protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class AttributeElement protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class EntityElement protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.6.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.IEntityMessageDefinition because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class EntityMessageDefinition protected () extends MessageDefinition {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var exposedEntity: ExposedEntity | scala.Null = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class ExposedAssociation protected () extends ExposedEntityBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var association: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAssociationBase = js.native
    val associationQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class ExposedAttribute protected () extends ExposedMember {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var attribute: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute = js.native
    val attributeQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  class ExposedEntity protected () extends ExposedEntityBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  abstract class ExposedEntityBase protected () extends ExposedMember {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  abstract class ExposedMember protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.15.0: introduced
      */
    var documentation: java.lang.String = js.native
    /**
      * In version 7.15.0: introduced
      */
    var example: java.lang.String = js.native
    var originalName: java.lang.String = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  trait IEntityMessageDefinition extends IMessageDefinition
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  trait IMessageDefinition
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsMessageDefinitionCollection: IMessageDefinitionCollection = js.native
    @JSName("model")
    val model_IMessageDefinition: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @js.native
  trait IMessageDefinitionCollection
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument {
    val messageDefinitions: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IMessageDefinition] = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinition because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  abstract class MessageDefinition protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsMessageDefinitionCollection: MessageDefinitionCollection = js.native
    var documentation: java.lang.String = js.native
    @JSName("model")
    var model_MessageDefinition: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.IMessageDefinitionCollection because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class MessageDefinitionCollection protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    val messageDefinitions: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[MessageDefinition] = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `MessageDefinitions`.
    */
  /**
    * In version 7.10.0: introduced
    */
  @js.native
  object AssociationElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.AssociationElement = js.native
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    def createInElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.AssociationElement = js.native
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    def createInJsonStructureUnderElements(container: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.AssociationElement = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  object AttributeElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.AttributeElement = js.native
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.AttributeElement = js.native
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.AttributeElement = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  object EntityElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityElement = js.native
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityElement = js.native
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityElement = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  object EntityMessageDefinition extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition = js.native
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
      * of the parent MessageDefinitionCollection element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createIn(
      container: mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.MessageDefinitionCollection
    ): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  object ExposedAssociation extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAssociation = js.native
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAssociation = js.native
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAssociation = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  object ExposedAttribute extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAttribute = js.native
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAttribute = js.native
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAttribute = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  object ExposedEntity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
      * of the parent EntityMessageDefinition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInEntityMessageDefinitionUnderExposedEntity(
      container: mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition
    ): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  object ExposedEntityBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  object ExposedMember extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @js.native
  object MessageDefinition extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @js.native
  object MessageDefinitionCollection extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenMessagedefinitionsMod.messagedefinitionsNs.MessageDefinitionCollection = js.native
  }
  
}

