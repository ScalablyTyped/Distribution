package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.anon.Leading
import typings.miscUtilsOfMineGeneric.anon.Minutes
import typings.miscUtilsOfMineGeneric.distSrcTimeAnimMod.AnimateOptions
import typings.miscUtilsOfMineGeneric.distSrcTimeAnimMod.Timing
import typings.miscUtilsOfMineGeneric.distSrcTimeAnimMod.TimingObject
import typings.miscUtilsOfMineGeneric.distSrcTimeNextTimeMod.NextTimeConfig
import typings.miscUtilsOfMineGeneric.distSrcTimeWaitForMod.WaitForPredicateOptions
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.MMSlashDDSlashYYYY
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.`YYYY-MM-DDTHHColonMMZ`
import typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.`YYYY-MM-DD`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTimeMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animate(param0: AnimateOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def blockFor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockFor")().asInstanceOf[Unit]
  inline def blockFor(ms: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockFor")(ms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object easing {
    
    @JSImport("misc-utils-of-mine-generic/dist/src/time", "easing")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * “bow shooting”. First we “pull the bowstring”, and then “shoot”.
      * @param x “elasticity coefficient”. The distance of “bowstring pulling” is defined by it. Default value 1.5.
      */
    inline def back(): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    inline def back(x: Double): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    
    inline def bounceEaseInOut(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceEaseInOut")().asInstanceOf[Timing]
    
    /**
      * Imagine we are dropping a ball. It falls down, then bounces back a few times and stops. The bounce function does the same, but in the reverse order: “bouncing” starts immediately.
      * */
    inline def bounceEasyOut(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceEasyOut")().asInstanceOf[Timing]
    
    inline def easeInBounce(): TimingObject = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInBounce")().asInstanceOf[TimingObject]
    
    inline def easeInCubic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInCubic")().asInstanceOf[Timing]
    
    inline def easeInElastic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInElastic")().asInstanceOf[Timing]
    
    inline def easeInExpo(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInExpo")().asInstanceOf[Timing]
    
    inline def easeInOutBack(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBack")().asInstanceOf[Timing]
    
    inline def easeInOutBounce(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBounce")().asInstanceOf[Timing]
    
    inline def easeInOutCubic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutCubic")().asInstanceOf[Timing]
    
    inline def easeInOutElastic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutElastic")().asInstanceOf[Timing]
    
    inline def easeInOutExpo(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutExpo")().asInstanceOf[Timing]
    
    inline def easeInOutQuad(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuad")().asInstanceOf[Timing]
    
    @JSImport("misc-utils-of-mine-generic/dist/src/time", "easing.easeInOutQuart")
    @js.native
    val easeInOutQuart: Timing = js.native
    
    inline def easeInOutQuint(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuint")().asInstanceOf[Timing]
    
    inline def easeInQuad(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInQuad")().asInstanceOf[Timing]
    
    @JSImport("misc-utils-of-mine-generic/dist/src/time", "easing.easeInQuart")
    @js.native
    val easeInQuart: Timing = js.native
    
    @JSImport("misc-utils-of-mine-generic/dist/src/time", "easing.easeInQuint")
    @js.native
    val easeInQuint: Timing = js.native
    
    inline def easeInSine(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInSine")().asInstanceOf[Timing]
    
    inline def easeOutBack(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBack")().asInstanceOf[Timing]
    
    inline def easeOutBounce(): TimingObject = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBounce")().asInstanceOf[TimingObject]
    
    inline def easeOutCubic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutCubic")().asInstanceOf[Timing]
    
    inline def easeOutElastic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutElastic")().asInstanceOf[Timing]
    
    inline def easeOutQuad(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuad")().asInstanceOf[Timing]
    
    inline def easeOutQuint(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuint")().asInstanceOf[Timing]
    
    /**
      * @param x “initial range”
      */
    inline def elastic(): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("elastic")().asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    inline def elastic(x: Double): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("elastic")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    
    /**
      * parabolic curve
      */
    inline def quad(timeFraction: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quad")(timeFraction.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  inline def formatDate(date: js.Date, format: `YYYY-MM-DD` | MMSlashDDSlashYYYY): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatDateTimeForSql(date: js.Date): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDateTimeForSql")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def formatDateTime_YYYYMMDDTHHMMZ(date: js.Date, format: `YYYY-MM-DDTHHColonMMZ`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateTime")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def nextTime(config: NextTimeConfig): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTime")(config.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def printMs(ms: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printMs")(ms.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def printMs(ms: Double, config: Minutes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printMs")(ms.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def throttle[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, wait: Double): js.ThisFunction0[/* this */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ Any, Any]]
  inline def throttle[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, wait: Double, options: Leading): js.ThisFunction0[/* this */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ Any, Any]]
  
  inline def timeHash(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeHash")().asInstanceOf[String]
  inline def timeHash(digits: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeHash")(digits.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def waitForPredicate[T](p: js.Function1[/* repeated */ Any, js.UndefOr[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPredicate")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def waitForPredicate[T](p: js.Function1[/* repeated */ Any, js.UndefOr[T]], options: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForPredicate")(p.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def waitForPredicate[T](p: js.Function1[/* repeated */ Any, js.UndefOr[T]], options: WaitForPredicateOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForPredicate")(p.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time", "wait")
  @js.native
  val wait_ : js.Function1[/* ms */ Double, js.Promise[Unit]] = js.native
  
  inline def withTime[T](label: String, fn: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("withTime")(label.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
}
