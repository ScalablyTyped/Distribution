package typings
package ngDashTableLib.srcCoreDataNgTableDefaultGetDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/data/ngTableDefaultGetData", "NgTableDefaultGetDataProvider")
@js.native
class NgTableDefaultGetDataProvider ()
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /* CompleteClass */
  @JSName("$get")
  override var $get: js.Any = js.native
  /**
    * The name of a angular filter that knows how to apply the values returned by
    * `NgTableParams.filter()` to restrict an array of data.
    * (defaults to the angular `filter` filter service)
    */
  var filterFilterName: java.lang.String = js.native
  /**
    * The name of a angular filter that knows how to apply the values returned by
    * `NgTableParams.orderBy()` to sort an array of data.
    * (defaults to the angular `orderBy` filter service)
    */
  var sortingFilterName: java.lang.String = js.native
  @JSName("$get")
  def $get_MNgTableDefaultGetDataProvider(
    $filter: angularLib.angularMod.angularNs.IFilterService,
    ngTableEventsChannel: ngDashTableLib.srcCoreNgTableEventsChannelMod.NgTableEventsChannel
  ): IDefaultGetData[_] = js.native
}

