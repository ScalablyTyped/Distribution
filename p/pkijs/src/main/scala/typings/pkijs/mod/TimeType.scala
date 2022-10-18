package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeType extends StObject
@JSImport("pkijs", "TimeType")
@js.native
object TimeType extends StObject {
  
  @js.native
  sealed trait GeneralizedTime
    extends StObject
       with TimeType
  
  @js.native
  sealed trait UTCTime
    extends StObject
       with TimeType
  
  @js.native
  sealed trait empty
    extends StObject
       with TimeType
}
