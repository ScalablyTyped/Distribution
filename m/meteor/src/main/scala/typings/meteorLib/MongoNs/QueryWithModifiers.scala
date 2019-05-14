package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryWithModifiers[T] extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[java.lang.String] = js.undefined
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
    $comment: java.lang.String = null,
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
    val __obj = js.Dynamic.literal($query = $query)
    if ($comment != null) __obj.updateDynamic("$comment")($comment)
    if ($explain != null) __obj.updateDynamic("$explain")($explain)
    if ($hint != null) __obj.updateDynamic("$hint")($hint)
    if ($max != null) __obj.updateDynamic("$max")($max)
    if ($maxScan != null) __obj.updateDynamic("$maxScan")($maxScan)
    if ($maxTimeMS != null) __obj.updateDynamic("$maxTimeMS")($maxTimeMS)
    if ($min != null) __obj.updateDynamic("$min")($min)
    if ($natural != null) __obj.updateDynamic("$natural")($natural)
    if ($orderby != null) __obj.updateDynamic("$orderby")($orderby)
    if ($returnKey != null) __obj.updateDynamic("$returnKey")($returnKey)
    if ($showDiskLoc != null) __obj.updateDynamic("$showDiskLoc")($showDiskLoc)
    __obj.asInstanceOf[QueryWithModifiers[T]]
  }
}

