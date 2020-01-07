package typings.ol.olMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.geomGeometryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "Feature")
@js.native
class Feature[GeomType /* <: default */] ()
  extends typings.ol.featureMod.default[GeomType] {
  def this(opt_geometryOrProperties: GeomType) = this()
  def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
}

