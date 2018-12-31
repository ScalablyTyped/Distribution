package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndirectPropertyID extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): scala.Unit
  def Clone(): IIndirectPropertyID
  def EqualTo(IndirectPropertyID: IIndirectPropertyID): scala.Boolean
  def Item(Index: scala.Double): IIndirectPropertyIDLevel
  def Remove(Index: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
}

