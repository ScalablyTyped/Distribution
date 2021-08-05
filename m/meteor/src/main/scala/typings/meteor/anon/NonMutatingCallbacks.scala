package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonMutatingCallbacks extends StObject {
  
  var nonMutatingCallbacks: js.UndefOr[Boolean] = js.undefined
}
object NonMutatingCallbacks {
  
  inline def apply(): NonMutatingCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonMutatingCallbacks]
  }
  
  extension [Self <: NonMutatingCallbacks](x: Self) {
    
    inline def setNonMutatingCallbacks(value: Boolean): Self = StObject.set(x, "nonMutatingCallbacks", value.asInstanceOf[js.Any])
    
    inline def setNonMutatingCallbacksUndefined: Self = StObject.set(x, "nonMutatingCallbacks", js.undefined)
  }
}
