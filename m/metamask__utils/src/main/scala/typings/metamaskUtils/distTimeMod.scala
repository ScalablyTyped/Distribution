package typings.metamaskUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimeMod {
  
  @JSImport("@metamask/utils/dist/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Duration extends StObject
  @JSImport("@metamask/utils/dist/time", "Duration")
  @js.native
  object Duration extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Duration & Double] = js.native
    
    /**
      * A day, in milliseconds.
      */
    @js.native
    sealed trait Day
      extends StObject
         with Duration
    /* 86400000 */ val Day: typings.metamaskUtils.distTimeMod.Duration.Day & Double = js.native
    
    /**
      * An hour, in milliseconds.
      */
    @js.native
    sealed trait Hour
      extends StObject
         with Duration
    /* 3600000 */ val Hour: typings.metamaskUtils.distTimeMod.Duration.Hour & Double = js.native
    
    /**
      * A millisecond.
      */
    @js.native
    sealed trait Millisecond
      extends StObject
         with Duration
    /* 1 */ val Millisecond: typings.metamaskUtils.distTimeMod.Duration.Millisecond & Double = js.native
    
    /**
      * A minute, in milliseconds.
      */
    @js.native
    sealed trait Minute
      extends StObject
         with Duration
    /* 60000 */ val Minute: typings.metamaskUtils.distTimeMod.Duration.Minute & Double = js.native
    
    /**
      * A second, in milliseconds.
      */
    @js.native
    sealed trait Second
      extends StObject
         with Duration
    /* 1000 */ val Second: typings.metamaskUtils.distTimeMod.Duration.Second & Double = js.native
    
    /**
      * A week, in milliseconds.
      */
    @js.native
    sealed trait Week
      extends StObject
         with Duration
    /* 604800000 */ val Week: typings.metamaskUtils.distTimeMod.Duration.Week & Double = js.native
    
    /**
      * A year, in milliseconds.
      */
    @js.native
    sealed trait Year
      extends StObject
         with Duration
    /* 31536000000.0 */ val Year: typings.metamaskUtils.distTimeMod.Duration.Year & Double = js.native
  }
  
  inline def inMilliseconds(count: Double, duration: Duration): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inMilliseconds")(count.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def timeSince(timestamp: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeSince")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
}
