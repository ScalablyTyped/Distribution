package typings.ol

import typings.ol.anon.Name
import typings.ol.renderWebglMixedGeometryBatchMod.LineStringGeometryBatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderWebglLineStringBatchRendererMod {
  
  @JSImport("ol/render/webgl/LineStringBatchRenderer", JSImport.Default)
  @js.native
  open class default () extends LineStringBatchRenderer
  
  object Attributes {
    
    @JSImport("ol/render/webgl/LineStringBatchRenderer", "Attributes.PARAMETERS")
    @js.native
    val PARAMETERS: String = js.native
    
    @JSImport("ol/render/webgl/LineStringBatchRenderer", "Attributes.SEGMENT_END")
    @js.native
    val SEGMENT_END: String = js.native
    
    @JSImport("ol/render/webgl/LineStringBatchRenderer", "Attributes.SEGMENT_START")
    @js.native
    val SEGMENT_START: String = js.native
  }
  type Attributes = String
  
  @js.native
  trait LineStringBatchRenderer
    extends typings.ol.renderWebglBatchRendererMod.default {
    
    @JSName("attributes")
    var attributes_LineStringBatchRenderer: js.Array[Name] = js.native
    
    /**
      * Render instructions for lines are structured like so:
      * [ customAttr0, ... , customAttrN, numberOfVertices0, x0, y0, ... , xN, yN, numberOfVertices1, ... ]
      * @param {import("./MixedGeometryBatch.js").LineStringGeometryBatch} batch Linestring geometry batch
      * @override
      */
    def generateRenderInstructions(batch: LineStringGeometryBatch): Unit = js.native
  }
}
