package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202205` extends StObject {
  
  /** Response */
  var `202`: ContentApplicationjsonMessageUrl
  
  /** Reset Content */
  var `205`: Any
}
object `202205` {
  
  inline def apply(`202`: ContentApplicationjsonMessageUrl, `205`: Any): `202205` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("205")(`205`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202205`]
  }
  
  extension [Self <: `202205`](x: Self) {
    
    inline def set202(value: ContentApplicationjsonMessageUrl): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set205(value: Any): Self = StObject.set(x, "205", value.asInstanceOf[js.Any])
  }
}
