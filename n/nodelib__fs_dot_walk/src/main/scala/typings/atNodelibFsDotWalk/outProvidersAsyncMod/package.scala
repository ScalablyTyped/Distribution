package typings.atNodelibFsDotWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersAsyncMod {
  import typings.atNodelibFsDotWalk.outTypesMod.Entry
  import typings.atNodelibFsDotWalk.outTypesMod.Errno

  type AsyncCallback = js.Function2[/* err */ Errno, /* entries */ js.Array[Entry], Unit]
}
