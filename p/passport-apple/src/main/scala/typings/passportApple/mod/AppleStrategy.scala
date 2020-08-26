package typings.passportApple.mod

import typings.passportApple.passportAppleStrings.apple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppleStrategy
  extends typings.passportOauth2.mod.^ {
  var name: apple = js.native
  def authorizationParams(options: js.Object): AppleAuthorizationParams = js.native
}

