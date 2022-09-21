package typings.pixiGraphics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGraphicsCurvesSettings extends StObject {
  
  def _segmentsCount(length: Double): Double = js.native
  def _segmentsCount(length: Double, defaultSegments: Double): Double = js.native
  
  var adaptive: Boolean = js.native
  
  var epsilon: Double = js.native
  
  var maxLength: Double = js.native
  
  var maxSegments: Double = js.native
  
  var minSegments: Double = js.native
}
