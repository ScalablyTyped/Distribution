package typings.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreNgTableEventsChannelMod {
  import typings.ngDashTable.srcCoreDataResultsMod.DataResult
  import typings.ngDashTable.srcCoreNgTableParamsMod.NgTableParams
  import typings.ngDashTable.srcCorePagingMod.IPageButton

  type EventSelector[T] = NgTableParams[T] | IEventSelectorFunc
  type IAfterCreatedListener = js.Function1[/* publisher */ NgTableParams[js.Any], js.Any]
  type IAfterDataFilteredListener[T] = js.Function2[/* publisher */ NgTableParams[T], /* newData */ js.Array[DataResult[T]], js.Any]
  type IAfterDataSortedListener[T] = js.Function2[/* publisher */ NgTableParams[T], /* newData */ js.Array[DataResult[T]], js.Any]
  type IAfterReloadDataListener[T] = js.Function3[
    /* publisher */ NgTableParams[T], 
    /* newData */ js.Array[DataResult[T]], 
    /* oldData */ js.Array[DataResult[T]], 
    js.Any
  ]
  type IDatasetChangedListener[T] = js.Function3[
    /* publisher */ NgTableParams[T], 
    /* newDataset */ js.Array[T], 
    /* oldDataset */ js.Array[T], 
    js.Any
  ]
  type IEventSelectorFunc = js.Function1[/* publisher */ NgTableParams[js.Any], Boolean]
  type IPagesChangedListener = js.Function3[
    /* publisher */ NgTableParams[js.Any], 
    /* newPages */ js.Array[IPageButton], 
    /* oldPages */ js.Array[IPageButton], 
    js.Any
  ]
  type IUnregistrationFunc = js.Function0[Unit]
}
