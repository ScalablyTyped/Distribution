package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blacklist extends StObject {
  
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}
object Blacklist {
  
  @scala.inline
  def apply(): Blacklist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blacklist]
  }
  
  @scala.inline
  implicit class BlacklistMutableBuilder[Self <: Blacklist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
