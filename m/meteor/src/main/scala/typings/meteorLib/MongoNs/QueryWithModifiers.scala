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

