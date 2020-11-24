package typings.ol.polylineMod

import typings.ol.featureMod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline
  extends typings.ol.textFeatureMod.default {
  
  /* protected */ def writeGeometryText(geometry: typings.ol.lineStringMod.default): String = js.native
  /* protected */ def writeGeometryText(geometry: typings.ol.lineStringMod.default, opt_options: WriteOptions): String = js.native
}
