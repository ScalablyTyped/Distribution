package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var content: typings.std.Element
  
  var header: typings.std.Element
}
object Header {
  
  inline def apply(content: typings.std.Element, header: typings.std.Element): Header = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  extension [Self <: Header](x: Self) {
    
    inline def setContent(value: typings.std.Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: typings.std.Element): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
