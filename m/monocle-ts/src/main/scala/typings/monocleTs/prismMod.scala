package typings.monocleTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.categoryMod.Category2
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.invariantMod.Invariant2
import typings.fpTs.optionMod.Option_
import typings.fpTs.traversableMod.Traversable1
import typings.monocleTs.lensMod.Lens
import typings.monocleTs.optionalMod.Optional
import typings.monocleTs.traversalMod.Traversal
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prismMod {
  
  @JSImport("monocle-ts/lib/Prism", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts/lib/Prism", "URI")
  @js.native
  val URI: /* "monocle-ts/Prism" */ String = js.native
  type URI = /* "monocle-ts/Prism" */ String
  
  inline def asOptional[S, A](sa: Prism[S, A]): Optional[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asOptional")(sa.asInstanceOf[js.Any]).asInstanceOf[Optional[S, A]]
  
  inline def asTraversal[S, A](sa: Prism[S, A]): Traversal[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[Traversal[S, A]]
  
  inline def atKey(key: String): js.Function1[/* sa */ Prism[js.Any, Record[String, js.Any]], Optional[js.Any, Option_[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, Record[String, js.Any]], Optional[js.Any, Option_[js.Any]]]]
  
  @JSImport("monocle-ts/lib/Prism", "categoryPrism")
  @js.native
  val categoryPrism: Category2[typings.monocleTs.prismMod.URI] = js.native
  
  inline def component[A /* <: js.Array[js.Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Prism[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Prism[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def compose[A, B](ab: Prism[A, B]): js.Function1[/* sa */ Prism[js.Any, A], Prism[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, A], Prism[js.Any, B]]]
  
  inline def composeLens[A, B](ab: Lens[A, B]): js.Function1[/* sa */ Prism[js.Any, A], Optional[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, A], Optional[js.Any, B]]]
  
  inline def composeOptional[A, B](ab: Optional[A, B]): js.Function1[/* sa */ Prism[js.Any, A], Optional[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, A], Optional[js.Any, B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* sa */ Prism[js.Any, A], Prism[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, A], Prism[js.Any, A]]]
  
  inline def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Prism[js.Any, A], Prism[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, A], Prism[js.Any, B]]]
  
  inline def findFirst[A](predicate: Predicate[A]): js.Function1[/* sa */ Prism[js.Any, js.Array[A]], Optional[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, js.Array[A]], Optional[js.Any, A]]]
  
  inline def fromNullable[S, A](sa: Prism[S, A]): Prism[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[Prism[S, NonNullable[A]]]
  
  inline def fromPredicate[A](predicate: Predicate[A]): Prism[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[Prism[A, A]]
  
  inline def fromPredicate_SA_S[S, A /* <: S */](refinement: Refinement[S, A]): Prism[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[Prism[S, A]]
  
  inline def id[S](): Prism[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Prism[S, S]]
  
  inline def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[/* sa */ Prism[js.Any, A], Prism[js.Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, A], Prism[js.Any, B]]]
  
  inline def index(i: Double): js.Function1[/* sa */ Prism[js.Any, js.Array[js.Any]], Optional[js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, js.Array[js.Any]], Optional[js.Any, js.Any]]]
  
  @JSImport("monocle-ts/lib/Prism", "invariantPrism")
  @js.native
  val invariantPrism: Invariant2[typings.monocleTs.prismMod.URI] = js.native
  
  inline def key(key: String): js.Function1[/* sa */ Prism[js.Any, Record[String, js.Any]], Optional[js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, Record[String, js.Any]], Optional[js.Any, js.Any]]]
  
  inline def left[S, E, A](sea: Prism[S, Either_[E, A]]): Prism[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[Prism[S, E]]
  
  inline def modify[A](f: js.Function1[/* a */ A, A]): js.Function1[/* sa */ Prism[js.Any, A], js.Function1[/* s */ js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, A], js.Function1[/* s */ js.Any, js.Any]]]
  
  inline def modifyOption[A](f: js.Function1[/* a */ A, A]): js.Function1[/* sa */ Prism[js.Any, A], js.Function1[/* s */ js.Any, Option_[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyOption")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, A], js.Function1[/* s */ js.Any, Option_[js.Any]]]]
  
  inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Prism[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Prism[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
    /* sa */ Prism[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any], props_2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* sa */ Prism[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ]]
  
  inline def right[S, E, A](sea: Prism[S, Either_[E, A]]): Prism[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[Prism[S, A]]
  
  inline def set[A](a: A): js.Function1[/* sa */ Prism[js.Any, A], js.Function1[/* s */ js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism[js.Any, A], js.Function1[/* s */ js.Any, js.Any]]]
  
  inline def some[S, A](soa: Prism[S, Option_[A]]): Prism[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[Prism[S, A]]
  
  inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](T: Traversable1[T]): js.Function1[
    /* sta */ Prism[
      js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any
    ], 
    Traversal[js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sta */ Prism[
      js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any
    ], 
    Traversal[js.Any, js.Any]
  ]]
  
  trait Prism[S, A] extends StObject {
    
    def getOption(s: S): Option_[A]
    
    def reverseGet(a: A): S
  }
  object Prism {
    
    inline def apply[S, A](getOption: S => Option_[A], reverseGet: A => S): Prism[S, A] = {
      val __obj = js.Dynamic.literal(getOption = js.Any.fromFunction1(getOption), reverseGet = js.Any.fromFunction1(reverseGet))
      __obj.asInstanceOf[Prism[S, A]]
    }
    
    extension [Self <: Prism[?, ?], S, A](x: Self & (Prism[S, A])) {
      
      inline def setGetOption(value: S => Option_[A]): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
      
      inline def setReverseGet(value: A => S): Self = StObject.set(x, "reverseGet", js.Any.fromFunction1(value))
    }
  }
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
