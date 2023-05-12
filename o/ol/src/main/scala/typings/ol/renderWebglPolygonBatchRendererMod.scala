package typings.ol

import typings.ol.anon.Name
import typings.ol.renderWebglMixedGeometryBatchMod.PolygonGeometryBatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderWebglPolygonBatchRendererMod {
  
  @JSImport("ol/render/webgl/PolygonBatchRenderer", JSImport.Default)
  @js.native
  open class default () extends PolygonBatchRenderer
  
  object Attributes {
    
    @JSImport("ol/render/webgl/PolygonBatchRenderer", "Attributes.POSITION")
    @js.native
    val POSITION: String = js.native
  }
  type Attributes = String
  
  @js.native
  trait PolygonBatchRenderer
    extends typings.ol.renderWebglBatchRendererMod.default {
    
    @JSName("attributes")
    var attributes_PolygonBatchRenderer: js.Array[Name] = js.native
    
    /**
      * Render instructions for polygons are structured like so:
      * [ customAttr0, ..., customAttrN, numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, ..., xN, yN, numberOfRings,... ]
      * @param {import("./MixedGeometryBatch.js").PolygonGeometryBatch} batch Polygon geometry batch
      * @override
      */
    def generateRenderInstructions(batch: PolygonGeometryBatch): Unit = js.native
  }
}
