package typings.prettier.mod

import typings.prettier.anon.`0`
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathArraySupportOption
  extends BaseSupportOption[path]
     with _SupportOption {
  
  var default: js.Array[`0`] = js.native
  
  var array: `true` = js.native
}
object PathArraySupportOption {
  
  @scala.inline
  def apply(array: `true`, category: String, default: js.Array[`0`], since: String, `type`: path): PathArraySupportOption = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArraySupportOption]
  }
  
  @scala.inline
  implicit class PathArraySupportOptionMutableBuilder[Self <: PathArraySupportOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: js.Array[`0`]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVarargs(value: `0`*): Self = StObject.set(x, "default", js.Array(value :_*))
  }
}
