package typings.mongodb.mongodbMod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.Anon_CaseSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var $text: js.UndefOr[Anon_CaseSensitive] = js.native
  /** https://docs.mongodb.com/manual/reference/operator/query/where/#op._S_where */
  @JSName("$where")
  var $where: js.UndefOr[String | js.Function] = js.native
}

