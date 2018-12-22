package typings
package plottableLib.buildSrcUtilsTransformAwareTranslatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/transformAwareTranslator", "Translator")
@js.native
class Translator protected () extends js.Object {
  def this(_rootElement: stdLib.HTMLElement) = this()
  var _rootElement: js.Any = js.native
  /**
       * Given `document` client coordinates, computes the position relative to the
       * `Component`'s root element, taking into account the cumulative CSS3
       * transforms of the root element ancestors up to `<body>`.
       *
       * This triggers a layout but doesn't further modify the DOM, so causes a
       * maximum of one layout per frame.
       *
       * Does not support `transform-origin` CSS property other than the default.
       */
  def computePosition(clientX: scala.Double, clientY: scala.Double): js.Any = js.native
}

@JSImport("plottable/build/src/utils/transformAwareTranslator", "Translator")
@js.native
object Translator extends js.Object {
  /**
       * Is the event's target part of the given component's DOM tree?
       */
  def isEventInside(component: plottableLib.buildSrcComponentsComponentMod.Component, e: stdLib.Event): scala.Boolean = js.native
}

