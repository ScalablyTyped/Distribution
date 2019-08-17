package typings.atNodelibFsDotStat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersAsyncMod {
  import typings.atNodelibFsDotStat.outTypesMod.ErrnoException
  import typings.atNodelibFsDotStat.outTypesMod.Stats

  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit]
}
