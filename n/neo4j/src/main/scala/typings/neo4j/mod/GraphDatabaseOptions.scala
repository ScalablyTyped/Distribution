package typings.neo4j.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphDatabaseOptions extends js.Object {
  
  /**
    * HTTP agent.
    * @type {any}
    */
  var agent: js.UndefOr[js.Any] = js.native
  
  /**
    * Authentication information.
    * @type {string|Authentication}
    */
  var auth: String | Authentication = js.native
  
  /**
    * HTTP headers.
    * @type {Object}
    */
  var headers: js.UndefOr[js.Object] = js.native
  
  /**
    * Proxy address.
    * @type {string}
    */
  var proxy: js.UndefOr[String] = js.native
  
  /**
    * URL connection.
    * @type {string}
    */
  var url: String = js.native
}
object GraphDatabaseOptions {
  
  @scala.inline
  def apply(auth: String | Authentication, url: String): GraphDatabaseOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDatabaseOptions]
  }
  
  @scala.inline
  implicit class GraphDatabaseOptionsOps[Self <: GraphDatabaseOptions] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | Authentication): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgent(value: js.Any): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
}
