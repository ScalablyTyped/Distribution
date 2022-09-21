package typings.nats.natsBaseClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "RetentionPolicy")
@js.native
object RetentionPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.typesMod.RetentionPolicy & String] = js.native
  
  /* "interest" */ val Interest: typings.nats.typesMod.RetentionPolicy.Interest & String = js.native
  
  /* "limits" */ val Limits: typings.nats.typesMod.RetentionPolicy.Limits & String = js.native
  
  /* "workqueue" */ val Workqueue: typings.nats.typesMod.RetentionPolicy.Workqueue & String = js.native
}
