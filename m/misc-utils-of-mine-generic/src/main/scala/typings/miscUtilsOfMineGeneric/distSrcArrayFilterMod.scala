package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcArrayFilterMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/array/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def anyUndefined(a: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("anyUndefined")(a.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Boolean]
  
  inline def dedup[T](a: js.Array[T], predicate: js.Function2[/* a */ T, /* b */ T, Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("dedup")(a.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def notFalsy[T](n: T): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notFalsy")(n.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  
  inline def notSame[T](t: T, i: Double, a: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notSame")(t.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def notSameNotFalsy[T](t: T, i: Double, a: js.Array[T]): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notSameNotFalsy")(t.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  
  inline def notUndefined[T](n: T): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotUndefined<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notUndefined")(n.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotUndefined<T> */ Boolean]
}
