package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedValueNamespaces extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, NamedValueNamespace: INamedValueNamespace): scala.Unit = js.native
  def Clone(): INamedValueNamespaces = js.native
  def Item(Index: scala.Double): INamedValueNamespace = js.native
  def Item(Index: scala.Double, value: INamedValueNamespace): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

