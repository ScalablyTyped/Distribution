package typings
package mendixmodelsdkLib.distGenJsonstructuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/jsonstructures", "jsonstructures")
@js.native
object jsonstructuresNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/json-structures relevant section in reference guide}
    *
    * In version 6.6.0: removed experimental
    * In version 6.2.0: introduced
    */
  @js.native
  trait IJsonStructure
    extends mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.IMxSchema
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `JsonStructures`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  class JsonElement protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var originalValue: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/json-structures relevant section in reference guide}
    *
    * In version 6.6.0: removed experimental
    * In version 6.2.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.IJsonStructure because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class JsonStructure protected ()
    extends mendixmodelsdkLib.distGenXmlschemasMod.xmlschemasNs.MxSchema {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
      * In version 6.6.0: introduced
      */
    val elements: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element] = js.native
    var jsonSnippet: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object JsonElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJsonstructuresMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonElement = js.native
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.Element): mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonElement = js.native
    /**
      * Creates and returns a new JsonElement instance in the SDK and on the server.
      * The new JsonElement will be automatically stored in the 'elements' property
      * of the parent JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure): mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonElement = js.native
  }
  
  /* static members */
  @js.native
  object JsonStructure extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJsonstructuresMod.StructureVersionInfo = js.native
    /**
      * Creates a new JsonStructure unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenJsonstructuresMod.jsonstructuresNs.JsonStructure = js.native
  }
  
}

