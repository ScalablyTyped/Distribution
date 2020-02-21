package typings.node.eventsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This symbol shall be used to install a listener for only monitoring `'error'`
  * events. Listeners installed using this symbol are called before the regular
  * `'error'` listeners are called.
  *
  * Installing a listener using this symbol does not change the behavior once an
  * `'error'` event is emitted, therefore the process will still crash if no
  * regular `'error'` listener is installed.
  */
@JSImport("events", "errorMonitor")
@js.native
object errorMonitor
  extends TopLevel[js.Symbol]

