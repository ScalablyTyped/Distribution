package typings.nodePgMigrate.indexesTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateStrings.btree
import typings.nodePgMigrate.nodePgMigrateStrings.gin
import typings.nodePgMigrate.nodePgMigrateStrings.gist
import typings.nodePgMigrate.nodePgMigrateStrings.hash
import typings.nodePgMigrate.nodePgMigrateStrings.spgist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIndexOptions extends js.Object {
  
  var concurrently: js.UndefOr[Boolean] = js.native
  
  var ifNotExists: js.UndefOr[Boolean] = js.native
  
  var include: js.UndefOr[String | js.Array[String]] = js.native
  
  var method: js.UndefOr[btree | hash | gist | spgist | gin] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * @deprecated should be parameter of IndexColumn
    */
  var opclass: js.UndefOr[Name] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
  
  var where: js.UndefOr[String] = js.native
}
object CreateIndexOptions {
  
  @scala.inline
  def apply(): CreateIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexOptions]
  }
  
  @scala.inline
  implicit class CreateIndexOptionsOps[Self <: CreateIndexOptions] (val x: Self) extends AnyVal {
    
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
    def setConcurrently(value: Boolean): Self = this.set("concurrently", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrently: Self = this.set("concurrently", js.undefined)
    
    @scala.inline
    def setIfNotExists(value: Boolean): Self = this.set("ifNotExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfNotExists: Self = this.set("ifNotExists", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: String | js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setMethod(value: btree | hash | gist | spgist | gin): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpclass(value: Name): Self = this.set("opclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpclass: Self = this.set("opclass", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
