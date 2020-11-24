package typings.ngTable

import typings.angular.mod.IPromise
import typings.ngTable.ngTableParamsMod.NgTableParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/core/data/getData", JSImport.Namespace)
@js.native
object getDataMod extends js.Object {
  
  type IGetDataFunc[T] = js.Function1[/* params */ NgTableParams[T], js.Array[T] | IPromise[js.Array[T]]]
  
  type IInterceptableGetDataFunc[T] = js.Function1[/* params */ NgTableParams[T], js.Any]
}
