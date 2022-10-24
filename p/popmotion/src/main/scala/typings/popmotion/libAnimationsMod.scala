package typings.popmotion

import typings.popmotion.anon.Stop
import typings.popmotion.libAnimationsTypesMod.AnimationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimationsMod {
  
  @JSImport("popmotion/lib/animations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animate[V](param0: AnimationOptions[V]): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(param0.asInstanceOf[js.Any]).asInstanceOf[Stop]
}
