package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMappingsMod.mappings.Element
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "jsonstructures")
@js.native
object jsonstructures extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `JsonStructures`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  class JsonElement protected ()
    extends typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonElement {
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
    * See: {@link https://docs.mendix.com/refguide7/json-structures relevant section in reference guide}
    *
    * In version 6.6.0: removed experimental
    * In version 6.2.0: introduced
    */
  @js.native
  class JsonStructure protected ()
    extends typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonStructure {
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
  object JsonElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenJsonstructuresMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonElement = js.native
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: Element): typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonElement = js.native
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'elements' property
      * of the parent JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonStructure): typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonElement = js.native
  }
  
  /* static members */
  @js.native
  object JsonStructure extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenJsonstructuresMod.StructureVersionInfo = js.native
    /**
      * Creates a new JsonStructure unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.JsonStructure = js.native
  }
  
}

