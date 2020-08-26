package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterColumnOptions extends js.Object {
  var allowNull: js.UndefOr[Boolean] = js.native
  var collation: js.UndefOr[String] = js.native
  var comment: js.UndefOr[String | Null] = js.native
  var default: js.UndefOr[Value] = js.native
  /**
    * @deprecated use sequenceGenerated
    */
  var generated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.native
  var notNull: js.UndefOr[Boolean] = js.native
  var sequenceGenerated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.native
  var `type`: js.UndefOr[String] = js.native
  var using: js.UndefOr[String] = js.native
}

object AlterColumnOptions {
  @scala.inline
  def apply(): AlterColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlterColumnOptions]
  }
  @scala.inline
  implicit class AlterColumnOptionsOps[Self <: AlterColumnOptions] (val x: Self) extends AnyVal {
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
    def setAllowNull(value: Boolean): Self = this.set("allowNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNull: Self = this.set("allowNull", js.undefined)
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
    def setGenerated(value: `false` | SequenceGeneratedOptions): Self = this.set("generated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerated: Self = this.set("generated", js.undefined)
    @scala.inline
    def setGeneratedNull: Self = this.set("generated", null)
    @scala.inline
    def setNotNull(value: Boolean): Self = this.set("notNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotNull: Self = this.set("notNull", js.undefined)
    @scala.inline
    def setSequenceGenerated(value: `false` | SequenceGeneratedOptions): Self = this.set("sequenceGenerated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceGenerated: Self = this.set("sequenceGenerated", js.undefined)
    @scala.inline
    def setSequenceGeneratedNull: Self = this.set("sequenceGenerated", null)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUsing(value: String): Self = this.set("using", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsing: Self = this.set("using", js.undefined)
  }
  
}

