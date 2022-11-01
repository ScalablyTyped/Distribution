package typings.navermaps.naver.maps

import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CanvasTile
  */
@js.native
trait CanvasTile
  extends StObject
     with Tile {
  
  def getElements(): js.Tuple2[HTMLElement, HTMLCanvasElement] = js.native
}
