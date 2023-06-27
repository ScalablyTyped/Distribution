package typings.mixpanel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Persistent extends StObject {
    
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object Persistent {
    
    inline def apply(): Persistent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Persistent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Persistent] (val x: Self) extends AnyVal {
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
