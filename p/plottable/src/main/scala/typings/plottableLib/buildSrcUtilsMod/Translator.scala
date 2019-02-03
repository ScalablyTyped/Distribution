package typings
package plottableLib.buildSrcUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "Translator")
@js.native
class Translator protected ()
  extends plottableLib.buildSrcUtilsTransformAwareTranslatorMod.Translator {
  def this(_rootElement: stdLib.HTMLElement) = this()
}

/* static members */
@JSImport("plottable/build/src/utils", "Translator")
@js.native
object Translator extends js.Object {
  /**
    * Is the event's target part of the given component's DOM tree?
    */
  def isEventInside(component: plottableLib.buildSrcComponentsComponentMod.Component, e: stdLib.Event): scala.Boolean = js.native
}

