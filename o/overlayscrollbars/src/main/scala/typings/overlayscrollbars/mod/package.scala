package typings.overlayscrollbars.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BasicEventCallback = js.ThisFunction0[/* this */ OverlayScrollbars, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.overlayscrollbars.anon.Y
  - typings.overlayscrollbars.anon.L
  - typings.overlayscrollbars.anon.Left
  - js.Tuple2[typings.overlayscrollbars.mod.Position, typings.overlayscrollbars.mod.Position]
  - typings.overlayscrollbars.mod.Position
  - typings.std.HTMLElement
  - typings.overlayscrollbars.mod.JQuery
  - typings.overlayscrollbars.anon.Block
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
