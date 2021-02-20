package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 设备服务列表 */
@js.native
trait BLEService extends StObject {
  
  /** 该服务是否为主服务 */
  var isPrimary: Boolean = js.native
  
  /** 蓝牙设备服务的 uuid */
  var uuid: String = js.native
}
object BLEService {
  
  @scala.inline
  def apply(isPrimary: Boolean, uuid: String): BLEService = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLEService]
  }
  
  @scala.inline
  implicit class BLEServiceMutableBuilder[Self <: BLEService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
