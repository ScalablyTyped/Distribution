package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AckPolicy extends StObject
@JSImport("nats/lib/nats-base-client/types", "AckPolicy")
@js.native
object AckPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AckPolicy & String] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with AckPolicy
  /* "all" */ val All: typings.nats.typesMod.AckPolicy.All & String = js.native
  
  @js.native
  sealed trait Explicit
    extends StObject
       with AckPolicy
  /* "explicit" */ val Explicit: typings.nats.typesMod.AckPolicy.Explicit & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with AckPolicy
  /* "none" */ val None: typings.nats.typesMod.AckPolicy.None & String = js.native
  
  @js.native
  sealed trait NotSet
    extends StObject
       with AckPolicy
  /* "" */ val NotSet: typings.nats.typesMod.AckPolicy.NotSet & String = js.native
}
