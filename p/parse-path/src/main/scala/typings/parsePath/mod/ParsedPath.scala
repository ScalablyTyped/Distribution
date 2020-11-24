package typings.parsePath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedPath extends js.Object {
  
  /** The url hash. */
  var hash: String = js.native
  
  /** The input url. */
  var href: String = js.native
  
  /** The url pathname. */
  var pathname: String = js.native
  
  /** The domain port. */
  var port: Null | Double = js.native
  
  /** The first protocol, `"ssh"` (if the url is a ssh url) or `"file"`. */
  var protocol: Protocol = js.native
  
  /** An array with the url protocols (usually it has one element). */
  var protocols: js.Array[Protocol] = js.native
  
  /** The url querystring, parsed as object. */
  var query: js.Any = js.native
  
  /** The url domain (including subdomains). */
  var resource: String = js.native
  
  /** The url querystring value. */
  var search: String = js.native
  
  /** The authentication user (usually for ssh urls). */
  var user: String = js.native
}
object ParsedPath {
  
  @scala.inline
  def apply(
    hash: String,
    href: String,
    pathname: String,
    protocol: Protocol,
    protocols: js.Array[Protocol],
    query: js.Any,
    resource: String,
    search: String,
    user: String
  ): ParsedPath = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedPath]
  }
  
  @scala.inline
  implicit class ParsedPathOps[Self <: ParsedPath] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("protocols", js.Array(value :_*))
    
    @scala.inline
    def setProtocols(value: js.Array[Protocol]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = this.set("port", null)
  }
}
