package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonstructures {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `JsonStructures`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "jsonstructures.JsonElement")
  @js.native
  class JsonElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.jsonstructures.JsonElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object JsonElement {
    
    @JSImport("mendixmodelsdk", "jsonstructures.JsonElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement]
    
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typings.mendixmodelsdk.mappingsMod.mappings.Element): typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement]
    
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'elements' property
      * of the parent JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure): typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/json-structures relevant section in reference guide}
    *
    * In version 6.6.0: removed experimental
    * In version 6.2.0: introduced
    */
  @JSImport("mendixmodelsdk", "jsonstructures.JsonStructure")
  @js.native
  class JsonStructure protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.jsonstructures.JsonStructure {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object JsonStructure {
    
    @JSImport("mendixmodelsdk", "jsonstructures.JsonStructure")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new JsonStructure unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure]
    
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonStructure.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "jsonstructures.JsonStructure.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.jsonstructuresMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
