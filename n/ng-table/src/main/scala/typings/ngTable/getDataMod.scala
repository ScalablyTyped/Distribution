package typings.ngTable

import typings.angular.mod.IPromise
import typings.ngTable.ngTableParamsMod.NgTableParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDataMod {
  
  type IGetDataFunc[T] = js.Function1[/* params */ NgTableParams[T], js.Array[T] | IPromise[js.Array[T]]]
  
  type IInterceptableGetDataFunc[T] = js.Function1[/* params */ NgTableParams[T], Any]
}
