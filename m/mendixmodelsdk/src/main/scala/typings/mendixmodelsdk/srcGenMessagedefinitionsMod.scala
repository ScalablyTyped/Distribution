package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenJsonstructuresMod.jsonstructures.JsonStructure
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.Element
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenMessagedefinitionsMod {
  
  @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object messagedefinitions {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `MessageDefinitions`.
      */
    /**
      * In version 7.10.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.AssociationElement")
    @js.native
    open class AssociationElement protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object AssociationElement {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.AssociationElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new AssociationElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): AssociationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AssociationElement]
      
      /**
        * Creates and returns a new AssociationElement instance in the SDK and on the server.
        * The new AssociationElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.10.0 and higher
        */
      /* static member */
      inline def createInElementUnderChildren(container: Element): AssociationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[AssociationElement]
      
      /**
        * Creates and returns a new AssociationElement instance in the SDK and on the server.
        * The new AssociationElement will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.10.0 and higher
        */
      /* static member */
      inline def createInJsonStructureUnderElements(container: JsonStructure): AssociationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[AssociationElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.AssociationElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.AssociationElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.AttributeElement")
    @js.native
    open class AttributeElement protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object AttributeElement {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.AttributeElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new AttributeElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): AttributeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AttributeElement]
      
      /**
        * Creates and returns a new AttributeElement instance in the SDK and on the server.
        * The new AttributeElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInElementUnderChildren(container: Element): AttributeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeElement]
      
      /**
        * Creates and returns a new AttributeElement instance in the SDK and on the server.
        * The new AttributeElement will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInJsonStructureUnderElements(container: JsonStructure): AttributeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.AttributeElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.AttributeElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.EntityElement")
    @js.native
    open class EntityElement protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object EntityElement {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.EntityElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new EntityElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): EntityElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[EntityElement]
      
      /**
        * Creates and returns a new EntityElement instance in the SDK and on the server.
        * The new EntityElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInElementUnderChildren(container: Element): EntityElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[EntityElement]
      
      /**
        * Creates and returns a new EntityElement instance in the SDK and on the server.
        * The new EntityElement will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInJsonStructureUnderElements(container: JsonStructure): EntityElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[EntityElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.EntityElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.EntityElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
      *
      * In version 7.6.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.IMessageDefinition because Already inherited
    - typings.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.IEntityMessageDefinition because var conflicts: containerAsMessageDefinitionCollection, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition")
    @js.native
    open class EntityMessageDefinition protected () extends MessageDefinition {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      @JSName("containerAsMessageDefinitionCollection")
      def containerAsMessageDefinitionCollection_MEntityMessageDefinition: MessageDefinitionCollection = js.native
      
      def exposedEntity: ExposedEntity | Null = js.native
      def exposedEntity_=(newValue: ExposedEntity | Null): Unit = js.native
    }
    object EntityMessageDefinition {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): EntityMessageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[EntityMessageDefinition]
      
      /**
        * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
        * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
        * of the parent MessageDefinitionCollection element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createIn(container: MessageDefinitionCollection): EntityMessageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[EntityMessageDefinition]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedAssociation")
    @js.native
    open class ExposedAssociation protected () extends ExposedEntityBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def association: IAssociationBase = js.native
      
      def associationQualifiedName: String = js.native
      
      def association_=(newValue: IAssociationBase): Unit = js.native
    }
    object ExposedAssociation {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedAssociation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ExposedAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ExposedAssociation]
      
      /**
        * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
        * The new ExposedAssociation will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInElementUnderChildren(container: Element): ExposedAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[ExposedAssociation]
      
      /**
        * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
        * The new ExposedAssociation will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInJsonStructureUnderElements(container: JsonStructure): ExposedAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[ExposedAssociation]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedAssociation.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedAssociation.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedAttribute")
    @js.native
    open class ExposedAttribute protected () extends ExposedMember {
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
      
      def attribute_=(newValue: IAttribute): Unit = js.native
    }
    object ExposedAttribute {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedAttribute")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ExposedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ExposedAttribute]
      
      /**
        * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
        * The new ExposedAttribute will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInElementUnderChildren(container: Element): ExposedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[ExposedAttribute]
      
      /**
        * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
        * The new ExposedAttribute will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInJsonStructureUnderElements(container: JsonStructure): ExposedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[ExposedAttribute]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedAttribute.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedAttribute.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedEntity")
    @js.native
    open class ExposedEntity protected () extends ExposedEntityBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object ExposedEntity {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedEntity")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExposedEntity instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ExposedEntity]
      
      /**
        * Creates and returns a new ExposedEntity instance in the SDK and on the server.
        * The new ExposedEntity will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInElementUnderChildren(container: Element): ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[ExposedEntity]
      
      /**
        * Creates and returns a new ExposedEntity instance in the SDK and on the server.
        * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
        * of the parent EntityMessageDefinition element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInEntityMessageDefinitionUnderExposedEntity(container: EntityMessageDefinition): ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityMessageDefinitionUnderExposedEntity")(container.asInstanceOf[js.Any]).asInstanceOf[ExposedEntity]
      
      /**
        * Creates and returns a new ExposedEntity instance in the SDK and on the server.
        * The new ExposedEntity will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.6.0 and higher
        */
      /* static member */
      inline def createInJsonStructureUnderElements(container: JsonStructure): ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[ExposedEntity]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedEntity.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedEntity.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedEntityBase")
    @js.native
    open class ExposedEntityBase protected () extends ExposedMember {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def entity: IEntity = js.native
      
      def entityQualifiedName: String = js.native
      
      def entity_=(newValue: IEntity): Unit = js.native
    }
    object ExposedEntityBase {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedEntityBase")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedEntityBase.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedEntityBase.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedMember")
    @js.native
    open class ExposedMember protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 7.15.0: introduced
        */
      def documentation: String = js.native
      def documentation_=(newValue: String): Unit = js.native
      
      /**
        * In version 7.15.0: introduced
        */
      def example: String = js.native
      def example_=(newValue: String): Unit = js.native
      
      def originalName: String = js.native
      def originalName_=(newValue: String): Unit = js.native
    }
    object ExposedMember {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedMember")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedMember.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.ExposedMember.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.6.0: introduced
      */
    /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.IMessageDefinition because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsMessageDefinitionCollection, name */ @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.MessageDefinition")
    @js.native
    open class MessageDefinition protected ()
      extends typings.mendixmodelsdk.srcSdkInternalMod.Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsMessageDefinitionCollection: MessageDefinitionCollection = js.native
      @JSName("containerAsMessageDefinitionCollection")
      val containerAsMessageDefinitionCollection_FMessageDefinition: IMessageDefinitionCollection = js.native
      
      def documentation: String = js.native
      def documentation_=(newValue: String): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FMessageDefinition: String = js.native
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      @JSName("qualifiedName")
      def qualifiedName_MMessageDefinition: String | Null = js.native
    }
    object MessageDefinition {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.MessageDefinition")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.MessageDefinition.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.MessageDefinition.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
      *
      * In version 7.6.0: introduced
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
    - typings.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.IMessageDefinitionCollection because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined messageDefinitions */ @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection")
    @js.native
    open class MessageDefinitionCollection protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMessageDefinitionCollection: FolderBase = js.native
      
      def messageDefinitions: IList[MessageDefinition] = js.native
      @JSName("messageDefinitions")
      val messageDefinitions_FMessageDefinitionCollection: IList[IMessageDefinition] = js.native
    }
    object MessageDefinitionCollection {
      
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): MessageDefinitionCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MessageDefinitionCollection]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
      *
      * In version 7.6.0: introduced
      */
    @js.native
    trait IEntityMessageDefinition
      extends StObject
         with IMessageDefinition
    
    /**
      * In version 7.6.0: introduced
      */
    @js.native
    trait IMessageDefinition
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val containerAsMessageDefinitionCollection: IMessageDefinitionCollection = js.native
      
      @JSName("model")
      val model_IMessageDefinition: IModel = js.native
      
      val name: String = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
      *
      * In version 7.6.0: introduced
      */
    @js.native
    trait IMessageDefinitionCollection
      extends StObject
         with IDocument {
      
      val messageDefinitions: IList[IMessageDefinition] = js.native
    }
  }
}
