package typings
package naverDashWhaleLib.whaleNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProperties extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var contexts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var documentUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. Since Chrome 20.  */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var onclick: js.UndefOr[js.Function] = js.undefined
  /** Optional. Note: You cannot change an item to be a child of one of its own descendants.  */
  var parentId: js.UndefOr[js.Any] = js.undefined
  var targetUrlPatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    contexts: js.Array[java.lang.String] = null,
    documentUrlPatterns: js.Array[java.lang.String] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    onclick: js.Function = null,
    parentId: js.Any = null,
    targetUrlPatterns: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (contexts != null) __obj.updateDynamic("contexts")(contexts)
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateProperties]
  }
}

