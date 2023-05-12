package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlEvidence
  extends StObject
     with AlertEvidence {
  
  // The Unique Resource Locator (URL).
  var url: js.UndefOr[NullableOption[String]] = js.undefined
}
object UrlEvidence {
  
  inline def apply(): UrlEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlEvidence] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
