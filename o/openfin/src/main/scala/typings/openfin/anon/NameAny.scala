package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameAny extends StObject {
  
  var name: js.Any = js.native
}
object NameAny {
  
  @scala.inline
  def apply(name: js.Any): NameAny = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameAny]
  }
  
  @scala.inline
  implicit class NameAnyMutableBuilder[Self <: NameAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
