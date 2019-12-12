package typings.meteor.Mongo

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

