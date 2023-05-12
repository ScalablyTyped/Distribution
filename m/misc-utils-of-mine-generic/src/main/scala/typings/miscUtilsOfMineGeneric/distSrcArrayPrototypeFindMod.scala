package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcArrayPrototypeFindMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/array/prototypeFind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayPrototypeFind[T, E](
    a: js.Array[T],
    predicate: FindPredicate[
      T, 
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof thisArg */ Any
    ]
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPrototypeFind")(a.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def arrayPrototypeFind[T, E](
    a: js.Array[T],
    predicate: FindPredicate[
      T, 
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof thisArg */ Any
    ],
    thisArg: E
  ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPrototypeFind")(a.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def installArrayPrototypeFind(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installArrayPrototypeFind")().asInstanceOf[Unit]
  inline def installArrayPrototypeFind(force: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installArrayPrototypeFind")(force.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type FindPredicate[T, E] = js.ThisFunction3[/* this */ E, /* value */ T, /* index */ Double, /* obj */ js.Array[T], Boolean]
}
