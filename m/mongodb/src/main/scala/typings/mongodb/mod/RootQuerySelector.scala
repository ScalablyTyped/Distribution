package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.anon.CaseSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootQuerySelector[T]
  extends // we could not find a proper TypeScript generic to support nested queries e.g. 'user.friends.name'
// this will mark all unrecognized properties as any (including nested queries)
/* key */ StringDictionary[js.Any] {
  /** https://docs.mongodb.com/manual/reference/operator/query/and/#op._S_and */
  @JSName("$and")
  var $and: js.UndefOr[js.Array[FilterQuery[T]]] = js.undefined
  /** https://docs.mongodb.com/manual/reference/operator/query/comment/#op._S_comment */
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.undefined
  /** https://docs.mongodb.com/manual/reference/operator/query/nor/#op._S_nor */
  @JSName("$nor")
  var $nor: js.UndefOr[js.Array[FilterQuery[T]]] = js.undefined
  /** https://docs.mongodb.com/manual/reference/operator/query/or/#op._S_or */
  @JSName("$or")
  var $or: js.UndefOr[js.Array[FilterQuery[T]]] = js.undefined
  /** https://docs.mongodb.com/manual/reference/operator/query/text */
  @JSName("$text")
  var $text: js.UndefOr[CaseSensitive] = js.undefined
  /** https://docs.mongodb.com/manual/reference/operator/query/where/#op._S_where */
  @JSName("$where")
  var $where: js.UndefOr[String | js.Function] = js.undefined
}

object RootQuerySelector {
  @scala.inline
  def apply[T](
    $and: js.Array[FilterQuery[T]] = null,
    $comment: String = null,
    $nor: js.Array[FilterQuery[T]] = null,
    $or: js.Array[FilterQuery[T]] = null,
    $text: CaseSensitive = null,
    $where: String | js.Function = null,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): RootQuerySelector[T] = {
    val __obj = js.Dynamic.literal()
    if ($and != null) __obj.updateDynamic("$and")($and.asInstanceOf[js.Any])
    if ($comment != null) __obj.updateDynamic("$comment")($comment.asInstanceOf[js.Any])
    if ($nor != null) __obj.updateDynamic("$nor")($nor.asInstanceOf[js.Any])
    if ($or != null) __obj.updateDynamic("$or")($or.asInstanceOf[js.Any])
    if ($text != null) __obj.updateDynamic("$text")($text.asInstanceOf[js.Any])
    if ($where != null) __obj.updateDynamic("$where")($where.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RootQuerySelector[T]]
  }
}

