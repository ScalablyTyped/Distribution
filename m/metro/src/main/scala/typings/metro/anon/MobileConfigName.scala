package typings.metro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileConfigName extends StObject {
  
  val mobileConfigName: String
}
object MobileConfigName {
  
  inline def apply(mobileConfigName: String): MobileConfigName = {
    val __obj = js.Dynamic.literal(mobileConfigName = mobileConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileConfigName]
  }
  
  extension [Self <: MobileConfigName](x: Self) {
    
    inline def setMobileConfigName(value: String): Self = StObject.set(x, "mobileConfigName", value.asInstanceOf[js.Any])
  }
}
