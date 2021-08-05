package typings.parse.mod

import typings.parse.mod.global.Parse.Push.PushData
import typings.parse.mod.global.Parse.Push.SendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions to deal with Push in Parse
  */
object Push {
  
  @JSImport("parse", "Push")
  @js.native
  val ^ : js.Any = js.native
  
  inline def send[T](data: PushData): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def send[T](data: PushData, options: SendOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
