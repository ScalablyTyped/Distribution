package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Restore extends StObject {
  
  /** The type of restore action taken. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Restore {
  
  @scala.inline
  def apply(): Restore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Restore]
  }
  
  @scala.inline
  implicit class RestoreMutableBuilder[Self <: Restore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
