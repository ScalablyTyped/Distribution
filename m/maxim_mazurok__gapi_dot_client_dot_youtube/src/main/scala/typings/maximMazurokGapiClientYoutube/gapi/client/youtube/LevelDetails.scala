package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelDetails extends StObject {
  
  /** The name that should be used when referring to this level. */
  var displayName: js.UndefOr[String] = js.undefined
}
object LevelDetails {
  
  inline def apply(): LevelDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelDetails] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
