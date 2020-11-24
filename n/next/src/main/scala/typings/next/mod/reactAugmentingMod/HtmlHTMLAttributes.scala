package typings.next.mod.reactAugmentingMod

import typings.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// <html amp=""> support
@js.native
trait HtmlHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var amp: js.UndefOr[String] = js.native
}
object HtmlHTMLAttributes {
  
  @scala.inline
  def apply[T](): HtmlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class HtmlHTMLAttributesOps[Self <: HtmlHTMLAttributes[_], T] (val x: Self with HtmlHTMLAttributes[T]) extends AnyVal {
    
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
    def setAmp(value: String): Self = this.set("amp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmp: Self = this.set("amp", js.undefined)
  }
}
