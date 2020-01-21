package typings.ol.sourceMod

import typings.ol.geometryMod.default
import typings.ol.sourceVectorMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source", "Vector")
@js.native
class Vector[GeomType /* <: default */] ()
  extends typings.ol.sourceVectorMod.default[GeomType] {
  def this(opt_options: Options) = this()
}

