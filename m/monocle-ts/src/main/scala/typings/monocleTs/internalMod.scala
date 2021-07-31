package typings.monocleTs

import typings.fpTs.traversableMod.Traversable
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableMod.Traversable2
import typings.monocleTs.traversalMod.Traversal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("monocle-ts/lib/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
