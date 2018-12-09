package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait columns
  extends stdLib.Array[js.Any] {
  def add(name: java.lang.String, `type`: js.Function0[ISqlType]): scala.Double = js.native
  def add(name: java.lang.String, `type`: js.Function0[ISqlType], options: IColumnOptions): scala.Double = js.native
  def add(name: java.lang.String, `type`: ISqlType): scala.Double = js.native
  def add(name: java.lang.String, `type`: ISqlType, options: IColumnOptions): scala.Double = js.native
}

