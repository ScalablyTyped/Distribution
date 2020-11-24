package typings.overlayscrollbars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BasicEventCallback = js.ThisFunction0[/* this */ typings.overlayscrollbars.mod.OverlayScrollbars, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.overlayscrollbars.anon.X
    - typings.overlayscrollbars.anon.L
    - typings.overlayscrollbars.anon.Left
    - js.Tuple2[typings.overlayscrollbars.mod.Position, typings.overlayscrollbars.mod.Position]
    - typings.overlayscrollbars.mod.Position
    - typings.std.HTMLElement
    - typings.overlayscrollbars.mod.JQuery
    - typings.overlayscrollbars.anon.Block
  */
  type Coordinates = typings.overlayscrollbars.mod._Coordinates | (js.Tuple2[typings.overlayscrollbars.mod.Position, typings.overlayscrollbars.mod.Position]) | typings.overlayscrollbars.mod.Position | typings.std.HTMLElement
  
  type DirectionChangedCallback = js.ThisFunction1[
    /* this */ typings.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typings.overlayscrollbars.mod.DirectionChangedArgs], 
    scala.Unit
  ]
  
  type Easing = js.UndefOr[java.lang.String | scala.Null]
  
  type Extensions = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[js.Object]
  
  type Margin = scala.Double | scala.Boolean
  
  type OverflowAmountChangedCallback = js.ThisFunction1[
    /* this */ typings.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typings.overlayscrollbars.mod.OverflowAmountChangedArgs], 
    scala.Unit
  ]
  
  type OverflowChangedCallback = js.ThisFunction1[
    /* this */ typings.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typings.overlayscrollbars.mod.OverflowChangedArgs], 
    scala.Unit
  ]
  
  type Position = scala.Double | java.lang.String
  
  type ScrollEventCallback = js.ThisFunction1[
    /* this */ typings.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typings.std.UIEvent], 
    scala.Unit
  ]
  
  type SizeChangedCallback = js.ThisFunction1[
    /* this */ typings.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typings.overlayscrollbars.mod.SizeChangedArgs], 
    scala.Unit
  ]
  
  type UpdatedCallback = js.ThisFunction1[
    /* this */ typings.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typings.overlayscrollbars.mod.UpdatedArgs], 
    scala.Unit
  ]
}
