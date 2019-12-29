package typings.plottable.plottableMod.Utils

import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Utils.Translator")
@js.native
class Translator protected ()
  extends typings.plottable.buildSrcUtilsMod.Translator {
  def this(_rootElement: HTMLElement) = this()
}

/* static members */
@JSImport("plottable", "Utils.Translator")
@js.native
object Translator extends js.Object {
  /**
    * Is the event's target part of the given component's DOM tree?
    */
  def isEventInside(component: Component, e: Event): Boolean = js.native
}

