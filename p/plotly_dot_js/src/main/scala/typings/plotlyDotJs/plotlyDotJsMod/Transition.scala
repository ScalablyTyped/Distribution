package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.`back-in-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`back-in`
import typings.plotlyDotJs.plotlyDotJsStrings.`back-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`bounce-in-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`bounce-in`
import typings.plotlyDotJs.plotlyDotJsStrings.`bounce-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`circle-in-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`circle-in`
import typings.plotlyDotJs.plotlyDotJsStrings.`circle-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`cubic-in-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`cubic-in`
import typings.plotlyDotJs.plotlyDotJsStrings.`cubic-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`elastic-in-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`elastic-in`
import typings.plotlyDotJs.plotlyDotJsStrings.`elastic-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`exp-in-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`exp-in`
import typings.plotlyDotJs.plotlyDotJsStrings.`exp-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`linear-in-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`linear-in`
import typings.plotlyDotJs.plotlyDotJsStrings.`linear-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`quad-in-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`quad-in`
import typings.plotlyDotJs.plotlyDotJsStrings.`quad-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`sin-in-out`
import typings.plotlyDotJs.plotlyDotJsStrings.`sin-in`
import typings.plotlyDotJs.plotlyDotJsStrings.`sin-out`
import typings.plotlyDotJs.plotlyDotJsStrings.back
import typings.plotlyDotJs.plotlyDotJsStrings.bounce
import typings.plotlyDotJs.plotlyDotJsStrings.circle
import typings.plotlyDotJs.plotlyDotJsStrings.cubic
import typings.plotlyDotJs.plotlyDotJsStrings.elastic
import typings.plotlyDotJs.plotlyDotJsStrings.exp
import typings.plotlyDotJs.plotlyDotJsStrings.linear
import typings.plotlyDotJs.plotlyDotJsStrings.quad
import typings.plotlyDotJs.plotlyDotJsStrings.sin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  /**
  	 * Sets the duration of the slider transition
  	 */
  var duration: Double
  /**
  	 * Sets the easing function of the slider transition
  	 */
  var easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
}

object Transition {
  @scala.inline
  def apply(
    duration: Double,
    easing: linear | quad | cubic | sin | exp | circle | elastic | back | bounce | `linear-in` | `quad-in` | `cubic-in` | `sin-in` | `exp-in` | `circle-in` | `elastic-in` | `back-in` | `bounce-in` | `linear-out` | `quad-out` | `cubic-out` | `sin-out` | `exp-out` | `circle-out` | `elastic-out` | `back-out` | `bounce-out` | `linear-in-out` | `quad-in-out` | `cubic-in-out` | `sin-in-out` | `exp-in-out` | `circle-in-out` | `elastic-in-out` | `back-in-out` | `bounce-in-out`
  ): Transition = {
    val __obj = js.Dynamic.literal(duration = duration, easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transition]
  }
}

