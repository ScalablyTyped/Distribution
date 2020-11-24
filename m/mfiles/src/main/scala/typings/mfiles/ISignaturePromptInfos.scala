package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISignaturePromptInfos extends js.Object {
  
  def Add(Index: Double, SignaturePromptInfo: ISignaturePromptInfo): Unit = js.native
  
  def Clone(): ISignaturePromptInfos = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): ISignaturePromptInfo = js.native
  def Item(Index: Double, value: ISignaturePromptInfo): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
}
