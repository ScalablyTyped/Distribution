package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterProperties extends StObject {
  
  /** The human-readable name of the master. */
  var displayName: js.UndefOr[String] = js.undefined
}
object MasterProperties {
  
  @scala.inline
  def apply(): MasterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterProperties]
  }
  
  @scala.inline
  implicit class MasterPropertiesMutableBuilder[Self <: MasterProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
