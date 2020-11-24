package typings.nodePgMigrate.migrationMod

import typings.nodePgMigrate.nodePgMigrateStrings.js_
import typings.nodePgMigrate.nodePgMigrateStrings.sql
import typings.nodePgMigrate.nodePgMigrateStrings.ts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOptionsDefault extends js.Object {
  
  var ignorePattern: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[js_ | ts | sql] = js.native
}
object CreateOptionsDefault {
  
  @scala.inline
  def apply(): CreateOptionsDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptionsDefault]
  }
  
  @scala.inline
  implicit class CreateOptionsDefaultOps[Self <: CreateOptionsDefault] (val x: Self) extends AnyVal {
    
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
    def setIgnorePattern(value: String): Self = this.set("ignorePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePattern: Self = this.set("ignorePattern", js.undefined)
    
    @scala.inline
    def setLanguage(value: js_ | ts | sql): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}
