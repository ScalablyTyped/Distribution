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
import typings.fpTs.traversableMod.Traversable
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableMod.Traversable2
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traversalMod {
  
  @JSImport("monocle-ts/lib/Traversal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts/lib/Traversal", "URI")
  @js.native
  val URI: /* "monocle-ts/Traversal" */ String = js.native
  type URI = /* "monocle-ts/Traversal" */ String
  
  @scala.inline
  def atKey(key: String): js.Function1[
    /* sa */ Traversal[js.Any, Record[String, js.Any]], 
    Traversal[js.Any, Option_[js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Traversal[js.Any, Record[String, js.Any]], 
    Traversal[js.Any, Option_[js.Any]]
  ]]
  
  @JSImport("monocle-ts/lib/Traversal", "categoryTraversal")
  @js.native
  val categoryTraversal: Category2[typings.monocleTs.traversalMod.URI] = js.native
  
  @scala.inline
  def component[A /* <: js.Array[js.Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Traversal[js.Any, A], 
    Traversal[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Traversal[js.Any, A], 
    Traversal[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  @scala.inline
  def compose[A, B](ab: Traversal[A, B]): js.Function1[/* sa */ Traversal[js.Any, A], Traversal[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal[js.Any, A], Traversal[js.Any, B]]]
  
  @scala.inline
  def filter[A](predicate: Predicate[A]): js.Function1[/* sa */ Traversal[js.Any, A], Traversal[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal[js.Any, A], Traversal[js.Any, A]]]
  
  @scala.inline
  def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Traversal[js.Any, A], Traversal[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal[js.Any, A], Traversal[js.Any, B]]]
  
  @scala.inline
  def fold[A](M: Monoid[A]): js.Function1[/* sa */ Traversal[js.Any, A], js.Function1[/* s */ js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal[js.Any, A], js.Function1[/* s */ js.Any, A]]]
  
  @scala.inline
  def foldMap[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* sa */ Traversal[js.Any, js.Any], js.Function1[/* s */ js.Any, M]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Any, M], 
    js.Function1[/* sa */ Traversal[js.Any, js.Any], js.Function1[/* s */ js.Any, M]]
  ]]
  
  @scala.inline
  def fromTraversable[T](T: Traversable[T]): js.Function0[
    Traversal[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ js.Any, 
      js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ js.Any, 
      js.Any
    ]
  ]]
  @scala.inline
  def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](T: Traversable1[T]): js.Function0[
    Traversal[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any, 
      js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any, 
      js.Any
    ]
  ]]
  @scala.inline
  def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](T: Traversable2[T]): js.Function0[
    Traversal[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ js.Any, 
      js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ js.Any, 
      js.Any
    ]
  ]]
  
  @scala.inline
  def getAll[S](s: S): js.Function1[/* sa */ Traversal[S, js.Any], js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal[S, js.Any], js.Array[js.Any]]]
  
  @scala.inline
  def id[S](): Traversal[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Traversal[S, S]]
  
  @scala.inline
  def index(i: Double): js.Function1[/* sa */ Traversal[js.Any, js.Array[js.Any]], Traversal[js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal[js.Any, js.Array[js.Any]], Traversal[js.Any, js.Any]]]
  
  @scala.inline
  def key(key: String): js.Function1[/* sa */ Traversal[js.Any, Record[String, js.Any]], Traversal[js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal[js.Any, Record[String, js.Any]], Traversal[js.Any, js.Any]]]
  
  @scala.inline
  def left[S, E, A](sea: Traversal[S, Either_[E, A]]): Traversal[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[Traversal[S, E]]
  
  @scala.inline
  def modify[A](f: js.Function1[/* a */ A, A]): js.Function1[/* sa */ Traversal[js.Any, A], js.Function1[/* s */ js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal[js.Any, A], js.Function1[/* s */ js.Any, js.Any]]]
  
  @scala.inline
  def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Traversal[js.Any, A], 
    Traversal[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Traversal[js.Any, A], 
    Traversal[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  @scala.inline
  def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
    /* sa */ Traversal[js.Any, A], 
    Traversal[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any], props_2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* sa */ Traversal[js.Any, A], 
    Traversal[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def right[S, E, A](sea: Traversal[S, Either_[E, A]]): Traversal[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[Traversal[S, A]]
  
  @scala.inline
  def set[A](a: A): js.Function1[/* sa */ Traversal[js.Any, A], js.Function1[/* s */ js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Traversal[js.Any, A], js.Function1[/* s */ js.Any, js.Any]]]
  
  @scala.inline
  def some[S, A](soa: Traversal[S, Option_[A]]): Traversal[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[Traversal[S, A]]
  
  @scala.inline
  def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](T: Traversable1[T]): js.Function1[
    /* sta */ Traversal[
      js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any
    ], 
    Traversal[js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sta */ Traversal[
      js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any
    ], 
    Traversal[js.Any, js.Any]
  ]]
  
  @js.native
  trait ModifyF[S, A] extends StObject {
    
    def apply[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ js.Any
        ]
      ] = js.native
    def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait Traversal[S, A] extends StObject {
    
    def modifyF[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ js.Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ js.Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ js.Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ js.Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ js.Any
        ]
      ] = js.native
  }
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
