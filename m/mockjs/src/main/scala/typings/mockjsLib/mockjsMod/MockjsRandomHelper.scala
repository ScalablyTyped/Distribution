package typings
package mockjsLib.mockjsMod

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
    capitalize: S => S,
    lower: S => S,
    pick: js.Array[_] => js.Any,
    shuffle: js.Array[_] => js.Array[_],
    upper: S => S
  ): MockjsRandomHelper = {
    val __obj = js.Dynamic.literal(capitalize = js.Any.fromFunction1(capitalize), lower = js.Any.fromFunction1(lower), pick = js.Any.fromFunction1(pick), shuffle = js.Any.fromFunction1(shuffle), upper = js.Any.fromFunction1(upper))
  
    __obj.asInstanceOf[MockjsRandomHelper]
  }
}

