package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticatedSafeJson extends StObject {
  
  var safeContents: js.Array[ContentInfoJson]
}
object AuthenticatedSafeJson {
  
  inline def apply(safeContents: js.Array[ContentInfoJson]): AuthenticatedSafeJson = {
    val __obj = js.Dynamic.literal(safeContents = safeContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatedSafeJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticatedSafeJson] (val x: Self) extends AnyVal {
    
    inline def setSafeContents(value: js.Array[ContentInfoJson]): Self = StObject.set(x, "safeContents", value.asInstanceOf[js.Any])
    
    inline def setSafeContentsVarargs(value: ContentInfoJson*): Self = StObject.set(x, "safeContents", js.Array(value*))
  }
}
