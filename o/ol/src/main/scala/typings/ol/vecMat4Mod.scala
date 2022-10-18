package typings.ol

import typings.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vecMat4Mod {
  
  @JSImport("ol/vec/mat4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Array[Double]]
  
  inline def fromTransform(mat4: js.Array[Double], transform: Transform): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTransform")(mat4.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
