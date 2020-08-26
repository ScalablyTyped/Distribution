package typings.needle.mod.core

import typings.needle.needleStrings.auto
import typings.needle.needleStrings.basic
import typings.needle.needleStrings.digest
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends js.Object {
  /**
    * Sets 'Accept' HTTP header. Defaults to &#x2a;&#x2f;&#x2a;.
    */
  var accept: js.UndefOr[String] = js.native
  /**
    * Uses an http.Agent of your choice, instead of the global, default one.
    * Useful for tweaking the behaviour at the connection level, such as when doing tunneling.
    */
  var agent: js.UndefOr[Agent | Boolean] = js.native
  /**
    * Determines what to do with provided username/password.
    * Options are auto, digest or basic (default).
    * auto will detect the type of authentication depending on the response headers.
    */
  var auth: js.UndefOr[auto | digest | basic] = js.native
  /**
    * If true, sets 'Accept-Encoding' header to 'gzip,deflate',
    * and inflates content if zipped.
    * Defaults to false.
    */
  var compressed: js.UndefOr[Boolean] = js.native
  /**
    * Sets 'Connection' HTTP header.
    * Not set by default, unless running Node < 0.11.4
    * in which case it defaults to close.
    */
  var connection: js.UndefOr[String] = js.native
  /**
    * Sets the 'Content-Type' header.
    * Unset by default, unless you're sending data
    * in which case it's set accordingly to whatever is being sent
    * (application/x-www-form-urlencoded, application/json or multipart/form-data).
    * That is, of course, unless the option is passed,
    * either here or through options.headers.
    */
  var content_type: js.UndefOr[String] = js.native
  // These properties are overwritten by those in the 'headers' field
  /**
    * Builds and sets a Cookie header from a { key: 'value' } object.
    */
  var cookies: js.UndefOr[Cookies] = js.native
  /**
    * Alias for follow_max
    */
  var follow: js.UndefOr[Double] = js.native
  /**
    * Number of redirects to follow. Defaults to 0.
    */
  var follow_max: js.UndefOr[Double] = js.native
  /**
    * Object containing custom HTTP headers for request.
    */
  var headers: js.UndefOr[js.Object] = js.native
  /**
    * When true, sets content type to application/json and sends request body as JSON string,
    * instead of a query string.
    */
  var json: js.UndefOr[Boolean] = js.native
  /**
    * Enables multipart/form-data encoding. Defaults to false.
    * Use it when uploading files.
    */
  var multipart: js.UndefOr[Boolean] = js.native
  /**
    * Returns error if connection takes longer than X milisecs to establish.
    * Defaults to 10000 (10 secs). 0 means no timeout.
    */
  var open_timeout: js.UndefOr[Double] = js.native
  /**
    * For HTTP basic auth. Requires username to be passed, but is optional.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Forwards request through HTTP(s) proxy.
    * Eg. proxy: 'http://user:pass@proxy.server.com:3128'.
    * For more advanced proxying/tunneling use a custom agent.
    */
  var proxy: js.UndefOr[String] = js.native
  /**
    * Returns error if data transfer takes longer than X milisecs,
    * after connection is established. Defaults to 0 (no timeout).
    */
  var read_timeout: js.UndefOr[Double] = js.native
  /**
    * When sending streams, this lets manually set the Content-Length header
    * --if the stream's bytecount is known beforehand--,
    * preventing ECONNRESET (socket hang up) errors on some servers that misbehave
    * when receiving payloads of unknown size.
    * Set it to 0 and Needle will get and set the stream's length,
    * or leave unset for the default behavior,
    * which is no Content-Length header for stream payloads.
    */
  var stream_length: js.UndefOr[Double] = js.native
  /**
    * Alias for open_timeout
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Sets the 'User-Agent' HTTP header.
    * Defaults to Needle/{version} (Node.js {node_version}).
    */
  var user_agent: js.UndefOr[String] = js.native
  // Overwritten if present in the URI
  /**
    * For HTTP basic auth.
    */
  var username: js.UndefOr[String] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAgent(value: Agent | Boolean): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setAuth(value: auto | digest | basic): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCompressed(value: Boolean): Self = this.set("compressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressed: Self = this.set("compressed", js.undefined)
    @scala.inline
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_type: Self = this.set("content_type", js.undefined)
    @scala.inline
    def setCookies(value: Cookies): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    @scala.inline
    def setFollow(value: Double): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setFollow_max(value: Double): Self = this.set("follow_max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow_max: Self = this.set("follow_max", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setMultipart(value: Boolean): Self = this.set("multipart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    @scala.inline
    def setOpen_timeout(value: Double): Self = this.set("open_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen_timeout: Self = this.set("open_timeout", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setRead_timeout(value: Double): Self = this.set("read_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead_timeout: Self = this.set("read_timeout", js.undefined)
    @scala.inline
    def setStream_length(value: Double): Self = this.set("stream_length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream_length: Self = this.set("stream_length", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUser_agent(value: String): Self = this.set("user_agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_agent: Self = this.set("user_agent", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

