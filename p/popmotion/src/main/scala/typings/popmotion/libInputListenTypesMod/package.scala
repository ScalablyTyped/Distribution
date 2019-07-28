package typings.popmotion

import typings.popmotion.libActionMod.Action
import typings.std.Document
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputListenTypesMod {
  type EventListener = js.Function3[
    /* type */ String, 
    /* listener */ js.Function, 
    /* options */ js.UndefOr[EventListenerOptions | Boolean], 
    Unit
  ]
  type ListenFactory = js.Function3[
    /* element */ Element | Document | Window, 
    /* events */ String, 
    /* options */ js.UndefOr[EventListenerOptions | Boolean], 
    Action
  ]
}
