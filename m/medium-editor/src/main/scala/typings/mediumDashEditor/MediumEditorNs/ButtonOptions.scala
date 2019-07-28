package typings.mediumDashEditor.MediumEditorNs

import org.scalablytyped.runtime.StringDictionary
import typings.mediumDashEditor.Anon_Prop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var aria: js.UndefOr[String] = js.undefined
  var attrs: js.UndefOr[StringDictionary[String]] = js.undefined
  var classList: js.UndefOr[js.Array[String]] = js.undefined
  var contentDefault: js.UndefOr[String] = js.undefined
  var contentFA: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[Anon_Prop] = js.undefined
  var tagNames: js.UndefOr[js.Array[String]] = js.undefined
  var useQueryState: js.UndefOr[Boolean] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    action: String = null,
    aria: String = null,
    attrs: StringDictionary[String] = null,
    classList: js.Array[String] = null,
    contentDefault: String = null,
    contentFA: String = null,
    name: String = null,
    style: Anon_Prop = null,
    tagNames: js.Array[String] = null,
    useQueryState: js.UndefOr[Boolean] = js.undefined
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

