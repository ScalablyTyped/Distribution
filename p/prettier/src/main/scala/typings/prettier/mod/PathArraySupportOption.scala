package typings.prettier.mod

import typings.prettier.anon.`0`
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathArraySupportOption
  extends BaseSupportOption[path]
     with _SupportOption {
  
  var array: `true` = js.native
  
  var default: js.Array[`0`] = js.native
}
object PathArraySupportOption {
  
  @scala.inline
  def apply(array: `true`, category: String, default: js.Array[`0`], since: String, `type`: path): PathArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArraySupportOption]
  }
  
  @scala.inline
  implicit class PathArraySupportOptionOps[Self <: PathArraySupportOption] (val x: Self) extends AnyVal {
    
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
    def setArray(value: `true`): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVarargs(value: `0`*): Self = this.set("default", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: js.Array[`0`]): Self = this.set("default", value.asInstanceOf[js.Any])
  }
}
