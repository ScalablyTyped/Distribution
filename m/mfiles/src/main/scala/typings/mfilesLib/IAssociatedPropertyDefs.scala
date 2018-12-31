package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedPropertyDefs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, AssociatedPropertyDef: IAssociatedPropertyDef): scala.Unit
  def Clone(): IAssociatedPropertyDefs
  def Item(Index: scala.Double): IAssociatedPropertyDef
  def Remove(Index: scala.Double): scala.Unit
}

