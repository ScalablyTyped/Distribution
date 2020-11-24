package typings.miniprogram

import typings.miniprogram.anon.ApFilePaths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseImageArgs extends AsyncCallback[ApFilePaths] {
  
  var count: js.UndefOr[Double] = js.native
  
  var sizeType: js.UndefOr[js.Array[String]] = js.native
  
  var sourceType: js.UndefOr[js.Array[String]] = js.native
}
object ChooseImageArgs {
  
  @scala.inline
  def apply(): ChooseImageArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageArgs]
  }
  
  @scala.inline
  implicit class ChooseImageArgsOps[Self <: ChooseImageArgs] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setSizeTypeVarargs(value: String*): Self = this.set("sizeType", js.Array(value :_*))
    
    @scala.inline
    def setSizeType(value: js.Array[String]): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    
    @scala.inline
    def setSourceTypeVarargs(value: String*): Self = this.set("sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: js.Array[String]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
}
