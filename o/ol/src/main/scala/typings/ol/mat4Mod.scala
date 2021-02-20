package typings.ol

import typings.ol.olMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mat4Mod {
  
  @JSImport("ol/vec/mat4", "create")
  @js.native
  def create(): js.Array[Double] = js.native
  
  @JSImport("ol/vec/mat4", "fromTransform")
  @js.native
  def fromTransform(mat4: js.Array[Double], transform: Transform): js.Array[Double] = js.native
}
