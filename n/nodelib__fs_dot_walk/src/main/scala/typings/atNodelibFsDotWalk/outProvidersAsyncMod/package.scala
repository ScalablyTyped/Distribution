package typings.atNodelibFsDotWalk

import typings.atNodelibFsDotWalk.outTypesMod.Entry
import typings.atNodelibFsDotWalk.outTypesMod.Errno
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersAsyncMod {
  type AsyncCallback = js.Function2[/* err */ Errno, /* entries */ js.Array[Entry], Unit]
}
