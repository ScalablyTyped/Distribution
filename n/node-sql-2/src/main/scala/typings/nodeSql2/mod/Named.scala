package typings.nodeSql2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Named[Name /* <: String */] extends StObject {
  
  var name: js.UndefOr[Name] = js.undefined
}
object Named {
  
  inline def apply[Name /* <: String */](): Named[Name] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Named[Name]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Named[?], Name /* <: String */] (val x: Self & Named[Name]) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
