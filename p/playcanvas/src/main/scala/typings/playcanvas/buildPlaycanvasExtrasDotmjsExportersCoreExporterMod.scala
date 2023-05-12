package typings.playcanvas

import typings.playcanvas.anon.MaxTextureSize
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlaycanvasExtrasDotmjsExportersCoreExporterMod {
  
  @JSImport("playcanvas/build/playcanvas-extras.mjs/exporters/core-exporter", "CoreExporter")
  @js.native
  open class CoreExporter () extends StObject {
    
    /**
      * Converts a texture to a canvas.
      *
      * @param {Texture} texture - The source texture to be converted.
      * @param {object} options - Object for passing optional arguments.
      * @param {Color} [options.color] - The tint color to modify the texture with.
      * @param {number} [options.maxTextureSize] - Maximum texture size. Texture is resized if over the size.
      * @returns {HTMLCanvasElement|undefined} - The canvas element containing the image.
      */
    def textureToCanvas(
      texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Texture */ Any
    ): js.UndefOr[HTMLCanvasElement] = js.native
    def textureToCanvas(
      texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Texture */ Any,
      options: MaxTextureSize
    ): js.UndefOr[HTMLCanvasElement] = js.native
  }
}
