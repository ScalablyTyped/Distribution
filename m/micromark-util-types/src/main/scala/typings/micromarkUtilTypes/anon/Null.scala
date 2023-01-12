package typings.micromarkUtilTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Null extends StObject {
  
  var `null`: js.UndefOr[js.Array[String]] = js.undefined
}
object Null {
  
  inline def apply(): Null = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Null]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Null] (val x: Self) extends AnyVal {
    
    inline def setNull(value: js.Array[String]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
    
    inline def setNullVarargs(value: String*): Self = StObject.set(x, "null", js.Array(value*))
  }
}
