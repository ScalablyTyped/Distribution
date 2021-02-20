package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which may be specified when getting an instance of the Advanced Queue class.
  */
@js.native
trait GetAdvancedQueueOptions extends StObject {
  
  /**
    * Name of an Oracle Database object type, or a DbObject Class earlier acquired from connection.getDbObjectClass().
    * If the name of an object type is used, it is recommended that a fully qualified name be used.
    */
  var payloadType: js.UndefOr[String] = js.native
}
object GetAdvancedQueueOptions {
  
  @scala.inline
  def apply(): GetAdvancedQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAdvancedQueueOptions]
  }
  
  @scala.inline
  implicit class GetAdvancedQueueOptionsMutableBuilder[Self <: GetAdvancedQueueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayloadType(value: String): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadTypeUndefined: Self = StObject.set(x, "payloadType", js.undefined)
  }
}
