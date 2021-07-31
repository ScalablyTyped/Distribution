package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Totalms extends StObject {
  
  var total_ms: Double
}
object Totalms {
  
  @scala.inline
  def apply(total_ms: Double): Totalms = {
    val __obj = js.Dynamic.literal(total_ms = total_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Totalms]
  }
  
  @scala.inline
  implicit class TotalmsMutableBuilder[Self <: Totalms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotal_ms(value: Double): Self = StObject.set(x, "total_ms", value.asInstanceOf[js.Any])
  }
}
