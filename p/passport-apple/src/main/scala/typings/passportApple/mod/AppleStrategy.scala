package typings.passportApple.mod

import typings.passportApple.passportAppleStrings.apple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppleStrategy
  extends typings.passportOauth2.mod.^ {
  
  def authorizationParams(options: js.Object): AppleAuthorizationParams = js.native
  
  var name: apple = js.native
}
