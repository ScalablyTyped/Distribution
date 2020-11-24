package typings.mssql.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait columns extends Array[IColumn] {
  
  def add(name: String, `type`: js.Function0[ISqlType]): Double = js.native
  def add(name: String, `type`: js.Function0[ISqlType], options: IColumnOptions): Double = js.native
  def add(name: String, `type`: ISqlType): Double = js.native
  def add(name: String, `type`: ISqlType, options: IColumnOptions): Double = js.native
}
