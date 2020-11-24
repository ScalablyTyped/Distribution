package typings.ol.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.geometryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol", "Feature")
@js.native
class Feature[GeomType /* <: default */] ()
  extends typings.ol.olFeatureMod.default[GeomType] {
  def this(opt_geometryOrProperties: GeomType) = this()
  def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
}
