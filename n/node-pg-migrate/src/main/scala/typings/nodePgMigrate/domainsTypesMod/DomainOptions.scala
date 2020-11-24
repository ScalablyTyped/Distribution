package typings.nodePgMigrate.domainsTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainOptions extends js.Object {
  
  var check: js.UndefOr[String] = js.native
  
  var constraintName: js.UndefOr[String] = js.native
  
  var default: js.UndefOr[Value] = js.native
  
  var notNull: js.UndefOr[Boolean] = js.native
}
object DomainOptions {
  
  @scala.inline
  def apply(): DomainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainOptions]
  }
  
  @scala.inline
  implicit class DomainOptionsOps[Self <: DomainOptions] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: String): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setConstraintName(value: String): Self = this.set("constraintName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraintName: Self = this.set("constraintName", js.undefined)
    
    @scala.inline
    def setDefaultVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
    ): Self = this.set("default", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: Value): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    
    @scala.inline
    def setNotNull(value: Boolean): Self = this.set("notNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotNull: Self = this.set("notNull", js.undefined)
  }
}
