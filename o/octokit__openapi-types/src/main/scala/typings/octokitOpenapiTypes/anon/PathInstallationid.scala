package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathInstallationid extends StObject {
  
  var path: Installationid
}
object PathInstallationid {
  
  inline def apply(path: Installationid): PathInstallationid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathInstallationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathInstallationid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Installationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
