package typings.needle.mod.core

import typings.needle.needleStrings.auto
import typings.needle.needleStrings.basic
import typings.needle.needleStrings.digest
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /**
    * Sets 'Accept' HTTP header. Defaults to &#x2a;&#x2f;&#x2a;.
    */
  var accept: js.UndefOr[String] = js.undefined
  /**
    * Uses an http.Agent of your choice, instead of the global, default one.
    * Useful for tweaking the behaviour at the connection level, such as when doing tunneling.
    */
  var agent: js.UndefOr[Agent | Boolean] = js.undefined
  /**
    * Determines what to do with provided username/password.
    * Options are auto, digest or basic (default).
    * auto will detect the type of authentication depending on the response headers.
    */
  var auth: js.UndefOr[auto | digest | basic] = js.undefined
  /**
    * If true, sets 'Accept-Encoding' header to 'gzip,deflate',
    * and inflates content if zipped.
    * Defaults to false.
    */
  var compressed: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets 'Connection' HTTP header.
    * Not set by default, unless running Node < 0.11.4
    * in which case it defaults to close.
    */
  var connection: js.UndefOr[String] = js.undefined
  /**
    * Sets the 'Content-Type' header.
    * Unset by default, unless you're sending data
    * in which case it's set accordingly to whatever is being sent
    * (application/x-www-form-urlencoded, application/json or multipart/form-data).
    * That is, of course, unless the option is passed,
    * either here or through options.headers.
    */
  var content_type: js.UndefOr[String] = js.undefined
  // These properties are overwritten by those in the 'headers' field
  /**
    * Builds and sets a Cookie header from a { key: 'value' } object.
    */
  var cookies: js.UndefOr[Cookies] = js.undefined
  /**
    * Alias for follow_max
    */
  var follow: js.UndefOr[Double] = js.undefined
  /**
    * Number of redirects to follow. Defaults to 0.
    */
  var follow_max: js.UndefOr[Double] = js.undefined
  /**
    * Object containing custom HTTP headers for request.
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
    * When true, sets content type to application/json and sends request body as JSON string,
    * instead of a query string.
    */
  var json: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables multipart/form-data encoding. Defaults to false.
    * Use it when uploading files.
    */
  var multipart: js.UndefOr[Boolean] = js.undefined
  /**
    * Returns error if connection takes longer than X milisecs to establish.
    * Defaults to 10000 (10 secs). 0 means no timeout.
    */
  var open_timeout: js.UndefOr[Double] = js.undefined
  /**
    * For HTTP basic auth. Requires username to be passed, but is optional.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Forwards request through HTTP(s) proxy.
    * Eg. proxy: 'http://user:pass@proxy.server.com:3128'.
    * For more advanced proxying/tunneling use a custom agent.
    */
  var proxy: js.UndefOr[String] = js.undefined
  /**
    * Returns error if data transfer takes longer than X milisecs,
    * after connection is established. Defaults to 0 (no timeout).
    */
  var read_timeout: js.UndefOr[Double] = js.undefined
  /**
    * When sending streams, this lets manually set the Content-Length header
    * --if the stream's bytecount is known beforehand--,
    * preventing ECONNRESET (socket hang up) errors on some servers that misbehave
    * when receiving payloads of unknown size.
    * Set it to 0 and Needle will get and set the stream's length,
    * or leave unset for the default behavior,
    * which is no Content-Length header for stream payloads.
    */
  var stream_length: js.UndefOr[Double] = js.undefined
  /**
    * Alias for open_timeout
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Sets the 'User-Agent' HTTP header.
    * Defaults to Needle/{version} (Node.js {node_version}).
    */
  var user_agent: js.UndefOr[String] = js.undefined
  // Overwritten if present in the URI
  /**
    * For HTTP basic auth.
    */
  var username: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    accept: String = null,
    agent: Agent | Boolean = null,
    auth: auto | digest | basic = null,
    compressed: js.UndefOr[Boolean] = js.undefined,
    connection: String = null,
    content_type: String = null,
    cookies: Cookies = null,
    follow: Int | Double = null,
    follow_max: Int | Double = null,
    headers: js.Object = null,
    json: js.UndefOr[Boolean] = js.undefined,
    multipart: js.UndefOr[Boolean] = js.undefined,
    open_timeout: Int | Double = null,
    password: String = null,
    proxy: String = null,
    read_timeout: Int | Double = null,
    stream_length: Int | Double = null,
    timeout: Int | Double = null,
    user_agent: String = null,
    username: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(compressed)) __obj.updateDynamic("compressed")(compressed.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (follow_max != null) __obj.updateDynamic("follow_max")(follow_max.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (open_timeout != null) __obj.updateDynamic("open_timeout")(open_timeout.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (read_timeout != null) __obj.updateDynamic("read_timeout")(read_timeout.asInstanceOf[js.Any])
    if (stream_length != null) __obj.updateDynamic("stream_length")(stream_length.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

