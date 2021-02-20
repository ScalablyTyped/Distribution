package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsMeasured extends StObject {
  
  var isMeasured: Boolean = js.native
}
object IsMeasured {
  
  @scala.inline
  def apply(isMeasured: Boolean): IsMeasured = {
    val __obj = js.Dynamic.literal(isMeasured = isMeasured.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMeasured]
  }
  
  @scala.inline
  implicit class IsMeasuredMutableBuilder[Self <: IsMeasured] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMeasured(value: Boolean): Self = StObject.set(x, "isMeasured", value.asInstanceOf[js.Any])
  }
}
