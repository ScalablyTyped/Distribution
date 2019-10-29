package typings.mdnDashBrowserDashCompatDashData.typesMod

import typings.mdnDashBrowserDashCompatDashData.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSupportStatement extends js.Object {
  /**
    * In some cases features are named entirely differently and not just prefixed,
    * or the prefix is an official non-vendor prefix.
    *
    * (eg. the official `grid-` prefixed aliases for the CSS `*-gap` properties).
    */
  var alternative_name: js.UndefOr[String] = js.undefined
  /**
    * An optional array of objects indicating what kind of flags must be set for this feature to work.
    * Usually this array will have one item, but there are cases where two or more flags can be required to activate a feature.
    */
  var flags: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  /**
    * An `array` of zero or more strings containing
    * additional information. If there is only one entry in the array,
    * the array must be omitted.
    *
    * The `<code>` and `<a>` HTML elements can be used.
    */
  var notes: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * A `boolean` value indicating whether or not the implementation of the sub-feature follows
    * the current specification closely enough to not create major interoperability problems.
    *
    * It defaults to `false` (no interoperability problem expected).
    *
    * If set to `true`, it is recommended to add a note indicating how it diverges from
    * the standard (implements an old version of the standard, for example).
    */
  var partial_implementation: js.UndefOr[Boolean] = js.undefined
  /**
    * A prefix to add to the sub-feature name (defaults to empty string).
    *
    * Only non-standard vendor prefixes are permitted.
    *
    * Note that leading and trailing `-` must be included.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /** The version indicating when a sub-feature has been added (and is therefore supported).
    *
    * The `boolean` values indicate that a sub-feature is supported
    * (`true`, with the additional meaning that it is unknown in which version support was added)
    * or not supported (`false`).
    *
    * A value of `null` indicates that support information is entirely unknown.
    */
  var version_added: VersionValue
  /**
    * Contains a string with the version number the sub-feature was
    * removed in. It may also be a `boolean` value of (`true` or `false`),
    * or the `null` value.
    *
    * Default values:
    * - If `version_added` is set to `true`, `false`, or a string,
    *   `version_removed` defaults to `false`.
    * - if `version_added` is set to `null`, the default value
    *   of `version_removed` is also `null`.
    */
  var version_removed: js.UndefOr[VersionValue] = js.undefined
}

object SimpleSupportStatement {
  @scala.inline
  def apply(
    alternative_name: String = null,
    flags: js.Array[Anon_Name] = null,
    notes: String | js.Array[String] = null,
    partial_implementation: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    version_added: VersionValue = null,
    version_removed: VersionValue = null
  ): SimpleSupportStatement = {
    val __obj = js.Dynamic.literal()
    if (alternative_name != null) __obj.updateDynamic("alternative_name")(alternative_name)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(partial_implementation)) __obj.updateDynamic("partial_implementation")(partial_implementation)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (version_added != null) __obj.updateDynamic("version_added")(version_added.asInstanceOf[js.Any])
    if (version_removed != null) __obj.updateDynamic("version_removed")(version_removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleSupportStatement]
  }
}

