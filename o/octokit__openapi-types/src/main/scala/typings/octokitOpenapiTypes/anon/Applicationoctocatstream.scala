package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationoctocatstream extends StObject {
  
  @JSName("application/octocat-stream")
  var `applicationSlashoctocat-stream`: String
}
object Applicationoctocatstream {
  
  inline def apply(`applicationSlashoctocat-stream`: String): Applicationoctocatstream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/octocat-stream")(`applicationSlashoctocat-stream`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationoctocatstream]
  }
  
  extension [Self <: Applicationoctocatstream](x: Self) {
    
    inline def `setApplicationSlashoctocat-stream`(value: String): Self = StObject.set(x, "application/octocat-stream", value.asInstanceOf[js.Any])
  }
}
