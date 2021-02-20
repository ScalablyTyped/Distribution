package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Website extends StObject {
  
  // The URL of the website.
  var address: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name of the web site.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The possible values are: other, home, work, blog, profile.
  var `type`: js.UndefOr[NullableOption[WebsiteType]] = js.native
}
object Website {
  
  @scala.inline
  def apply(): Website = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Website]
  }
  
  @scala.inline
  implicit class WebsiteMutableBuilder[Self <: Website] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NullableOption[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[WebsiteType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
