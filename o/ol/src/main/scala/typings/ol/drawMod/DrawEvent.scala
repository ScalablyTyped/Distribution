package typings.ol.drawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawEvent
  extends typings.ol.eventMod.default {
  
  /**
    * The feature being drawn.
    */
  var feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
}
