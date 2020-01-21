package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeFactoryWithTvpType extends ISqlTypeFactory {
  def apply(tvpType: js.Any): ISqlTypeWithTvpType = js.native
}

