package typings.pixiTextBitmap

import typings.pixiTextBitmap.mod.BitmapFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  object GlobalMixins {
    
    trait IBitmapFontResource extends StObject {
      
      var bitmapFont: BitmapFont
    }
    object IBitmapFontResource {
      
      inline def apply(bitmapFont: BitmapFont): IBitmapFontResource = {
        val __obj = js.Dynamic.literal(bitmapFont = bitmapFont.asInstanceOf[js.Any])
        __obj.asInstanceOf[IBitmapFontResource]
      }
      
      extension [Self <: IBitmapFontResource](x: Self) {
        
        inline def setBitmapFont(value: BitmapFont): Self = StObject.set(x, "bitmapFont", value.asInstanceOf[js.Any])
      }
    }
    
    trait IBitmapFontResourceMetadata extends StObject {
      
      var pageFile: String
    }
    object IBitmapFontResourceMetadata {
      
      inline def apply(pageFile: String): IBitmapFontResourceMetadata = {
        val __obj = js.Dynamic.literal(pageFile = pageFile.asInstanceOf[js.Any])
        __obj.asInstanceOf[IBitmapFontResourceMetadata]
      }
      
      extension [Self <: IBitmapFontResourceMetadata](x: Self) {
        
        inline def setPageFile(value: String): Self = StObject.set(x, "pageFile", value.asInstanceOf[js.Any])
      }
    }
    
    // eslint-disable-next-line @typescript-eslint/no-empty-interface
    /* Inlined parent std.Partial<@pixi/text-bitmap.@pixi/text-bitmap/global.GlobalMixins.IBitmapFontResourceMetadata> */
    trait IResourceMetadata extends StObject {
      
      var pageFile: js.UndefOr[String] = js.undefined
    }
    object IResourceMetadata {
      
      inline def apply(): IResourceMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IResourceMetadata]
      }
      
      extension [Self <: IResourceMetadata](x: Self) {
        
        inline def setPageFile(value: String): Self = StObject.set(x, "pageFile", value.asInstanceOf[js.Any])
        
        inline def setPageFileUndefined: Self = StObject.set(x, "pageFile", js.undefined)
      }
    }
    
    // eslint-disable-next-line @typescript-eslint/no-empty-interface
    /* Inlined parent std.Partial<@pixi/text-bitmap.@pixi/text-bitmap/global.GlobalMixins.IBitmapFontResource> */
    trait LoaderResource extends StObject {
      
      var bitmapFont: js.UndefOr[BitmapFont] = js.undefined
    }
    object LoaderResource {
      
      inline def apply(): LoaderResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoaderResource]
      }
      
      extension [Self <: LoaderResource](x: Self) {
        
        inline def setBitmapFont(value: BitmapFont): Self = StObject.set(x, "bitmapFont", value.asInstanceOf[js.Any])
        
        inline def setBitmapFontUndefined: Self = StObject.set(x, "bitmapFont", js.undefined)
      }
    }
  }
}
