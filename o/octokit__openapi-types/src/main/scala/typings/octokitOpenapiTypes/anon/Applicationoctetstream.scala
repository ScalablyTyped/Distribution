package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationoctetstream extends StObject {
  
  @JSName("application/octet-stream")
  var `applicationSlashoctet-stream`: String
}
object Applicationoctetstream {
  
  inline def apply(`applicationSlashoctet-stream`: String): Applicationoctetstream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/octet-stream")(`applicationSlashoctet-stream`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationoctetstream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationoctetstream] (val x: Self) extends AnyVal {
    
    inline def `setApplicationSlashoctet-stream`(value: String): Self = StObject.set(x, "application/octet-stream", value.asInstanceOf[js.Any])
  }
}
