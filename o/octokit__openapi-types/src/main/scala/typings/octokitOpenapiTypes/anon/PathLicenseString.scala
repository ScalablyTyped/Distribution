package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathLicenseString extends StObject {
  
  var path: LicenseString
}
object PathLicenseString {
  
  inline def apply(path: LicenseString): PathLicenseString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathLicenseString]
  }
  
  extension [Self <: PathLicenseString](x: Self) {
    
    inline def setPath(value: LicenseString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
