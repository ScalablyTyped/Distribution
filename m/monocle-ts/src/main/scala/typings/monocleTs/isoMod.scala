package typings.monocleTs

import typings.fpTs.categoryMod.Category2
import typings.fpTs.invariantMod.Invariant2
import typings.monocleTs.lensMod.Lens
import typings.monocleTs.optionalMod.Optional
import typings.monocleTs.prismMod.Prism
import typings.monocleTs.traversalMod.Traversal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isoMod {
  
  @JSImport("monocle-ts/lib/Iso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts/lib/Iso", "URI")
  @js.native
  val URI: /* "monocle-ts/Iso" */ String = js.native
  type URI = /* "monocle-ts/Iso" */ String
  
  @scala.inline
  def asLens[S, A](sa: Iso[S, A]): Lens[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asLens")(sa.asInstanceOf[js.Any]).asInstanceOf[Lens[S, A]]
  
  @scala.inline
  def asOptional[S, A](sa: Iso[S, A]): Optional[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asOptional")(sa.asInstanceOf[js.Any]).asInstanceOf[Optional[S, A]]
  
  @scala.inline
  def asPrism[S, A](sa: Iso[S, A]): Prism[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asPrism")(sa.asInstanceOf[js.Any]).asInstanceOf[Prism[S, A]]
  
  @scala.inline
  def asTraversal[S, A](sa: Iso[S, A]): Traversal[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[Traversal[S, A]]
  
  @JSImport("monocle-ts/lib/Iso", "categoryIso")
  @js.native
  val categoryIso: Category2[typings.monocleTs.isoMod.URI] = js.native
  
  @scala.inline
  def compose[A, B](ab: Iso[A, B]): js.Function1[/* sa */ Iso[js.Any, A], Iso[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso[js.Any, A], Iso[js.Any, B]]]
  
  @scala.inline
  def id[S](): Iso[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Iso[S, S]]
  
  @scala.inline
  def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[/* sa */ Iso[js.Any, A], Iso[js.Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* sa */ Iso[js.Any, A], Iso[js.Any, B]]]
  
  @JSImport("monocle-ts/lib/Iso", "invariantIso")
  @js.native
  val invariantIso: Invariant2[typings.monocleTs.isoMod.URI] = js.native
  
  @scala.inline
  def modify[A](f: js.Function1[/* a */ A, A]): js.Function1[/* sa */ Iso[js.Any, A], js.Function1[/* s */ js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso[js.Any, A], js.Function1[/* s */ js.Any, js.Any]]]
  
  @scala.inline
  def reverse[S, A](sa: Iso[S, A]): Iso[A, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(sa.asInstanceOf[js.Any]).asInstanceOf[Iso[A, S]]
  
  trait Iso[S, A] extends StObject {
    
    def get(s: S): A
    
    def reverseGet(a: A): S
  }
  object Iso {
    
    @scala.inline
    def apply[S, A](get: S => A, reverseGet: A => S): Iso[S, A] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), reverseGet = js.Any.fromFunction1(reverseGet))
      __obj.asInstanceOf[Iso[S, A]]
    }
    
    @scala.inline
    implicit class IsoMutableBuilder[Self <: Iso[?, ?], S, A] (val x: Self & (Iso[S, A])) extends AnyVal {
      
      @scala.inline
      def setGet(value: S => A): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReverseGet(value: A => S): Self = StObject.set(x, "reverseGet", js.Any.fromFunction1(value))
    }
  }
  
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
