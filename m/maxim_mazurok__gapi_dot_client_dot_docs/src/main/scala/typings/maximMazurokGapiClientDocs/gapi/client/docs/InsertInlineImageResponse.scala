package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertInlineImageResponse extends StObject {
  
  /** The ID of the created InlineObject. */
  var objectId: js.UndefOr[String] = js.undefined
}
object InsertInlineImageResponse {
  
  inline def apply(): InsertInlineImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertInlineImageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertInlineImageResponse] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
