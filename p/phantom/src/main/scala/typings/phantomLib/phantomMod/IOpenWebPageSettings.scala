package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenWebPageSettings extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[phantomLib.phantomLibStrings.utf8 | java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var operation: js.UndefOr[
    phantomLib.phantomLibStrings.GET | phantomLib.phantomLibStrings.POST | phantomLib.phantomLibStrings.HEAD | phantomLib.phantomLibStrings.DELETE | phantomLib.phantomLibStrings.PUT | java.lang.String
  ] = js.undefined
}

object IOpenWebPageSettings {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    encoding: phantomLib.phantomLibStrings.utf8 | java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    operation: phantomLib.phantomLibStrings.GET | phantomLib.phantomLibStrings.POST | phantomLib.phantomLibStrings.HEAD | phantomLib.phantomLibStrings.DELETE | phantomLib.phantomLibStrings.PUT | java.lang.String = null
  ): IOpenWebPageSettings = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpenWebPageSettings]
  }
}

