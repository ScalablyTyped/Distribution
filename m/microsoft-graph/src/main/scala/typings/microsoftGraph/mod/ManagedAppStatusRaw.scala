package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAppStatusRaw
  extends StObject
     with ManagedAppStatus {
  
  // Status report content.
  var content: js.UndefOr[NullableOption[js.Any]] = js.undefined
}
object ManagedAppStatusRaw {
  
  @scala.inline
  def apply(): ManagedAppStatusRaw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppStatusRaw]
  }
  
  @scala.inline
  implicit class ManagedAppStatusRawMutableBuilder[Self <: ManagedAppStatusRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: NullableOption[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
