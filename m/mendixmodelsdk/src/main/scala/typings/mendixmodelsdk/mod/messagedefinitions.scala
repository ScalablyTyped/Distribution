package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagedefinitions {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `MessageDefinitions`.
    */
  /**
    * In version 7.10.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement")
  @js.native
  class AssociationElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.AssociationElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AssociationElement {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement]
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typings.mendixmodelsdk.mappingsMod.mappings.Element): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement]
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AssociationElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement")
  @js.native
  class AttributeElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.AttributeElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AttributeElement {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement]
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typings.mendixmodelsdk.mappingsMod.mappings.Element): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement]
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.AttributeElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement")
  @js.native
  class EntityElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.EntityElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityElement {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement]
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typings.mendixmodelsdk.mappingsMod.mappings.Element): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement]
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition")
  @js.native
  class EntityMessageDefinition protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.EntityMessageDefinition {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityMessageDefinition {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition]
    
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
      * of the parent MessageDefinitionCollection element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createIn(
      container: typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinitionCollection
    ): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation")
  @js.native
  class ExposedAssociation protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedAssociation {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedAssociation {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation]
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typings.mendixmodelsdk.mappingsMod.mappings.Element): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation]
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAssociation]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute")
  @js.native
  class ExposedAttribute protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedAttribute {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedAttribute {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute]
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typings.mendixmodelsdk.mappingsMod.mappings.Element): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute]
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedAttribute]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity")
  @js.native
  class ExposedEntity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedEntity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedEntity {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity]
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typings.mendixmodelsdk.mappingsMod.mappings.Element): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity]
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
      * of the parent EntityMessageDefinition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInEntityMessageDefinitionUnderExposedEntity(container: typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityMessageDefinitionUnderExposedEntity")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity]
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.ExposedEntity]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase")
  @js.native
  abstract class ExposedEntityBase protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedEntityBase {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedEntityBase {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
  @js.native
  abstract class ExposedMember protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.ExposedMember {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedMember {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition")
  @js.native
  abstract class MessageDefinition protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.MessageDefinition {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MessageDefinition {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
  @js.native
  class MessageDefinitionCollection protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.messagedefinitions.MessageDefinitionCollection {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MessageDefinitionCollection {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinitionCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinitionCollection]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
