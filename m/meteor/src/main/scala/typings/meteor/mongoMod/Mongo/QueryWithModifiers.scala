package typings.meteor.mongoMod.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryWithModifiers[T] extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  @JSName("$explain")
  var $explain: js.UndefOr[js.Any] = js.native
  @JSName("$hint")
  var $hint: js.UndefOr[js.Any] = js.native
  @JSName("$max")
  var $max: js.UndefOr[js.Any] = js.native
  @JSName("$maxScan")
  var $maxScan: js.UndefOr[js.Any] = js.native
  @JSName("$maxTimeMS")
  var $maxTimeMS: js.UndefOr[js.Any] = js.native
  @JSName("$min")
  var $min: js.UndefOr[js.Any] = js.native
  @JSName("$natural")
  var $natural: js.UndefOr[js.Any] = js.native
  @JSName("$orderby")
  var $orderby: js.UndefOr[js.Any] = js.native
  @JSName("$query")
  var $query: Query[T] = js.native
  @JSName("$returnKey")
  var $returnKey: js.UndefOr[js.Any] = js.native
  @JSName("$showDiskLoc")
  var $showDiskLoc: js.UndefOr[js.Any] = js.native
}

object QueryWithModifiers {
  @scala.inline
  def apply[T]($query: Query[T]): QueryWithModifiers[T] = {
    val __obj = js.Dynamic.literal($query = $query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryWithModifiers[T]]
  }
  @scala.inline
  implicit class QueryWithModifiersOps[Self <: QueryWithModifiers[_], T] (val x: Self with QueryWithModifiers[T]) extends AnyVal {
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
    def set$query(value: Query[T]): Self = this.set("$query", value.asInstanceOf[js.Any])
    @scala.inline
    def set$comment(value: String): Self = this.set("$comment", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$comment: Self = this.set("$comment", js.undefined)
    @scala.inline
    def set$explain(value: js.Any): Self = this.set("$explain", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$explain: Self = this.set("$explain", js.undefined)
    @scala.inline
    def set$hint(value: js.Any): Self = this.set("$hint", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$hint: Self = this.set("$hint", js.undefined)
    @scala.inline
    def set$max(value: js.Any): Self = this.set("$max", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$max: Self = this.set("$max", js.undefined)
    @scala.inline
    def set$maxScan(value: js.Any): Self = this.set("$maxScan", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxScan: Self = this.set("$maxScan", js.undefined)
    @scala.inline
    def set$maxTimeMS(value: js.Any): Self = this.set("$maxTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxTimeMS: Self = this.set("$maxTimeMS", js.undefined)
    @scala.inline
    def set$min(value: js.Any): Self = this.set("$min", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$min: Self = this.set("$min", js.undefined)
    @scala.inline
    def set$natural(value: js.Any): Self = this.set("$natural", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$natural: Self = this.set("$natural", js.undefined)
    @scala.inline
    def set$orderby(value: js.Any): Self = this.set("$orderby", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$orderby: Self = this.set("$orderby", js.undefined)
    @scala.inline
    def set$returnKey(value: js.Any): Self = this.set("$returnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$returnKey: Self = this.set("$returnKey", js.undefined)
    @scala.inline
    def set$showDiskLoc(value: js.Any): Self = this.set("$showDiskLoc", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$showDiskLoc: Self = this.set("$showDiskLoc", js.undefined)
  }
  
}

