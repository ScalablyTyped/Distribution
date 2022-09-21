package typings.nanoid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("nanoid/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def customAlphabet(alphabet: String): js.Function1[/* size */ js.UndefOr[Double], js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("customAlphabet")(alphabet.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* size */ js.UndefOr[Double], js.Promise[String]]]
  inline def customAlphabet(alphabet: String, defaultSize: Double): js.Function1[/* size */ js.UndefOr[Double], js.Promise[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("customAlphabet")(alphabet.asInstanceOf[js.Any], defaultSize.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* size */ js.UndefOr[Double], js.Promise[String]]]
  
  inline def nanoid(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nanoid")().asInstanceOf[js.Promise[String]]
  inline def nanoid(size: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nanoid")(size.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def random(bytes: Double): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}
