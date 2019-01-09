package typings
package overlayscrollbarsLib.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OverlayScrollbarsNs {
  type AutoHideBehavior = overlayscrollbarsLib.overlayscrollbarsLibStrings.never | overlayscrollbarsLib.overlayscrollbarsLibStrings.scroll | overlayscrollbarsLib.overlayscrollbarsLibStrings.leave | overlayscrollbarsLib.overlayscrollbarsLibStrings.move | overlayscrollbarsLib.overlayscrollbarsLibStrings.n | overlayscrollbarsLib.overlayscrollbarsLibStrings.s | overlayscrollbarsLib.overlayscrollbarsLibStrings.l | overlayscrollbarsLib.overlayscrollbarsLibStrings.m
  type BasicEventCallback = js.ThisFunction0[/* this */ overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, scala.Unit]
  type BlockBehavior = overlayscrollbarsLib.overlayscrollbarsLibStrings.begin | overlayscrollbarsLib.overlayscrollbarsLibStrings.end | overlayscrollbarsLib.overlayscrollbarsLibStrings.center | overlayscrollbarsLib.overlayscrollbarsLibStrings.nearest
  type Coordinates = overlayscrollbarsLib.Anon_X | overlayscrollbarsLib.Anon_L | overlayscrollbarsLib.Anon_Left | (js.Tuple2[Position, Position]) | Position | stdLib.HTMLElement | overlayscrollbarsLib.overlayscrollbarsMod.JQuery | overlayscrollbarsLib.Anon_Block
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
  type OverflowBehavior = overlayscrollbarsLib.overlayscrollbarsLibStrings.hidden | overlayscrollbarsLib.overlayscrollbarsLibStrings.scroll | overlayscrollbarsLib.overlayscrollbarsLibStrings.`visible-hidden` | overlayscrollbarsLib.overlayscrollbarsLibStrings.`visible-scroll` | overlayscrollbarsLib.overlayscrollbarsLibStrings.h | overlayscrollbarsLib.overlayscrollbarsLibStrings.s | overlayscrollbarsLib.overlayscrollbarsLibStrings.`v-h` | overlayscrollbarsLib.overlayscrollbarsLibStrings.`v-s`
  type OverflowChangedCallback = js.ThisFunction1[
    /* this */ overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbars, 
    /* args */ js.UndefOr[OverflowChangedArgs], 
    scala.Unit
  ]
  type Position = scala.Double | java.lang.String
  type ResizeBehavior = overlayscrollbarsLib.overlayscrollbarsLibStrings.none | overlayscrollbarsLib.overlayscrollbarsLibStrings.both | overlayscrollbarsLib.overlayscrollbarsLibStrings.horizontal | overlayscrollbarsLib.overlayscrollbarsLibStrings.vertical | overlayscrollbarsLib.overlayscrollbarsLibStrings.n | overlayscrollbarsLib.overlayscrollbarsLibStrings.b | overlayscrollbarsLib.overlayscrollbarsLibStrings.h | overlayscrollbarsLib.overlayscrollbarsLibStrings.v
  type ScrollBehavior = overlayscrollbarsLib.overlayscrollbarsLibStrings.always | overlayscrollbarsLib.overlayscrollbarsLibStrings.ifneeded | overlayscrollbarsLib.overlayscrollbarsLibStrings.never
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
  type VisibilityBehavior = overlayscrollbarsLib.overlayscrollbarsLibStrings.visible | overlayscrollbarsLib.overlayscrollbarsLibStrings.hidden | overlayscrollbarsLib.overlayscrollbarsLibStrings.auto | overlayscrollbarsLib.overlayscrollbarsLibStrings.v | overlayscrollbarsLib.overlayscrollbarsLibStrings.h | overlayscrollbarsLib.overlayscrollbarsLibStrings.a
}
