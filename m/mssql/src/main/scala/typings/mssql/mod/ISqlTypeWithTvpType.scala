package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeWithTvpType extends ISqlType {
  var tvpType: js.Any = js.native
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithTvpType = js.native
  @JSName("type")
  def type_MISqlTypeWithTvpType(tvpType: js.Any): ISqlTypeWithTvpType = js.native
}

