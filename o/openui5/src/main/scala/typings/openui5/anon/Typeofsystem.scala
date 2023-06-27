package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofsystem extends StObject {
  
  val combi: Boolean
  
  val desktop: Boolean
  
  val phone: Boolean
  
  val tablet: Boolean
}
object Typeofsystem {
  
  inline def apply(combi: Boolean, desktop: Boolean, phone: Boolean, tablet: Boolean): Typeofsystem = {
    val __obj = js.Dynamic.literal(combi = combi.asInstanceOf[js.Any], desktop = desktop.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofsystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofsystem] (val x: Self) extends AnyVal {
    
    inline def setCombi(value: Boolean): Self = StObject.set(x, "combi", value.asInstanceOf[js.Any])
    
    inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
  }
}
