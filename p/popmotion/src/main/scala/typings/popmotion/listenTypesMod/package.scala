package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listenTypesMod {
  type EventListener = js.Function3[
    /* type */ java.lang.String, 
    /* listener */ js.Function, 
    /* options */ js.UndefOr[typings.popmotion.listenTypesMod.EventListenerOptions | scala.Boolean], 
    scala.Unit
  ]
  type ListenFactory = js.Function3[
    /* element */ typings.std.Element | typings.std.Document | typings.std.Window, 
    /* events */ java.lang.String, 
    /* options */ js.UndefOr[typings.popmotion.listenTypesMod.EventListenerOptions | scala.Boolean], 
    typings.popmotion.actionMod.Action[typings.popmotion.actionTypesMod.ColdSubscription]
  ]
}
