package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportResponse extends StObject {
  
  val body: ExportResponseData
}
object ExportResponse {
  
  inline def apply(body: ExportResponseData): ExportResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: ExportResponseData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
