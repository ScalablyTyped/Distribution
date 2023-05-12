package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reruninfo extends StObject {
  
  var rerun_info: js.UndefOr[Jobids] = js.undefined
}
object Reruninfo {
  
  inline def apply(): Reruninfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reruninfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reruninfo] (val x: Self) extends AnyVal {
    
    inline def setRerun_info(value: Jobids): Self = StObject.set(x, "rerun_info", value.asInstanceOf[js.Any])
    
    inline def setRerun_infoUndefined: Self = StObject.set(x, "rerun_info", js.undefined)
  }
}
