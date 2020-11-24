package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartupOptions extends js.Object {
  
  /**
    * Shuts down a running database using oracledb.SHUTDOWN_MODE_ABORT before restarting the database. The database start up may require instance recovery. The default for force is false.
    * 
    * @default false
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * The path and filename for a text file containing Oracle Database initialization parameters. If pfile is not set, then the database server-side parameter file is used.
    */
  var pfile: js.UndefOr[String] = js.native
  
  /**
    * After the database is started, access is restricted to users who have the CREATE_SESSION and RESTRICTED SESSION privileges. The default is false.
    * 
    * @default false
    */
  var restrict: js.UndefOr[Boolean] = js.native
}
object StartupOptions {
  
  @scala.inline
  def apply(): StartupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartupOptions]
  }
  
  @scala.inline
  implicit class StartupOptionsOps[Self <: StartupOptions] (val x: Self) extends AnyVal {
    
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
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setPfile(value: String): Self = this.set("pfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfile: Self = this.set("pfile", js.undefined)
    
    @scala.inline
    def setRestrict(value: Boolean): Self = this.set("restrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrict: Self = this.set("restrict", js.undefined)
  }
}
