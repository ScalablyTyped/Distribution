package typings.monocleTs

import typings.fpTs.libCategoryMod.Category2
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libFunctionMod.Predicate
import typings.fpTs.libFunctionMod.Refinement
import typings.fpTs.libFunctorMod.Functor
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libFunctorMod.Functor3
import typings.fpTs.libInvariantMod.Invariant2
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libReadonlyRecordMod.ReadonlyRecord_
import typings.fpTs.libSemigroupoidMod.Semigroupoid2
import typings.fpTs.libTraversableMod.Traversable1
import typings.monocleTs.libIsoMod.Iso_
import typings.monocleTs.libOptionalMod.Optional_
import typings.monocleTs.libPrismMod.Prism_
import typings.monocleTs.libTraversalMod.Traversal_
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLensMod {
  
  @JSImport("monocle-ts/lib/Lens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts/lib/Lens", "Category")
  @js.native
  val Category: Category2[typings.monocleTs.libLensMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Lens", "Invariant")
  @js.native
  val Invariant: Invariant2[typings.monocleTs.libLensMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Lens", "Semigroupoid")
  @js.native
  val Semigroupoid: Semigroupoid2[typings.monocleTs.libLensMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Lens", "URI")
  @js.native
  val URI: /* "monocle-ts/Lens" */ String = js.native
  type URI = /* "monocle-ts/Lens" */ String
  
  inline def asOptional[S, A](sa: Lens_[S, A]): Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asOptional")(sa.asInstanceOf[js.Any]).asInstanceOf[Optional_[S, A]]
  
  inline def asTraversal[S, A](sa: Lens_[S, A]): Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[Traversal_[S, A]]
  
  inline def atKey(key: String): js.Function1[/* sa */ Lens_[Any, ReadonlyRecord_[String, Any]], Lens_[Any, Option_[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, ReadonlyRecord_[String, Any]], Lens_[Any, Option_[Any]]]]
  
  inline def component[A /* <: js.Array[Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Lens_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Lens_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def compose[A, B](ab: Lens_[A, B]): js.Function1[/* sa */ Lens_[Any, A], Lens_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], Lens_[Any, B]]]
  
  inline def composeIso[A, B](ab: Iso_[A, B]): js.Function1[/* sa */ Lens_[Any, A], Lens_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIso")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], Lens_[Any, B]]]
  
  inline def composeLens[A, B](ab: Lens_[A, B]): js.Function1[/* sa */ Lens_[Any, A], Lens_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], Lens_[Any, B]]]
  
  inline def composeOptional[A, B](ab: Optional_[A, B]): js.Function1[/* sa */ Lens_[Any, A], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], Optional_[Any, B]]]
  
  inline def composePrism[A, B](ab: Prism_[A, B]): js.Function1[/* sa */ Lens_[Any, A], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], Optional_[Any, B]]]
  
  inline def composeTraversal[A, B](ab: Traversal_[A, B]): js.Function1[/* sa */ Lens_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTraversal")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], Traversal_[Any, B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* sa */ Lens_[Any, A], Optional_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], Optional_[Any, A]]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Lens_[Any, A], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], Optional_[Any, B]]]
  
  inline def findFirst[A](predicate: Predicate[A]): js.Function1[/* sa */ Lens_[Any, js.Array[A]], Optional_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, js.Array[A]], Optional_[Any, A]]]
  
  inline def findFirstNonEmpty[A](predicate: Predicate[A]): js.Function1[/* sa */ Lens_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, A]]]
  
  inline def findFirstNonEmpty_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Lens_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, B]]]
  
  inline def findFirst_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Lens_[Any, js.Array[A]], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, js.Array[A]], Optional_[Any, B]]]
  
  inline def fromNullable[S, A](sa: Lens_[S, A]): Optional_[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[Optional_[S, NonNullable[A]]]
  
  inline def id[S](): Lens_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Lens_[S, S]]
  
  inline def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[/* sa */ Lens_[Any, A], Lens_[Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], Lens_[Any, B]]]
  
  inline def index(i: Double): js.Function1[/* sa */ Lens_[Any, js.Array[Any]], Optional_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, js.Array[Any]], Optional_[Any, Any]]]
  
  inline def indexNonEmpty(i: Double): js.Function1[/* sa */ Lens_[Any, ReadonlyNonEmptyArray_[Any]], Optional_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexNonEmpty")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, ReadonlyNonEmptyArray_[Any]], Optional_[Any, Any]]]
  
  inline def key(key: String): js.Function1[/* sa */ Lens_[Any, Record[String, Any]], Optional_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, Record[String, Any]], Optional_[Any, Any]]]
  
  inline def left[S, E, A](sea: Lens_[S, Either_[E, A]]): Optional_[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[Optional_[S, E]]
  
  inline def lens[S, A](get: js.Function1[/* s */ S, A], set: js.Function1[/* a */ A, js.Function1[/* s */ S, S]]): Lens_[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lens")(get.asInstanceOf[js.Any], set.asInstanceOf[js.Any])).asInstanceOf[Lens_[S, A]]
  
  inline def modify[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[/* sa */ Lens_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Lens_[Any, A], js.Function1[/* s */ Any, Any]]]
  
  inline def modifyF[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Lens_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Lens_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
      ]
    ]
  ]]
  inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Lens_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Lens_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
      ]
    ]
  ]]
  inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Lens_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Lens_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
      ]
    ]
  ]]
  inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Lens_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Lens_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
      ]
    ]
  ]]
  
  inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Lens_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Lens_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def props[A, P /* <: /* keyof A */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param props because its type [P, P, ...ReadonlyArray<P>] is not an array type */ props: Array[P]
  ): js.Function1[
    /* sa */ Lens_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in P ]: A[K]} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("props")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Lens_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in P ]: A[K]} */ js.Any
    ]
  ]]
  
  inline def right[S, E, A](sea: Lens_[S, Either_[E, A]]): Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[Optional_[S, A]]
  
  inline def some[S, A](soa: Lens_[S, Option_[A]]): Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[Optional_[S, A]]
  
  inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function1[
    /* sta */ Lens_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
    ], 
    Traversal_[Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sta */ Lens_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
    ], 
    Traversal_[Any, Any]
  ]]
  
  trait Lens_[S, A] extends StObject {
    
    def get(s: S): A
    
    def set(a: A): js.Function1[/* s */ S, S]
  }
  object Lens_ {
    
    inline def apply[S, A](get: S => A, set: A => js.Function1[/* s */ S, S]): Lens_[S, A] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Lens_[S, A]]
    }
    
    extension [Self <: Lens_[?, ?], S, A](x: Self & (Lens_[S, A])) {
      
      inline def setGet(value: S => A): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: A => js.Function1[/* s */ S, S]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
