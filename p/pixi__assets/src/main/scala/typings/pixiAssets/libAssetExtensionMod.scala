package typings.pixiAssets

import typings.pixiAssets.anon.PartialFormatDetectionPar
import typings.pixiAssets.anon.PartialResolveURLParser
import typings.pixiAssets.libCacheCacheParserMod.CacheParser
import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiExtensions.mod.ExtensionType.Asset
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAssetExtensionMod {
  
  /**
    * This developer convenience object allows developers to group
    * together the various asset parsers into a single object.
    * @memberof PIXI
    */
  trait AssetExtension[ASSET, META_DATA] extends StObject {
    
    var cache: js.UndefOr[Partial[CacheParser[ASSET]]] = js.undefined
    
    var detection: js.UndefOr[PartialFormatDetectionPar] = js.undefined
    
    var `extension`: Asset
    
    var loader: js.UndefOr[Partial[LoaderParser[ASSET, META_DATA, Record[String, Any]]]] = js.undefined
    
    var resolver: js.UndefOr[PartialResolveURLParser] = js.undefined
  }
  object AssetExtension {
    
    inline def apply[ASSET, META_DATA](`extension`: Asset): AssetExtension[ASSET, META_DATA] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetExtension[ASSET, META_DATA]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssetExtension[?, ?], ASSET, META_DATA] (val x: Self & (AssetExtension[ASSET, META_DATA])) extends AnyVal {
      
      inline def setCache(value: Partial[CacheParser[ASSET]]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDetection(value: PartialFormatDetectionPar): Self = StObject.set(x, "detection", value.asInstanceOf[js.Any])
      
      inline def setDetectionUndefined: Self = StObject.set(x, "detection", js.undefined)
      
      inline def setExtension(value: Asset): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setLoader(value: Partial[LoaderParser[ASSET, META_DATA, Record[String, Any]]]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setResolver(value: PartialResolveURLParser): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    }
  }
}
