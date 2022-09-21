package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiscardPolicy extends StObject
@JSImport("nats/lib/nats-base-client/types", "DiscardPolicy")
@js.native
object DiscardPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DiscardPolicy & String] = js.native
  
  @js.native
  sealed trait New
    extends StObject
       with DiscardPolicy
  /* "new" */ val New: typings.nats.typesMod.DiscardPolicy.New & String = js.native
  
  @js.native
  sealed trait Old
    extends StObject
       with DiscardPolicy
  /* "old" */ val Old: typings.nats.typesMod.DiscardPolicy.Old & String = js.native
}
