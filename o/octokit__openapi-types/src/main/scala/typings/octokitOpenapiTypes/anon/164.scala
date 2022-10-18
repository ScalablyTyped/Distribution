package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  /**
    * Format: date-time
    * @description Describes the last point that notifications were checked. Anything updated since this time will not be marked as read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
    */
  var last_read_at: js.UndefOr[String] = js.undefined
}
object `164` {
  
  inline def apply(): `164` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`164`]
  }
  
  extension [Self <: `164`](x: Self) {
    
    inline def setLast_read_at(value: String): Self = StObject.set(x, "last_read_at", value.asInstanceOf[js.Any])
    
    inline def setLast_read_atUndefined: Self = StObject.set(x, "last_read_at", js.undefined)
  }
}
