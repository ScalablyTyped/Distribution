package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPOptions extends js.Object {
  /**
    * The body of the request.
    * If it is a JSON object, then the Content-Type set in the headers must be application/x-www-form-urlencoded or application/json.
    * You can also set this to a Buffer object to send raw bytes.
    * If you use a Buffer, you should also set the Content-Type header explicitly to describe what these bytes represent.
    */
  var body: js.UndefOr[String | Buffer | Object[Attributes]] = js.native
  var error: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.native
  /**
    * Defaults to 'false'.
    */
  var followRedirects: js.UndefOr[Boolean] = js.native
  /**
    * The headers for the request.
    */
  var headers: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
  /**
    * The method of the request (i.e GET, POST, etc).
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The query portion of the url.
    */
  var params: js.UndefOr[js.Any] = js.native
  var success: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.native
  /**
    * The url to send the request to.
    */
  var url: String = js.native
}

/**
  * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
  *
  *     import Buffer = require("buffer").Buffer;
  */
@JSGlobal("Parse.Cloud.HTTPOptions")
@js.native
object HTTPOptions extends TopLevel[Instantiable0[HTTPOptions]]

