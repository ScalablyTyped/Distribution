package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.renderCanvasBuilderTypeMod.BuilderType
import typings.ol.renderCanvasMod.DeclutterGroups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/BuilderGroup", JSImport.Namespace)
@js.native
object renderCanvasBuilderGroupMod extends js.Object {
  @js.native
  trait BuilderGroup extends js.Object {
    def addDeclutter(group: Boolean): DeclutterGroups = js.native
    def finish(): StringDictionary[typings.ol.olStrings.BuilderGroup with js.Any] = js.native
    def getBuilder(zIndex: js.UndefOr[scala.Nothing], builderType: BuilderType): typings.ol.renderVectorContextMod.default = js.native
    def getBuilder(zIndex: Double, builderType: BuilderType): typings.ol.renderVectorContextMod.default = js.native
  }
  
  @js.native
  class default protected () extends BuilderGroup {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double, declutter: Boolean) = this()
  }
  
}

