package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlServerDatabaseDetails extends js.Object {
  
  /** The version of SQL Server with which the database is to be made compatible */
  var compatibilityLevel: js.UndefOr[Double] = js.native
  
  /** The recovery model of a SQL Server database */
  var recoveryModel: js.UndefOr[String] = js.native
}
object SqlServerDatabaseDetails {
  
  @scala.inline
  def apply(): SqlServerDatabaseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlServerDatabaseDetails]
  }
  
  @scala.inline
  implicit class SqlServerDatabaseDetailsOps[Self <: SqlServerDatabaseDetails] (val x: Self) extends AnyVal {
    
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
    def setCompatibilityLevel(value: Double): Self = this.set("compatibilityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibilityLevel: Self = this.set("compatibilityLevel", js.undefined)
    
    @scala.inline
    def setRecoveryModel(value: String): Self = this.set("recoveryModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoveryModel: Self = this.set("recoveryModel", js.undefined)
  }
}
