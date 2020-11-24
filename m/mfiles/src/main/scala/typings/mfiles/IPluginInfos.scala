package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPluginInfos extends js.Object {
  
  def Add(Index: Double, PluginInfo: IPluginInfo): Unit = js.native
  
  def Clone(): IPluginInfos = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IPluginInfo = js.native
  def Item(Index: Double, value: IPluginInfo): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
