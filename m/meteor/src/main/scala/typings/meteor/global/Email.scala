package typings.meteor.global

import typings.meteor.Email.CustomEmailOptions
import typings.meteor.Email.EmailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Email {
  
  @JSGlobal("Email")
  @js.native
  val ^ : js.Any = js.native
  
  inline def customTransport(fn: js.Function1[/* options */ CustomEmailOptions, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("customTransport")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hookSend(fn: js.Function1[/* options */ EmailOptions, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hookSend")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def send(options: EmailOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
