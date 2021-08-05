package typings.monocleTs

import typings.fpTs.eqMod.Eq
import typings.monocleTs.mod.At_
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlySetMod {
  
  @JSImport("monocle-ts/lib/At/ReadonlySet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atReadonlySet[A](E: Eq[A]): At_[ReadonlySet[A], A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("atReadonlySet")(E.asInstanceOf[js.Any]).asInstanceOf[At_[ReadonlySet[A], A, Boolean]]
}
