package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var aria: js.UndefOr[java.lang.String] = js.undefined
  var attrs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var classList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var contentDefault: js.UndefOr[java.lang.String] = js.undefined
  var contentFA: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[mediumDashEditorLib.Anon_Prop] = js.undefined
  var tagNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var useQueryState: js.UndefOr[scala.Boolean] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    aria: java.lang.String = null,
    attrs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    classList: js.Array[java.lang.String] = null,
    contentDefault: java.lang.String = null,
    contentFA: java.lang.String = null,
    name: java.lang.String = null,
    style: mediumDashEditorLib.Anon_Prop = null,
    tagNames: js.Array[java.lang.String] = null,
    useQueryState: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (aria != null) __obj.updateDynamic("aria")(aria)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (classList != null) __obj.updateDynamic("classList")(classList)
    if (contentDefault != null) __obj.updateDynamic("contentDefault")(contentDefault)
    if (contentFA != null) __obj.updateDynamic("contentFA")(contentFA)
    if (name != null) __obj.updateDynamic("name")(name)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tagNames != null) __obj.updateDynamic("tagNames")(tagNames)
    if (!js.isUndefined(useQueryState)) __obj.updateDynamic("useQueryState")(useQueryState)
    __obj.asInstanceOf[ButtonOptions]
  }
}

