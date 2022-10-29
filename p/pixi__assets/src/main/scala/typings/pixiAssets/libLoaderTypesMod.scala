package typings.pixiAssets

import typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderTypesMod {
  
  trait LoadAsset[T] extends StObject {
    
    var alias: js.UndefOr[js.Array[String]] = js.undefined
    
    var data: js.UndefOr[T] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var src: String
  }
  object LoadAsset {
    
    inline def apply[T](src: String): LoadAsset[T] = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadAsset[T]]
    }
    
    extension [Self <: LoadAsset[?], T](x: Self & LoadAsset[T]) {
      
      inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromiseAndParser extends StObject {
    
    var parser: LoaderParser[Any, Any]
    
    var promise: js.Promise[Any]
  }
  object PromiseAndParser {
    
    inline def apply(parser: LoaderParser[Any, Any], promise: js.Promise[Any]): PromiseAndParser = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseAndParser]
    }
    
    extension [Self <: PromiseAndParser](x: Self) {
      
      inline def setParser(value: LoaderParser[Any, Any]): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
}
