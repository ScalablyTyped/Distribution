package typings
package nodemailerLib.libMailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates an object for exposing the Mail API */
@js.native
trait Mail
  extends nodeLib.eventsMod.EventEmitter {
  /** Usage: typeof transporter.MailMessage */
  var MailMessage: nodemailerLib.libMailerMailDashMessageMod.namespaced = js.native
  var dkim: nodemailerLib.libDkimMod.namespaced = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  var meta: stdLib.Map[java.lang.String, _] = js.native
  var options: nodemailerLib.libMailerMod.MailNs.Options = js.native
  var transporter: nodemailerLib.nodemailerMod.Transport = js.native
  @JSName("addListener")
  def addListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_token(
    event: nodemailerLib.nodemailerLibStrings.token,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  /** Closes all connections in the pool. If there is a message being sent, the connection is closed later */
  def close(): scala.Unit = js.native
  @JSName("emit")
  def emit_error(event: nodemailerLib.nodemailerLibStrings.error, error: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_idle(event: nodemailerLib.nodemailerLibStrings.idle): scala.Boolean = js.native
  @JSName("emit")
  def emit_token(
    event: nodemailerLib.nodemailerLibStrings.token,
    token: nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token
  ): scala.Boolean = js.native
  def get(key: java.lang.String): js.Any = js.native
  def getVersionString(): java.lang.String = js.native
  @JSName("get")
  def get_oauth2_provision_cb(key: nodemailerLib.nodemailerLibStrings.oauth2_provision_cb): js.Function3[
    /* user */ java.lang.String, 
    /* renew */ scala.Boolean, 
    /* callback */ js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* accessToken */ java.lang.String, 
      /* expires */ scala.Double, 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  @JSName("get")
  def get_proxy_handler_http(key: nodemailerLib.nodemailerLibStrings.proxy_handler_http): js.Function3[
    /* proxy */ nodeLib.urlMod.Url, 
    /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* socketOptions */ nodemailerLib.Anon_Connection, 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  @JSName("get")
  def get_proxy_handler_https(key: nodemailerLib.nodemailerLibStrings.proxy_handler_https): js.Function3[
    /* proxy */ nodeLib.urlMod.Url, 
    /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* socketOptions */ nodemailerLib.Anon_Connection, 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  @JSName("get")
  def get_proxy_handler_socks(key: nodemailerLib.nodemailerLibStrings.proxy_handler_socks): js.Function3[
    /* proxy */ nodeLib.urlMod.Url, 
    /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* socketOptions */ nodemailerLib.Anon_Connection, 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  @JSName("get")
  def get_proxy_handler_socks4(key: nodemailerLib.nodemailerLibStrings.proxy_handler_socks4): js.Function3[
    /* proxy */ nodeLib.urlMod.Url, 
    /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* socketOptions */ nodemailerLib.Anon_Connection, 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  @JSName("get")
  def get_proxy_handler_socks4a(key: nodemailerLib.nodemailerLibStrings.proxy_handler_socks4a): js.Function3[
    /* proxy */ nodeLib.urlMod.Url, 
    /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* socketOptions */ nodemailerLib.Anon_Connection, 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  @JSName("get")
  def get_proxy_handler_socks5(key: nodemailerLib.nodemailerLibStrings.proxy_handler_socks5): js.Function3[
    /* proxy */ nodeLib.urlMod.Url, 
    /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* socketOptions */ nodemailerLib.Anon_Connection, 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  /** Returns true if there are free slots in the queue */
  def isIdle(): scala.Boolean = js.native
  @JSName("listeners")
  def listeners_end(event: nodemailerLib.nodemailerLibStrings.end): js.Array[
    js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ] = js.native
  @JSName("listeners")
  def listeners_error(event: nodemailerLib.nodemailerLibStrings.error): js.Array[js.Function1[/* err */ nodeLib.Error, scala.Unit]] = js.native
  @JSName("listeners")
  def listeners_idle(event: nodemailerLib.nodemailerLibStrings.idle): js.Array[js.Function0[scala.Unit]] = js.native
  @JSName("on")
  def on_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_token(
    event: nodemailerLib.nodemailerLibStrings.token,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_token(
    event: nodemailerLib.nodemailerLibStrings.token,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(
    event: nodemailerLib.nodemailerLibStrings.end,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(
    event: nodemailerLib.nodemailerLibStrings.end,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_idle(event: nodemailerLib.nodemailerLibStrings.idle, listener: js.Function0[scala.Unit]): this.type = js.native
  def sendMail(mailOptions: nodemailerLib.libMailerMod.MailNs.Options): js.Promise[nodemailerLib.nodemailerMod.SentMessageInfo] = js.native
  /** Sends an email using the preselected transport object */
  def sendMail(
    mailOptions: nodemailerLib.libMailerMod.MailNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* info */ nodemailerLib.nodemailerMod.SentMessageInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): stdLib.Map[java.lang.String, _] = js.native
  @JSName("set")
  def set_oauth2_provision_cb(
    key: nodemailerLib.nodemailerLibStrings.oauth2_provision_cb,
    value: js.Function3[
      /* user */ java.lang.String, 
      /* renew */ scala.Boolean, 
      /* callback */ js.Function3[
        /* err */ nodeLib.Error | scala.Null, 
        /* accessToken */ js.UndefOr[java.lang.String], 
        /* expires */ js.UndefOr[scala.Double], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): stdLib.Map[java.lang.String, _] = js.native
  @JSName("set")
  def set_proxy_handler_http(
    key: nodemailerLib.nodemailerLibStrings.proxy_handler_http,
    value: js.Function3[
      /* proxy */ nodeLib.urlMod.Url, 
      /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
      /* callback */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* socketOptions */ js.UndefOr[nodemailerLib.Anon_Connection], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): stdLib.Map[java.lang.String, _] = js.native
  @JSName("set")
  def set_proxy_handler_https(
    key: nodemailerLib.nodemailerLibStrings.proxy_handler_https,
    value: js.Function3[
      /* proxy */ nodeLib.urlMod.Url, 
      /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
      /* callback */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* socketOptions */ js.UndefOr[nodemailerLib.Anon_Connection], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): stdLib.Map[java.lang.String, _] = js.native
  @JSName("set")
  def set_proxy_handler_socks(
    key: nodemailerLib.nodemailerLibStrings.proxy_handler_socks,
    value: js.Function3[
      /* proxy */ nodeLib.urlMod.Url, 
      /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
      /* callback */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* socketOptions */ js.UndefOr[nodemailerLib.Anon_Connection], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): stdLib.Map[java.lang.String, _] = js.native
  @JSName("set")
  def set_proxy_handler_socks4(
    key: nodemailerLib.nodemailerLibStrings.proxy_handler_socks4,
    value: js.Function3[
      /* proxy */ nodeLib.urlMod.Url, 
      /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
      /* callback */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* socketOptions */ js.UndefOr[nodemailerLib.Anon_Connection], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): stdLib.Map[java.lang.String, _] = js.native
  @JSName("set")
  def set_proxy_handler_socks4a(
    key: nodemailerLib.nodemailerLibStrings.proxy_handler_socks4a,
    value: js.Function3[
      /* proxy */ nodeLib.urlMod.Url, 
      /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
      /* callback */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* socketOptions */ js.UndefOr[nodemailerLib.Anon_Connection], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): stdLib.Map[java.lang.String, _] = js.native
  @JSName("set")
  def set_proxy_handler_socks5(
    key: nodemailerLib.nodemailerLibStrings.proxy_handler_socks5,
    value: js.Function3[
      /* proxy */ nodeLib.urlMod.Url, 
      /* options */ nodemailerLib.nodemailerMod.TransportOptions, 
      /* callback */ js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* socketOptions */ js.UndefOr[nodemailerLib.Anon_Connection], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): stdLib.Map[java.lang.String, _] = js.native
  /** Sets up proxy handler for a Nodemailer object */
  def setupProxy(proxyUrl: java.lang.String): scala.Unit = js.native
  def use(step: java.lang.String, plugin: nodemailerLib.libMailerMod.MailNs.PluginFunction): this.type = js.native
  def verify(): js.Promise[nodemailerLib.nodemailerLibNumbers.`true`] = js.native
  /** Verifies SMTP configuration */
  def verify(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      nodemailerLib.nodemailerLibNumbers.`true`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

