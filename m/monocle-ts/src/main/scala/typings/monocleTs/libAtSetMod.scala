package typings.monocleTs

import typings.fpTs.libEqMod.Eq
import typings.monocleTs.mod.At_
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAtSetMod {
  
  @JSImport("monocle-ts/lib/At/Set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atSet[A](E: Eq[A]): At_[Set[A], A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("atSet")(E.asInstanceOf[js.Any]).asInstanceOf[At_[Set[A], A, Boolean]]
}
