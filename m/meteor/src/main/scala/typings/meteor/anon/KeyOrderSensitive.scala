package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyOrderSensitive extends StObject {
  
  var keyOrderSensitive: js.UndefOr[Boolean] = js.native
}
object KeyOrderSensitive {
  
  @scala.inline
  def apply(): KeyOrderSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyOrderSensitive]
  }
  
  @scala.inline
  implicit class KeyOrderSensitiveMutableBuilder[Self <: KeyOrderSensitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyOrderSensitive(value: Boolean): Self = StObject.set(x, "keyOrderSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyOrderSensitiveUndefined: Self = StObject.set(x, "keyOrderSensitive", js.undefined)
  }
}
