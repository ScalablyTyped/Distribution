package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used with pool.getConnection().
  */
@js.native
trait GetPooledConnectionOptions extends js.Object {
  
  /** Password of the specified user. */
  var password: js.UndefOr[String] = js.native
  
  /** Optionally set the connection tag. */
  var tag: js.UndefOr[String] = js.native
  
  /** Database user to retrieve the connection for. */
  var user: js.UndefOr[String] = js.native
}
object GetPooledConnectionOptions {
  
  @scala.inline
  def apply(): GetPooledConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPooledConnectionOptions]
  }
  
  @scala.inline
  implicit class GetPooledConnectionOptionsOps[Self <: GetPooledConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
