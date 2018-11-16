package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeFactoryWithScale extends ISqlTypeFactory {
  def apply(): ISqlTypeWithScale = js.native
  def apply(scale: scala.Double): ISqlTypeWithScale = js.native
}

