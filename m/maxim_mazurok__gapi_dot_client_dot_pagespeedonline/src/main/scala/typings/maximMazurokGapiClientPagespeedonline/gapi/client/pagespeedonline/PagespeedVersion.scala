package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagespeedVersion extends StObject {
  
  /** The major version number of PageSpeed used to generate these results. */
  var major: js.UndefOr[String] = js.undefined
  
  /** The minor version number of PageSpeed used to generate these results. */
  var minor: js.UndefOr[String] = js.undefined
}
object PagespeedVersion {
  
  inline def apply(): PagespeedVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagespeedVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagespeedVersion] (val x: Self) extends AnyVal {
    
    inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
  }
}
