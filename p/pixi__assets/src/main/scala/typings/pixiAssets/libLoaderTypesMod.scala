package typings.pixiAssets

import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import typings.pixiAssets.pixiAssetsStrings.loadJson
import typings.pixiAssets.pixiAssetsStrings.loadSVG
import typings.pixiAssets.pixiAssetsStrings.loadTextures
import typings.pixiAssets.pixiAssetsStrings.loadTxt
import typings.pixiAssets.pixiAssetsStrings.loadWebFont
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderTypesMod {
  
  trait LoadAsset[T] extends StObject {
    
    /** Aliases associated with asset */
    var alias: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional data */
    var data: js.UndefOr[T] = js.undefined
    
    /** Format, ususally the file extension */
    var format: js.UndefOr[String] = js.undefined
    
    /** An override that will ensure that the asset is loaded with a specific parser */
    var loadParser: js.UndefOr[loadTextures | loadJson | loadTxt | loadWebFont | loadSVG | String] = js.undefined
    
    /** The URL or relative path to the asset */
    var src: String
  }
  object LoadAsset {
    
    inline def apply[T](src: String): LoadAsset[T] = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadAsset[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadAsset[?], T] (val x: Self & LoadAsset[T]) extends AnyVal {
      
      inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLoadParser(value: loadTextures | loadJson | loadTxt | loadWebFont | loadSVG | String): Self = StObject.set(x, "loadParser", value.asInstanceOf[js.Any])
      
      inline def setLoadParserUndefined: Self = StObject.set(x, "loadParser", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromiseAndParser extends StObject {
    
    var parser: LoaderParser[Any, Any, Record[String, Any]]
    
    var promise: js.Promise[Any]
  }
  object PromiseAndParser {
    
    inline def apply(parser: LoaderParser[Any, Any, Record[String, Any]], promise: js.Promise[Any]): PromiseAndParser = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseAndParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseAndParser] (val x: Self) extends AnyVal {
      
      inline def setParser(value: LoaderParser[Any, Any, Record[String, Any]]): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
}
