package typings.atNodelibFsDotStat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersStatMod {
  import typings.node.NodeJSNs.ErrnoException
  import typings.node.fsMod.Stats

  type AsyncCallback = js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit]
}
