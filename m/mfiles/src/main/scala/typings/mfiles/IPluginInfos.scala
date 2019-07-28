package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPluginInfos extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, PluginInfo: IPluginInfo): Unit = js.native
  def Clone(): IPluginInfos = js.native
  def Item(Index: Double): IPluginInfo = js.native
  def Item(Index: Double, value: IPluginInfo): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

