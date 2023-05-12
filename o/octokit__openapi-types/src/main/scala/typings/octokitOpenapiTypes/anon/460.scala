package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `460` extends StObject {
  
  var archived_at: js.UndefOr[FromTo] = js.undefined
}
object `460` {
  
  inline def apply(): `460` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`460`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `460`] (val x: Self) extends AnyVal {
    
    inline def setArchived_at(value: FromTo): Self = StObject.set(x, "archived_at", value.asInstanceOf[js.Any])
    
    inline def setArchived_atUndefined: Self = StObject.set(x, "archived_at", js.undefined)
  }
}
