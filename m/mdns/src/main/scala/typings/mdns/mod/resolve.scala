package typings.mdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mdns", "resolve")
@js.native
object resolve extends js.Object {
  
  def apply(service: Service): Unit = js.native
  def apply(
    service: Service,
    sequence: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Unit = js.native
  def apply(
    service: Service,
    sequence: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]
  ): Unit = js.native
  def apply(
    service: Service,
    sequence: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]],
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Unit = js.native
}
