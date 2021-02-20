package typings.parse.mod

import typings.parse.mod.global.Parse.Push.PushData
import typings.parse.mod.global.Parse.Push.SendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions to deal with Push in Parse
  */
object Push {
  
  @JSImport("parse", "Push.send")
  @js.native
  def send[T](data: PushData): js.Promise[T] = js.native
  @JSImport("parse", "Push.send")
  @js.native
  def send[T](data: PushData, options: SendOptions): js.Promise[T] = js.native
}
