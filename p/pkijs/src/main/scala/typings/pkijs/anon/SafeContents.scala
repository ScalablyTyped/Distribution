package typings.pkijs.anon

import typings.pkijs.mod.SafeContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeContents extends StObject {
  
  var safeContents: js.Array[SafeContent]
}
object SafeContents {
  
  inline def apply(safeContents: js.Array[SafeContent]): SafeContents = {
    val __obj = js.Dynamic.literal(safeContents = safeContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeContents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SafeContents] (val x: Self) extends AnyVal {
    
    inline def setSafeContents(value: js.Array[SafeContent]): Self = StObject.set(x, "safeContents", value.asInstanceOf[js.Any])
    
    inline def setSafeContentsVarargs(value: SafeContent*): Self = StObject.set(x, "safeContents", js.Array(value*))
  }
}
