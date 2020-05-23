package typings.ol.builderGroupMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.ol.builderTypeMod.BuilderType
import typings.ol.canvasMod.DeclutterGroups
import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/BuilderGroup", JSImport.Default)
@js.native
class default protected () extends BuilderGroup {
  def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double, declutter: Boolean) = this()
  /* CompleteClass */
  override def addDeclutter(group: Boolean): DeclutterGroups = js.native
  /* CompleteClass */
  override def finish(): StringDictionary[typings.ol.olStrings.BuilderGroup with TopLevel[js.Any]] = js.native
  /* CompleteClass */
  override def getBuilder(zIndex: js.UndefOr[Double], builderType: BuilderType): typings.ol.vectorContextMod.default = js.native
}

