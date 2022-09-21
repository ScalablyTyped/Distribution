package typings.popmotion

import org.scalablytyped.runtime.StringDictionary
import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixComplexMod {
  
  @JSImport("popmotion/lib/utils/mix-complex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mixArray(from: BlendableArray, to: BlendableArray): js.Function1[/* v */ Double, js.Array[String | Double | HSLA | RGBA]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixArray")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Array[String | Double | HSLA | RGBA]]]
  
  inline def mixComplex(origin: String, target: String): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  inline def mixComplex(origin: String, target: Double): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  inline def mixComplex(origin: Double, target: String): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  inline def mixComplex(origin: Double, target: Double): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  
  inline def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[/* v */ Double, StringDictionary[String | Double | HSLA | RGBA]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixObject")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, StringDictionary[String | Double | HSLA | RGBA]]]
  
  type BlendableArray = js.Array[Double | RGBA | HSLA | String]
  
  type BlendableObject = StringDictionary[String | Double | RGBA | HSLA]
  
  type MixComplex_ = js.Function1[/* p */ Double, String]
}
