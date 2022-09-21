package typings.postcssPrefixSelector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<postcss-prefix-selector.postcss-prefix-selector.Options> */
  trait ReadonlyOptions extends StObject {
    
    val exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    val ignoreFiles: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    val includeFiles: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    val prefix: js.UndefOr[String] = js.undefined
    
    val transform: js.UndefOr[
        js.Function4[
          /* prefix */ String, 
          /* selector */ String, 
          /* prefixedSelector */ String, 
          /* file */ String, 
          String
        ]
      ] = js.undefined
  }
  object ReadonlyOptions {
    
    inline def apply(): ReadonlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptions]
    }
    
    extension [Self <: ReadonlyOptions](x: Self) {
      
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
