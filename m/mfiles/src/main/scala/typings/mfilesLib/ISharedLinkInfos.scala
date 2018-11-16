package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISharedLinkInfos extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, SharedLink: ISharedLinkInfo): scala.Unit = js.native
  def Clone(): ISharedLinkInfos = js.native
  def Item(Index: scala.Double): ISharedLinkInfo = js.native
  def Item(Index: scala.Double, value: ISharedLinkInfo): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

