package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReferencesOptions extends js.Object {
  var `match`: js.UndefOr[
    nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.FULL | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibStrings.SIMPLE
  ] = js.undefined
  var onDelete: js.UndefOr[Action] = js.undefined
  var onUpdate: js.UndefOr[Action] = js.undefined
  var references: js.UndefOr[Name] = js.undefined
  var referencesConstraintName: js.UndefOr[java.lang.String] = js.undefined
}

