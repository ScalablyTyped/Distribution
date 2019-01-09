package typings
package ngDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreNgTableEventsChannelMod {
  type EventSelector[T] = ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T] | IEventSelectorFunc
  type IAfterCreatedListener = js.Function1[
    /* publisher */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[js.Any], 
    js.Any
  ]
  type IAfterDataFilteredListener[T] = js.Function2[
    /* publisher */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
    /* newData */ js.Array[ngDashTableLib.srcCoreDataResultsMod.DataResult[T]], 
    js.Any
  ]
  type IAfterDataSortedListener[T] = js.Function2[
    /* publisher */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
    /* newData */ js.Array[ngDashTableLib.srcCoreDataResultsMod.DataResult[T]], 
    js.Any
  ]
  type IAfterReloadDataListener[T] = js.Function3[
    /* publisher */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
    /* newData */ js.Array[ngDashTableLib.srcCoreDataResultsMod.DataResult[T]], 
    /* oldData */ js.Array[ngDashTableLib.srcCoreDataResultsMod.DataResult[T]], 
    js.Any
  ]
  type IDatasetChangedListener[T] = js.Function3[
    /* publisher */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[T], 
    /* newDataset */ js.Array[T], 
    /* oldDataset */ js.Array[T], 
    js.Any
  ]
  type IEventSelectorFunc = js.Function1[
    /* publisher */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[js.Any], 
    scala.Boolean
  ]
  type IPagesChangedListener = js.Function3[
    /* publisher */ ngDashTableLib.srcCoreNgTableParamsMod.NgTableParams[js.Any], 
    /* newPages */ js.Array[ngDashTableLib.srcCorePagingMod.IPageButton], 
    /* oldPages */ js.Array[ngDashTableLib.srcCorePagingMod.IPageButton], 
    js.Any
  ]
  type IUnregistrationFunc = js.Function0[scala.Unit]
}
