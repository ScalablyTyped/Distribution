package typings.oDotJs.distTypesOdataQueryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OdataQuery
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$compute")
  var $compute: js.UndefOr[String] = js.undefined
  @JSName("$count")
  var $count: js.UndefOr[Boolean] = js.undefined
  @JSName("$expand")
  var $expand: js.UndefOr[String] = js.undefined
  @JSName("$filter")
  var $filter: js.UndefOr[String] = js.undefined
  @JSName("$format")
  var $format: js.UndefOr[String] = js.undefined
  @JSName("$index")
  var $index: js.UndefOr[Double] = js.undefined
  @JSName("$orderby")
  var $orderby: js.UndefOr[String] = js.undefined
  @JSName("$search")
  var $search: js.UndefOr[String] = js.undefined
  @JSName("$select")
  var $select: js.UndefOr[String] = js.undefined
  @JSName("$skip")
  var $skip: js.UndefOr[Double] = js.undefined
  @JSName("$top")
  var $top: js.UndefOr[Double] = js.undefined
}

object OdataQuery {
  @scala.inline
  def apply(
    $compute: String = null,
    $count: js.UndefOr[Boolean] = js.undefined,
    $expand: String = null,
    $filter: String = null,
    $format: String = null,
    $index: Int | Double = null,
    $orderby: String = null,
    $search: String = null,
    $select: String = null,
    $skip: Int | Double = null,
    $top: Int | Double = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): OdataQuery = {
    val __obj = js.Dynamic.literal()
    if ($compute != null) __obj.updateDynamic("$compute")($compute)
    if (!js.isUndefined($count)) __obj.updateDynamic("$count")($count)
    if ($expand != null) __obj.updateDynamic("$expand")($expand)
    if ($filter != null) __obj.updateDynamic("$filter")($filter)
    if ($format != null) __obj.updateDynamic("$format")($format)
    if ($index != null) __obj.updateDynamic("$index")($index.asInstanceOf[js.Any])
    if ($orderby != null) __obj.updateDynamic("$orderby")($orderby)
    if ($search != null) __obj.updateDynamic("$search")($search)
    if ($select != null) __obj.updateDynamic("$select")($select)
    if ($skip != null) __obj.updateDynamic("$skip")($skip.asInstanceOf[js.Any])
    if ($top != null) __obj.updateDynamic("$top")($top.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OdataQuery]
  }
}

