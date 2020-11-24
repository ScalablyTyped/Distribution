package typings.postRobot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("post-robot", "send")
@js.native
object send extends js.Object {
  
  def apply(win: CrossDomainWindowType, name: String): ZalgoPromise[ResponseMessageEvent] = js.native
  def apply(
    win: CrossDomainWindowType,
    name: String,
    data: js.UndefOr[scala.Nothing],
    options: FireAndForgetRequestOptionsType with RegularRequestOptionsType
  ): ZalgoPromise[ResponseMessageEvent] = js.native
  def apply(win: CrossDomainWindowType, name: String, data: js.Object): ZalgoPromise[ResponseMessageEvent] = js.native
  def apply(
    win: CrossDomainWindowType,
    name: String,
    data: js.Object,
    options: FireAndForgetRequestOptionsType with RegularRequestOptionsType
  ): ZalgoPromise[ResponseMessageEvent] = js.native
}
