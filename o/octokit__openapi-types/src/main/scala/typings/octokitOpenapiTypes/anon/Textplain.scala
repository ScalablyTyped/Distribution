package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Textplain extends StObject {
  
  @JSName("text/plain")
  var textSlashplain: String
  
  @JSName("text/x-markdown")
  var `textSlashx-markdown`: String
}
object Textplain {
  
  inline def apply(textSlashplain: String, `textSlashx-markdown`: String): Textplain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text/plain")(textSlashplain.asInstanceOf[js.Any])
    __obj.updateDynamic("text/x-markdown")(`textSlashx-markdown`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Textplain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Textplain] (val x: Self) extends AnyVal {
    
    inline def setTextSlashplain(value: String): Self = StObject.set(x, "text/plain", value.asInstanceOf[js.Any])
    
    inline def `setTextSlashx-markdown`(value: String): Self = StObject.set(x, "text/x-markdown", value.asInstanceOf[js.Any])
  }
}
