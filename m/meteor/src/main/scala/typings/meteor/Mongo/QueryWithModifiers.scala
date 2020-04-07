package typings.meteor.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryWithModifiers[T] extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.undefined
  @JSName("$explain")
  var $explain: js.UndefOr[js.Any] = js.undefined
  @JSName("$hint")
  var $hint: js.UndefOr[js.Any] = js.undefined
  @JSName("$max")
  var $max: js.UndefOr[js.Any] = js.undefined
  @JSName("$maxScan")
  var $maxScan: js.UndefOr[js.Any] = js.undefined
  @JSName("$maxTimeMS")
  var $maxTimeMS: js.UndefOr[js.Any] = js.undefined
  @JSName("$min")
  var $min: js.UndefOr[js.Any] = js.undefined
  @JSName("$natural")
  var $natural: js.UndefOr[js.Any] = js.undefined
  @JSName("$orderby")
  var $orderby: js.UndefOr[js.Any] = js.undefined
  @JSName("$query")
  var $query: Query[T]
  @JSName("$returnKey")
  var $returnKey: js.UndefOr[js.Any] = js.undefined
  @JSName("$showDiskLoc")
  var $showDiskLoc: js.UndefOr[js.Any] = js.undefined
}

object QueryWithModifiers {
  @scala.inline
  def apply[T](
    $query: Query[T],
    $comment: String = null,
    $explain: js.Any = null,
    $hint: js.Any = null,
    $max: js.Any = null,
    $maxScan: js.Any = null,
    $maxTimeMS: js.Any = null,
    $min: js.Any = null,
    $natural: js.Any = null,
    $orderby: js.Any = null,
    $returnKey: js.Any = null,
    $showDiskLoc: js.Any = null
  ): QueryWithModifiers[T] = {
    val __obj = js.Dynamic.literal($query = $query.asInstanceOf[js.Any])
    if ($comment != null) __obj.updateDynamic("$comment")($comment.asInstanceOf[js.Any])
    if ($explain != null) __obj.updateDynamic("$explain")($explain.asInstanceOf[js.Any])
    if ($hint != null) __obj.updateDynamic("$hint")($hint.asInstanceOf[js.Any])
    if ($max != null) __obj.updateDynamic("$max")($max.asInstanceOf[js.Any])
    if ($maxScan != null) __obj.updateDynamic("$maxScan")($maxScan.asInstanceOf[js.Any])
    if ($maxTimeMS != null) __obj.updateDynamic("$maxTimeMS")($maxTimeMS.asInstanceOf[js.Any])
    if ($min != null) __obj.updateDynamic("$min")($min.asInstanceOf[js.Any])
    if ($natural != null) __obj.updateDynamic("$natural")($natural.asInstanceOf[js.Any])
    if ($orderby != null) __obj.updateDynamic("$orderby")($orderby.asInstanceOf[js.Any])
    if ($returnKey != null) __obj.updateDynamic("$returnKey")($returnKey.asInstanceOf[js.Any])
    if ($showDiskLoc != null) __obj.updateDynamic("$showDiskLoc")($showDiskLoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryWithModifiers[T]]
  }
}

