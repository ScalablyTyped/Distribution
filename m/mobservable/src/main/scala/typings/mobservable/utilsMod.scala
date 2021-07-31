package typings.mobservable

import typings.mobservable.interfacesMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mobservable/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deepEquals(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isPlainObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def makeNonEnumerable(`object`: js.Any, props: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNonEnumerable")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def once(func: Lambda): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(func.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  @scala.inline
  def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickDiff")(current.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[T]]]
  
  @scala.inline
  def unique[T](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
