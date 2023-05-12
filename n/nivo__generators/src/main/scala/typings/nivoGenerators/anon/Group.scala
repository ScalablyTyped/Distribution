package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var group: String
  
  var mu: Double
  
  var n: Double
  
  var sd: Double
  
  var subgroup: js.UndefOr[String] = js.undefined
  
  var value: Double
}
object Group {
  
  inline def apply(group: String, mu: Double, n: Double, sd: Double, value: Double): Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], mu = mu.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setMu(value: Double): Self = StObject.set(x, "mu", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setSd(value: Double): Self = StObject.set(x, "sd", value.asInstanceOf[js.Any])
    
    inline def setSubgroup(value: String): Self = StObject.set(x, "subgroup", value.asInstanceOf[js.Any])
    
    inline def setSubgroupUndefined: Self = StObject.set(x, "subgroup", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
