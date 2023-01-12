package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseStepResult[T] extends StObject {
  
  /**
    * In the step callback, the data array will only contain one element.
    */
  var data: T
  
  /** an array of errors. */
  var errors: js.Array[ParseError]
  
  /**
    * contains extra information about the parse, such as delimiter used,
    * the newline sequence, whether the process was aborted, etc.
    * Properties in this object are not guaranteed to exist in all situations.
    */
  var meta: ParseMeta
}
object ParseStepResult {
  
  inline def apply[T](data: T, errors: js.Array[ParseError], meta: ParseMeta): ParseStepResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseStepResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseStepResult[?], T] (val x: Self & ParseStepResult[T]) extends AnyVal {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMeta(value: ParseMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
