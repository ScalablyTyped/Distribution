package typings.ol.geoJSONMod

import typings.ol.featureMod.ReadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSON
  extends typings.ol.jsonfeatureMod.default {
  
  /* protected */ def readGeometryFromObject(`object`: GeoJSONGeometry): typings.ol.geometryMod.default = js.native
  /* protected */ def readGeometryFromObject(`object`: GeoJSONGeometry, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
}
