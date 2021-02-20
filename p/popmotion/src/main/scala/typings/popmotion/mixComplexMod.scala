package typings.popmotion

import org.scalablytyped.runtime.StringDictionary
import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixComplexMod {
  
  @JSImport("popmotion/lib/utils/mix-complex", "mixArray")
  @js.native
  def mixArray(from: BlendableArray, to: BlendableArray): js.Function1[/* v */ Double, js.Array[String | Double | HSLA | RGBA]] = js.native
  
  @JSImport("popmotion/lib/utils/mix-complex", "mixComplex")
  @js.native
  def mixComplex(origin: String, target: String): MixComplex_ = js.native
  
  @JSImport("popmotion/lib/utils/mix-complex", "mixObject")
  @js.native
  def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[/* v */ Double, StringDictionary[String | Double | HSLA | RGBA]] = js.native
  
  type BlendableArray = js.Array[Double | RGBA | HSLA | String]
  
  type BlendableObject = StringDictionary[String | Double | RGBA | HSLA]
  
  type MixComplex_ = js.Function1[/* p */ Double, String]
}
