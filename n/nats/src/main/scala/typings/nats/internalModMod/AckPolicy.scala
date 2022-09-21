package typings.nats.internalModMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/nats-base-client/internal_mod", "AckPolicy")
@js.native
object AckPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.typesMod.AckPolicy & String] = js.native
  
  /* "all" */ val All: typings.nats.typesMod.AckPolicy.All & String = js.native
  
  /* "explicit" */ val Explicit: typings.nats.typesMod.AckPolicy.Explicit & String = js.native
  
  /* "none" */ val None: typings.nats.typesMod.AckPolicy.None & String = js.native
  
  /* "" */ val NotSet: typings.nats.typesMod.AckPolicy.NotSet & String = js.native
}
