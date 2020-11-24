package typings.plottable.utilsMod

import typings.plottable.componentMod.Component
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils", "Translator")
@js.native
class Translator protected ()
  extends typings.plottable.transformAwareTranslatorMod.Translator {
  def this(_rootElement: HTMLElement) = this()
}
/* static members */
@JSImport("plottable/build/src/utils", "Translator")
@js.native
object Translator extends js.Object {
  
  /**
    * Is the event's target part of the given component's DOM tree?
    */
  def isEventInside(component: Component, e: Event): Boolean = js.native
}
