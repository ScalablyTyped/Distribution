package typings.popmotion

import typings.popmotion.anon.Stop
import typings.popmotion.libAnimationsTypesMod.InertiaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimationsInertiaMod {
  
  @JSImport("popmotion/lib/animations/inertia", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inertia(param0: InertiaOptions): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("inertia")(param0.asInstanceOf[js.Any]).asInstanceOf[Stop]
}
