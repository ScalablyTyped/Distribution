package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeArrayIndex extends js.Object {
  
  var includeArrayIndex: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  var preserveNullAndEmptyArrays: js.UndefOr[Boolean] = js.native
}
object IncludeArrayIndex {
  
  @scala.inline
  def apply(path: String): IncludeArrayIndex = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeArrayIndex]
  }
  
  @scala.inline
  implicit class IncludeArrayIndexOps[Self <: IncludeArrayIndex] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeArrayIndex(value: String): Self = this.set("includeArrayIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeArrayIndex: Self = this.set("includeArrayIndex", js.undefined)
    
    @scala.inline
    def setPreserveNullAndEmptyArrays(value: Boolean): Self = this.set("preserveNullAndEmptyArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveNullAndEmptyArrays: Self = this.set("preserveNullAndEmptyArrays", js.undefined)
  }
}
