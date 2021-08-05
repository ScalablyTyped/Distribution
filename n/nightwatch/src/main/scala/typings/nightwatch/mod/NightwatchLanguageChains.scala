package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchLanguageChains extends StObject {
  
  var and: Expect
  
  var at: Expect
  
  var be: Expect
  
  var been: Expect
  
  var has: Expect
  
  var have: Expect
  
  var is: Expect
  
  var of: Expect
  
  var that: Expect
  
  var to: Expect
  
  var which: Expect
  
  var `with`: Expect
}
object NightwatchLanguageChains {
  
  inline def apply(
    and: Expect,
    at: Expect,
    be: Expect,
    been: Expect,
    has: Expect,
    have: Expect,
    is: Expect,
    of: Expect,
    that: Expect,
    to: Expect,
    which: Expect,
    `with`: Expect
  ): NightwatchLanguageChains = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchLanguageChains]
  }
  
  extension [Self <: NightwatchLanguageChains](x: Self) {
    
    inline def setAnd(value: Expect): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAt(value: Expect): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setBe(value: Expect): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
    
    inline def setBeen(value: Expect): Self = StObject.set(x, "been", value.asInstanceOf[js.Any])
    
    inline def setHas(value: Expect): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
    
    inline def setHave(value: Expect): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
    
    inline def setIs(value: Expect): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setOf(value: Expect): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    inline def setThat(value: Expect): Self = StObject.set(x, "that", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Expect): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setWhich(value: Expect): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    
    inline def setWith(value: Expect): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
  }
}
