package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runurl extends StObject {
  
  /** @description ID of the corresponding run. */
  var run_id: js.UndefOr[Double] = js.undefined
  
  /** @description URL of the corresponding run. */
  var run_url: js.UndefOr[String] = js.undefined
}
object Runurl {
  
  inline def apply(): Runurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Runurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Runurl] (val x: Self) extends AnyVal {
    
    inline def setRun_id(value: Double): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
    
    inline def setRun_idUndefined: Self = StObject.set(x, "run_id", js.undefined)
    
    inline def setRun_url(value: String): Self = StObject.set(x, "run_url", value.asInstanceOf[js.Any])
    
    inline def setRun_urlUndefined: Self = StObject.set(x, "run_url", js.undefined)
  }
}
