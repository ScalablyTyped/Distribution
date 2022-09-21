package typings.monocleTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.categoryMod.Category2
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.semigroupoidMod.Semigroupoid2
import typings.fpTs.traversableMod.Traversable
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableMod.Traversable2
import typings.fpTs.traversableMod.Traversable3
import typings.monocleTs.isoMod.Iso_
import typings.monocleTs.lensMod.Lens_
import typings.monocleTs.optionalMod.Optional_
import typings.monocleTs.prismMod.Prism_
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traversalMod {
  
  @JSImport("monocle-ts/lib/Traversal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts/lib/Traversal", "Category")
  @js.native
  val Category: Category2[typings.monocleTs.traversalMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Traversal", "Semigroupoid")
  @js.native
  val Semigroupoid: Semigroupoid2[typings.monocleTs.traversalMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Traversal", "URI")
  @js.native
  val URI: /* "monocle-ts/Traversal" */ String = js.native
  type URI = /* "monocle-ts/Traversal" */ String
  
  inline def atKey(key: String): js.Function1[/* sa */ Traversal_[Any, Record[String, Any]], Traversal_[Any, Option_[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, Record[String, Any]], Traversal_[Any, Option_[Any]]]]
  
  inline def component[A /* <: js.Array[Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Traversal_[Any, A], 
    Traversal_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Traversal_[Any, A], 
    Traversal_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def compose[A, B](ab: Traversal_[A, B]): js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]]]
  
  inline def composeIso[A, B](ab: Iso_[A, B]): js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIso")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]]]
  
  inline def composeLens[A, B](ab: Lens_[A, B]): js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]]]
  
  inline def composeOptional[A, B](ab: Optional_[A, B]): js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]]]
  
  inline def composePrism[A, B](ab: Prism_[A, B]): js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]]]
  
  inline def composeTraversal[A, B](ab: Traversal_[A, B]): js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTraversal")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, A]]]
  
  inline def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], Traversal_[Any, B]]]
  
  inline def findFirst[A](predicate: Predicate[A]): js.Function1[/* sa */ Traversal_[Any, js.Array[A]], Traversal_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, js.Array[A]], Traversal_[Any, A]]]
  
  inline def findFirstNonEmpty[A](predicate: Predicate[A]): js.Function1[/* sa */ Traversal_[Any, ReadonlyNonEmptyArray_[A]], Traversal_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, ReadonlyNonEmptyArray_[A]], Traversal_[Any, A]]]
  
  inline def findFirstNonEmpty_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Traversal_[Any, ReadonlyNonEmptyArray_[A]], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, ReadonlyNonEmptyArray_[A]], Traversal_[Any, B]]]
  
  inline def findFirst_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Traversal_[Any, js.Array[A]], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, js.Array[A]], Traversal_[Any, B]]]
  
  inline def fold[A](M: Monoid[A]): js.Function1[/* sa */ Traversal_[Any, A], js.Function1[/* s */ Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], js.Function1[/* s */ Any, A]]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, M], 
    js.Function1[/* sa */ Traversal_[Any, Any], js.Function1[/* s */ Any, M]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, M], 
    js.Function1[/* sa */ Traversal_[Any, Any], js.Function1[/* s */ Any, M]]
  ]]
  
  inline def fromNullable[S, A](sa: Traversal_[S, A]): Traversal_[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[Traversal_[S, NonNullable[A]]]
  
  inline def fromTraversable[T](T: Traversable[T]): js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ Any, 
      Any
    ]
  ]]
  inline def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any, 
      Any
    ]
  ]]
  inline def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](T: Traversable2[T]): js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ Any, 
      Any
    ]
  ]]
  inline def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](T: Traversable3[T]): js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ Any, 
      Any
    ]
  ]]
  
  inline def getAll[S](s: S): js.Function1[/* sa */ Traversal_[S, Any], js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[S, Any], js.Array[Any]]]
  
  inline def id[S](): Traversal_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Traversal_[S, S]]
  
  inline def index(i: Double): js.Function1[/* sa */ Traversal_[Any, js.Array[Any]], Traversal_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, js.Array[Any]], Traversal_[Any, Any]]]
  
  inline def indexNonEmpty(i: Double): js.Function1[/* sa */ Traversal_[Any, ReadonlyNonEmptyArray_[Any]], Traversal_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexNonEmpty")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, ReadonlyNonEmptyArray_[Any]], Traversal_[Any, Any]]]
  
  inline def key(key: String): js.Function1[/* sa */ Traversal_[Any, Record[String, Any]], Traversal_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, Record[String, Any]], Traversal_[Any, Any]]]
  
  inline def left[S, E, A](sea: Traversal_[S, Either_[E, A]]): Traversal_[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[Traversal_[S, E]]
  
  inline def modify[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[/* sa */ Traversal_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], js.Function1[/* s */ Any, Any]]]
  
  inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Traversal_[Any, A], 
    Traversal_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Traversal_[Any, A], 
    Traversal_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
    /* sa */ Traversal_[Any, A], 
    Traversal_[
      Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")((List(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any])).`++`(props_2.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[
    /* sa */ Traversal_[Any, A], 
    Traversal_[
      Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ]]
  
  inline def right[S, E, A](sea: Traversal_[S, Either_[E, A]]): Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[Traversal_[S, A]]
  
  inline def set[A](a: A): js.Function1[/* sa */ Traversal_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal_[Any, A], js.Function1[/* s */ Any, Any]]]
  
  inline def some[S, A](soa: Traversal_[S, Option_[A]]): Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[Traversal_[S, A]]
  
  inline def traversal[S, A](modifyF: ModifyF[S, A]): Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("traversal")(modifyF.asInstanceOf[js.Any]).asInstanceOf[Traversal_[S, A]]
  
  inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function1[
    /* sta */ Traversal_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
    ], 
    Traversal_[Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sta */ Traversal_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
    ], 
    Traversal_[Any, Any]
  ]]
  
  @js.native
  trait ModifyF[S, A] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
        ]
      ] = js.native
  }
  
  @js.native
  trait Traversal_[S, A] extends StObject {
    
    def modifyF[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
        ]
      ] = js.native
  }
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
