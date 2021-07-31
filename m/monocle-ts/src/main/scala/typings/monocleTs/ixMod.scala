package typings.monocleTs

import typings.fpTs.optionMod.Option_
import typings.monocleTs.atMod.At
import typings.monocleTs.isoMod.Iso
import typings.monocleTs.optionalMod.Optional
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ixMod {
  
  @JSImport("monocle-ts/lib/Ix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromAt[T, J, B](at: At[T, J, Option_[B]]): Index[T, J, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAt")(at.asInstanceOf[js.Any]).asInstanceOf[Index[T, J, B]]
  
  @scala.inline
  def fromIso[T, S](iso: Iso[T, S]): js.Function1[/* sia */ Index[S, js.Any, js.Any], Index[T, js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso")(iso.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sia */ Index[S, js.Any, js.Any], Index[T, js.Any, js.Any]]]
  
  @scala.inline
  def indexArray[A](): Index[js.Array[A], Double, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexArray")().asInstanceOf[Index[js.Array[A], Double, A]]
  
  @scala.inline
  def indexRecord[A](): Index[Record[String, A], String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexRecord")().asInstanceOf[Index[Record[String, A], String, A]]
  
  trait Index[S, I, A] extends StObject {
    
    def index(i: I): Optional[S, A]
  }
  object Index {
    
    @scala.inline
    def apply[S, I, A](index: I => Optional[S, A]): Index[S, I, A] = {
      val __obj = js.Dynamic.literal(index = js.Any.fromFunction1(index))
      __obj.asInstanceOf[Index[S, I, A]]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index[?, ?, ?], S, I, A] (val x: Self & (Index[S, I, A])) extends AnyVal {
      
      @scala.inline
      def setIndex(value: I => Optional[S, A]): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
    }
  }
}
