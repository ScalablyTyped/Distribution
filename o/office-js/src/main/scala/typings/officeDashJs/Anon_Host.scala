package typings.officeDashJs

import typings.officeDashJs.Office.HostType
import typings.officeDashJs.Office.PlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: HostType
  var platform: PlatformType
}

object Anon_Host {
  @scala.inline
  def apply(host: HostType, platform: PlatformType): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host, platform = platform)
  
    __obj.asInstanceOf[Anon_Host]
  }
}

