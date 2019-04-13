package typings
package ngDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcBrowserPublicDashInterfacesMod {
  type ColumnFieldContext = angularLib.angularMod.IScope with ngDashTableLib.Anon_Column
  type DynamicTableColField[T] = IDynamicTableColFieldFunc[T] | T
  type IDynamicTableColFieldFunc[T] = js.Function1[/* context */ ColumnFieldContext, T]
  type IFilterTemplateDefMap = org.scalablytyped.runtime.StringDictionary[java.lang.String | IFilterTemplateDef]
  type ISelectDataFunc = js.Function0[
    js.Array[ISelectOption] | angularLib.angularMod.IPromise[js.Array[ISelectOption]]
  ]
  type SelectData = js.Array[ISelectOption] | ISelectDataFunc
}
