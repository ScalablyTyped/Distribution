package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasChanged extends StObject {
  
  var hasChanged: Boolean = js.native
}
object HasChanged {
  
  @scala.inline
  def apply(hasChanged: Boolean): HasChanged = {
    val __obj = js.Dynamic.literal(hasChanged = hasChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasChanged]
  }
  
  @scala.inline
  implicit class HasChangedMutableBuilder[Self <: HasChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasChanged(value: Boolean): Self = StObject.set(x, "hasChanged", value.asInstanceOf[js.Any])
  }
}
