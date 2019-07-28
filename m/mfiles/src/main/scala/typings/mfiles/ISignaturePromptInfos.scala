package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISignaturePromptInfos extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, SignaturePromptInfo: ISignaturePromptInfo): Unit = js.native
  def Clone(): ISignaturePromptInfos = js.native
  def Item(Index: Double): ISignaturePromptInfo = js.native
  def Item(Index: Double, value: ISignaturePromptInfo): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

