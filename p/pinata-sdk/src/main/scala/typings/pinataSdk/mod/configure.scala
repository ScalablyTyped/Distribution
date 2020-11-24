package typings.pinataSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pinata-sdk", "configure")
@js.native
object configure extends js.Object {
  
  def apply(apiKey: String, privateApiKey: String): PinataConfig = js.native
  def apply(apiKey: String, privateApiKey: String, apiURL: String): PinataConfig = js.native
}
