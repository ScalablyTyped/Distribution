package typings.meteor.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matcher[T] extends js.Object {
  
  var _meteorCheckMatcherBrand: Unit = js.native
}
object Matcher {
  
  @scala.inline
  def apply[T](_meteorCheckMatcherBrand: Unit): Matcher[T] = {
    val __obj = js.Dynamic.literal(_meteorCheckMatcherBrand = _meteorCheckMatcherBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matcher[T]]
  }
  
  @scala.inline
  implicit class MatcherOps[Self <: Matcher[_], T] (val x: Self with Matcher[T]) extends AnyVal {
    
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
    def set_meteorCheckMatcherBrand(value: Unit): Self = this.set("_meteorCheckMatcherBrand", value.asInstanceOf[js.Any])
  }
}
