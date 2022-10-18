package typings.nivoAnnotations

import typings.nivoAnnotations.anon.Data
import typings.nivoAnnotations.distTypesTypesMod.AnnotationInstructions
import typings.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/annotations/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindAnnotations[Datum](hasDataAnnotationsGetPositionGetDimensions: Data[Datum]): js.Array[BoundAnnotation[Datum]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAnnotations")(hasDataAnnotationsGetPositionGetDimensions.asInstanceOf[js.Any]).asInstanceOf[js.Array[BoundAnnotation[Datum]]]
  
  inline def computeAnnotation[Datum](annotation: BoundAnnotation[Datum]): AnnotationInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAnnotation")(annotation.asInstanceOf[js.Any]).asInstanceOf[AnnotationInstructions]
  
  inline def getLinkAngle(sourceX: Double, sourceY: Double, targetX: Double, targetY: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLinkAngle")(sourceX.asInstanceOf[js.Any], sourceY.asInstanceOf[js.Any], targetX.asInstanceOf[js.Any], targetY.asInstanceOf[js.Any])).asInstanceOf[Double]
}
