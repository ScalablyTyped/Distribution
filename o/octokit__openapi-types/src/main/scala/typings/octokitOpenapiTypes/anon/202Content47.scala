package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202Content47` extends StObject {
  
  /** Response */
  var `202`: Content47
  
  var `409`: Content55
}
object `202Content47` {
  
  inline def apply(`202`: Content47, `409`: Content55): `202Content47` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202Content47`]
  }
  
  extension [Self <: `202Content47`](x: Self) {
    
    inline def set202(value: Content47): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content55): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
  }
}
