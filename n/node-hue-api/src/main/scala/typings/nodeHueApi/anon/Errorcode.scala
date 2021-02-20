package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.BackupStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errorcode extends StObject {
  
  var errorcode: Double = js.native
  
  var status: BackupStatus = js.native
}
object Errorcode {
  
  @scala.inline
  def apply(errorcode: Double, status: BackupStatus): Errorcode = {
    val __obj = js.Dynamic.literal(errorcode = errorcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorcode]
  }
  
  @scala.inline
  implicit class ErrorcodeMutableBuilder[Self <: Errorcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorcode(value: Double): Self = StObject.set(x, "errorcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: BackupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
