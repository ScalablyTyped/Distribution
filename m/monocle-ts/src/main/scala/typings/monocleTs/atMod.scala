package typings.monocleTs

import typings.fpTs.eqMod.Eq
import typings.fpTs.optionMod.Option_
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import typings.monocleTs.isoMod.Iso_
import typings.monocleTs.lensMod.Lens_
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atMod {
  
  @JSImport("monocle-ts/lib/At", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def at[S, I, A](at: js.Function1[/* i */ I, Lens_[S, A]]): At_[S, I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("at")(at.asInstanceOf[js.Any]).asInstanceOf[At_[S, I, A]]
  
  inline def atReadonlyMap[K](E: Eq[K]): js.Function0[At_[ReadonlyMap[K, scala.Nothing], K, Option_[scala.Nothing]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atReadonlyMap")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function0[At_[ReadonlyMap[K, scala.Nothing], K, Option_[scala.Nothing]]]]
  
  inline def atReadonlyRecord[A](): At_[ReadonlyRecord_[String, A], String, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atReadonlyRecord")().asInstanceOf[At_[ReadonlyRecord_[String, A], String, Option_[A]]]
  
  inline def atReadonlySet[A](E: Eq[A]): At_[ReadonlySet[A], A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("atReadonlySet")(E.asInstanceOf[js.Any]).asInstanceOf[At_[ReadonlySet[A], A, Boolean]]
  
  inline def atRecord[A](): At_[ReadonlyRecord_[String, A], String, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atRecord")().asInstanceOf[At_[ReadonlyRecord_[String, A], String, Option_[A]]]
  
  inline def fromIso[T, S](iso: Iso_[T, S]): js.Function1[/* sia */ At_[S, Any, Any], At_[T, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso")(iso.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sia */ At_[S, Any, Any], At_[T, Any, Any]]]
  
  trait At_[S, I, A] extends StObject {
    
    def at(i: I): Lens_[S, A]
  }
  object At_ {
    
    inline def apply[S, I, A](at: I => Lens_[S, A]): At_[S, I, A] = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at))
      __obj.asInstanceOf[At_[S, I, A]]
    }
    
    extension [Self <: At_[?, ?, ?], S, I, A](x: Self & (At_[S, I, A])) {
      
      inline def setAt(value: I => Lens_[S, A]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    }
  }
}
