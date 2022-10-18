package typings.nextAuth.anon

import typings.nextAuth.coreMod.OutgoingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signin extends StObject {
  
  def error(): OutgoingResponse[Any] = js.native
  def error(props: Error): OutgoingResponse[Any] = js.native
  
  def signin(): OutgoingResponse[Any] = js.native
  def signin(props: Any): OutgoingResponse[Any] = js.native
  
  def signout(): OutgoingResponse[Any] = js.native
  def signout(props: Any): OutgoingResponse[Any] = js.native
  
  def verifyRequest(): OutgoingResponse[Any] = js.native
  def verifyRequest(props: Any): OutgoingResponse[Any] = js.native
}
