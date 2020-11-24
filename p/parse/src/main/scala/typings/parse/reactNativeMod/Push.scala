package typings.parse.reactNativeMod

import typings.parse.mod.global.Parse.Push.PushData
import typings.parse.mod.global.Parse.Push.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions to deal with Push in Parse
  */
@JSImport("parse/react-native", "Push")
@js.native
object Push extends js.Object {
  
  def send[T](data: PushData): js.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): js.Promise[T] = js.native
}
