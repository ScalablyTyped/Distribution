package typings.next.anon

import typings.next.distClientLegacyImageMod.ImageLoader
import typings.next.distClientLegacyImageMod.ImageLoaderProps
import typings.next.distClientLegacyImageMod.LayoutValue
import typings.next.distClientLegacyImageMod.LoadingValue
import typings.next.distClientLegacyImageMod.OnLoadingComplete
import typings.next.distClientLegacyImageMod.PlaceholderValue
import typings.next.distClientLegacyImageMod.SafeNumber
import typings.next.distClientLegacyImageMod.StaticImport
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurDataURL extends StObject {
  
  var blurDataURL: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[SafeNumber] = js.undefined
  
  var layout: js.UndefOr[LayoutValue] = js.undefined
  
  var lazyBoundary: js.UndefOr[String] = js.undefined
  
  var lazyRoot: js.UndefOr[RefObject[HTMLElement] | Null] = js.undefined
  
  var loader: js.UndefOr[ImageLoader] = js.undefined
  
  var loading: js.UndefOr[LoadingValue] = js.undefined
  
  var objectFit: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/client/legacy/image.ImgElementStyle['objectFit'] */ js.Any
  ] = js.undefined
  
  var objectPosition: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/client/legacy/image.ImgElementStyle['objectPosition'] */ js.Any
  ] = js.undefined
  
  var onLoadingComplete: js.UndefOr[OnLoadingComplete] = js.undefined
  
  var placeholder: js.UndefOr[PlaceholderValue] = js.undefined
  
  var priority: js.UndefOr[Boolean] = js.undefined
  
  var quality: js.UndefOr[SafeNumber] = js.undefined
  
  var src: String | StaticImport
  
  var unoptimized: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[SafeNumber] = js.undefined
}
object BlurDataURL {
  
  inline def apply(src: String | StaticImport): BlurDataURL = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurDataURL]
  }
  
  extension [Self <: BlurDataURL](x: Self) {
    
    inline def setBlurDataURL(value: String): Self = StObject.set(x, "blurDataURL", value.asInstanceOf[js.Any])
    
    inline def setBlurDataURLUndefined: Self = StObject.set(x, "blurDataURL", js.undefined)
    
    inline def setHeight(value: SafeNumber): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLayout(value: LayoutValue): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLazyBoundary(value: String): Self = StObject.set(x, "lazyBoundary", value.asInstanceOf[js.Any])
    
    inline def setLazyBoundaryUndefined: Self = StObject.set(x, "lazyBoundary", js.undefined)
    
    inline def setLazyRoot(value: RefObject[HTMLElement]): Self = StObject.set(x, "lazyRoot", value.asInstanceOf[js.Any])
    
    inline def setLazyRootNull: Self = StObject.set(x, "lazyRoot", null)
    
    inline def setLazyRootUndefined: Self = StObject.set(x, "lazyRoot", js.undefined)
    
    inline def setLoader(value: /* resolverProps */ ImageLoaderProps => String): Self = StObject.set(x, "loader", js.Any.fromFunction1(value))
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setLoading(value: LoadingValue): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setObjectFit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/client/legacy/image.ImgElementStyle['objectFit'] */ js.Any
    ): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    inline def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
    
    inline def setObjectPosition(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/client/legacy/image.ImgElementStyle['objectPosition'] */ js.Any
    ): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
    
    inline def setObjectPositionUndefined: Self = StObject.set(x, "objectPosition", js.undefined)
    
    inline def setOnLoadingComplete(value: /* result */ NaturalHeight => Unit): Self = StObject.set(x, "onLoadingComplete", js.Any.fromFunction1(value))
    
    inline def setOnLoadingCompleteUndefined: Self = StObject.set(x, "onLoadingComplete", js.undefined)
    
    inline def setPlaceholder(value: PlaceholderValue): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setQuality(value: SafeNumber): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setSrc(value: String | StaticImport): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setUnoptimized(value: Boolean): Self = StObject.set(x, "unoptimized", value.asInstanceOf[js.Any])
    
    inline def setUnoptimizedUndefined: Self = StObject.set(x, "unoptimized", js.undefined)
    
    inline def setWidth(value: SafeNumber): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
