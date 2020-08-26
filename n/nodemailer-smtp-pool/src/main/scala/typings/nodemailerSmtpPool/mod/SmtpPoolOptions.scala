package typings.nodemailerSmtpPool.mod

import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmtpPoolOptions extends js.Object {
  /**
    *  defines authentication data (see authentication section below)
    */
  var auth: js.UndefOr[AuthOptions] = js.native
  /**
    * defines preferred authentication method, eg. 'PLAIN'
    */
  var authMethod: js.UndefOr[String] = js.native
  /**
    * how many milliseconds to wait for the connection to establish
    */
  var connectionTimeout: js.UndefOr[Double] = js.native
  /**
    * if true, the connection emits all traffic between client and server as 'log' events
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * how many milliseconds to wait for the greeting after connection is established
    */
  var greetingTimeout: js.UndefOr[Double] = js.native
  /**
    * is the hostname or IP address to connect to (defaults to 'localhost')
    */
  var host: js.UndefOr[String] = js.native
  /**
    *  turns off STARTTLS support if true
    */
  var ignoreTLS: js.UndefOr[Boolean] = js.native
  /**
    * is the local interface to bind to for network connections
    */
  var localAddress: js.UndefOr[String] = js.native
  /**
    * (defaults to 5) is the count of maximum simultaneous connections to make against the SMTP server
    */
  var maxConnections: js.UndefOr[Double] = js.native
  /**
    * (defaults to 100) limits the message count to be sent using a single connection. After maxMessages messages the connection is dropped and a new one is created for the following messages
    */
  var maxMessages: js.UndefOr[Double] = js.native
  /**
    * optional hostname of the client, used for identifying to the server
    */
  var name: js.UndefOr[String] = js.native
  /**
    * is the port to connect to (defaults to 25 or 465)
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * defines if the connection should use SSL (if true) or not (if false)
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * how many milliseconds of inactivity to allow
    */
  var socketTimeout: js.UndefOr[Double] = js.native
  /**
    *  defines additional options to be passed to the socket constructor, eg. {rejectUnauthorized: true}
    */
  var tls: js.UndefOr[ConnectionOptions] = js.native
}

object SmtpPoolOptions {
  @scala.inline
  def apply(): SmtpPoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmtpPoolOptions]
  }
  @scala.inline
  implicit class SmtpPoolOptionsOps[Self <: SmtpPoolOptions] (val x: Self) extends AnyVal {
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
    def setAuth(value: AuthOptions): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setAuthMethod(value: String): Self = this.set("authMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthMethod: Self = this.set("authMethod", js.undefined)
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setGreetingTimeout(value: Double): Self = this.set("greetingTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreetingTimeout: Self = this.set("greetingTimeout", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setIgnoreTLS(value: Boolean): Self = this.set("ignoreTLS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreTLS: Self = this.set("ignoreTLS", js.undefined)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    @scala.inline
    def setMaxMessages(value: Double): Self = this.set("maxMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMessages: Self = this.set("maxMessages", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
    @scala.inline
    def setTls(value: ConnectionOptions): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
  }
  
}

