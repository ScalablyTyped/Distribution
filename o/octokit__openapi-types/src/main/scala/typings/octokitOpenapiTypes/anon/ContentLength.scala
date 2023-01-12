package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentLength extends StObject {
  
  var `Content-Length`: js.UndefOr[String] = js.undefined
}
object ContentLength {
  
  inline def apply(): ContentLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentLength] (val x: Self) extends AnyVal {
    
    inline def `setContent-Length`(value: String): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
    
    inline def `setContent-LengthUndefined`: Self = StObject.set(x, "Content-Length", js.undefined)
  }
}
