package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RetentionPolicy extends StObject
@JSImport("nats/lib/nats-base-client/types", "RetentionPolicy")
@js.native
object RetentionPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RetentionPolicy & String] = js.native
  
  @js.native
  sealed trait Interest
    extends StObject
       with RetentionPolicy
  /* "interest" */ val Interest: typings.nats.typesMod.RetentionPolicy.Interest & String = js.native
  
  @js.native
  sealed trait Limits
    extends StObject
       with RetentionPolicy
  /* "limits" */ val Limits: typings.nats.typesMod.RetentionPolicy.Limits & String = js.native
  
  @js.native
  sealed trait Workqueue
    extends StObject
       with RetentionPolicy
  /* "workqueue" */ val Workqueue: typings.nats.typesMod.RetentionPolicy.Workqueue & String = js.native
}
