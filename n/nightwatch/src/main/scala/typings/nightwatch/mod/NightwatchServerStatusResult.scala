package typings.nightwatch.mod

import typings.nightwatch.anon.Arch
import typings.nightwatch.anon.Revision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchServerStatusResult extends StObject {
  
  var build: Revision
  
  var status: Arch
}
object NightwatchServerStatusResult {
  
  inline def apply(build: Revision, status: Arch): NightwatchServerStatusResult = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchServerStatusResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NightwatchServerStatusResult] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: Revision): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Arch): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
