package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagespeedVersion extends StObject {
  
  /** The major version number of PageSpeed used to generate these results. */
  var major: js.UndefOr[String] = js.native
  
  /** The minor version number of PageSpeed used to generate these results. */
  var minor: js.UndefOr[String] = js.native
}
object PagespeedVersion {
  
  @scala.inline
  def apply(): PagespeedVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagespeedVersion]
  }
  
  @scala.inline
  implicit class PagespeedVersionMutableBuilder[Self <: PagespeedVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    @scala.inline
    def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
  }
}
