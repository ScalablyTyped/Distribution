package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String | nodeLib.Buffer | stdLib.Uint8Array
  var elapsedTime: scala.Double
  var headers: js.UndefOr[js.Array[postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition]] = js.undefined
  var statusCode: scala.Double
  var statusMessage: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: java.lang.String | nodeLib.Buffer | stdLib.Uint8Array,
    elapsedTime: scala.Double,
    statusCode: scala.Double,
    headers: js.Array[postmanDashCollectionLib.postmanDashCollectionMod.HeaderDefinition] = null,
    statusMessage: java.lang.String = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.updateDynamic("elapsedTime")(elapsedTime)
    __obj.updateDynamic("statusCode")(statusCode)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[Anon_Body]
  }
}

