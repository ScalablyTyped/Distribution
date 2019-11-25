package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typings.nodeDashPgDashMigrate.Anon_ALWAYS
import typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterColumnOptions extends js.Object {
  var allowNull: js.UndefOr[Boolean] = js.undefined
  var collation: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String | Null] = js.undefined
  var default: js.UndefOr[Value] = js.undefined
  var generated: js.UndefOr[Null | `false` | (Anon_ALWAYS with SequenceOptions)] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var using: js.UndefOr[String] = js.undefined
}

object AlterColumnOptions {
  @scala.inline
  def apply(
    allowNull: js.UndefOr[Boolean] = js.undefined,
    collation: String = null,
    comment: String = null,
    default: Value = null,
    generated: `false` | (Anon_ALWAYS with SequenceOptions) = null,
    notNull: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    using: String = null
  ): AlterColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (generated != null) __obj.updateDynamic("generated")(generated.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (using != null) __obj.updateDynamic("using")(using.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterColumnOptions]
  }
}

