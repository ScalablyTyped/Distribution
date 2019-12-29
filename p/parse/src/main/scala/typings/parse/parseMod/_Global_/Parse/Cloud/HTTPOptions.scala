package typings.parse.parseMod._Global_.Parse.Cloud

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import typings.parse.parseMod._Global_.Parse.Attributes
import typings.parse.parseMod._Global_.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPOptions extends js.Object {
  /**
    * The body of the request.
    * If it is a JSON object, then the Content-Type set in the headers must be application/x-www-form-urlencoded or application/json.
    * You can also set this to a Buffer object to send raw bytes.
    * If you use a Buffer, you should also set the Content-Type header explicitly to describe what these bytes represent.
    */
  var body: js.UndefOr[String | Buffer | Object[Attributes]] = js.undefined
  var error: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.undefined
  /**
    * Defaults to 'false'.
    */
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  /**
    * The headers for the request.
    */
  var headers: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
  /**
    * The method of the request (i.e GET, POST, etc).
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The query portion of the url.
    */
  var params: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.undefined
  /**
    * The url to send the request to.
    */
  var url: String
}

/**
  * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
  *
  *     import Buffer = require("buffer").Buffer;
  */
@JSGlobal("Parse.Cloud.HTTPOptions")
@js.native
object HTTPOptions extends TopLevel[Instantiable0[HTTPOptions]]

