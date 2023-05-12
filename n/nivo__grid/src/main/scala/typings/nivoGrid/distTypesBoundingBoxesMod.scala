package typings.nivoGrid

import typings.nivoGrid.distTypesTypesMod.BoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBoundingBoxesMod {
  
  @JSImport("@nivo/grid/dist/types/boundingBoxes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areBoundingBoxTouching(boxA: BoundingBox, boxB: BoundingBox): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areBoundingBoxTouching")(boxA.asInstanceOf[js.Any], boxB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
