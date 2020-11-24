package typings.objectMerge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectMergeOptions extends js.Object {
  
  var depth: Double | Boolean = js.native
  
  var throwOnCircularRef: Boolean = js.native
}
object ObjectMergeOptions {
  
  @scala.inline
  def apply(depth: Double | Boolean, throwOnCircularRef: Boolean): ObjectMergeOptions = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], throwOnCircularRef = throwOnCircularRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMergeOptions]
  }
  
  @scala.inline
  implicit class ObjectMergeOptionsOps[Self <: ObjectMergeOptions] (val x: Self) extends AnyVal {
    
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
    def setDepth(value: Double | Boolean): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowOnCircularRef(value: Boolean): Self = this.set("throwOnCircularRef", value.asInstanceOf[js.Any])
  }
}
