package typings.atNodelibFsDotWalk

import typings.atNodelibFsDotWalk.outTypesMod.Entry
import typings.atNodelibFsDotWalk.outTypesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outReadersAsyncMod {
  type EndEventCallback = js.Function0[Unit]
  type EntryEventCallback = js.Function1[/* entry */ Entry, Unit]
  type ErrorEventCallback = js.Function1[/* error */ Errno, Unit]
}
