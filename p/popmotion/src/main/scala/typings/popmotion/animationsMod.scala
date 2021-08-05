package typings.popmotion

import typings.popmotion.anon.Stop
import typings.popmotion.typesMod.AnimationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsMod {
  
  @JSImport("popmotion/lib/animations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animate[V](
    hasFromAutoplayDriverElapsedRepeatMaxRepeatTypeRepeatDelayOnPlayOnStopOnCompleteOnRepeatOnUpdateOptions: AnimationOptions[V]
  ): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(hasFromAutoplayDriverElapsedRepeatMaxRepeatTypeRepeatDelayOnPlayOnStopOnCompleteOnRepeatOnUpdateOptions.asInstanceOf[js.Any]).asInstanceOf[Stop]
}
