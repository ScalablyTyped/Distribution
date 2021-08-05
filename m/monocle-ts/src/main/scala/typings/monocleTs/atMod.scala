package typings.monocleTs

import typings.fpTs.optionMod.Option_
import typings.monocleTs.isoMod.Iso
import typings.monocleTs.lensMod.Lens
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atMod {
  
  @JSImport("monocle-ts/lib/At", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atRecord[A](): At[Record[String, A], String, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atRecord")().asInstanceOf[At[Record[String, A], String, Option_[A]]]
  
  inline def fromIso[T, S](iso: Iso[T, S]): js.Function1[/* sia */ At[S, js.Any, js.Any], At[T, js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso")(iso.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sia */ At[S, js.Any, js.Any], At[T, js.Any, js.Any]]]
  
  trait At[S, I, A] extends StObject {
    
    def at(i: I): Lens[S, A]
  }
  object At {
    
    inline def apply[S, I, A](at: I => Lens[S, A]): At[S, I, A] = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at))
      __obj.asInstanceOf[At[S, I, A]]
    }
    
    extension [Self <: At[?, ?, ?], S, I, A](x: Self & (At[S, I, A])) {
      
      inline def setAt(value: I => Lens[S, A]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    }
  }
}
