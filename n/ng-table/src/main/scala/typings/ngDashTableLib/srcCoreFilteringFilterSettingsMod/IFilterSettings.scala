package typings
package ngDashTableLib.srcCoreFilteringFilterSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterSettings[T] extends js.Object {
  /**
    * Use this to determine how items are matched against the filter values.
    * This setting is identical to the `comparator` parameter supported by the angular
    * `$filter` filter service
    *
    * Defaults to `undefined` which will result in a case insensitive susbstring match when
    * `IDefaultGetData` service is supplying the implementation for the
    * `ISettings.getData` function
    */
  var filterComparator: js.UndefOr[ngDashTableLib.srcCoreFilteringFilterComparatorMod.FilterComparator[T]] = js.undefined
  /**
    * A duration to wait for the user to stop typing before applying the filter.
    * - Defaults to 0 for small managed inmemory arrays ie where a `ISettings.dataset` argument is
    *   supplied to `NgTableParams.settings`.
    * - Defaults to 500 milliseconds otherwise.
    */
  var filterDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of elements up to which a managed inmemory array is considered small. Defaults to 10000.
    */
  var filterDelayThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Overrides `IDefaultGetDataProvider.filterFilterName`.
    * The value supplied should be the name of the angular `$filter` service that will be selected to perform
    * the actual filter logic.
    * Defaults to 'filter'.
    */
  var filterFilterName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tells `IDefaultGetData` to use this function supplied to perform the filtering instead of selecting an angular $filter.
    */
  var filterFn: js.UndefOr[ngDashTableLib.srcCoreFilteringFilterFuncMod.IFilterFunc[T]] = js.undefined
  /**
    * The layout to use when multiple html templates are to rendered in a single table header column.
    */
  var filterLayout: js.UndefOr[FilterLayout] = js.undefined
}

object IFilterSettings {
  @scala.inline
  def apply[T](
    filterComparator: ngDashTableLib.srcCoreFilteringFilterComparatorMod.FilterComparator[T] = null,
    filterDelay: scala.Int | scala.Double = null,
    filterDelayThreshold: scala.Int | scala.Double = null,
    filterFilterName: java.lang.String = null,
    filterFn: ngDashTableLib.srcCoreFilteringFilterFuncMod.IFilterFunc[T] = null,
    filterLayout: FilterLayout = null
  ): IFilterSettings[T] = {
    val __obj = js.Dynamic.literal()
    if (filterComparator != null) __obj.updateDynamic("filterComparator")(filterComparator.asInstanceOf[js.Any])
    if (filterDelay != null) __obj.updateDynamic("filterDelay")(filterDelay.asInstanceOf[js.Any])
    if (filterDelayThreshold != null) __obj.updateDynamic("filterDelayThreshold")(filterDelayThreshold.asInstanceOf[js.Any])
    if (filterFilterName != null) __obj.updateDynamic("filterFilterName")(filterFilterName)
    if (filterFn != null) __obj.updateDynamic("filterFn")(filterFn)
    if (filterLayout != null) __obj.updateDynamic("filterLayout")(filterLayout)
    __obj.asInstanceOf[IFilterSettings[T]]
  }
}

