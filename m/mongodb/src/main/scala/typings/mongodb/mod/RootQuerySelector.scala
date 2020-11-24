package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.CaseSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootQuerySelector[T]
  extends // we could not find a proper TypeScript generic to support nested queries e.g. 'user.friends.name'
// this will mark all unrecognized properties as any (including nested queries)
/* key */ StringDictionary[js.Any] {
  
  /** https://docs.mongodb.com/manual/reference/operator/query/and/#op._S_and */
  @JSName("$and")
  var $and: js.UndefOr[js.Array[FilterQuery[T]]] = js.native
  
  /** https://docs.mongodb.com/manual/reference/operator/query/comment/#op._S_comment */
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  
  /** https://docs.mongodb.com/manual/reference/operator/query/nor/#op._S_nor */
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[FilterQuery[T]]] = js.native
  
  /** https://docs.mongodb.com/manual/reference/operator/query/or/#op._S_or */
  @JSName("$or")
  var $or: js.UndefOr[js.Array[FilterQuery[T]]] = js.native
  
  /** https://docs.mongodb.com/manual/reference/operator/query/text */
  @JSName("$text")
  var $text: js.UndefOr[CaseSensitive] = js.native
  
  /** https://docs.mongodb.com/manual/reference/operator/query/where/#op._S_where */
  @JSName("$where")
  var $where: js.UndefOr[String | js.Function] = js.native
}
object RootQuerySelector {
  
  @scala.inline
  def apply[T](): RootQuerySelector[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootQuerySelector[T]]
  }
  
  @scala.inline
  implicit class RootQuerySelectorOps[Self <: RootQuerySelector[_], T] (val x: Self with RootQuerySelector[T]) extends AnyVal {
    
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
    def set$andVarargs(value: FilterQuery[T]*): Self = this.set("$and", js.Array(value :_*))
    
    @scala.inline
    def set$and(value: js.Array[FilterQuery[T]]): Self = this.set("$and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$and: Self = this.set("$and", js.undefined)
    
    @scala.inline
    def set$comment(value: String): Self = this.set("$comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$comment: Self = this.set("$comment", js.undefined)
    
    @scala.inline
    def set$norVarargs(value: FilterQuery[T]*): Self = this.set("$nor", js.Array(value :_*))
    
    @scala.inline
    def set$nor(value: js.Array[FilterQuery[T]]): Self = this.set("$nor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$nor: Self = this.set("$nor", js.undefined)
    
    @scala.inline
    def set$orVarargs(value: FilterQuery[T]*): Self = this.set("$or", js.Array(value :_*))
    
    @scala.inline
    def set$or(value: js.Array[FilterQuery[T]]): Self = this.set("$or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$or: Self = this.set("$or", js.undefined)
    
    @scala.inline
    def set$text(value: CaseSensitive): Self = this.set("$text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$text: Self = this.set("$text", js.undefined)
    
    @scala.inline
    def set$where(value: String | js.Function): Self = this.set("$where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$where: Self = this.set("$where", js.undefined)
  }
}
