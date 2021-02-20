package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteName extends StObject {
  
  var siteName: String = js.native
}
object SiteName {
  
  @scala.inline
  def apply(siteName: String): SiteName = {
    val __obj = js.Dynamic.literal(siteName = siteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteName]
  }
  
  @scala.inline
  implicit class SiteNameMutableBuilder[Self <: SiteName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
  }
}
