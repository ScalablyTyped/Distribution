package typings.ngDashTable.srcCoreDataNgTableDefaultGetDataMod

import typings.angular.angularMod.IFilterService
import typings.angular.angularMod.IServiceProvider
import typings.ngDashTable.srcCoreNgTableEventsChannelMod.NgTableEventsChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/data/ngTableDefaultGetData", "NgTableDefaultGetDataProvider")
@js.native
class NgTableDefaultGetDataProvider () extends IServiceProvider {
  /* CompleteClass */
  @JSName("$get")
  override var $get: js.Any = js.native
  /**
    * The name of a angular filter that knows how to apply the values returned by
    * `NgTableParams.filter()` to restrict an array of data.
    * (defaults to the angular `filter` filter service)
    */
  var filterFilterName: String = js.native
  /**
    * The name of a angular filter that knows how to apply the values returned by
    * `NgTableParams.orderBy()` to sort an array of data.
    * (defaults to the angular `orderBy` filter service)
    */
  var sortingFilterName: String = js.native
  @JSName("$get")
  def $get_MNgTableDefaultGetDataProvider($filter: IFilterService, ngTableEventsChannel: NgTableEventsChannel): IDefaultGetData[_] = js.native
}

