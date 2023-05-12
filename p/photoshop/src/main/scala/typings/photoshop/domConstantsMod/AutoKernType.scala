package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoKernType extends StObject
@JSImport("photoshop/dom/Constants", "AutoKernType")
@js.native
object AutoKernType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoKernType & String] = js.native
  
  @js.native
  sealed trait MANUAL
    extends StObject
       with AutoKernType
  /* "manual" */ val MANUAL: typings.photoshop.domConstantsMod.AutoKernType.MANUAL & String = js.native
  
  @js.native
  sealed trait METRICS
    extends StObject
       with AutoKernType
  /* "metricsKern" */ val METRICS: typings.photoshop.domConstantsMod.AutoKernType.METRICS & String = js.native
  
  @js.native
  sealed trait OPTICAL
    extends StObject
       with AutoKernType
  /* "opticalKern" */ val OPTICAL: typings.photoshop.domConstantsMod.AutoKernType.OPTICAL & String = js.native
}
