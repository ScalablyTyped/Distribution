package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignaturePromptInfos extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, SignaturePromptInfo: ISignaturePromptInfo): scala.Unit = js.native
  def Clone(): ISignaturePromptInfos = js.native
  def Item(Index: scala.Double): ISignaturePromptInfo = js.native
  def Item(Index: scala.Double, value: ISignaturePromptInfo): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

