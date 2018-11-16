package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectVersions extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, ObjectVersionData: IObjectVersion): scala.Unit = js.native
  def GetAsObjVers(): IObjVers = js.native
  def Item(Index: scala.Double): IObjectVersion = js.native
  def Item(Index: scala.Double, value: IObjectVersion): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
  def Sort(ObjectComparer: IObjectComparer): scala.Unit = js.native
}

