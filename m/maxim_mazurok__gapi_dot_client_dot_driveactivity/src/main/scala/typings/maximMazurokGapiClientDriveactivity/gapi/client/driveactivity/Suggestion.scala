package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suggestion extends StObject {
  
  /** The sub-type of this event. */
  var subtype: js.UndefOr[String] = js.undefined
}
object Suggestion {
  
  inline def apply(): Suggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Suggestion] (val x: Self) extends AnyVal {
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
  }
}
