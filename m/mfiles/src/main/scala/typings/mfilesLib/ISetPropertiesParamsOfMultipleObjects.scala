package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISetPropertiesParamsOfMultipleObjects extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, SetPropertiesParams: ISetPropertiesParams): scala.Unit
  def Clone(): ISetPropertiesParamsOfMultipleObjects
  def Item(Index: scala.Double): ISetPropertiesParams
  def Remove(Index: scala.Double): scala.Unit
}

