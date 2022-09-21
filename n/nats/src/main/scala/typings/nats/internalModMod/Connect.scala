package typings.nats.internalModMod

import typings.nats.anon.Lang
import typings.nats.typesMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "Connect")
@js.native
open class Connect protected ()
  extends typings.nats.protocolMod.Connect {
  def this(transport: Lang, opts: ConnectionOptions) = this()
  def this(transport: Lang, opts: ConnectionOptions, nonce: String) = this()
}
