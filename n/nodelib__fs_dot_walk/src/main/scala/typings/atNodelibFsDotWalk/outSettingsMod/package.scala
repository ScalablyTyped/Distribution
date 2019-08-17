package typings.atNodelibFsDotWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outSettingsMod {
  import typings.atNodelibFsDotWalk.outTypesMod.Entry
  import typings.atNodelibFsDotWalk.outTypesMod.Errno

  type DeepFilterFunction = FilterFunction[Entry]
  type EntryFilterFunction = FilterFunction[Entry]
  type ErrorFilterFunction = FilterFunction[Errno]
  type FilterFunction[T] = js.Function1[/* value */ T, Boolean]
}
