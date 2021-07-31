package typings.openseadragon.mod

import typings.openseadragon.openseadragonBooleans.`true`
import typings.std.Element
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewerEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var button: js.UndefOr[Double] = js.native
  
  var buttonDownAny: js.UndefOr[Boolean] = js.native
  
  var buttons: js.UndefOr[Double] = js.native
  
  var center: js.UndefOr[Point] = js.native
  
  var contentBounds: js.UndefOr[Rect] = js.native
  
  var contentFactor: js.UndefOr[Double] = js.native
  
  var contentSize: js.UndefOr[Point] = js.native
  
  var context: js.UndefOr[Tile] = js.native
  
  var degrees: js.UndefOr[Double] = js.native
  
  var delta: js.UndefOr[Point] = js.native
  
  var direction: js.UndefOr[Double] = js.native
  
  var element: js.UndefOr[Element] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var flipped: js.UndefOr[Double] = js.native
  
  var fullPage: js.UndefOr[Boolean] = js.native
  
  var fullScreen: js.UndefOr[Boolean] = js.native
  
  var gesturePoints: js.UndefOr[js.Array[GesturePoint]] = js.native
  
  var getCompletionCallback: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
  
  var homeBounds: js.UndefOr[Rect] = js.native
  
  var immediately: js.UndefOr[Double] = js.native
  
  var insideElementPressed: js.UndefOr[Boolean] = js.native
  
  var insideElementReleased: js.UndefOr[Boolean] = js.native
  
  var lastCenter: js.UndefOr[Point] = js.native
  
  var lastDistance: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[Point | Rect] = js.native
  
  var mantain: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var newContainerSize: js.UndefOr[Point] = js.native
  
  var options: js.UndefOr[js.Object] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var pointerType: js.UndefOr[String] = js.native
  
  var pointers: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[Point] = js.native
  
  var preventDefaultAction: js.UndefOr[`true`] = js.native
  
  var preventHorizontalPan: js.UndefOr[Boolean] = js.native
  
  var preventVerticalPan: js.UndefOr[Boolean] = js.native
  
  var quick: js.UndefOr[Boolean] = js.native
  
  var refPoint: js.UndefOr[Point] = js.native
  
  var rendered: js.UndefOr[Tile] = js.native
  
  var scroll: js.UndefOr[Double] = js.native
  
  var shift: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var speed: js.UndefOr[Double] = js.native
  
  var tile: js.UndefOr[Tile] = js.native
  
  var tileRequest: js.UndefOr[XMLHttpRequest] = js.native
  
  var tiledImage: js.UndefOr[TiledImage | XMLHttpRequest] = js.native
  
  var time: js.UndefOr[Double] = js.native
  
  var tracker: js.UndefOr[MouseTracker] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
}
