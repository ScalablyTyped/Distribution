package typings
package mockjsLib.mockjsMod.mockjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Helper
// see https://github.com/nuysoft/Mock/wiki/Helper
trait MockjsRandomHelper extends js.Object {
  // Random.capitalize
  def capitalize(word: S): S
  // Random.lower
  def lower(str: S): S
  // Random.pick
  def pick(arr: js.Array[_]): js.Any
  // Random.shuffle
  def shuffle(arr: js.Array[_]): js.Array[_]
  // Random.upper
  def upper(str: S): S
}

object MockjsRandomHelper {
  @scala.inline
  def apply(
    capitalize: js.Function1[S, S],
    lower: js.Function1[S, S],
    pick: js.Function1[js.Array[_], js.Any],
    shuffle: js.Function1[js.Array[_], js.Array[_]],
    upper: js.Function1[S, S]
  ): MockjsRandomHelper = {
    val __obj = js.Dynamic.literal(capitalize = capitalize, lower = lower, pick = pick, shuffle = shuffle, upper = upper)
  
    __obj.asInstanceOf[MockjsRandomHelper]
  }
}

