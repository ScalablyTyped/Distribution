package typings
package nextDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_On extends js.Object {
  var off: js.Function2[
    /* eventName */ nextDashServerLib.routerMod.EventName, 
    /* handler */ js.Function1[/* url */ java.lang.String, _], 
    scala.Unit
  ]
  var on: js.Function2[
    /* eventName */ nextDashServerLib.routerMod.EventName, 
    /* handler */ nextDashServerLib.routerMod.EventHandler | nextDashServerLib.routerMod.ErrorEventHandler, 
    scala.Unit
  ]
}

