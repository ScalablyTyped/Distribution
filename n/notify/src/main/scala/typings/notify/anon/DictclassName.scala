package typings.notify.anon

import org.scalablytyped.runtime.StringDictionary
import typings.notify.Notify.ClassCSS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictclassName extends /* className */ StringDictionary[ClassCSS] {
  
  var base: js.UndefOr[ClassCSS] = js.native
}
object DictclassName {
  
  @scala.inline
  def apply(): DictclassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictclassName]
  }
  
  @scala.inline
  implicit class DictclassNameOps[Self <: DictclassName] (val x: Self) extends AnyVal {
    
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
    def setBase(value: ClassCSS): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
  }
}
