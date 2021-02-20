package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameDeferred
  extends /* key */ StringDictionary[js.Any] {
  
  var deferred: js.UndefOr[Boolean] = js.native
}
object DictpropNameDeferred {
  
  @scala.inline
  def apply(): DictpropNameDeferred = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropNameDeferred]
  }
  
  @scala.inline
  implicit class DictpropNameDeferredMutableBuilder[Self <: DictpropNameDeferred] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
  }
}
