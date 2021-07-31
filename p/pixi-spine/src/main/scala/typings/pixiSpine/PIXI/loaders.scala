package typings.pixiSpine.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaders {
  
  trait IMetadata extends StObject {
    
    var atlasRawData: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[js.Any] = js.undefined
    
    var imageLoader: js.UndefOr[js.Any] = js.undefined
    
    var imageMetadata: js.UndefOr[js.Any] = js.undefined
    
    var imageNamePrefix: js.UndefOr[String] = js.undefined
    
    var images: js.UndefOr[js.Any] = js.undefined
    
    var spineAtlas: js.UndefOr[js.Any] = js.undefined
    
    var spineAtlasFile: js.UndefOr[String] = js.undefined
    
    var spineAtlasSuffix: js.UndefOr[String] = js.undefined
    
    var spineMetadata: js.UndefOr[js.Any] = js.undefined
    
    var spineSkeletonScale: js.UndefOr[Double] = js.undefined
  }
  object IMetadata {
    
    @scala.inline
    def apply(): IMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMetadata]
    }
    
    @scala.inline
    implicit class IMetadataMutableBuilder[Self <: IMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtlasRawData(value: String): Self = StObject.set(x, "atlasRawData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtlasRawDataUndefined: Self = StObject.set(x, "atlasRawData", js.undefined)
      
      @scala.inline
      def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageLoader(value: js.Any): Self = StObject.set(x, "imageLoader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageLoaderUndefined: Self = StObject.set(x, "imageLoader", js.undefined)
      
      @scala.inline
      def setImageMetadata(value: js.Any): Self = StObject.set(x, "imageMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageMetadataUndefined: Self = StObject.set(x, "imageMetadata", js.undefined)
      
      @scala.inline
      def setImageNamePrefix(value: String): Self = StObject.set(x, "imageNamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageNamePrefixUndefined: Self = StObject.set(x, "imageNamePrefix", js.undefined)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setImages(value: js.Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setSpineAtlas(value: js.Any): Self = StObject.set(x, "spineAtlas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpineAtlasFile(value: String): Self = StObject.set(x, "spineAtlasFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpineAtlasFileUndefined: Self = StObject.set(x, "spineAtlasFile", js.undefined)
      
      @scala.inline
      def setSpineAtlasSuffix(value: String): Self = StObject.set(x, "spineAtlasSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpineAtlasSuffixUndefined: Self = StObject.set(x, "spineAtlasSuffix", js.undefined)
      
      @scala.inline
      def setSpineAtlasUndefined: Self = StObject.set(x, "spineAtlas", js.undefined)
      
      @scala.inline
      def setSpineMetadata(value: js.Any): Self = StObject.set(x, "spineMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpineMetadataUndefined: Self = StObject.set(x, "spineMetadata", js.undefined)
      
      @scala.inline
      def setSpineSkeletonScale(value: Double): Self = StObject.set(x, "spineSkeletonScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpineSkeletonScaleUndefined: Self = StObject.set(x, "spineSkeletonScale", js.undefined)
    }
  }
}
