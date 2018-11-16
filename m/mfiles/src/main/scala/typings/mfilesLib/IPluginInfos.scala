package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPluginInfos extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, PluginInfo: IPluginInfo): scala.Unit = js.native
  def Clone(): IPluginInfos = js.native
  def Item(Index: scala.Double): IPluginInfo = js.native
  def Item(Index: scala.Double, value: IPluginInfo): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

