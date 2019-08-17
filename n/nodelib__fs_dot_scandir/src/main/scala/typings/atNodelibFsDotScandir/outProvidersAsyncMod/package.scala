package typings.atNodelibFsDotScandir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersAsyncMod {
  import typings.atNodelibFsDotScandir.outTypesMod.Entry
  import typings.node.NodeJSNs.ErrnoException

  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* entries */ js.Array[Entry], Unit]
}
