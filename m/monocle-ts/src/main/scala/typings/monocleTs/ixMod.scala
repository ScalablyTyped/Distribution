package typings.monocleTs

import typings.fpTs.eqMod.Eq
import typings.fpTs.optionMod.Option_
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import typings.monocleTs.atMod.At_
import typings.monocleTs.isoMod.Iso_
import typings.monocleTs.optionalMod.Optional_
import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ixMod {
  
  @JSImport("monocle-ts/lib/Ix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromAt[T, J, B](at: At_[T, J, Option_[B]]): Index_[T, J, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAt")(at.asInstanceOf[js.Any]).asInstanceOf[Index_[T, J, B]]
  
  inline def fromIso[T, S](iso: Iso_[T, S]): js.Function1[/* sia */ Index_[S, Any, Any], Index_[T, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso")(iso.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sia */ Index_[S, Any, Any], Index_[T, Any, Any]]]
  
  inline def index[S, I, A](index: js.Function1[/* i */ I, Optional_[S, A]]): Index_[S, I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(index.asInstanceOf[js.Any]).asInstanceOf[Index_[S, I, A]]
  
  inline def indexArray[A](): Index_[js.Array[A], Double, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexArray")().asInstanceOf[Index_[js.Array[A], Double, A]]
  
  inline def indexReadonlyArray[A](): Index_[js.Array[A], Double, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyArray")().asInstanceOf[Index_[js.Array[A], Double, A]]
  
  inline def indexReadonlyMap[K](E: Eq[K]): js.Function0[Index_[ReadonlyMap[K, scala.Nothing], K, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyMap")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Index_[ReadonlyMap[K, scala.Nothing], K, scala.Nothing]]]
  
  inline def indexReadonlyNonEmptyArray[A](): Index_[ReadonlyNonEmptyArray_[A], Double, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyNonEmptyArray")().asInstanceOf[Index_[ReadonlyNonEmptyArray_[A], Double, A]]
  
  inline def indexReadonlyRecord[A](): Index_[ReadonlyRecord_[String, A], String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyRecord")().asInstanceOf[Index_[ReadonlyRecord_[String, A], String, A]]
  
  inline def indexRecord[A](): Index_[ReadonlyRecord_[String, A], String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexRecord")().asInstanceOf[Index_[ReadonlyRecord_[String, A], String, A]]
  
  trait Index_[S, I, A] extends StObject {
    
    def index(i: I): Optional_[S, A]
  }
  object Index_ {
    
    inline def apply[S, I, A](index: I => Optional_[S, A]): Index_[S, I, A] = {
      val __obj = js.Dynamic.literal(index = js.Any.fromFunction1(index))
      __obj.asInstanceOf[Index_[S, I, A]]
    }
    
    extension [Self <: Index_[?, ?, ?], S, I, A](x: Self & (Index_[S, I, A])) {
      
      inline def setIndex(value: I => Optional_[S, A]): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
    }
  }
}
