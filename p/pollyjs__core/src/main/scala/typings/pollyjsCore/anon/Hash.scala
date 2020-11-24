package typings.pollyjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.pollyjsCore.mod.MatchBy
import typings.pollyjsCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends js.Object {
  
  var hash: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  
  var hostname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  
  var password: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  
  var pathname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  
  var port: js.UndefOr[Boolean | (MatchBy[Double, Double])] = js.native
  
  var protocol: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  
  var query: js.UndefOr[Boolean | (MatchBy[StringDictionary[_], StringDictionary[_]])] = js.native
  
  var username: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
}
object Hash {
  
  @scala.inline
  def apply(): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHashFunction2(value: (String, /* req */ Request) => String): Self = this.set("hash", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHash(value: Boolean | (MatchBy[String, String])): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setHostnameFunction2(value: (String, /* req */ Request) => String): Self = this.set("hostname", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHostname(value: Boolean | (MatchBy[String, String])): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setPasswordFunction2(value: (String, /* req */ Request) => String): Self = this.set("password", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPassword(value: Boolean | (MatchBy[String, String])): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPathnameFunction2(value: (String, /* req */ Request) => String): Self = this.set("pathname", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPathname(value: Boolean | (MatchBy[String, String])): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    
    @scala.inline
    def setPortFunction2(value: (Double, /* req */ Request) => Double): Self = this.set("port", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPort(value: Boolean | (MatchBy[Double, Double])): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocolFunction2(value: (String, /* req */ Request) => String): Self = this.set("protocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProtocol(value: Boolean | (MatchBy[String, String])): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setQueryFunction2(value: (StringDictionary[_], /* req */ Request) => StringDictionary[_]): Self = this.set("query", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQuery(value: Boolean | (MatchBy[StringDictionary[_], StringDictionary[_]])): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setUsernameFunction2(value: (String, /* req */ Request) => String): Self = this.set("username", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUsername(value: Boolean | (MatchBy[String, String])): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
