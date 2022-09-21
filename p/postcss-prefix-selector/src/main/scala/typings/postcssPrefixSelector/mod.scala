package typings.postcssPrefixSelector

import typings.postcssPrefixSelector.anon.ReadonlyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: ReadonlyOptions): js.Function1[/* root */ Any, js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* root */ Any, js.UndefOr[String]]]
  
  @JSImport("postcss-prefix-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var ignoreFiles: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var includeFiles: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[
        js.Function4[
          /* prefix */ String, 
          /* selector */ String, 
          /* prefixedSelector */ String, 
          /* file */ String, 
          String
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setIgnoreFiles(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesUndefined: Self = StObject.set(x, "ignoreFiles", js.undefined)
      
      inline def setIgnoreFilesVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoreFiles", js.Array(value*))
      
      inline def setIncludeFiles(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "includeFiles", value.asInstanceOf[js.Any])
      
      inline def setIncludeFilesUndefined: Self = StObject.set(x, "includeFiles", js.undefined)
      
      inline def setIncludeFilesVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "includeFiles", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTransform(
        value: (/* prefix */ String, /* selector */ String, /* prefixedSelector */ String, /* file */ String) => String
      ): Self = StObject.set(x, "transform", js.Any.fromFunction4(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
