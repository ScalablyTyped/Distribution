package typings.pixiLoaders.mod

import typings.pixiCore.mod.IBaseTextureOptions
import typings.std.HTMLAudioElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResourceMetadata
  extends StObject
     with typings.pixiLoaders.GlobalMixins.IResourceMetadata
     with IBaseTextureOptions[Any] {
  
  /**
    * Used by BitmapFonts, Spritesheet and CompressedTextures as the options to used for
    * metadata when loading the child image.
    */
  var imageMetadata: js.UndefOr[IResourceMetadata] = js.undefined
  
  /** The element to use for loading, instead of creating one. */
  var loadElement: js.UndefOr[HTMLImageElement | HTMLAudioElement | HTMLVideoElement] = js.undefined
  
  /**
    * The mime type to use for the source element
    * of a video/audio elment. If the urls are an array, you can pass this as an array as well
    * where each index is the mime type to use for the corresponding url index.
    */
  var mimeType: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Skips adding source(s) to the load element. This
    * is useful if you want to pass in a `loadElement` that you already added load sources to.
    */
  var skipSource: js.UndefOr[Boolean] = js.undefined
}
object IResourceMetadata {
  
  inline def apply(): IResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceMetadata]
  }
  
  extension [Self <: IResourceMetadata](x: Self) {
    
    inline def setImageMetadata(value: IResourceMetadata): Self = StObject.set(x, "imageMetadata", value.asInstanceOf[js.Any])
    
    inline def setImageMetadataUndefined: Self = StObject.set(x, "imageMetadata", js.undefined)
    
    inline def setLoadElement(value: HTMLImageElement | HTMLAudioElement | HTMLVideoElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
    
    inline def setLoadElementUndefined: Self = StObject.set(x, "loadElement", js.undefined)
    
    inline def setMimeType(value: String | js.Array[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value*))
    
    inline def setSkipSource(value: Boolean): Self = StObject.set(x, "skipSource", value.asInstanceOf[js.Any])
    
    inline def setSkipSourceUndefined: Self = StObject.set(x, "skipSource", js.undefined)
  }
}
