package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  /** The type of delete action taken. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Delete {
  
  @scala.inline
  def apply(): Delete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
