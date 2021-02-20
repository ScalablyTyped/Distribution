package typings.mobservable

import typings.mobservable.interfacesMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("mobservable/lib/utils", "deepEquals")
  @js.native
  def deepEquals(a: js.Any, b: js.Any): Boolean = js.native
  
  @JSImport("mobservable/lib/utils", "isPlainObject")
  @js.native
  def isPlainObject(value: js.Any): Boolean = js.native
  
  @JSImport("mobservable/lib/utils", "makeNonEnumerable")
  @js.native
  def makeNonEnumerable(`object`: js.Any, props: js.Array[String]): Unit = js.native
  
  @JSImport("mobservable/lib/utils", "once")
  @js.native
  def once(func: Lambda): Lambda = js.native
  
  @JSImport("mobservable/lib/utils", "quickDiff")
  @js.native
  def quickDiff[T](current: js.Array[T], base: js.Array[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  
  @JSImport("mobservable/lib/utils", "unique")
  @js.native
  def unique[T](list: js.Array[T]): js.Array[T] = js.native
}
