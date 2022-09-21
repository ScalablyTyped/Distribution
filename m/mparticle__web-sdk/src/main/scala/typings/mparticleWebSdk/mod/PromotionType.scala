package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PromotionType extends StObject
@JSImport("@mparticle/web-sdk", "PromotionType")
@js.native
object PromotionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PromotionType & Double] = js.native
  
  @js.native
  sealed trait PromotionClick
    extends StObject
       with PromotionType
  /* 1 */ val PromotionClick: typings.mparticleWebSdk.mod.PromotionType.PromotionClick & Double = js.native
  
  @js.native
  sealed trait PromotionView
    extends StObject
       with PromotionType
  /* 2 */ val PromotionView: typings.mparticleWebSdk.mod.PromotionType.PromotionView & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with PromotionType
  /* 0 */ val Unknown: typings.mparticleWebSdk.mod.PromotionType.Unknown & Double = js.native
}
