package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISqlTypeWithPrecisionScale extends ISqlType {
  
  var precision: Double = js.native
  
  var scale: Double = js.native
  
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(): ISqlTypeWithPrecisionScale = js.native
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(precision: js.UndefOr[scala.Nothing], scale: Double): ISqlTypeWithPrecisionScale = js.native
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(precision: Double): ISqlTypeWithPrecisionScale = js.native
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithPrecisionScale = js.native
}
