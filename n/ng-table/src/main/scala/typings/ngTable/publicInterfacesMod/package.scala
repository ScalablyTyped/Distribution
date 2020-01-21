package typings.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object publicInterfacesMod {
  type ColumnFieldContext = typings.angular.mod.IScope with typings.ngTable.AnonColumn
  type DynamicTableColField[T] = typings.ngTable.publicInterfacesMod.IDynamicTableColFieldFunc[T] | T
  type IDynamicTableColFieldFunc[T] = js.Function1[/* context */ typings.ngTable.publicInterfacesMod.ColumnFieldContext, T]
  type IFilterTemplateDefMap = org.scalablytyped.runtime.StringDictionary[java.lang.String | typings.ngTable.publicInterfacesMod.IFilterTemplateDef]
  type ISelectDataFunc = js.Function0[
    js.Array[typings.ngTable.publicInterfacesMod.ISelectOption] | typings.angular.mod.IPromise[js.Array[typings.ngTable.publicInterfacesMod.ISelectOption]]
  ]
  type SelectData = js.Array[typings.ngTable.publicInterfacesMod.ISelectOption] | typings.ngTable.publicInterfacesMod.ISelectDataFunc
}
