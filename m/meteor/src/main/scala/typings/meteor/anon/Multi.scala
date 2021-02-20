package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multi extends StObject {
  
  var multi: js.UndefOr[Boolean] = js.native
}
object Multi {
  
  @scala.inline
  def apply(): Multi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multi]
  }
  
  @scala.inline
  implicit class MultiMutableBuilder[Self <: Multi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
  }
}
