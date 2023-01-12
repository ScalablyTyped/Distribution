package typings.parseColumns

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-columns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Value](textColumns: String): js.Array[Record[String, Value]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(textColumns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Record[String, Value]]]
  inline def default[Value](textColumns: String, options: Options[Value]): js.Array[Record[String, Value]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(textColumns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Value]]]
  
  trait Options[Value] extends StObject {
    
    /**
    	Headers to use instead of the existing ones.
    	*/
    val headers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    	Separator to split columns on.
    	@default ' '
    	*/
    val separator: js.UndefOr[String] = js.undefined
    
    /**
    	Transform elements.
    	Useful for being able to cleanup or change the type of elements.
    	*/
    val transform: js.UndefOr[
        js.Function4[
          /* element */ String, 
          /* header */ String, 
          /* columnIndex */ Double, 
          /* rowIndex */ Double, 
          Value
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply[Value](): Options[Value] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Value]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], Value] (val x: Self & Options[Value]) extends AnyVal {
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTransform(
        value: (/* element */ String, /* header */ String, /* columnIndex */ Double, /* rowIndex */ Double) => Value
      ): Self = StObject.set(x, "transform", js.Any.fromFunction4(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
