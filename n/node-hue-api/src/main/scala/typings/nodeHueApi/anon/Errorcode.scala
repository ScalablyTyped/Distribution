package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.BackupStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errorcode extends StObject {
  
  var errorcode: Double
  
  var status: BackupStatus
}
object Errorcode {
  
  inline def apply(errorcode: Double, status: BackupStatus): Errorcode = {
    val __obj = js.Dynamic.literal(errorcode = errorcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcode]
  }
  
  extension [Self <: Errorcode](x: Self) {
    
    inline def setErrorcode(value: Double): Self = StObject.set(x, "errorcode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: BackupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
