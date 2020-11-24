package typings.popperjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object offsetMod {
  
  type Offset = typings.popperjsCore.offsetMod.OffsetsFunction | (js.Tuple2[js.UndefOr[scala.Double | scala.Null], js.UndefOr[scala.Double | scala.Null]])
  
  type OffsetModifier = typings.popperjsCore.typesMod.Modifier[
    typings.popperjsCore.popperjsCoreStrings.offset, 
    typings.popperjsCore.offsetMod.Options
  ]
  
  type OffsetsFunction = js.Function1[
    /* arg0 */ typings.popperjsCore.anon.Placement, 
    js.Tuple2[js.UndefOr[scala.Double | scala.Null], js.UndefOr[scala.Double | scala.Null]]
  ]
}
