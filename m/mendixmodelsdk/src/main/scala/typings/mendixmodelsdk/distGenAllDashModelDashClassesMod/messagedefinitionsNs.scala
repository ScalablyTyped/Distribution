package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.Element
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions")
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
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AssociationElement {
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
  class AttributeElement protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AttributeElement {
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
  class EntityElement protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityElement {
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
  @js.native
  class EntityMessageDefinition protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition {
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
  class ExposedAssociation protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAssociation {
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
  class ExposedAttribute protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAttribute {
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
  class ExposedEntity protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity {
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
  abstract class ExposedEntityBase protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntityBase {
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
  abstract class ExposedMember protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedMember {
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
  abstract class MessageDefinition protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.MessageDefinition {
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
  @js.native
  class MessageDefinitionCollection protected ()
    extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.MessageDefinitionCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /* static members */
  @js.native
  object AssociationElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AssociationElement = js.native
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    def createInElementUnderChildren(container: Element): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AssociationElement = js.native
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AssociationElement = js.native
  }
  
  /* static members */
  @js.native
  object AttributeElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AttributeElement = js.native
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AttributeElement = js.native
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.AttributeElement = js.native
  }
  
  /* static members */
  @js.native
  object EntityElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityElement = js.native
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityElement = js.native
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityElement = js.native
  }
  
  /* static members */
  @js.native
  object EntityMessageDefinition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition = js.native
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
      * of the parent MessageDefinitionCollection element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createIn(
      container: typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.MessageDefinitionCollection
    ): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition = js.native
  }
  
  /* static members */
  @js.native
  object ExposedAssociation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAssociation = js.native
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAssociation = js.native
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAssociation = js.native
  }
  
  /* static members */
  @js.native
  object ExposedAttribute extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAttribute = js.native
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAttribute = js.native
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedAttribute = js.native
  }
  
  /* static members */
  @js.native
  object ExposedEntity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
      * of the parent EntityMessageDefinition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInEntityMessageDefinitionUnderExposedEntity(
      container: typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.EntityMessageDefinition
    ): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity = js.native
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.ExposedEntity = js.native
  }
  
  /* static members */
  @js.native
  object ExposedEntityBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ExposedMember extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MessageDefinition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MessageDefinitionCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo = js.native
    /**
      * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitionsNs.MessageDefinitionCollection = js.native
  }
  
}

