package typings.playcanvas

import typings.playcanvas.anon.BufferViewMap
import typings.playcanvas.anon.Images
import typings.playcanvas.anon.`0`
import typings.playcanvas.buildPlaycanvasExtrasDotmjsExportersCoreExporterMod.CoreExporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlaycanvasExtrasDotmjsExportersGltfExporterMod {
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs/exporters/gltf-exporter", "GltfExporter")
  @js.native
  open class GltfExporter () extends CoreExporter {
    
    /**
      * Converts a hierarchy of entities to GLB format.
      *
      * @param {Entity} entity - The root of the entity hierarchy to convert.
      * @param {object} options - Object for passing optional arguments.
      * @param {number} [options.maxTextureSize] - Maximum texture size. Texture is resized if over the size.
      * @returns {ArrayBuffer} - The GLB file content.
      */
    def build(
      entity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any
    ): js.typedarray.ArrayBuffer = js.native
    def build(
      entity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any,
      options: `0`
    ): js.typedarray.ArrayBuffer = js.native
    
    def buildJson(resources: Any, options: Any): Images = js.native
    
    def collectResources(root: Any): BufferViewMap = js.native
    
    def convertTextures(textures: Any, json: Any, options: Any): Unit = js.native
    
    def writeBufferViews(resources: Any, json: Any): Unit = js.native
    
    def writeBuffers(resources: Any, json: Any): Unit = js.native
    
    def writeCameras(resources: Any, json: Any): Unit = js.native
    
    def writeMaterials(resources: Any, json: Any): Unit = js.native
    
    def writeMeshes(resources: Any, json: Any): Unit = js.native
    
    def writeNodes(resources: Any, json: Any): Unit = js.native
  }
}
