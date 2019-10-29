package typings.odata

import typings.odata.distTypesOHandlerMod.OHandler
import typings.odata.distTypesOdataConfigMod.OdataBatchConfig
import typings.std.Response
import typings.std.URL
import typings.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Batch extends js.Object {
  /**
    * Batch configuration (experimental)
    */
  var batch: js.UndefOr[OdataBatchConfig] = js.native
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
    * An default query
    */
  var query: js.UndefOr[URLSearchParams] = js.native
  /**
    * The URL to request data from
    */
  var rootUrl: URL = js.native
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
}

