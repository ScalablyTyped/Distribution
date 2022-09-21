package typings.nats.typesMod

import typings.nats.headersMod.MsgHdrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Msg extends StObject {
  
  var data: js.typedarray.Uint8Array = js.native
  
  var headers: js.UndefOr[MsgHdrs] = js.native
  
  var reply: js.UndefOr[String] = js.native
  
  def respond(): Boolean = js.native
  def respond(data: js.typedarray.Uint8Array): Boolean = js.native
  def respond(data: js.typedarray.Uint8Array, opts: PublishOptions): Boolean = js.native
  def respond(data: Unit, opts: PublishOptions): Boolean = js.native
  
  var sid: Double = js.native
  
  var subject: String = js.native
}
