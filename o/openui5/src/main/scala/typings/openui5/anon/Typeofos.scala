package typings.openui5.anon

import typings.openui5.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofos extends StObject {
  
  val OS: TypeofOS_
  
  val android: Boolean
  
  val ios: Boolean
  
  val linux: Boolean
  
  val macintosh: Boolean
  
  val name: String
  
  val version: float
  
  val versionStr: String
  
  val windows: Boolean
}
object Typeofos {
  
  inline def apply(
    OS: TypeofOS_,
    android: Boolean,
    ios: Boolean,
    linux: Boolean,
    macintosh: Boolean,
    name: String,
    version: float,
    versionStr: String,
    windows: Boolean
  ): Typeofos = {
    val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any], macintosh = macintosh.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionStr = versionStr.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofos] (val x: Self) extends AnyVal {
    
    inline def setAndroid(value: Boolean): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setIos(value: Boolean): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setLinux(value: Boolean): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    
    inline def setMacintosh(value: Boolean): Self = StObject.set(x, "macintosh", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOS(value: TypeofOS_): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: float): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionStr(value: String): Self = StObject.set(x, "versionStr", value.asInstanceOf[js.Any])
    
    inline def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
  }
}
