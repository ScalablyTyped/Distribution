package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inline extends js.Object {
  /** the results are returned in an array */
  var `inline`: js.UndefOr[Double] = js.undefined
  /**
    * {merge: 'collectionName'} add the results to collectionName: if
    * dups exist the new docs overwrite the old
    */
  var merge: js.UndefOr[String] = js.undefined
  /**
    * {reduce: 'collectionName'} add the results to collectionName: if
    * dups are detected, uses the reducer / finalize functions
    */
  var reduce: js.UndefOr[String] = js.undefined
  /**
    * {replace: 'collectionName'} add the results to collectionName: the
    * results replace the collection
    */
  var replace: js.UndefOr[String] = js.undefined
}

object Anon_Inline {
  @scala.inline
  def apply(`inline`: Int | Double = null, merge: String = null, reduce: String = null, replace: String = null): Anon_Inline = {
    val __obj = js.Dynamic.literal()
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (merge != null) __obj.updateDynamic("merge")(merge)
    if (reduce != null) __obj.updateDynamic("reduce")(reduce)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[Anon_Inline]
  }
}

