package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyDefOrObjectTypes extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, PropertyDefOrObjectType: IPropertyDefOrObjectType): scala.Unit = js.native
  def Clone(): IPropertyDefOrObjectTypes = js.native
  def Item(Index: scala.Double): IPropertyDefOrObjectType = js.native
  def Item(Index: scala.Double, value: IPropertyDefOrObjectType): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

