package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
@JSImport("@mparticle/web-sdk", "EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType & Double] = js.native
  
  @js.native
  sealed trait Location
    extends StObject
       with EventType
  /* 2 */ val Location: typings.mparticleWebSdk.mod.EventType.Location & Double = js.native
  
  @js.native
  sealed trait Media
    extends StObject
       with EventType
  /* 9 */ val Media: typings.mparticleWebSdk.mod.EventType.Media & Double = js.native
  
  @js.native
  sealed trait Navigation
    extends StObject
       with EventType
  /* 1 */ val Navigation: typings.mparticleWebSdk.mod.EventType.Navigation & Double = js.native
  
  @js.native
  sealed trait Other
    extends StObject
       with EventType
  /* 8 */ val Other: typings.mparticleWebSdk.mod.EventType.Other & Double = js.native
  
  @js.native
  sealed trait Search
    extends StObject
       with EventType
  /* 3 */ val Search: typings.mparticleWebSdk.mod.EventType.Search & Double = js.native
  
  @js.native
  sealed trait Social
    extends StObject
       with EventType
  /* 7 */ val Social: typings.mparticleWebSdk.mod.EventType.Social & Double = js.native
  
  @js.native
  sealed trait Transaction
    extends StObject
       with EventType
  /* 4 */ val Transaction: typings.mparticleWebSdk.mod.EventType.Transaction & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EventType
  /* 0 */ val Unknown: typings.mparticleWebSdk.mod.EventType.Unknown & Double = js.native
  
  @js.native
  sealed trait UserContent
    extends StObject
       with EventType
  /* 5 */ val UserContent: typings.mparticleWebSdk.mod.EventType.UserContent & Double = js.native
  
  @js.native
  sealed trait UserPreference
    extends StObject
       with EventType
  /* 6 */ val UserPreference: typings.mparticleWebSdk.mod.EventType.UserPreference & Double = js.native
}
