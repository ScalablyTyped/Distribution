package typings.monocleTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.categoryMod.Category2
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.invariantMod.Invariant2
import typings.fpTs.optionMod.Option_
import typings.fpTs.traversableMod.Traversable1
import typings.monocleTs.optionalMod.Optional
import typings.monocleTs.prismMod.Prism
import typings.monocleTs.traversalMod.Traversal
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lensMod {
  
  @JSImport("monocle-ts/lib/Lens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts/lib/Lens", "URI")
  @js.native
  val URI: /* "monocle-ts/Lens" */ String = js.native
  type URI = /* "monocle-ts/Lens" */ String
  
  @scala.inline
  def asOptional[S, A](sa: Lens[S, A]): Optional[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asOptional")(sa.asInstanceOf[js.Any]).asInstanceOf[Optional[S, A]]
  
  @scala.inline
  def asTraversal[S, A](sa: Lens[S, A]): Traversal[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[Traversal[S, A]]
  
  @scala.inline
  def atKey(key: String): js.Function1[/* sa */ Lens[js.Any, Record[String, js.Any]], Lens[js.Any, Option_[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, Record[String, js.Any]], Lens[js.Any, Option_[js.Any]]]]
  
  @JSImport("monocle-ts/lib/Lens", "categoryLens")
  @js.native
  val categoryLens: Category2[typings.monocleTs.lensMod.URI] = js.native
  
  @scala.inline
  def component[A /* <: js.Array[js.Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Lens[js.Any, A], 
    Lens[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Lens[js.Any, A], 
    Lens[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  @scala.inline
  def compose[A, B](ab: Lens[A, B]): js.Function1[/* sa */ Lens[js.Any, A], Lens[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, A], Lens[js.Any, B]]]
  
  @scala.inline
  def composeOptional[A, B](ab: Optional[A, B]): js.Function1[/* sa */ Lens[js.Any, A], Optional[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, A], Optional[js.Any, B]]]
  
  @scala.inline
  def composePrism[A, B](ab: Prism[A, B]): js.Function1[/* sa */ Lens[js.Any, A], Optional[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, A], Optional[js.Any, B]]]
  
  @scala.inline
  def filter[A](predicate: Predicate[A]): js.Function1[/* sa */ Lens[js.Any, A], Optional[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, A], Optional[js.Any, A]]]
  
  @scala.inline
  def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Lens[js.Any, A], Optional[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, A], Optional[js.Any, B]]]
  
  @scala.inline
  def findFirst[A](predicate: Predicate[A]): js.Function1[/* sa */ Lens[js.Any, js.Array[A]], Optional[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, js.Array[A]], Optional[js.Any, A]]]
  
  @scala.inline
  def fromNullable[S, A](sa: Lens[S, A]): Optional[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[Optional[S, NonNullable[A]]]
  
  @scala.inline
  def id[S](): Lens[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Lens[S, S]]
  
  @scala.inline
  def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[/* sa */ Lens[js.Any, A], Lens[js.Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, A], Lens[js.Any, B]]]
  
  @scala.inline
  def index(i: Double): js.Function1[/* sa */ Lens[js.Any, js.Array[js.Any]], Optional[js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, js.Array[js.Any]], Optional[js.Any, js.Any]]]
  
  @JSImport("monocle-ts/lib/Lens", "invariantLens")
  @js.native
  val invariantLens: Invariant2[typings.monocleTs.lensMod.URI] = js.native
  
  @scala.inline
  def key(key: String): js.Function1[/* sa */ Lens[js.Any, Record[String, js.Any]], Optional[js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, Record[String, js.Any]], Optional[js.Any, js.Any]]]
  
  @scala.inline
  def left[S, E, A](sea: Lens[S, Either_[E, A]]): Optional[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[Optional[S, E]]
  
  @scala.inline
  def modify[A](f: js.Function1[/* a */ A, A]): js.Function1[/* sa */ Lens[js.Any, A], js.Function1[/* s */ js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens[js.Any, A], js.Function1[/* s */ js.Any, js.Any]]]
  
  @scala.inline
  def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Lens[js.Any, A], 
    Lens[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Lens[js.Any, A], 
    Lens[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  @scala.inline
  def props[A, P /* <: /* keyof A */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param props because its type [P, P, ...Array<P>] is not an array type */ props: Array[P]
  ): js.Function1[
    /* sa */ Lens[js.Any, A], 
    Lens[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("props")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Lens[js.Any, A], 
    Lens[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def right[S, E, A](sea: Lens[S, Either_[E, A]]): Optional[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[Optional[S, A]]
  
  @scala.inline
  def some[S, A](soa: Lens[S, Option_[A]]): Optional[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[Optional[S, A]]
  
  @scala.inline
  def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](T: Traversable1[T]): js.Function1[
    /* sta */ Lens[
      js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any
    ], 
    Traversal[js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sta */ Lens[
      js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any
    ], 
    Traversal[js.Any, js.Any]
  ]]
  
  trait Lens[S, A] extends StObject {
    
    def get(s: S): A
    
    def set(a: A): js.Function1[/* s */ S, S]
  }
  object Lens {
    
    @scala.inline
    def apply[S, A](get: S => A, set: A => js.Function1[/* s */ S, S]): Lens[S, A] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Lens[S, A]]
    }
    
    @scala.inline
    implicit class LensMutableBuilder[Self <: Lens[?, ?], S, A] (val x: Self & (Lens[S, A])) extends AnyVal {
      
      @scala.inline
      def setGet(value: S => A): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: A => js.Function1[/* s */ S, S]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
