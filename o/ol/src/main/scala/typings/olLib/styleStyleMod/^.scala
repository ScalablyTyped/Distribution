package typings
package olLib.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/style/Style", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createDefaultStyle(feature: olLib.featureMod.FeatureLike, resolution: scala.Double): js.Array[Style] = js.native
  def createEditingStyle(): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in ol.ol/geom/GeometryType.GeometryType ]: std.Array<ol.ol/style/Style.Style>}
    */ olLib.olLibStrings.createEditingStyle with js.Any = js.native
  def toFunction(obj: js.Array[Style]): StyleFunction = js.native
  def toFunction(obj: Style): StyleFunction = js.native
  def toFunction(obj: StyleFunction): StyleFunction = js.native
}

