package typings
package popmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputListenTypesMod {
  type EventListener = js.Function3[
    /* type */ java.lang.String, 
    /* listener */ js.Function, 
    /* options */ js.UndefOr[EventListenerOptions | scala.Boolean], 
    scala.Unit
  ]
  type ListenFactory = js.Function3[
    /* element */ stdLib.Element | stdLib.Document | stdLib.Window, 
    /* events */ java.lang.String, 
    /* options */ js.UndefOr[EventListenerOptions | scala.Boolean], 
    popmotionLib.libActionMod.Action
  ]
}
