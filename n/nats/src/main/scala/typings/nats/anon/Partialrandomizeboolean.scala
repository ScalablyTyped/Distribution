package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  randomize :boolean}> */
trait Partialrandomizeboolean extends StObject {
  
  var randomize: js.UndefOr[Boolean] = js.undefined
}
object Partialrandomizeboolean {
  
  inline def apply(): Partialrandomizeboolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialrandomizeboolean]
  }
  
  extension [Self <: Partialrandomizeboolean](x: Self) {
    
    inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
    
    inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
  }
}
