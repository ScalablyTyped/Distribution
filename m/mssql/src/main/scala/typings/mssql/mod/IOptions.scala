package typings.mssql.mod

import typings.tedious.mod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends ConnectionOptions {
  
  var beforeConnect: js.UndefOr[Unit] = js.native
  
  var connectionString: js.UndefOr[String] = js.native
  
  var trustedConnection: js.UndefOr[Boolean] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setBeforeConnect(value: Unit): Self = this.set("beforeConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeConnect: Self = this.set("beforeConnect", js.undefined)
    
    @scala.inline
    def setConnectionString(value: String): Self = this.set("connectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionString: Self = this.set("connectionString", js.undefined)
    
    @scala.inline
    def setTrustedConnection(value: Boolean): Self = this.set("trustedConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustedConnection: Self = this.set("trustedConnection", js.undefined)
  }
}
