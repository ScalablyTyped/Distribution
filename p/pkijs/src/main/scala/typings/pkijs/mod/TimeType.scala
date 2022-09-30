package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeType extends StObject
@JSImport("pkijs", "TimeType")
@js.native
object TimeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeType & Double] = js.native
  
  @js.native
  sealed trait GeneralizedTime
    extends StObject
       with TimeType
  /* 1 */ val GeneralizedTime: typings.pkijs.mod.TimeType.GeneralizedTime & Double = js.native
  
  @js.native
  sealed trait UTCTime
    extends StObject
       with TimeType
  /* 0 */ val UTCTime: typings.pkijs.mod.TimeType.UTCTime & Double = js.native
  
  @js.native
  sealed trait empty
    extends StObject
       with TimeType
  /* 2 */ val empty: typings.pkijs.mod.TimeType.empty & Double = js.native
}
