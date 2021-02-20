package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationReference extends StObject {
  
  /** The reference type corresponding to this event. */
  var `type`: js.UndefOr[String] = js.native
}
object ApplicationReference {
  
  @scala.inline
  def apply(): ApplicationReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationReference]
  }
  
  @scala.inline
  implicit class ApplicationReferenceMutableBuilder[Self <: ApplicationReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
