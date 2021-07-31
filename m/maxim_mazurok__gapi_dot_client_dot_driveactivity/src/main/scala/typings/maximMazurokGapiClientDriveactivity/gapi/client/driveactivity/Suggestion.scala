package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suggestion extends StObject {
  
  /** The sub-type of this event. */
  var subtype: js.UndefOr[String] = js.undefined
}
object Suggestion {
  
  @scala.inline
  def apply(): Suggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suggestion]
  }
  
  @scala.inline
  implicit class SuggestionMutableBuilder[Self <: Suggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
  }
}
