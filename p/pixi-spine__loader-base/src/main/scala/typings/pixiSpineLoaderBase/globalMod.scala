package typings.pixiSpineLoaderBase

import typings.pixiSpineBase.mod.TextureAtlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  object GlobalMixins {
    
    trait IResourceMetadata extends StObject {
      
      var atlasRawData: js.UndefOr[String] = js.undefined
      
      var image: js.UndefOr[Any] = js.undefined
      
      var imageLoader: js.UndefOr[Any] = js.undefined
      
      var imageMetadata: js.UndefOr[Any] = js.undefined
      
      var imageNamePrefix: js.UndefOr[String] = js.undefined
      
      var images: js.UndefOr[Any] = js.undefined
      
      var spineAtlas: js.UndefOr[Any] = js.undefined
      
      var spineAtlasFile: js.UndefOr[String] = js.undefined
      
      var spineAtlasSuffix: js.UndefOr[String] = js.undefined
      
      var spineMetadata: js.UndefOr[Any] = js.undefined
      
      var spineSkeletonScale: js.UndefOr[Double] = js.undefined
    }
    object IResourceMetadata {
      
      inline def apply(): IResourceMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IResourceMetadata]
      }
      
      extension [Self <: IResourceMetadata](x: Self) {
        
        inline def setAtlasRawData(value: String): Self = StObject.set(x, "atlasRawData", value.asInstanceOf[js.Any])
        
        inline def setAtlasRawDataUndefined: Self = StObject.set(x, "atlasRawData", js.undefined)
        
        inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageLoader(value: Any): Self = StObject.set(x, "imageLoader", value.asInstanceOf[js.Any])
        
        inline def setImageLoaderUndefined: Self = StObject.set(x, "imageLoader", js.undefined)
        
        inline def setImageMetadata(value: Any): Self = StObject.set(x, "imageMetadata", value.asInstanceOf[js.Any])
        
        inline def setImageMetadataUndefined: Self = StObject.set(x, "imageMetadata", js.undefined)
        
        inline def setImageNamePrefix(value: String): Self = StObject.set(x, "imageNamePrefix", value.asInstanceOf[js.Any])
        
        inline def setImageNamePrefixUndefined: Self = StObject.set(x, "imageNamePrefix", js.undefined)
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setImages(value: Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
        
        inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
        
        inline def setSpineAtlas(value: Any): Self = StObject.set(x, "spineAtlas", value.asInstanceOf[js.Any])
        
        inline def setSpineAtlasFile(value: String): Self = StObject.set(x, "spineAtlasFile", value.asInstanceOf[js.Any])
        
        inline def setSpineAtlasFileUndefined: Self = StObject.set(x, "spineAtlasFile", js.undefined)
        
        inline def setSpineAtlasSuffix(value: String): Self = StObject.set(x, "spineAtlasSuffix", value.asInstanceOf[js.Any])
        
        inline def setSpineAtlasSuffixUndefined: Self = StObject.set(x, "spineAtlasSuffix", js.undefined)
        
        inline def setSpineAtlasUndefined: Self = StObject.set(x, "spineAtlas", js.undefined)
        
        inline def setSpineMetadata(value: Any): Self = StObject.set(x, "spineMetadata", value.asInstanceOf[js.Any])
        
        inline def setSpineMetadataUndefined: Self = StObject.set(x, "spineMetadata", js.undefined)
        
        inline def setSpineSkeletonScale(value: Double): Self = StObject.set(x, "spineSkeletonScale", value.asInstanceOf[js.Any])
        
        inline def setSpineSkeletonScaleUndefined: Self = StObject.set(x, "spineSkeletonScale", js.undefined)
      }
    }
    
    trait LoaderResource extends StObject {
      
      var spineAtlas: js.UndefOr[TextureAtlas] = js.undefined
    }
    object LoaderResource {
      
      inline def apply(): LoaderResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoaderResource]
      }
      
      extension [Self <: LoaderResource](x: Self) {
        
        inline def setSpineAtlas(value: TextureAtlas): Self = StObject.set(x, "spineAtlas", value.asInstanceOf[js.Any])
        
        inline def setSpineAtlasUndefined: Self = StObject.set(x, "spineAtlas", js.undefined)
      }
    }
  }
}
