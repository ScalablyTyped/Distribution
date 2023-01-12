package typings.pkcs11js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure that describes the version
  */
trait Version extends StObject {
  
  /**
    * Major version number (the integer portion of the version)
    */
  var major: Double
  
  /**
    * minor version number (the hundredths portion of the version)
    */
  var minor: Double
}
object Version {
  
  inline def apply(major: Double, minor: Double): Version = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
  }
}
