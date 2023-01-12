package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pinned extends StObject {
  
  /**
    * False or True values indicate the new pinned property value.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
}
object Pinned {
  
  inline def apply(): Pinned = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pinned]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pinned] (val x: Self) extends AnyVal {
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
  }
}
