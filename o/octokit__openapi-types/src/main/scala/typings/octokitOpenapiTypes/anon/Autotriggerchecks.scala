package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autotriggerchecks extends StObject {
  
  var auto_trigger_checks: js.UndefOr[js.Array[Setting]] = js.undefined
}
object Autotriggerchecks {
  
  inline def apply(): Autotriggerchecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autotriggerchecks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Autotriggerchecks] (val x: Self) extends AnyVal {
    
    inline def setAuto_trigger_checks(value: js.Array[Setting]): Self = StObject.set(x, "auto_trigger_checks", value.asInstanceOf[js.Any])
    
    inline def setAuto_trigger_checksUndefined: Self = StObject.set(x, "auto_trigger_checks", js.undefined)
    
    inline def setAuto_trigger_checksVarargs(value: Setting*): Self = StObject.set(x, "auto_trigger_checks", js.Array(value*))
  }
}
