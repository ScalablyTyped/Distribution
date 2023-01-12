package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var domain: LinePartial
  
  var legend: TextPartial
  
  var ticks: Text
}
object Domain {
  
  inline def apply(domain: LinePartial, legend: TextPartial, ticks: Text): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: LinePartial): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: TextPartial): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: Text): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
