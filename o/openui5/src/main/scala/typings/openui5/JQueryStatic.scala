package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var sap: JquerySap = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(sap: JquerySap): JQueryStatic = {
    val __obj = js.Dynamic.literal(sap = sap.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSap(value: JquerySap): Self = StObject.set(x, "sap", value.asInstanceOf[js.Any])
  }
}
