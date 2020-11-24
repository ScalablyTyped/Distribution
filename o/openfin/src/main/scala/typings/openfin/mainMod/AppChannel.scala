package typings.openfin.mainMod

import typings.openfin.contextChannelsMod.AppChannelTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/fdc3/main", "AppChannel")
@js.native
class AppChannel protected ()
  extends typings.openfin.contextChannelsMod.AppChannel {
  /**
    * @hidden
    *
    * Channel objects should not be created directly by an application, channel objects should be obtained by calling the relevant APIs.
    */
  def this(transport: AppChannelTransport) = this()
}
