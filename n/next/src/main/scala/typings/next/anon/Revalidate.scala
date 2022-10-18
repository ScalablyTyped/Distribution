package typings.next.anon

import typings.next.distServerSendPayloadMod.PayloadOptions
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Revalidate
  extends StObject
     with PayloadOptions {
  
  var `private`: Boolean
  
  var revalidate: Double | `false`
  
  var stateful: `false`
}
object Revalidate {
  
  inline def apply(`private`: Boolean, revalidate: Double | `false`): Revalidate = {
    val __obj = js.Dynamic.literal(revalidate = revalidate.asInstanceOf[js.Any], stateful = false)
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revalidate]
  }
  
  extension [Self <: Revalidate](x: Self) {
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setRevalidate(value: Double | `false`): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setStateful(value: `false`): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
  }
}
