package typings.novncNovnc

import typings.novncNovnc.anon.Capabilities
import typings.novncNovnc.anon.Clean
import typings.novncNovnc.anon.Name
import typings.novncNovnc.anon.Power
import typings.novncNovnc.anon.Reason
import typings.novncNovnc.anon.Text
import typings.novncNovnc.anon.Types
import typings.novncNovnc.novncNovncStrings.bell
import typings.novncNovnc.novncNovncStrings.capabilities
import typings.novncNovnc.novncNovncStrings.clipboard
import typings.novncNovnc.novncNovncStrings.connect
import typings.novncNovnc.novncNovncStrings.credentialsrequired
import typings.novncNovnc.novncNovncStrings.desktopname
import typings.novncNovnc.novncNovncStrings.disconnect
import typings.novncNovnc.novncNovncStrings.securityfailure
import typings.std.CustomEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusOptions
import typings.std.Map
import typings.std.RTCDataChannel
import typings.std.Record
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRfbMod {
  
  @JSImport("@novnc/novnc/core/rfb", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NoVncClient {
    /**
      * Returns a new `NoVncClient` object and initiates a new connection to a specified VNC server.
      *
      * @param target - A block {@link HTMLElement} that specifies where the `NoVncClient` object
      * should attach itself. The existing contents of the `HTMLElement` will be untouched, but new
      * elements will be added during the lifetime of the `NoVncClient` object.
      * @param url - A `string`, {@link WebSocket}, or {@link RTCDataChannel} specifying the VNC server to connect
      * to. This must be a valid WebSocket URL.
      * @param options - An {@link NoVncOptions} specifying extra details about how the connection
      * should be made.
      */
    def this(target: Element, url: String) = this()
    def this(target: Element, url: RTCDataChannel) = this()
    def this(target: Element, url: WebSocket) = this()
    def this(target: Element, url: String, options: NoVncOptions) = this()
    def this(target: Element, url: RTCDataChannel, options: NoVncOptions) = this()
    def this(target: Element, url: WebSocket, options: NoVncOptions) = this()
  }
  
  @js.native
  trait NoVncClient
    extends StObject
       with NoVncEventTarget {
    
    val _target: Element = js.native
    
    val _url: String | Null = js.native
    
    /**
      * Is a valid CSS [background](https://developer.mozilla.org/en-US/docs/Web/CSS/background)
      * style value indicating which background style should be applied to the element containing the
      * remote session screen. The default value is `rgb(40, 40, 40)` (solid gray color).
      */
    var background: String = js.native
    
    /**
      * Remove keyboard focus on the remote session. Keyboard events will no longer be sent to the
      * remote server after this point.
      */
    def blur(): Unit = js.native
    
    /**
      * Is an `object` indicating which optional extensions are available on the server. Some methods
      * may only be called if the corresponding capability is set. The following capabilities are
      * defined:
      *
      * | name     | type      | description
      * | -------- | --------- | -----------
      * | `power`  | `boolean` | Machine power control is available
      */
    val capabilities: Power = js.native
    
    /**
      * Is a `boolean` indicating if the remote session should be clipped to its container. When
      * disabled scrollbars will be shown to handle the resulting overflow. Disabled by default.
      */
    var clipViewport: Boolean = js.native
    
    /**
      * Send clipboard data to the remote server.
      *
      * @param text A `string` specifying the clipboard data to send.
      */
    def clipboardPasteFrom(text: String): Unit = js.native
    
    /**
      * Is an `int` in range `[0-9]` controlling the desired compression level. Value `0` means no
      * compression. Level 1 uses a minimum of CPU resources and achieves weak compression ratios,
      * while level 9 offers best compression but is slow in terms of CPU consumption on the server
      * side. Use high levels with very slow network connections. Default value is `2`.
      */
    var compressionLevel: Double = js.native
    
    /**
      * Disconnect from the server.
      */
    def disconnect(): Unit = js.native
    
    /**
      * Is a `boolean` indicating if mouse events should control the relative position of a clipped
      * remote session. Only relevant if `clipViewport` is enabled. Disabled by default.
      */
    var dragViewport: Boolean = js.native
    
    /**
      * Sets the keyboard focus on the remote session. Keyboard events will be sent to the remote
      * server after this point.
      *
      * @param options A {@link FocusOptions} providing options to control how the focus will be
      * performed. Please see {@link HTMLElement.focus} for available options.
      */
    def focus(): Unit = js.native
    def focus(options: FocusOptions): Unit = js.native
    
    /**
      * Is a `boolean` indicating if keyboard focus should automatically be moved to the remote
      * session when a `mousedown` or `touchstart` event is received. Enabled by default.
      */
    var focusOnClick: Boolean = js.native
    
    /**
      * Request a clean reboot of the remote machine. The capability `power` must be set for this
      * method to have any effect.
      */
    def machineReboot(): Unit = js.native
    
    /**
      * Request a forced reset of the remote machine. The capability `power` must be set for this
      * method to have any effect.
      */
    def machineReset(): Unit = js.native
    
    /**
      * Request to shut down the remote machine. The capability `power` must be set for this method
      * to have any effect.
      */
    def machineShutdown(): Unit = js.native
    
    /**
      * Is an `int` in range `[0-9]` controlling the desired JPEG quality. Value `0` implies low
      * quality and `9` implies high quality. Default value is `6`.
      */
    var qualityLevel: Double = js.native
    
    /**
      * Is a `boolean` indicating if a request to resize the remote session should be sent whenever
      * the container changes dimensions. Disabled by default.
      */
    var resizeSession: Boolean = js.native
    
    /**
      * Is a `boolean` indicating if the remote session should be scaled locally so it fits its
      * container. When disabled it will be centered if the remote session is smaller than its
      * container, or handled according to `clipViewport` if it is larger. Disabled by default.
      */
    var scaleViewport: Boolean = js.native
    
    /**
      * Send credentials to server. Should be called after the
      * {@link NoVncEventType.credentialsrequired} event has fired.
      *
      * @param credentials An {@link NoVncCredentials} specifying the credentials to provide to the
      * server when authenticating.
      */
    def sendCredentials(credentials: NoVncCredentials): Unit = js.native
    
    /**
      * Send the key sequence *left Control*, *left Alt*, *Delete*. This is a convenience wrapper
      * around {@link sendKey}.
      */
    def sendCtrlAltDel(): Unit = js.native
    
    /**
      * Send a key event to the server.
      *
      * @param keysym A `number` specifying the NoVncClient keysym to send. Can be `0` if a valid
      * **`code`** is specified.
      * @param code A `string` specifying the physical key to send. Valid values are those that can
      * be specified to {@link KeyboardEvent.code}. If the physical key cannot be determined then
      * `null` shall be specified.
      * @param down A `boolean` specifying if a press or a release event should be sent. If omitted
      * then both a press and release event are sent.
      */
    def sendKey(keysym: Double): Unit = js.native
    def sendKey(keysym: Double, code: String): Unit = js.native
    def sendKey(keysym: Double, code: String, down: Boolean): Unit = js.native
    def sendKey(keysym: Double, code: Null, down: Boolean): Unit = js.native
    
    /**
      * Is a `boolean` indicating whether a dot cursor should be shown instead of a zero-sized or
      * fully-transparent cursor if the server sets such invisible cursor. Disabled by default.
      */
    var showDotCursor: Boolean = js.native
    
    /**
      * Is a `boolean` indicating if any events (e.g. key presses or mouse movement) should be
      * prevented from being sent to the server. Disabled by default.
      */
    var viewOnly: Boolean = js.native
  }
  
  /**
    * An `object` specifying the credentials to provide to the server when authenticating.
    */
  trait NoVncCredentials extends StObject {
    
    /** Password for the user */
    var password: String
    
    /** Target machine or session */
    var target: String
    
    /** The user that authenticates */
    var username: String
  }
  object NoVncCredentials {
    
    inline def apply(password: String, target: String, username: String): NoVncCredentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoVncCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoVncCredentials] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @novnc/novnc.@novnc/novnc/core/rfb.NoVncEvents[@novnc/novnc.@novnc/novnc/core/rfb.NoVncEventType] */
  /* Rewritten from type alias, can be one of: 
    - typings.novncNovnc.novncNovncStrings.detail
    - typings.novncNovnc.novncNovncStrings.initCustomEvent
  */
  trait NoVncEvent extends StObject
  object NoVncEvent {
    
    inline def detail: typings.novncNovnc.novncNovncStrings.detail = "detail".asInstanceOf[typings.novncNovnc.novncNovncStrings.detail]
    
    inline def initCustomEvent: typings.novncNovnc.novncNovncStrings.initCustomEvent = "initCustomEvent".asInstanceOf[typings.novncNovnc.novncNovncStrings.initCustomEvent]
  }
  
  @js.native
  trait NoVncEventTarget
    extends StObject
       with EventTarget {
    
    /* protected */ var _listeners: Map[NoVncEventType, js.Function1[/* event */ Event, Unit]] = js.native
    
    def addEventListener(`type`: String, listener: js.Function1[/* event */ CustomEvent[Any], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_bell(`type`: bell, listener: js.Function1[/* event */ CustomEvent[Record[String, scala.Nothing]], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_capabilities(`type`: capabilities, listener: js.Function1[/* event */ CustomEvent[Capabilities], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_clipboard(`type`: clipboard, listener: js.Function1[/* event */ CustomEvent[Text], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_connect(
      `type`: connect,
      listener: js.Function1[/* event */ CustomEvent[Record[String, scala.Nothing]], Unit]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_credentialsrequired(`type`: credentialsrequired, listener: js.Function1[/* event */ CustomEvent[Types], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_desktopname(`type`: desktopname, listener: js.Function1[/* event */ CustomEvent[Name], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_disconnect(`type`: disconnect, listener: js.Function1[/* event */ CustomEvent[Clean], Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_securityfailure(`type`: securityfailure, listener: js.Function1[/* event */ CustomEvent[Reason], Unit]): Unit = js.native
    
    def dispatchEvent(event: NoVncEvent): Boolean = js.native
    def dispatchEvent(event: CustomEvent[Any]): Boolean = js.native
    
    def removeEventListener(`type`: String, listener: js.Function1[/* event */ CustomEvent[Any], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_bell(`type`: bell, listener: js.Function1[/* event */ CustomEvent[Record[String, scala.Nothing]], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_capabilities(`type`: capabilities, listener: js.Function1[/* event */ CustomEvent[Capabilities], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_clipboard(`type`: clipboard, listener: js.Function1[/* event */ CustomEvent[Text], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_connect(
      `type`: connect,
      listener: js.Function1[/* event */ CustomEvent[Record[String, scala.Nothing]], Unit]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_credentialsrequired(`type`: credentialsrequired, listener: js.Function1[/* event */ CustomEvent[Types], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_desktopname(`type`: desktopname, listener: js.Function1[/* event */ CustomEvent[Name], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_disconnect(`type`: disconnect, listener: js.Function1[/* event */ CustomEvent[Clean], Unit]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_securityfailure(`type`: securityfailure, listener: js.Function1[/* event */ CustomEvent[Reason], Unit]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.novncNovnc.novncNovncStrings.connect
    - typings.novncNovnc.novncNovncStrings.disconnect
    - typings.novncNovnc.novncNovncStrings.credentialsrequired
    - typings.novncNovnc.novncNovncStrings.securityfailure
    - typings.novncNovnc.novncNovncStrings.clipboard
    - typings.novncNovnc.novncNovncStrings.bell
    - typings.novncNovnc.novncNovncStrings.desktopname
    - typings.novncNovnc.novncNovncStrings.capabilities
  */
  trait NoVncEventType extends StObject
  
  trait NoVncEvents extends StObject {
    
    /**
      * The `bell` event is fired when the server has requested an audible bell.
      */
    var bell: CustomEvent[Record[String, scala.Nothing]]
    
    /**
      * The `capabilities` event is fired whenever an entry is added or removed from `capabilities`.
      * The `detail` property is an `object` with the property `capabilities` containing the new
      * value of `capabilities`.
      */
    var capabilities: CustomEvent[Capabilities]
    
    /**
      * The `clipboard` event is fired when the server has sent clipboard data. The `detail` property
      * is an `object` containing the property `text` which is a `string` with the clipboard data.
      */
    var clipboard: CustomEvent[Text]
    
    /**
      * The `connect` event is fired after all the handshaking with the server is completed and the
      * connection is fully established. After this event the `NoVncClient` object is ready to
      * receive graphics updates and to send input.
      */
    var connect: CustomEvent[Record[String, scala.Nothing]]
    
    /**
      * The `credentialsrequired` event is fired when the server requests more credentials than were
      * specified to {@link NoVncClient}. The `detail` property is an `object` containing the
      * property `types` which is an `Array` of `string` listing the credentials that are required.
      */
    var credentialsrequired: CustomEvent[Types]
    
    /**
      * The `desktopname` event is fired when the name of the remote desktop changes. The `detail`
      * property is an `object` with the property `name` which is a `string` specifying the new name.
      */
    var desktopname: CustomEvent[Name]
    
    /**
      * The `disconnect` event is fired when the connection has been terminated. The `detail`
      * property is an `object` that contains the property `clean`. `clean` is a `boolean` indicating
      * if the termination was clean or not. In the event of an unexpected termination or an error
      * `clean` will be set to false.
      */
    var disconnect: CustomEvent[Clean]
    
    /**
      * The `securityfailure` event is fired when the handshaking process with the server fails
      * during the security negotiation step. The `detail` property is an `object` containing the
      * following properties:
      *
      * | Property | Type        | Description
      * | -------- | ----------- | -----------
      * | `status` | `number`    | The failure status code
      * | `reason` | `string`    | The **optional** reason for the failure
      *
      * The property `status` corresponds to the
      * [SecurityResult](https://github.com/rfbproto/rfbproto/blob/master/rfbproto.rst#securityresult)
      * status code in cases of failure. A status of zero will not be sent in this event since that
      * indicates a successful security handshaking process. The optional property `reason` is
      * provided by the server and thus the language of the string is not known. However most servers
      * will probably send English strings. The server can choose to not send a reason and in these
      * cases the `reason` property will be omitted.
      */
    var securityfailure: CustomEvent[Reason]
  }
  object NoVncEvents {
    
    inline def apply(
      bell: CustomEvent[Record[String, scala.Nothing]],
      capabilities: CustomEvent[Capabilities],
      clipboard: CustomEvent[Text],
      connect: CustomEvent[Record[String, scala.Nothing]],
      credentialsrequired: CustomEvent[Types],
      desktopname: CustomEvent[Name],
      disconnect: CustomEvent[Clean],
      securityfailure: CustomEvent[Reason]
    ): NoVncEvents = {
      val __obj = js.Dynamic.literal(bell = bell.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], connect = connect.asInstanceOf[js.Any], credentialsrequired = credentialsrequired.asInstanceOf[js.Any], desktopname = desktopname.asInstanceOf[js.Any], disconnect = disconnect.asInstanceOf[js.Any], securityfailure = securityfailure.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoVncEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoVncEvents] (val x: Self) extends AnyVal {
      
      inline def setBell(value: CustomEvent[Record[String, scala.Nothing]]): Self = StObject.set(x, "bell", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: CustomEvent[Capabilities]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setClipboard(value: CustomEvent[Text]): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setConnect(value: CustomEvent[Record[String, scala.Nothing]]): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setCredentialsrequired(value: CustomEvent[Types]): Self = StObject.set(x, "credentialsrequired", value.asInstanceOf[js.Any])
      
      inline def setDesktopname(value: CustomEvent[Name]): Self = StObject.set(x, "desktopname", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: CustomEvent[Clean]): Self = StObject.set(x, "disconnect", value.asInstanceOf[js.Any])
      
      inline def setSecurityfailure(value: CustomEvent[Reason]): Self = StObject.set(x, "securityfailure", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An `object` specifying extra details about how the connection should be made.
    */
  trait NoVncOptions extends StObject {
    
    /**
      * An `object` specifying the credentials to provide to the server when authenticating.
      */
    var credentials: js.UndefOr[NoVncCredentials] = js.undefined
    
    /**
      * A `string` specifying the ID to provide to any VNC repeater encountered.
      */
    var repeaterID: js.UndefOr[String] = js.undefined
    
    /**
      * A `boolean` indicating if the remote server should be shared or if any other connected
      * clients should be disconnected. Enabled by default.
      */
    var shared: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An `Array` of `string`s specifying the sub-protocols to use in the WebSocket connection.
      * Empty by default.
      */
    var wsProtocols: js.UndefOr[js.Array[String]] = js.undefined
  }
  object NoVncOptions {
    
    inline def apply(): NoVncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoVncOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoVncOptions] (val x: Self) extends AnyVal {
      
      inline def setCredentials(value: NoVncCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setRepeaterID(value: String): Self = StObject.set(x, "repeaterID", value.asInstanceOf[js.Any])
      
      inline def setRepeaterIDUndefined: Self = StObject.set(x, "repeaterID", js.undefined)
      
      inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      
      inline def setWsProtocols(value: js.Array[String]): Self = StObject.set(x, "wsProtocols", value.asInstanceOf[js.Any])
      
      inline def setWsProtocolsUndefined: Self = StObject.set(x, "wsProtocols", js.undefined)
      
      inline def setWsProtocolsVarargs(value: String*): Self = StObject.set(x, "wsProtocols", js.Array(value*))
    }
  }
}
