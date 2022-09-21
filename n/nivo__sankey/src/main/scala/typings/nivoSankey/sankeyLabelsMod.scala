package typings.nivoSankey

import typings.nivoSankey.nivoSankeyStrings.horizontal
import typings.nivoSankey.nivoSankeyStrings.inside
import typings.nivoSankey.nivoSankeyStrings.outside
import typings.nivoSankey.nivoSankeyStrings.vertical
import typings.nivoSankey.typesMod.DefaultLink
import typings.nivoSankey.typesMod.DefaultNode
import typings.nivoSankey.typesMod.SankeyNodeDatum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sankeyLabelsMod {
  
  @JSImport("@nivo/sankey/dist/types/SankeyLabels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SankeyLabels[N /* <: DefaultNode */, L /* <: DefaultLink */](
    hasNodesLayoutWidthHeightLabelPositionLabelPaddingLabelOrientationGetLabelTextColor: SankeyLabelsProps[N, L]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SankeyLabels")(hasNodesLayoutWidthHeightLabelPositionLabelPaddingLabelOrientationGetLabelTextColor.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SankeyLabelsProps[N /* <: DefaultNode */, L /* <: DefaultLink */] extends StObject {
    
    def getLabelTextColor(node: SankeyNodeDatum[N, L]): String
    
    var height: Double
    
    var labelOrientation: horizontal | vertical
    
    var labelPadding: Double
    
    var labelPosition: inside | outside
    
    var layout: horizontal | vertical
    
    var nodes: js.Array[SankeyNodeDatum[N, L]]
    
    var width: Double
  }
  object SankeyLabelsProps {
    
    inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
      getLabelTextColor: SankeyNodeDatum[N, L] => String,
      height: Double,
      labelOrientation: horizontal | vertical,
      labelPadding: Double,
      labelPosition: inside | outside,
      layout: horizontal | vertical,
      nodes: js.Array[SankeyNodeDatum[N, L]],
      width: Double
    ): SankeyLabelsProps[N, L] = {
      val __obj = js.Dynamic.literal(getLabelTextColor = js.Any.fromFunction1(getLabelTextColor), height = height.asInstanceOf[js.Any], labelOrientation = labelOrientation.asInstanceOf[js.Any], labelPadding = labelPadding.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyLabelsProps[N, L]]
    }
    
    extension [Self <: SankeyLabelsProps[?, ?], N /* <: DefaultNode */, L /* <: DefaultLink */](x: Self & (SankeyLabelsProps[N, L])) {
      
      inline def setGetLabelTextColor(value: SankeyNodeDatum[N, L] => String): Self = StObject.set(x, "getLabelTextColor", js.Any.fromFunction1(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLabelOrientation(value: horizontal | vertical): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      inline def setLabelPadding(value: Double): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPosition(value: inside | outside): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[SankeyNodeDatum[N, L]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: (SankeyNodeDatum[N, L])*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
