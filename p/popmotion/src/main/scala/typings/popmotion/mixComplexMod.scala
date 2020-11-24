package typings.popmotion

import org.scalablytyped.runtime.StringDictionary
import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/utils/mix-complex", JSImport.Namespace)
@js.native
object mixComplexMod extends js.Object {
  
  def mixArray(from: BlendableArray, to: BlendableArray): js.Function1[/* v */ Double, js.Array[String | Double | HSLA | RGBA]] = js.native
  
  def mixComplex(origin: String, target: String): MixComplex_ = js.native
  
  def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[/* v */ Double, StringDictionary[String | Double | HSLA | RGBA]] = js.native
  
  type BlendableArray = js.Array[Double | RGBA | HSLA | String]
  
  type BlendableObject = StringDictionary[String | Double | RGBA | HSLA]
  
  type MixComplex_ = js.Function1[/* p */ Double, String]
}
