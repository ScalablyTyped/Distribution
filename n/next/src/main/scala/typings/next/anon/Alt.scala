package typings.next.anon

import typings.next.distClientImageMod.ImageLoader
import typings.next.distClientImageMod.LoadingValue
import typings.next.distClientImageMod.OnLoadingComplete
import typings.next.distClientImageMod.PlaceholderValue
import typings.next.distClientImageMod.SafeNumber
import typings.next.distClientImageMod.StaticImport
import typings.next.distSharedLibImageConfigMod.ImageLoaderProps
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alt extends StObject {
  
  var alt: String
  
  var blurDataURL: js.UndefOr[String] = js.undefined
  
  var fill: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[SafeNumber] = js.undefined
  
  var loader: js.UndefOr[ImageLoader] = js.undefined
  
  var loading: js.UndefOr[LoadingValue] = js.undefined
  
  var onLoadingComplete: js.UndefOr[OnLoadingComplete] = js.undefined
  
  var placeholder: js.UndefOr[PlaceholderValue] = js.undefined
  
  var priority: js.UndefOr[Boolean] = js.undefined
  
  var quality: js.UndefOr[SafeNumber] = js.undefined
  
  var src: String | StaticImport
  
  var unoptimized: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[SafeNumber] = js.undefined
}
object Alt {
  
  inline def apply(alt: String, src: String | StaticImport): Alt = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
  
  extension [Self <: Alt](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setBlurDataURL(value: String): Self = StObject.set(x, "blurDataURL", value.asInstanceOf[js.Any])
    
    inline def setBlurDataURLUndefined: Self = StObject.set(x, "blurDataURL", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHeight(value: SafeNumber): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLoader(value: /* p */ ImageLoaderProps => String): Self = StObject.set(x, "loader", js.Any.fromFunction1(value))
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setLoading(value: LoadingValue): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setOnLoadingComplete(value: /* img */ HTMLImageElement => Unit): Self = StObject.set(x, "onLoadingComplete", js.Any.fromFunction1(value))
    
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
