package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISqlTypeFactoryWithPrecisionScale extends ISqlTypeFactory {
  
  def apply(): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: js.UndefOr[scala.Nothing], scale: Double): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: Double): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
}
