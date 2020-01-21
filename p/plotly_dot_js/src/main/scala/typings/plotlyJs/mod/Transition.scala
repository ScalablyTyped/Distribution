package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.`back-in-out`
import typings.plotlyJs.plotlyJsStrings.`back-in`
import typings.plotlyJs.plotlyJsStrings.`back-out`
import typings.plotlyJs.plotlyJsStrings.`bounce-in-out`
import typings.plotlyJs.plotlyJsStrings.`bounce-in`
import typings.plotlyJs.plotlyJsStrings.`bounce-out`
import typings.plotlyJs.plotlyJsStrings.`circle-in-out`
import typings.plotlyJs.plotlyJsStrings.`circle-in`
import typings.plotlyJs.plotlyJsStrings.`circle-out`
import typings.plotlyJs.plotlyJsStrings.`cubic-in-out`
import typings.plotlyJs.plotlyJsStrings.`cubic-in`
import typings.plotlyJs.plotlyJsStrings.`cubic-out`
import typings.plotlyJs.plotlyJsStrings.`elastic-in-out`
import typings.plotlyJs.plotlyJsStrings.`elastic-in`
import typings.plotlyJs.plotlyJsStrings.`elastic-out`
import typings.plotlyJs.plotlyJsStrings.`exp-in-out`
import typings.plotlyJs.plotlyJsStrings.`exp-in`
import typings.plotlyJs.plotlyJsStrings.`exp-out`
import typings.plotlyJs.plotlyJsStrings.`linear-in-out`
import typings.plotlyJs.plotlyJsStrings.`linear-in`
import typings.plotlyJs.plotlyJsStrings.`linear-out`
import typings.plotlyJs.plotlyJsStrings.`quad-in-out`
import typings.plotlyJs.plotlyJsStrings.`quad-in`
import typings.plotlyJs.plotlyJsStrings.`quad-out`
import typings.plotlyJs.plotlyJsStrings.`sin-in-out`
import typings.plotlyJs.plotlyJsStrings.`sin-in`
import typings.plotlyJs.plotlyJsStrings.`sin-out`
import typings.plotlyJs.plotlyJsStrings.back
import typings.plotlyJs.plotlyJsStrings.bounce
import typings.plotlyJs.plotlyJsStrings.circle
import typings.plotlyJs.plotlyJsStrings.cubic
import typings.plotlyJs.plotlyJsStrings.elastic
import typings.plotlyJs.plotlyJsStrings.exp
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.quad
import typings.plotlyJs.plotlyJsStrings.sin
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
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transition]
  }
}

