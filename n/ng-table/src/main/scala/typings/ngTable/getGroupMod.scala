package typings.ngTable

import typings.angular.mod.IPromise
import typings.ngTable.ngTableParamsMod.NgTableParams
import typings.ngTable.resultsMod.IDataRowGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGroupMod {
  
  type IGetGroupFunc[T] = js.Function1[
    /* params */ NgTableParams[T], 
    js.Array[IDataRowGroup[T]] | IPromise[js.Array[IDataRowGroup[T]]]
  ]
}
