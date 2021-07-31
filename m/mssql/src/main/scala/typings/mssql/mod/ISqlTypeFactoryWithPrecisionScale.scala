package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISqlTypeFactoryWithPrecisionScale
  extends StObject
     with ISqlTypeFactory {
  
  def apply(): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: Double): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: Unit, scale: Double): ISqlTypeWithPrecisionScale = js.native
}
