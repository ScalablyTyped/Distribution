package typings.mdnDashBrowserDashCompatDashData.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatStatement extends js.Object {
  /**
    * A string containing a human-readable description of the feature.
    *
    * It is intended to be used as a caption or title and should be kept short.
    *
    * The `<code>` and `<a>` HTML elements can be used.
    */
  var description: js.UndefOr[String] = js.undefined
  var matches: js.UndefOr[MatchesBlock] = js.undefined
  /**
    * URL which points to a MDN reference page documenting the feature.
    *
    * It needs to be a valid URL, and should be the language-⁠neutral URL
    * (e.g. use `https⁠://developer.mozilla.org/docs/Web/CSS/text-⁠align`
    * instead of `https⁠://developer.mozilla.org/en-⁠US/docs/Web/CSS/text-⁠align`).
    */
  var mdn_url: js.UndefOr[String] = js.undefined
  /**
    * An object containing information about the stability of the feature:
    *
    * Is it a functionality that is standard? Is it stable?
    * Has it been deprecated and shouldn't be used anymore?
    */
  var status: js.UndefOr[StatusBlock] = js.undefined
  /**
    * Each `__compat` object contains support information.
    *
    * For each browser identifier, it contains a `support_statement` object with
    * information about versions, prefixes, or alternate names, as well as notes.
    */
  var support: SupportBlock
}

object CompatStatement {
  @scala.inline
  def apply(
    support: SupportBlock,
    description: String = null,
    matches: MatchesBlock = null,
    mdn_url: String = null,
    status: StatusBlock = null
  ): CompatStatement = {
    val __obj = js.Dynamic.literal(support = support)
    if (description != null) __obj.updateDynamic("description")(description)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (mdn_url != null) __obj.updateDynamic("mdn_url")(mdn_url)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CompatStatement]
  }
}

