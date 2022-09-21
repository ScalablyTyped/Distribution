package typings.nGram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("n-gram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bigram[T /* <: String | js.Array[String] */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("bigram")().asInstanceOf[js.Array[T]]
  inline def bigram[T /* <: String | js.Array[String] */](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("bigram")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def nGram(n: Double): js.Function1[
    /* value */ js.UndefOr[String | js.Array[String]], 
    js.Array[String | js.Array[String]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("nGram")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* value */ js.UndefOr[String | js.Array[String]], 
    js.Array[String | js.Array[String]]
  ]]
  
  inline def trigram[T /* <: String | js.Array[String] */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("trigram")().asInstanceOf[js.Array[T]]
  inline def trigram[T /* <: String | js.Array[String] */](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("trigram")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
