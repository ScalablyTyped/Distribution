package typings.overwatchApi.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("overwatch-api", "getProfile")
@js.native
object getProfile extends js.Object {
  
  def apply(
    platform: PLATFORM,
    region: REGION,
    tag: String,
    callback: js.Function2[/* err */ Error, /* data */ Profile, Unit]
  ): Unit = js.native
}
