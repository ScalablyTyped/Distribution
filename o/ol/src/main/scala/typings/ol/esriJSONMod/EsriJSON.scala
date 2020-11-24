package typings.ol.esriJSONMod

import typings.ol.featureMod.ReadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EsriJSON
  extends typings.ol.jsonfeatureMod.default {
  
  /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: js.UndefOr[scala.Nothing], opt_idField: String): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
  /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: ReadOptions, opt_idField: String): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
  
  /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry): typings.ol.geometryMod.default = js.native
  /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
}
