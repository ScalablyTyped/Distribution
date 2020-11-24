package typings.nodePgMigrate.policiesTypesMod

import typings.nodePgMigrate.nodePgMigrateStrings.ALL
import typings.nodePgMigrate.nodePgMigrateStrings.DELETE
import typings.nodePgMigrate.nodePgMigrateStrings.INSERT
import typings.nodePgMigrate.nodePgMigrateStrings.SELECT
import typings.nodePgMigrate.nodePgMigrateStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePolicyOptionsEn extends js.Object {
  
  var command: js.UndefOr[ALL | SELECT | INSERT | UPDATE | DELETE] = js.native
}
object CreatePolicyOptionsEn {
  
  @scala.inline
  def apply(): CreatePolicyOptionsEn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyOptionsEn]
  }
  
  @scala.inline
  implicit class CreatePolicyOptionsEnOps[Self <: CreatePolicyOptionsEn] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: ALL | SELECT | INSERT | UPDATE | DELETE): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
  }
}
