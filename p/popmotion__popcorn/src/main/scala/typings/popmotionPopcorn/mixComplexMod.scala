package typings.popmotionPopcorn

import org.scalablytyped.runtime.StringDictionary
import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixComplexMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/mix-complex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mixArray(from: js.Array[String | Double | RGBA | HSLA], to: js.Array[String | Double | RGBA | HSLA]): js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixArray")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]]]
  
  @scala.inline
  def mixComplex(origin: String, target: String): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  
  @scala.inline
  def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[/* v */ Double, StringDictionary[String | Double | RGBA | HSLA]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixObject")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, StringDictionary[String | Double | RGBA | HSLA]]]
  
  type BlendableObject = StringDictionary[String | Double | RGBA | HSLA]
  
  type MixComplex_ = js.Function1[/* p */ Double, String]
}
