package typings
package atNodelibFsDotWalkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outSettingsMod {
  type DeepFilterFunction = FilterFunction[atNodelibFsDotWalkLib.outTypesMod.Entry]
  type EntryFilterFunction = FilterFunction[atNodelibFsDotWalkLib.outTypesMod.Entry]
  type ErrorFilterFunction = FilterFunction[atNodelibFsDotWalkLib.outTypesMod.Errno]
  type FilterFunction[T] = js.Function1[/* value */ T, scala.Boolean]
}
