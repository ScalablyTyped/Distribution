package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateStrings.FULL
import typings.nodePgMigrate.nodePgMigrateStrings.SIMPLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<node-pg-migrate.node-pg-migrate/dist/operations/tablesTypes.ReferencesOptions> */
@js.native
trait ColumnDefinition extends js.Object {
  
  var check: js.UndefOr[String] = js.native
  
  var collation: js.UndefOr[String] = js.native
  
  var comment: js.UndefOr[String | Null] = js.native
  
  var default: js.UndefOr[Value] = js.native
  
  var deferrable: js.UndefOr[Boolean] = js.native
  
  var deferred: js.UndefOr[Boolean] = js.native
  
  var expressionGenerated: js.UndefOr[String] = js.native
  
  /**
    * @deprecated use sequenceGenerated
    */
  var generated: js.UndefOr[SequenceGeneratedOptions] = js.native
  
  var `match`: js.UndefOr[FULL | SIMPLE] = js.native
  
  var notNull: js.UndefOr[Boolean] = js.native
  
  var onDelete: js.UndefOr[Action] = js.native
  
  var onUpdate: js.UndefOr[Action] = js.native
  
  var primaryKey: js.UndefOr[Boolean] = js.native
  
  var references: js.UndefOr[Name] = js.native
  
  var referencesConstraintComment: js.UndefOr[String] = js.native
  
  var referencesConstraintName: js.UndefOr[String] = js.native
  
  var sequenceGenerated: js.UndefOr[SequenceGeneratedOptions] = js.native
  
  var `type`: String = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object ColumnDefinition {
  
  @scala.inline
  def apply(`type`: String): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
  
  @scala.inline
  implicit class ColumnDefinitionOps[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck(value: String): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setCollation(value: String): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCommentNull: Self = this.set("comment", null)
    
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
    def setDeferrable(value: Boolean): Self = this.set("deferrable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferrable: Self = this.set("deferrable", js.undefined)
    
    @scala.inline
    def setDeferred(value: Boolean): Self = this.set("deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    
    @scala.inline
    def setExpressionGenerated(value: String): Self = this.set("expressionGenerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionGenerated: Self = this.set("expressionGenerated", js.undefined)
    
    @scala.inline
    def setGenerated(value: SequenceGeneratedOptions): Self = this.set("generated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerated: Self = this.set("generated", js.undefined)
    
    @scala.inline
    def setMatch(value: FULL | SIMPLE): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setNotNull(value: Boolean): Self = this.set("notNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotNull: Self = this.set("notNull", js.undefined)
    
    @scala.inline
    def setOnDelete(value: Action): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: Action): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setReferences(value: Name): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    
    @scala.inline
    def setReferencesConstraintComment(value: String): Self = this.set("referencesConstraintComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencesConstraintComment: Self = this.set("referencesConstraintComment", js.undefined)
    
    @scala.inline
    def setReferencesConstraintName(value: String): Self = this.set("referencesConstraintName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencesConstraintName: Self = this.set("referencesConstraintName", js.undefined)
    
    @scala.inline
    def setSequenceGenerated(value: SequenceGeneratedOptions): Self = this.set("sequenceGenerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceGenerated: Self = this.set("sequenceGenerated", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}
