package typings.phantom.mod

import org.scalablytyped.runtime.StringDictionary
import typings.phantom.phantomStrings.DELETE
import typings.phantom.phantomStrings.GET
import typings.phantom.phantomStrings.HEAD
import typings.phantom.phantomStrings.POST
import typings.phantom.phantomStrings.PUT
import typings.phantom.phantomStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenWebPageSettings extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[utf8 | String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var operation: js.UndefOr[GET | POST | HEAD | DELETE | PUT | String] = js.undefined
}

object IOpenWebPageSettings {
  @scala.inline
  def apply(
    data: String = null,
    encoding: utf8 | String = null,
    headers: StringDictionary[String] = null,
    operation: GET | POST | HEAD | DELETE | PUT | String = null
  ): IOpenWebPageSettings = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpenWebPageSettings]
  }
}

