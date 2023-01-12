package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ignored extends StObject {
  
  /**
    * @description Whether to block all notifications from a thread.
    * @default false
    */
  var ignored: js.UndefOr[Boolean] = js.undefined
}
object Ignored {
  
  inline def apply(): Ignored = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ignored]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ignored] (val x: Self) extends AnyVal {
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
  }
}
