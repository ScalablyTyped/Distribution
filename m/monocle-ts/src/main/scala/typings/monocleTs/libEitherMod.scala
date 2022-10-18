package typings.monocleTs

import typings.fpTs.libEitherMod.Either_
import typings.monocleTs.mod.Prism_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEitherMod {
  
  @JSImport("monocle-ts/lib/Either", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def left[E, A](): Prism_[Either_[E, A], E] = ^.asInstanceOf[js.Dynamic].applyDynamic("_left")().asInstanceOf[Prism_[Either_[E, A], E]]
  
  inline def right[E, A](): Prism_[Either_[E, A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("_right")().asInstanceOf[Prism_[Either_[E, A], A]]
}
