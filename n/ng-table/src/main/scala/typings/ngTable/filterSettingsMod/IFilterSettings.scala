package typings.ngTable.filterSettingsMod

import typings.ngTable.filterComparatorMod.FilterComparator
import typings.ngTable.filterFuncMod.IFilterFunc
import typings.ngTable.filterFuncMod.IFilterValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var filterComparator: js.UndefOr[FilterComparator[T]] = js.native
  /**
    * A duration to wait for the user to stop typing before applying the filter.
    * - Defaults to 0 for small managed inmemory arrays ie where a `ISettings.dataset` argument is
    *   supplied to `NgTableParams.settings`.
    * - Defaults to 500 milliseconds otherwise.
    */
  var filterDelay: js.UndefOr[Double] = js.native
  /**
    * The number of elements up to which a managed inmemory array is considered small. Defaults to 10000.
    */
  var filterDelayThreshold: js.UndefOr[Double] = js.native
  /**
    * Overrides `IDefaultGetDataProvider.filterFilterName`.
    * The value supplied should be the name of the angular `$filter` service that will be selected to perform
    * the actual filter logic.
    * Defaults to 'filter'.
    */
  var filterFilterName: js.UndefOr[String] = js.native
  /**
    * Tells `IDefaultGetData` to use this function supplied to perform the filtering instead of selecting an angular $filter.
    */
  var filterFn: js.UndefOr[IFilterFunc[T]] = js.native
  /**
    * The layout to use when multiple html templates are to rendered in a single table header column.
    */
  var filterLayout: js.UndefOr[FilterLayout] = js.native
}

object IFilterSettings {
  @scala.inline
  def apply[T](): IFilterSettings[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterSettings[T]]
  }
  @scala.inline
  implicit class IFilterSettingsOps[Self <: IFilterSettings[_], T] (val x: Self with IFilterSettings[T]) extends AnyVal {
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
    def setFilterComparatorFunction2(value: (T, T) => Boolean): Self = this.set("filterComparator", js.Any.fromFunction2(value))
    @scala.inline
    def setFilterComparator(value: FilterComparator[T]): Self = this.set("filterComparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterComparator: Self = this.set("filterComparator", js.undefined)
    @scala.inline
    def setFilterDelay(value: Double): Self = this.set("filterDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDelay: Self = this.set("filterDelay", js.undefined)
    @scala.inline
    def setFilterDelayThreshold(value: Double): Self = this.set("filterDelayThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDelayThreshold: Self = this.set("filterDelayThreshold", js.undefined)
    @scala.inline
    def setFilterFilterName(value: String): Self = this.set("filterFilterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterFilterName: Self = this.set("filterFilterName", js.undefined)
    @scala.inline
    def setFilterFn(
      value: (/* data */ js.Array[T], /* filter */ IFilterValues, /* filterComparator */ FilterComparator[T]) => js.Array[T]
    ): Self = this.set("filterFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFilterFn: Self = this.set("filterFn", js.undefined)
    @scala.inline
    def setFilterLayout(value: FilterLayout): Self = this.set("filterLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterLayout: Self = this.set("filterLayout", js.undefined)
  }
  
}

