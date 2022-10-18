package typings.next.anon

import typings.next.distServerSendPayloadMod.PayloadOptions
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stateful
  extends StObject
     with PayloadOptions {
  
  var `private`: Boolean
  
  var stateful: `true`
}
object Stateful {
  
  inline def apply(`private`: Boolean): Stateful = {
    val __obj = js.Dynamic.literal(stateful = true)
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stateful]
  }
  
  extension [Self <: Stateful](x: Self) {
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setStateful(value: `true`): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
  }
}
