package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmartBlurQuality extends StObject
@JSImport("photoshop/dom/Constants", "SmartBlurQuality")
@js.native
object SmartBlurQuality extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SmartBlurQuality & String] = js.native
  
  @js.native
  sealed trait HIGH
    extends StObject
       with SmartBlurQuality
  /* "smartBlurQualityHigh" */ val HIGH: typings.photoshop.domConstantsMod.SmartBlurQuality.HIGH & String = js.native
  
  @js.native
  sealed trait LOW
    extends StObject
       with SmartBlurQuality
  /* "smartBlurQualityLow" */ val LOW: typings.photoshop.domConstantsMod.SmartBlurQuality.LOW & String = js.native
  
  @js.native
  sealed trait MEDIUM
    extends StObject
       with SmartBlurQuality
  /* "smartBlurQualityMedium" */ val MEDIUM: typings.photoshop.domConstantsMod.SmartBlurQuality.MEDIUM & String = js.native
}
