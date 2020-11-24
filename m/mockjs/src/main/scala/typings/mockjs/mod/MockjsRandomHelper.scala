package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Mockjs.Random - Helper
// see https://github.com/nuysoft/Mock/wiki/Helper
@js.native
trait MockjsRandomHelper extends js.Object {
  
  // Random.capitalize
  def capitalize(word: S): S = js.native
  
  // Random.lower
  def lower(str: S): S = js.native
  
  // Random.pick
  def pick(arr: js.Array[_]): js.Any = js.native
  
  // Random.shuffle
  def shuffle(arr: js.Array[_]): js.Array[_] = js.native
  
  // Random.upper
  def upper(str: S): S = js.native
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
  
  @scala.inline
  implicit class MockjsRandomHelperOps[Self <: MockjsRandomHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapitalize(value: S => S): Self = this.set("capitalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLower(value: S => S): Self = this.set("lower", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPick(value: js.Array[_] => js.Any): Self = this.set("pick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShuffle(value: js.Array[_] => js.Array[_]): Self = this.set("shuffle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpper(value: S => S): Self = this.set("upper", js.Any.fromFunction1(value))
  }
}
