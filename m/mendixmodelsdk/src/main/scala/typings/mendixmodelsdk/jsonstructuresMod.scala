package typings.mendixmodelsdk

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.mappings.Element
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import typings.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema
import typings.mendixmodelsdk.xmlschemasMod.xmlschemas.MxSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/jsonstructures", JSImport.Namespace)
@js.native
object jsonstructuresMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object jsonstructures extends js.Object {
    /**
      * See: {@link https://docs.mendix.com/refguide7/json-structures relevant section in reference guide}
      *
      * In version 6.6.0: removed experimental
      * In version 6.2.0: introduced
      */
    @js.native
    trait IJsonStructure extends IMxSchema
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `JsonStructures`.
      */
    /**
      * In version 6.6.0: introduced
      */
    @js.native
    class JsonElement protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FJsonElement: IModel = js.native
      def originalValue: String = js.native
      def originalValue(newValue: String): js.Any = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/json-structures relevant section in reference guide}
      *
      * In version 6.6.0: removed experimental
      * In version 6.2.0: introduced
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.xmlschemasMod.xmlschemas.IMxSchema because Already inherited
    - typings.mendixmodelsdk.jsonstructuresMod.jsonstructures.IJsonStructure because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class JsonStructure protected () extends MxSchema {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FJsonStructure: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MJsonStructure: FolderBase = js.native
      /**
        * In version 6.6.0: introduced
        */
      def elements: IList[Element] = js.native
      def jsonSnippet: String = js.native
      def jsonSnippet(newValue: String): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object JsonElement extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new JsonElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): JsonElement = js.native
      /**
        * Creates and returns a new JsonElement instance in the SDK and on the server.
        * The new JsonElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      def createInElementUnderChildren(container: Element): JsonElement = js.native
      /**
        * Creates and returns a new JsonElement instance in the SDK and on the server.
        * The new JsonElement will be automatically stored in the 'elements' property
        * of the parent JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      def createInJsonStructureUnderElements(container: JsonStructure): JsonElement = js.native
    }
    
    /* static members */
    @js.native
    object JsonStructure extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new JsonStructure unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): JsonStructure = js.native
    }
    
  }
  
}

