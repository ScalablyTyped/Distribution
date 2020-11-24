package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.nodePgMigrateStrings.DISABLE
import typings.nodePgMigrate.nodePgMigrateStrings.ENABLE
import typings.nodePgMigrate.nodePgMigrateStrings.FORCE
import typings.nodePgMigrate.nodePgMigrateStrings.`NO FORCE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlterTableOptions extends js.Object {
  
  var levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`) = js.native
}
object AlterTableOptions {
  
  @scala.inline
  def apply(levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)): AlterTableOptions = {
    val __obj = js.Dynamic.literal(levelSecurity = levelSecurity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterTableOptions]
  }
  
  @scala.inline
  implicit class AlterTableOptionsOps[Self <: AlterTableOptions] (val x: Self) extends AnyVal {
    
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
    def setLevelSecurity(value: DISABLE | ENABLE | FORCE | (`NO FORCE`)): Self = this.set("levelSecurity", value.asInstanceOf[js.Any])
  }
}
