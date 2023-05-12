package typings.ol

import typings.ol.anon.Name
import typings.ol.renderWebglMixedGeometryBatchMod.PointGeometryBatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderWebglPointBatchRendererMod {
  
  @JSImport("ol/render/webgl/PointBatchRenderer", JSImport.Default)
  @js.native
  open class default () extends PointBatchRenderer
  
  object Attributes {
    
    @JSImport("ol/render/webgl/PointBatchRenderer", "Attributes.INDEX")
    @js.native
    val INDEX: String = js.native
    
    @JSImport("ol/render/webgl/PointBatchRenderer", "Attributes.POSITION")
    @js.native
    val POSITION: String = js.native
  }
  type Attributes = String
  
  @js.native
  trait PointBatchRenderer
    extends typings.ol.renderWebglBatchRendererMod.default {
    
    @JSName("attributes")
    var attributes_PointBatchRenderer: js.Array[Name] = js.native
    
    /**
      * Render instructions for lines are structured like so:
      * [ x0, y0, customAttr0, ... , xN, yN, customAttrN ]
      * @param {import("./MixedGeometryBatch.js").PointGeometryBatch} batch Point geometry batch
      * @override
      */
    def generateRenderInstructions(batch: PointGeometryBatch): Unit = js.native
  }
}
