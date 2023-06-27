package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOS_ extends StObject {
  
  val ANDROID: Unit
  
  val IOS: Unit
  
  val LINUX: Unit
  
  val MACINTOSH: Unit
  
  val WINDOWS: Unit
}
object TypeofOS_ {
  
  inline def apply(ANDROID: Unit, IOS: Unit, LINUX: Unit, MACINTOSH: Unit, WINDOWS: Unit): TypeofOS_ = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], IOS = IOS.asInstanceOf[js.Any], LINUX = LINUX.asInstanceOf[js.Any], MACINTOSH = MACINTOSH.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOS_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofOS_] (val x: Self) extends AnyVal {
    
    inline def setANDROID(value: Unit): Self = StObject.set(x, "ANDROID", value.asInstanceOf[js.Any])
    
    inline def setIOS(value: Unit): Self = StObject.set(x, "IOS", value.asInstanceOf[js.Any])
    
    inline def setLINUX(value: Unit): Self = StObject.set(x, "LINUX", value.asInstanceOf[js.Any])
    
    inline def setMACINTOSH(value: Unit): Self = StObject.set(x, "MACINTOSH", value.asInstanceOf[js.Any])
    
    inline def setWINDOWS(value: Unit): Self = StObject.set(x, "WINDOWS", value.asInstanceOf[js.Any])
  }
}
