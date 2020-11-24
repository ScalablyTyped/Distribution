package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which may be specified when getting an instance of the Advanced Queue class.
  */
@js.native
trait GetAdvancedQueueOptions extends js.Object {
  
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
  implicit class GetAdvancedQueueOptionsOps[Self <: GetAdvancedQueueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPayloadType(value: String): Self = this.set("payloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadType: Self = this.set("payloadType", js.undefined)
  }
}
