package typings.overlayscrollbars

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object overlayscrollbarsMod {
  type BasicEventCallback = js.ThisFunction0[/* this */ OverlayScrollbars, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.overlayscrollbars.Anon_X
    - typings.overlayscrollbars.Anon_L
    - typings.overlayscrollbars.Anon_Left
    - js.Tuple2[
  typings.overlayscrollbars.overlayscrollbarsMod.Position, 
  typings.overlayscrollbars.overlayscrollbarsMod.Position]
    - typings.overlayscrollbars.overlayscrollbarsMod.Position
    - typings.std.HTMLElement
    - typings.overlayscrollbars.overlayscrollbarsMod.JQuery
    - typings.overlayscrollbars.Anon_Block
  */
  type Coordinates = _Coordinates | (js.Tuple2[Position, Position]) | Position | HTMLElement
  type DirectionChangedCallback = js.ThisFunction1[/* this */ OverlayScrollbars, /* args */ js.UndefOr[DirectionChangedArgs], Unit]
  type Easing = js.UndefOr[String | Null]
  type Extensions = String | js.Array[String] | StringDictionary[js.Object]
  type Margin = Double | Boolean
  type OverflowAmountChangedCallback = js.ThisFunction1[/* this */ OverlayScrollbars, /* args */ js.UndefOr[OverflowAmountChangedArgs], Unit]
  type OverflowChangedCallback = js.ThisFunction1[/* this */ OverlayScrollbars, /* args */ js.UndefOr[OverflowChangedArgs], Unit]
  type Position = Double | String
  type ScrollEventCallback = js.ThisFunction1[/* this */ OverlayScrollbars, /* args */ js.UndefOr[UIEvent], Unit]
  type SizeChangedCallback = js.ThisFunction1[/* this */ OverlayScrollbars, /* args */ js.UndefOr[SizeChangedArgs], Unit]
  type UpdatedCallback = js.ThisFunction1[/* this */ OverlayScrollbars, /* args */ js.UndefOr[UpdatedArgs], Unit]
}
