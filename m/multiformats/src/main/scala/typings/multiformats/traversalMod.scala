package typings.multiformats

import typings.multiformats.anon.Load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object traversalMod {
  
  @JSImport("multiformats/traversal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def walk(param0: Load): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
