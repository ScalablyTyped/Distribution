package typings
package atNodelibFsDotWalkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outReadersAsyncMod {
  type EndEventCallback = js.Function0[scala.Unit]
  type EntryEventCallback = js.Function1[/* entry */ atNodelibFsDotWalkLib.outTypesMod.Entry, scala.Unit]
  type ErrorEventCallback = js.Function1[/* error */ atNodelibFsDotWalkLib.outTypesMod.Errno, scala.Unit]
}
