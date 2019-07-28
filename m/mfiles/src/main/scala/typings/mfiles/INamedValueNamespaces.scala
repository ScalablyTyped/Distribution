package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamedValueNamespaces extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, NamedValueNamespace: INamedValueNamespace): Unit = js.native
  def Clone(): INamedValueNamespaces = js.native
  def Item(Index: Double): INamedValueNamespace = js.native
  def Item(Index: Double, value: INamedValueNamespace): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

