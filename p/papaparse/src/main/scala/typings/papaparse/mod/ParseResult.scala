package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseResult[T] extends StObject {
  
  /**
    * an array of rows. If header is false, rows are arrays; otherwise they are objects of data keyed by the field name.
    */
  var data: js.Array[T]
  
  /** an array of errors. */
  var errors: js.Array[ParseError]
  
  /**
    * contains extra information about the parse, such as delimiter used,
    * the newline sequence, whether the process was aborted, etc.
    * Properties in this object are not guaranteed to exist in all situations.
    */
  var meta: ParseMeta
}
object ParseResult {
  
  inline def apply[T](data: js.Array[T], errors: js.Array[ParseError], meta: ParseMeta): ParseResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult[T]]
  }
  
  extension [Self <: ParseResult[?], T](x: Self & ParseResult[T]) {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMeta(value: ParseMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
