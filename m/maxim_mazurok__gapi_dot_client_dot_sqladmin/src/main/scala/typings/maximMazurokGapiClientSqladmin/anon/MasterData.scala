package typings.maximMazurokGapiClientSqladmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterData extends js.Object {
  
  /**
    * Option to include SQL statement required to set up replication. If set to *1*, the dump file includes a CHANGE MASTER TO statement with the binary log coordinates, and
    * --set-gtid-purged is set to ON. If set to *2*, the CHANGE MASTER TO statement is written as a SQL comment and has no effect. If set to any value other than *1*,
    * --set-gtid-purged is set to OFF.
    */
  var masterData: js.UndefOr[Double] = js.native
}
object MasterData {
  
  @scala.inline
  def apply(): MasterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterData]
  }
  
  @scala.inline
  implicit class MasterDataOps[Self <: MasterData] (val x: Self) extends AnyVal {
    
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
    def setMasterData(value: Double): Self = this.set("masterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterData: Self = this.set("masterData", js.undefined)
  }
}
