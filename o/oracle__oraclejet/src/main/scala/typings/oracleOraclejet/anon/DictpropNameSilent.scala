package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameSilent
  extends /* key */ StringDictionary[js.Any] {
  
  var silent: js.UndefOr[Boolean] = js.native
}
object DictpropNameSilent {
  
  @scala.inline
  def apply(): DictpropNameSilent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropNameSilent]
  }
  
  @scala.inline
  implicit class DictpropNameSilentMutableBuilder[Self <: DictpropNameSilent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
