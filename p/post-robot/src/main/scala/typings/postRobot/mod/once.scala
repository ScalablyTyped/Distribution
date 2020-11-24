package typings.postRobot.mod

import typings.postRobot.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("post-robot", "once")
@js.native
object once extends js.Object {
  
  def apply(name: String): ZalgoPromise[Data] = js.native
  def apply(name: String, options: js.UndefOr[scala.Nothing], handler: HandlerType): ZalgoPromise[Data] = js.native
  def apply(name: String, options: HandlerType): ZalgoPromise[Data] = js.native
  def apply(name: String, options: HandlerType, handler: HandlerType): ZalgoPromise[Data] = js.native
  def apply(name: String, options: ServerOptionsType): ZalgoPromise[Data] = js.native
  def apply(name: String, options: ServerOptionsType, handler: HandlerType): ZalgoPromise[Data] = js.native
}
