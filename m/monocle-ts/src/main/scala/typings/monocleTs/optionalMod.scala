package typings.monocleTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.categoryMod.Category2
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.invariantMod.Invariant2
import typings.fpTs.optionMod.Option_
import typings.fpTs.traversableMod.Traversable1
import typings.monocleTs.traversalMod.Traversal
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionalMod {
  
  @JSImport("monocle-ts/lib/Optional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts/lib/Optional", "URI")
  @js.native
  val URI: /* "monocle-ts/Optional" */ String = js.native
  type URI = /* "monocle-ts/Optional" */ String
  
  inline def asTraversal[S, A](sa: Optional[S, A]): Traversal[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[Traversal[S, A]]
  
  inline def atKey(key: String): js.Function1[
    /* sa */ Optional[js.Any, Record[String, js.Any]], 
    Optional[js.Any, Option_[js.Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Optional[js.Any, Record[String, js.Any]], 
    Optional[js.Any, Option_[js.Any]]
  ]]
  
  @JSImport("monocle-ts/lib/Optional", "categoryOptional")
  @js.native
  val categoryOptional: Category2[typings.monocleTs.optionalMod.URI] = js.native
  
  inline def component[A /* <: js.Array[js.Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Optional[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Optional[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def compose[A, B](ab: Optional[A, B]): js.Function1[/* sa */ Optional[js.Any, A], Optional[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Optional[js.Any, A], Optional[js.Any, B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* sa */ Optional[js.Any, A], Optional[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Optional[js.Any, A], Optional[js.Any, A]]]
  
  inline def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Optional[js.Any, A], Optional[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Optional[js.Any, A], Optional[js.Any, B]]]
  
  inline def findFirst[A](predicate: Predicate[A]): js.Function1[/* sa */ Optional[js.Any, js.Array[A]], Optional[js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Optional[js.Any, js.Array[A]], Optional[js.Any, A]]]
  
  inline def fromNullable[S, A](sa: Optional[S, A]): Optional[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[Optional[S, NonNullable[A]]]
  
  inline def id[S](): Optional[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Optional[S, S]]
  
  inline def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Optional[js.Any, A], Optional[js.Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Optional[js.Any, A], Optional[js.Any, B]]]
  
  inline def index(i: Double): js.Function1[/* sa */ Optional[js.Any, js.Array[js.Any]], Optional[js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Optional[js.Any, js.Array[js.Any]], Optional[js.Any, js.Any]]]
  
  @JSImport("monocle-ts/lib/Optional", "invariantOptional")
  @js.native
  val invariantOptional: Invariant2[typings.monocleTs.optionalMod.URI] = js.native
  
  inline def key(key: String): js.Function1[/* sa */ Optional[js.Any, Record[String, js.Any]], Optional[js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Optional[js.Any, Record[String, js.Any]], Optional[js.Any, js.Any]]]
  
  inline def left[S, E, A](sea: Optional[S, Either_[E, A]]): Optional[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[Optional[S, E]]
  
  inline def modify[A](f: js.Function1[/* a */ A, A]): js.Function1[/* optional */ Optional[js.Any, A], js.Function1[/* s */ js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* optional */ Optional[js.Any, A], js.Function1[/* s */ js.Any, js.Any]]]
  
  inline def modifyOption[A](f: js.Function1[/* a */ A, A]): js.Function1[/* optional */ Optional[js.Any, A], js.Function1[/* s */ js.Any, Option_[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyOption")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* optional */ Optional[js.Any, A], js.Function1[/* s */ js.Any, Option_[js.Any]]]]
  
  inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Optional[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Optional[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
    /* sa */ Optional[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any], props_2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* sa */ Optional[js.Any, A], 
    Optional[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in P ]: A[K]}
    */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
    ]
  ]]
  
  inline def right[S, E, A](sea: Optional[S, Either_[E, A]]): Optional[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[Optional[S, A]]
  
  inline def some[S, A](soa: Optional[S, Option_[A]]): Optional[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[Optional[S, A]]
  
  inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](T: Traversable1[T]): js.Function1[
    /* sta */ Optional[
      js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any
    ], 
    Traversal[js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sta */ Optional[
      js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ js.Any
    ], 
    Traversal[js.Any, js.Any]
  ]]
  
  trait Optional[S, A] extends StObject {
    
    def getOption(s: S): Option_[A]
    
    def set(a: A): js.Function1[/* s */ S, S]
  }
  object Optional {
    
    inline def apply[S, A](getOption: S => Option_[A], set: A => js.Function1[/* s */ S, S]): Optional[S, A] = {
      val __obj = js.Dynamic.literal(getOption = js.Any.fromFunction1(getOption), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Optional[S, A]]
    }
    
    extension [Self <: Optional[?, ?], S, A](x: Self & (Optional[S, A])) {
      
      inline def setGetOption(value: S => Option_[A]): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
      
      inline def setSet(value: A => js.Function1[/* s */ S, S]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
