package typings.normalizr.mod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityOptions[T] extends js.Object {
  var idAttribute: js.UndefOr[String | SchemaFunction] = js.native
  var mergeStrategy: js.UndefOr[MergeFunction] = js.native
  var processStrategy: js.UndefOr[StrategyFunction[T]] = js.native
}

object EntityOptions {
  @scala.inline
  def apply[T](): EntityOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityOptions[T]]
  }
  @scala.inline
  implicit class EntityOptionsOps[Self <: EntityOptions[_], T] (val x: Self with EntityOptions[T]) extends AnyVal {
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
    def setIdAttributeFunction3(value: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => String): Self = this.set("idAttribute", js.Any.fromFunction3(value))
    @scala.inline
    def setIdAttribute(value: String | SchemaFunction): Self = this.set("idAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdAttribute: Self = this.set("idAttribute", js.undefined)
    @scala.inline
    def setMergeStrategy(value: (/* entityA */ js.Any, /* entityB */ js.Any) => js.Any): Self = this.set("mergeStrategy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMergeStrategy: Self = this.set("mergeStrategy", js.undefined)
    @scala.inline
    def setProcessStrategy(value: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => T): Self = this.set("processStrategy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteProcessStrategy: Self = this.set("processStrategy", js.undefined)
  }
  
}

