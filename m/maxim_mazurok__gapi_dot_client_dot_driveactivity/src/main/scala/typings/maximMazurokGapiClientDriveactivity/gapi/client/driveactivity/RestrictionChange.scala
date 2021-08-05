package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictionChange extends StObject {
  
  /** The feature which had a change in restriction policy. */
  var feature: js.UndefOr[String] = js.undefined
  
  /** The restriction in place after the change. */
  var newRestriction: js.UndefOr[String] = js.undefined
}
object RestrictionChange {
  
  inline def apply(): RestrictionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictionChange]
  }
  
  extension [Self <: RestrictionChange](x: Self) {
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setNewRestriction(value: String): Self = StObject.set(x, "newRestriction", value.asInstanceOf[js.Any])
    
    inline def setNewRestrictionUndefined: Self = StObject.set(x, "newRestriction", js.undefined)
  }
}
