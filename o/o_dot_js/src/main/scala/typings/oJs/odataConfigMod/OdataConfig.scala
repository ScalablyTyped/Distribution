package typings.oJs.odataConfigMod

import typings.oJs.ohandlerMod.OHandler
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.Response
import typings.std.URL
import typings.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.RequestInit & {  rootUrl :std.URL,   query :std.URLSearchParams | undefined,   fragment :string,   batch :o.js.o.js/dist/types/OdataConfig.OdataBatchConfig | undefined,   disablePolyfill :boolean, onStart (oHandler : o.js.o.js/dist/types/OHandler.OHandler): void, onFinish (oHandler : o.js.o.js/dist/types/OHandler.OHandler, res : std.Response | undefined): void, onError (oHandler : o.js.o.js/dist/types/OHandler.OHandler, res : std.Response): void} */
@js.native
trait OdataConfig extends js.Object {
  
  /**
    * Batch configuration (experimental)
    */
  var batch: js.UndefOr[OdataBatchConfig] = js.native
  
  /**
    * A BodyInit object or null to set request's body.
    */
  var body: js.UndefOr[BodyInit | Null] = js.native
  
  /**
    * A string indicating how the request will interact with the browser's cache to set request's cache.
    */
  var cache: js.UndefOr[RequestCache] = js.native
  
  /**
    * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
    */
  var credentials: js.UndefOr[RequestCredentials] = js.native
  
  /**
    * Set to true to disable auto polyfilling
    */
  var disablePolyfill: Boolean = js.native
  
  /**
    * The fragment to parse data from
    * Default is: value
    */
  var fragment: String = js.native
  
  /**
    * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
    */
  var headers: js.UndefOr[HeadersInit] = js.native
  
  /**
    * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
    */
  var integrity: js.UndefOr[String] = js.native
  
  /**
    * A boolean to set request's keepalive.
    */
  var keepalive: js.UndefOr[Boolean] = js.native
  
  /**
    * A string to set request's method.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
    */
  var mode: js.UndefOr[RequestMode] = js.native
  
  /**
    * A function which is called when a request has a error
    */
  def onError(oHandler: OHandler, res: Response): Unit = js.native
  
  /**
    * A function which is called when a request has finished
    */
  def onFinish(oHandler: OHandler): Unit = js.native
  def onFinish(oHandler: OHandler, res: Response): Unit = js.native
  
  /**
    * A function which is called on each start of a request
    */
  def onStart(oHandler: OHandler): Unit = js.native
  
  /**
    * An default query
    */
  var query: js.UndefOr[URLSearchParams] = js.native
  
  /**
    * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
    */
  var redirect: js.UndefOr[RequestRedirect] = js.native
  
  /**
    * A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer.
    */
  var referrer: js.UndefOr[String] = js.native
  
  /**
    * A referrer policy to set request's referrerPolicy.
    */
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
  
  /**
    * The URL to request data from
    */
  var rootUrl: URL = js.native
  
  /**
    * An AbortSignal to set request's signal.
    */
  var signal: js.UndefOr[AbortSignal | Null] = js.native
  
  /**
    * Can only be null. Used to disassociate request from any Window.
    */
  var window: js.UndefOr[js.Any] = js.native
}
