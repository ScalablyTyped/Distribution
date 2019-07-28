package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectVersions extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ObjectVersionData: IObjectVersion): Unit = js.native
  def GetAsObjVers(): IObjVers = js.native
  def Item(Index: Double): IObjectVersion = js.native
  def Item(Index: Double, value: IObjectVersion): Unit = js.native
  def Remove(Index: Double): Unit = js.native
  def Sort(ObjectComparer: IObjectComparer): Unit = js.native
}

