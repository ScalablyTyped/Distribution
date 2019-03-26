package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLObject
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var attribute: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var wrapped: js.UndefOr[scala.Boolean] = js.undefined
}

object XMLObject {
  @scala.inline
  def apply(
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    attribute: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    namespace: java.lang.String = null,
    prefix: java.lang.String = null,
    wrapped: js.UndefOr[scala.Boolean] = js.undefined
  ): XMLObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(attribute)) __obj.updateDynamic("attribute")(attribute)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(wrapped)) __obj.updateDynamic("wrapped")(wrapped)
    __obj.asInstanceOf[XMLObject]
  }
}

