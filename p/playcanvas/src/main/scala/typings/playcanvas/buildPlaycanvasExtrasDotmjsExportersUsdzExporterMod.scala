package typings.playcanvas

import typings.playcanvas.anon.FileName
import typings.playcanvas.anon.`0`
import typings.playcanvas.buildPlaycanvasExtrasDotmjsExportersCoreExporterMod.CoreExporter
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlaycanvasExtrasDotmjsExportersUsdzExporterMod {
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs/exporters/usdz-exporter", "UsdzExporter")
  @js.native
  open class UsdzExporter () extends CoreExporter {
    
    def addFile(category: Any, uniqueId: Any): String = js.native
    def addFile(category: Any, uniqueId: Any, refName: String): String = js.native
    def addFile(category: Any, uniqueId: Any, refName: String, content: Any): String = js.native
    def addFile(category: Any, uniqueId: Any, refName: Unit, content: Any): String = js.native
    
    def alignFiles(): Unit = js.native
    
    /**
      * Converts a hierarchy of entities to USDZ format.
      *
      * @param {Entity} entity - The root of the entity hierarchy to convert.
      * @param {object} options - Object for passing optional arguments.
      * @param {number} [options.maxTextureSize] - Maximum texture size. Texture is resized if over the size.
      * @returns {Promise<ArrayBuffer>} - The USDZ file content.
      */
    def build(
      entity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any
    ): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def build(
      entity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any,
      options: `0`
    ): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def buildArray2(array: Any): String = js.native
    
    def buildArray3(array: Any): String = js.native
    
    def buildMat4(mat: Any): String = js.native
    
    def buildMaterial(material: Any): String = js.native
    
    def buildMesh(mesh: Any): String = js.native
    
    def buildMeshInstance(meshInstance: Any): String = js.native
    
    def done(): Unit = js.native
    
    /**
      * An object, storing a mapping between the file name and its content. Used as input to fflate to
      * zip up the data.
      *
      * @type {object}
      */
    var files: js.Object = js.native
    
    def getFileIds(category: Any, name: Any, ref: Any): FileName = js.native
    def getFileIds(category: Any, name: Any, ref: Any, `extension`: String): FileName = js.native
    
    def getMaterialRef(material: Any): String = js.native
    
    def getMeshRef(mesh: Any): String = js.native
    
    def getTextureFileIds(texture: Any): FileName = js.native
    
    def init(): Unit = js.native
    
    /**
      * Maps a material to a reference (path) inside the usdz container
      *
      * @type {Map<Material, string>}
      */
    var materialMap: Map[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Material */ Any, 
        String
      ] = js.native
    
    /**
      * A list of generated material usda contents, which are processed at the end
      */
    var materials: Any = js.native
    
    /**
      * Maps a mesh to a reference (path) inside the usdz container
      *
      * @type {Map<Mesh, string>}
      */
    var meshMap: Map[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mesh */ Any, 
        String
      ] = js.native
    
    /**
      * A set of used node names. Used in order to keep them unique.
      *
      * @type {Set<string>}
      */
    var nodeNames: Set[String] = js.native
    
    /**
      * A map of texture requests
      *
      * @type {Map<Texture, string>}
      */
    var textureMap: Map[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Texture */ Any, 
        String
      ] = js.native
  }
}
