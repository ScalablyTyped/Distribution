package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deferred
  extends /* key */ StringDictionary[js.Any] {
  
  var deferred: js.UndefOr[Boolean] = js.native
  
  var fetchSize: js.UndefOr[Double] = js.native
}
object Deferred {
  
  @scala.inline
  def apply(): Deferred = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deferred]
  }
  
  @scala.inline
  implicit class DeferredMutableBuilder[Self <: Deferred] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
    
    @scala.inline
    def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
  }
}
