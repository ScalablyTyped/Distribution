package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autotriggerchecks extends StObject {
  
  var auto_trigger_checks: js.Array[Appid]
}
object Autotriggerchecks {
  
  inline def apply(auto_trigger_checks: js.Array[Appid]): Autotriggerchecks = {
    val __obj = js.Dynamic.literal(auto_trigger_checks = auto_trigger_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autotriggerchecks]
  }
  
  extension [Self <: Autotriggerchecks](x: Self) {
    
    inline def setAuto_trigger_checks(value: js.Array[Appid]): Self = StObject.set(x, "auto_trigger_checks", value.asInstanceOf[js.Any])
    
    inline def setAuto_trigger_checksVarargs(value: Appid*): Self = StObject.set(x, "auto_trigger_checks", js.Array(value :_*))
  }
}
