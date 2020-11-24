package typings.nodePgMigrate.distTypesMod

import typings.pg.mod.ClientBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunnerOptionClient extends js.Object {
  
  var dbClient: ClientBase = js.native
}
object RunnerOptionClient {
  
  @scala.inline
  def apply(dbClient: ClientBase): RunnerOptionClient = {
    val __obj = js.Dynamic.literal(dbClient = dbClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionClient]
  }
  
  @scala.inline
  implicit class RunnerOptionClientOps[Self <: RunnerOptionClient] (val x: Self) extends AnyVal {
    
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
    def setDbClient(value: ClientBase): Self = this.set("dbClient", value.asInstanceOf[js.Any])
  }
}
