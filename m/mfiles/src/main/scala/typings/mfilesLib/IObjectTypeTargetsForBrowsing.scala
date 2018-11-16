package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjectTypeTargetsForBrowsing extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing): scala.Unit
  def Clone(): IObjectTypeTargetsForBrowsing
  def Item(Index: scala.Double): IObjectTypeTargetForBrowsing
  def Remove(Index: scala.Double): scala.Unit
}

