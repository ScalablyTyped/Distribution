package typings.nightwatch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  var build: Revision
  
  var status: Arch
}
object Build {
  
  inline def apply(build: Revision, status: Arch): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  
  extension [Self <: Build](x: Self) {
    
    inline def setBuild(value: Revision): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Arch): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
