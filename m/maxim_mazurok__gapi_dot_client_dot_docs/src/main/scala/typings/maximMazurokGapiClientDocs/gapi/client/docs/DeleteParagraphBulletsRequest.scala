package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParagraphBulletsRequest extends StObject {
  
  /** The range to delete bullets from. */
  var range: js.UndefOr[Range] = js.undefined
}
object DeleteParagraphBulletsRequest {
  
  inline def apply(): DeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParagraphBulletsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParagraphBulletsRequest] (val x: Self) extends AnyVal {
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
