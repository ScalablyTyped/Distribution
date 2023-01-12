package typings.parse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeArrayIndex extends StObject {
  
  var includeArrayIndex: js.UndefOr[String] = js.undefined
  
  var path: String
  
  var preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.undefined
}
object IncludeArrayIndex {
  
  inline def apply(path: String): IncludeArrayIndex = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeArrayIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeArrayIndex] (val x: Self) extends AnyVal {
    
    inline def setIncludeArrayIndex(value: String): Self = StObject.set(x, "includeArrayIndex", value.asInstanceOf[js.Any])
    
    inline def setIncludeArrayIndexUndefined: Self = StObject.set(x, "includeArrayIndex", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPreserveNullAndEmptyArrays(value: Boolean): Self = StObject.set(x, "preserveNullAndEmptyArrays", value.asInstanceOf[js.Any])
    
    inline def setPreserveNullAndEmptyArraysUndefined: Self = StObject.set(x, "preserveNullAndEmptyArrays", js.undefined)
  }
}
