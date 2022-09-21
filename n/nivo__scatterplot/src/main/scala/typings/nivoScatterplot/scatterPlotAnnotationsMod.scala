package typings.nivoScatterplot

import typings.nivoAnnotations.typesMod.AnnotationMatcher
import typings.nivoScatterplot.typesMod.ScatterPlotDatum
import typings.nivoScatterplot.typesMod.ScatterPlotNodeData
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterPlotAnnotationsMod {
  
  @JSImport("@nivo/scatterplot/dist/types/ScatterPlotAnnotations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ScatterPlotAnnotations[RawDatum /* <: ScatterPlotDatum */](hasNodesAnnotations: ScatterPlotAnnotationsProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScatterPlotAnnotations")(hasNodesAnnotations.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ScatterPlotAnnotationsProps[RawDatum /* <: ScatterPlotDatum */] extends StObject {
    
    var annotations: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]
    
    var nodes: js.Array[ScatterPlotNodeData[RawDatum]]
  }
  object ScatterPlotAnnotationsProps {
    
    inline def apply[RawDatum /* <: ScatterPlotDatum */](
      annotations: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]],
      nodes: js.Array[ScatterPlotNodeData[RawDatum]]
    ): ScatterPlotAnnotationsProps[RawDatum] = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterPlotAnnotationsProps[RawDatum]]
    }
    
    extension [Self <: ScatterPlotAnnotationsProps[?], RawDatum /* <: ScatterPlotDatum */](x: Self & ScatterPlotAnnotationsProps[RawDatum]) {
      
      inline def setAnnotations(value: js.Array[AnnotationMatcher[ScatterPlotNodeData[RawDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsVarargs(value: AnnotationMatcher[ScatterPlotNodeData[RawDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setNodes(value: js.Array[ScatterPlotNodeData[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ScatterPlotNodeData[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
}
