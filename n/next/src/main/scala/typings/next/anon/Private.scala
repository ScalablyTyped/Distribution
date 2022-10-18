package typings.next.anon

import typings.next.distServerSendPayloadMod.PayloadOptions
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Private
  extends StObject
     with PayloadOptions {
  
  var `private`: `true`
}
object Private {
  
  inline def apply(): Private = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("private")(true)
    __obj.asInstanceOf[Private]
  }
  
  extension [Self <: Private](x: Self) {
    
    inline def setPrivate(value: `true`): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
  }
}
