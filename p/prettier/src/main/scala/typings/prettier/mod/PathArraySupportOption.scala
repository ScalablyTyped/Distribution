package typings.prettier.mod

import typings.prettier.anon.`0`
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathArraySupportOption
  extends StObject
     with BaseSupportOption[path]
     with _SupportOption {
  
  var default: js.UndefOr[js.Array[`0`]] = js.undefined
  
  var array: `true`
}
object PathArraySupportOption {
  
  inline def apply(category: String, since: String): PathArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path")
    __obj.asInstanceOf[PathArraySupportOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathArraySupportOption] (val x: Self) extends AnyVal {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: js.Array[`0`]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: `0`*): Self = StObject.set(x, "default", js.Array(value*))
  }
}
