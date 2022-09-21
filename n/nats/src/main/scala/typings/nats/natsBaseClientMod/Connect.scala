package typings.nats.natsBaseClientMod

import typings.nats.anon.Lang
import typings.nats.typesMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "Connect")
@js.native
open class Connect protected ()
  extends typings.nats.internalModMod.Connect {
  def this(transport: Lang, opts: ConnectionOptions) = this()
  def this(transport: Lang, opts: ConnectionOptions, nonce: String) = this()
}
