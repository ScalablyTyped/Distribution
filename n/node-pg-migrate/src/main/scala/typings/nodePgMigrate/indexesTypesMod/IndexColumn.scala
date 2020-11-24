package typings.nodePgMigrate.indexesTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateStrings.ASC
import typings.nodePgMigrate.nodePgMigrateStrings.DESC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexColumn extends js.Object {
  
  var name: String = js.native
  
  var opclass: js.UndefOr[Name] = js.native
  
  var sort: js.UndefOr[ASC | DESC] = js.native
}
object IndexColumn {
  
  @scala.inline
  def apply(name: String): IndexColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexColumn]
  }
  
  @scala.inline
  implicit class IndexColumnOps[Self <: IndexColumn] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpclass(value: Name): Self = this.set("opclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpclass: Self = this.set("opclass", js.undefined)
    
    @scala.inline
    def setSort(value: ASC | DESC): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
