package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.renderCanvasBuilderTypeMod.BuilderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasBuilderGroupMod {
  
  @JSImport("ol/render/canvas/BuilderGroup", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BuilderGroup {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait BuilderGroup extends StObject {
    
    def finish(): StringDictionary[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ key in ol.ol/render/canvas/BuilderType.BuilderType ]: ol.ol/render/canvas.SerializableInstructions} */ js.Any
      ] = js.native
    
    def getBuilder(zIndex: Double, builderType: BuilderType): typings.ol.renderVectorContextMod.default = js.native
    def getBuilder(zIndex: Unit, builderType: BuilderType): typings.ol.renderVectorContextMod.default = js.native
  }
}
