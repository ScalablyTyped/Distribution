package typings.mobservable

import typings.mobservable.libInterfacesMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("mobservable/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepEquals(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPlainObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeNonEnumerable(`object`: Any, props: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNonEnumerable")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def once(func: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  inline def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickDiff")(current.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[T]]]
  
  inline def unique[T](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
