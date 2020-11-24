package typings.ol.dragAndDropMod

import typings.ol.olFeatureMod.FeatureLike
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndDropEvent
  extends typings.ol.eventMod.default {
  
  /**
    * The features parsed from dropped data.
    */
  var features: js.Array[FeatureLike] = js.native
  
  /**
    * The dropped file.
    */
  var file: File = js.native
  
  /**
    * The feature projection.
    */
  var projection: typings.ol.projectionMod.default = js.native
}
