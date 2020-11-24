package typings.minify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxSize extends js.Object {
  
  /**
    * bigger images are not base64 in the CSS
    * @default 4096
    */
  var maxSize: js.UndefOr[Double] = js.native
}
object MaxSize {
  
  @scala.inline
  def apply(): MaxSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSize]
  }
  
  @scala.inline
  implicit class MaxSizeOps[Self <: MaxSize] (val x: Self) extends AnyVal {
    
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
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
  }
}
