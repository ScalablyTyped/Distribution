package typings.next

import typings.next.anon.Alt
import typings.next.distSharedLibImageConfigMod.ImageLoaderProps
import typings.next.nextStrings.alt
import typings.next.nextStrings.height
import typings.next.nextStrings.loading
import typings.next.nextStrings.ref
import typings.next.nextStrings.src
import typings.next.nextStrings.srcSet
import typings.next.nextStrings.width
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLImageElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientImageMod {
  
  @JSImport("next/dist/client/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: ImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ImageLoader = js.Function1[/* p */ ImageLoaderProps, String]
  
  type ImageProps = (Omit[
    DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
    src | srcSet | ref | alt | width | height | loading
  ]) & Alt
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.`lazy`
    - typings.next.nextStrings.eager
    - scala.Unit
  */
  type LoadingValue = js.UndefOr[_LoadingValue]
  
  type OnLoadingComplete = js.Function1[/* img */ HTMLImageElement, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.blur
    - typings.next.nextStrings.empty
  */
  trait PlaceholderValue extends StObject
  object PlaceholderValue {
    
    inline def blur: typings.next.nextStrings.blur = "blur".asInstanceOf[typings.next.nextStrings.blur]
    
    inline def empty: typings.next.nextStrings.empty = "empty".asInstanceOf[typings.next.nextStrings.empty]
  }
  
  type SafeNumber = Double | (/* template literal string: ${number} */ String)
  
  trait StaticImageData
    extends StObject
       with StaticImport {
    
    var blurDataURL: js.UndefOr[String] = js.undefined
    
    var blurHeight: js.UndefOr[Double] = js.undefined
    
    var blurWidth: js.UndefOr[Double] = js.undefined
    
    var height: Double
    
    var src: String
    
    var width: Double
  }
  object StaticImageData {
    
    inline def apply(height: Double, src: String, width: Double): StaticImageData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticImageData]
    }
    
    extension [Self <: StaticImageData](x: Self) {
      
      inline def setBlurDataURL(value: String): Self = StObject.set(x, "blurDataURL", value.asInstanceOf[js.Any])
      
      inline def setBlurDataURLUndefined: Self = StObject.set(x, "blurDataURL", js.undefined)
      
      inline def setBlurHeight(value: Double): Self = StObject.set(x, "blurHeight", value.asInstanceOf[js.Any])
      
      inline def setBlurHeightUndefined: Self = StObject.set(x, "blurHeight", js.undefined)
      
      inline def setBlurWidth(value: Double): Self = StObject.set(x, "blurWidth", value.asInstanceOf[js.Any])
      
      inline def setBlurWidthUndefined: Self = StObject.set(x, "blurWidth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.distClientImageMod.StaticRequire
    - typings.next.distClientImageMod.StaticImageData
  */
  trait StaticImport extends StObject
  object StaticImport {
    
    inline def StaticImageData(height: Double, src: String, width: Double): typings.next.distClientImageMod.StaticImageData = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distClientImageMod.StaticImageData]
    }
    
    inline def StaticRequire(default: StaticImageData): typings.next.distClientImageMod.StaticRequire = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distClientImageMod.StaticRequire]
    }
  }
  
  trait StaticRequire
    extends StObject
       with StaticImport {
    
    var default: StaticImageData
  }
  object StaticRequire {
    
    inline def apply(default: StaticImageData): StaticRequire = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRequire]
    }
    
    extension [Self <: StaticRequire](x: Self) {
      
      inline def setDefault(value: StaticImageData): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait _LoadingValue extends StObject
}
