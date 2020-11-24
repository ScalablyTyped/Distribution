package typings.poi.mod.Config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assets extends js.Object {
  
  var inlineImageMaxSize: js.UndefOr[Double] = js.native
}
object Assets {
  
  @scala.inline
  def apply(): Assets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assets]
  }
  
  @scala.inline
  implicit class AssetsOps[Self <: Assets] (val x: Self) extends AnyVal {
    
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
    def setInlineImageMaxSize(value: Double): Self = this.set("inlineImageMaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineImageMaxSize: Self = this.set("inlineImageMaxSize", js.undefined)
  }
}
