package typings
package overlayscrollbarsLib.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OverlayScrollbarsNs {
  type BasicEventCallback = js.ThisFunction0[/* this */ overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - overlayscrollbarsLib.Anon_X
    - overlayscrollbarsLib.Anon_L
    - overlayscrollbarsLib.Anon_Left
    - js.Tuple2[Position, Position]
    - Position
    - stdLib.HTMLElement
    - overlayscrollbarsLib.overlayscrollbarsMod.JQuery
    - overlayscrollbarsLib.Anon_Block
  */
  type Coordinates = _Coordinates | (js.Tuple2[Position, Position]) | Position | stdLib.HTMLElement
  type DirectionChangedCallback = js.ThisFunction1[
    /* this */ overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, 
    /* args */ js.UndefOr[DirectionChangedArgs], 
    scala.Unit
  ]
  type Easing = js.UndefOr[java.lang.String | scala.Null]
  type Margin = scala.Double | scala.Boolean
  type OverflowAmountChangedCallback = js.ThisFunction1[
    /* this */ overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, 
    /* args */ js.UndefOr[OverflowAmountChangedArgs], 
    scala.Unit
  ]
  type OverflowChangedCallback = js.ThisFunction1[
    /* this */ overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, 
    /* args */ js.UndefOr[OverflowChangedArgs], 
    scala.Unit
  ]
  type Position = scala.Double | java.lang.String
  type ScrollEventCallback = js.ThisFunction1[
    /* this */ overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, 
    /* args */ js.UndefOr[stdLib.UIEvent], 
    scala.Unit
  ]
  type SizeChangedCallback = js.ThisFunction1[
    /* this */ overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, 
    /* args */ js.UndefOr[SizeChangedArgs], 
    scala.Unit
  ]
  type UpdatedCallback = js.ThisFunction1[
    /* this */ overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, 
    /* args */ js.UndefOr[UpdatedArgs], 
    scala.Unit
  ]
}
