package typings.ol.mapboxVectorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxVectorLayer
  extends typings.ol.vectorTileMod.default {
  
  /**
    * Fetch the style object.
    */
  /* protected */ def fetchStyle(styleUrl: String): Unit = js.native
  
  /**
    * Handle configuration or loading error.
    */
  /* protected */ def handleError(error: Error): Unit = js.native
  
  /**
    * Handle the loaded style object.
    */
  /* protected */ def onStyleLoad(style: StyleObject): Unit = js.native
}
