package typings.atNodelibFsDotStat

import typings.atNodelibFsDotStat.outTypesMod.ErrnoException
import typings.atNodelibFsDotStat.outTypesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersAsyncMod {
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit]
}
