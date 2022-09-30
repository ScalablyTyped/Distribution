package typings.monocleTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.categoryMod.Category2
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.invariantMod.Invariant2
import typings.fpTs.optionMod.Option_
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.semigroupoidMod.Semigroupoid2
import typings.fpTs.traversableMod.Traversable1
import typings.monocleTs.isoMod.Iso_
import typings.monocleTs.lensMod.Lens_
import typings.monocleTs.optionalMod.Optional_
import typings.monocleTs.traversalMod.Traversal_
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prismMod {
  
  @JSImport("monocle-ts/lib/Prism", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts/lib/Prism", "Category")
  @js.native
  val Category: Category2[typings.monocleTs.prismMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Prism", "Invariant")
  @js.native
  val Invariant: Invariant2[typings.monocleTs.prismMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Prism", "Semigroupoid")
  @js.native
  val Semigroupoid: Semigroupoid2[typings.monocleTs.prismMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Prism", "URI")
  @js.native
  val URI: /* "monocle-ts/Prism" */ String = js.native
  type URI = /* "monocle-ts/Prism" */ String
  
  inline def asOptional[S, A](sa: Prism_[S, A]): Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asOptional")(sa.asInstanceOf[js.Any]).asInstanceOf[Optional_[S, A]]
  
  inline def asTraversal[S, A](sa: Prism_[S, A]): Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[Traversal_[S, A]]
  
  inline def atKey(key: String): js.Function1[/* sa */ Prism_[Any, Record[String, Any]], Optional_[Any, Option_[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, Record[String, Any]], Optional_[Any, Option_[Any]]]]
  
  inline def component[A /* <: js.Array[Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Prism_[Any, A], 
    Optional_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Prism_[Any, A], 
    Optional_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def compose[A, B](ab: Prism_[A, B]): js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]]]
  
  inline def composeIso[A, B](ab: Iso_[A, B]): js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIso")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]]]
  
  inline def composeLens[A, B](ab: Lens_[A, B]): js.Function1[/* sa */ Prism_[Any, A], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], Optional_[Any, B]]]
  
  inline def composeOptional[A, B](ab: Optional_[A, B]): js.Function1[/* sa */ Prism_[Any, A], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], Optional_[Any, B]]]
  
  inline def composePrism[A, B](ab: Prism_[A, B]): js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]]]
  
  inline def composeTraversal[A, B](ab: Traversal_[A, B]): js.Function1[/* sa */ Prism_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTraversal")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], Traversal_[Any, B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, A]]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]]]
  
  inline def findFirst[A](predicate: Predicate[A]): js.Function1[/* sa */ Prism_[Any, js.Array[A]], Optional_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, js.Array[A]], Optional_[Any, A]]]
  
  inline def findFirstNonEmpty[A](predicate: Predicate[A]): js.Function1[/* sa */ Prism_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, A]]]
  
  inline def findFirstNonEmpty_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Prism_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, B]]]
  
  inline def findFirst_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Prism_[Any, js.Array[A]], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, js.Array[A]], Optional_[Any, B]]]
  
  inline def fromNullable[S, A](sa: Prism_[S, A]): Prism_[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, NonNullable[A]]]
  
  inline def fromPredicate[A](predicate: Predicate[A]): Prism_[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[Prism_[A, A]]
  
  inline def fromPredicate_SA[S, A /* <: S */](refinement: Refinement[S, A]): Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, A]]
  
  inline def id[S](): Prism_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Prism_[S, S]]
  
  inline def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], Prism_[Any, B]]]
  
  inline def index(i: Double): js.Function1[/* sa */ Prism_[Any, js.Array[Any]], Optional_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, js.Array[Any]], Optional_[Any, Any]]]
  
  inline def indexNonEmpty(i: Double): js.Function1[/* sa */ Prism_[Any, ReadonlyNonEmptyArray_[Any]], Optional_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexNonEmpty")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, ReadonlyNonEmptyArray_[Any]], Optional_[Any, Any]]]
  
  inline def key(key: String): js.Function1[/* sa */ Prism_[Any, Record[String, Any]], Optional_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, Record[String, Any]], Optional_[Any, Any]]]
  
  inline def left[S, E, A](sea: Prism_[S, Either_[E, A]]): Prism_[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, E]]
  
  inline def modify[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[/* sa */ Prism_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], js.Function1[/* s */ Any, Any]]]
  
  inline def modifyF[F](F: Applicative[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Prism_[Any, Any], 
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
      /* sa */ Prism_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
      ]
    ]
  ]]
  inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Prism_[Any, Any], 
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
      /* sa */ Prism_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
      ]
    ]
  ]]
  inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Prism_[Any, Any], 
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
      /* sa */ Prism_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
      ]
    ]
  ]]
  inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Prism_[Any, Any], 
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
      /* sa */ Prism_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
      ]
    ]
  ]]
  
  inline def modifyOption[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[/* sa */ Prism_[Any, A], js.Function1[/* s */ Any, Option_[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyOption")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], js.Function1[/* s */ Any, Option_[Any]]]]
  
  inline def prism[S, A](getOption: js.Function1[/* s */ S, Option_[A]], reverseGet: js.Function1[/* a */ A, S]): Prism_[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("prism")(getOption.asInstanceOf[js.Any], reverseGet.asInstanceOf[js.Any])).asInstanceOf[Prism_[S, A]]
  
  inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Prism_[Any, A], 
    Optional_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Prism_[Any, A], 
    Optional_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
    /* sa */ Prism_[Any, A], 
    Optional_[
      Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")((scala.List(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any])).`++`(props_2.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[
    /* sa */ Prism_[Any, A], 
    Optional_[
      Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ]]
  
  inline def right[S, E, A](sea: Prism_[S, Either_[E, A]]): Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, A]]
  
  inline def set[A](a: A): js.Function1[/* sa */ Prism_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Prism_[Any, A], js.Function1[/* s */ Any, Any]]]
  
  inline def some[S, A](soa: Prism_[S, Option_[A]]): Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, A]]
  
  inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function1[
    /* sta */ Prism_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
    ], 
    Traversal_[Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sta */ Prism_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
    ], 
    Traversal_[Any, Any]
  ]]
  
  trait Prism_[S, A] extends StObject {
    
    def getOption(s: S): Option_[A]
    
    def reverseGet(a: A): S
  }
  object Prism_ {
    
    inline def apply[S, A](getOption: S => Option_[A], reverseGet: A => S): Prism_[S, A] = {
      val __obj = js.Dynamic.literal(getOption = js.Any.fromFunction1(getOption), reverseGet = js.Any.fromFunction1(reverseGet))
      __obj.asInstanceOf[Prism_[S, A]]
    }
    
    extension [Self <: Prism_[?, ?], S, A](x: Self & (Prism_[S, A])) {
      
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
