package typings.openidClient.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X5tS256
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
}
object X5tS256 {
  
  inline def apply(): X5tS256 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X5tS256]
  }
  
  extension [Self <: X5tS256](x: Self) {
    
    inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
  }
}
