package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestrictionChange extends StObject {
  
  /** The feature which had a change in restriction policy. */
  var feature: js.UndefOr[String] = js.native
  
  /** The restriction in place after the change. */
  var newRestriction: js.UndefOr[String] = js.native
}
object RestrictionChange {
  
  @scala.inline
  def apply(): RestrictionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictionChange]
  }
  
  @scala.inline
  implicit class RestrictionChangeMutableBuilder[Self <: RestrictionChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setNewRestriction(value: String): Self = StObject.set(x, "newRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewRestrictionUndefined: Self = StObject.set(x, "newRestriction", js.undefined)
  }
}
