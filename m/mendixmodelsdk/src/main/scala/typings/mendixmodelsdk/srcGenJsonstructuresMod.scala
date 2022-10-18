package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.Element
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.IMxSchema
import typings.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.MxSchema
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
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

object srcGenJsonstructuresMod {
  
  @JSImport("mendixmodelsdk/src/gen/jsonstructures", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object jsonstructures {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `JsonStructures`.
      */
    /**
      * In version 6.6.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/jsonstructures", "jsonstructures.JsonElement")
    @js.native
    open class JsonElement protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def originalValue: String = js.native
      def originalValue_=(newValue: String): Unit = js.native
    }
    object JsonElement {
      
      @JSImport("mendixmodelsdk/src/gen/jsonstructures", "jsonstructures.JsonElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new JsonElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): JsonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[JsonElement]
      
      /**
        * Creates and returns a new JsonElement instance in the SDK and on the server.
        * The new JsonElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      /* static member */
      inline def createInElementUnderChildren(container: Element): JsonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[JsonElement]
      
      /**
        * Creates and returns a new JsonElement instance in the SDK and on the server.
        * The new JsonElement will be automatically stored in the 'elements' property
        * of the parent JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      /* static member */
      inline def createInJsonStructureUnderElements(container: JsonStructure): JsonElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[JsonElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/jsonstructures", "jsonstructures.JsonElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/jsonstructures", "jsonstructures.JsonElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/json-structures relevant section in reference guide}
      *
      * In version 6.6.0: removed experimental
      * In version 6.2.0: introduced
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
    - typings.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.IMxSchema because Already inherited
    - typings.mendixmodelsdk.srcGenJsonstructuresMod.jsonstructures.IJsonStructure because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/jsonstructures", "jsonstructures.JsonStructure")
    @js.native
    open class JsonStructure protected () extends MxSchema {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MJsonStructure: FolderBase = js.native
      
      /**
        * In version 6.6.0: introduced
        */
      def elements: IList[Element] = js.native
      
      def jsonSnippet: String = js.native
      def jsonSnippet_=(newValue: String): Unit = js.native
    }
    object JsonStructure {
      
      @JSImport("mendixmodelsdk/src/gen/jsonstructures", "jsonstructures.JsonStructure")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new JsonStructure unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): JsonStructure = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[JsonStructure]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/jsonstructures", "jsonstructures.JsonStructure.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/jsonstructures", "jsonstructures.JsonStructure.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/json-structures relevant section in reference guide}
      *
      * In version 6.6.0: removed experimental
      * In version 6.2.0: introduced
      */
    @js.native
    trait IJsonStructure
      extends StObject
         with IMxSchema
  }
}
