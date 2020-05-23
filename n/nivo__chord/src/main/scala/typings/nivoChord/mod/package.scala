package typings.nivoChord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChordArcMouseHandler = js.Function2[
    /* arc */ typings.nivoChord.mod.ArcData, 
    /* event */ typings.react.mod.MouseEvent[js.Any, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type ChordRibbonMouseHandler = js.Function2[
    /* ribbon */ typings.nivoChord.mod.RibbonData, 
    /* event */ typings.react.mod.MouseEvent[js.Any, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type LabelAccessor = js.Function1[/* datum */ typings.nivoChord.anon.OmitArcDatalabel, java.lang.String]
  type ValueFormatter = js.Function1[
    /* datum */ typings.nivoChord.anon.OmitArcDataformattedValue, 
    java.lang.String | scala.Double
  ]
}
