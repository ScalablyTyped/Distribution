package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeFactoryWithLength extends ISqlTypeFactory {
  def apply(): ISqlTypeWithLength = js.native
  def apply(length: Double): ISqlTypeWithLength = js.native
}

