package typings.pixiGraphics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/graphics", "LineStyle")
@js.native
open class LineStyle () extends FillStyle {
  
  /** The alignment of any lines drawn (0.5 = middle, 1 = outer, 0 = inner). WebGL only. */
  var alignment: Double = js.native
  
  /**
    * Line cap style.
    * @member {PIXI.LINE_CAP}
    * @default PIXI.LINE_CAP.BUTT
    */
  var cap: LINE_CAP = js.native
  
  /**
    * Line join style.
    * @member {PIXI.LINE_JOIN}
    * @default PIXI.LINE_JOIN.MITER
    */
  var join: LINE_JOIN = js.native
  
  /** Miter limit. */
  var miterLimit: Double = js.native
  
  /** If true the lines will be draw using LINES instead of TRIANGLE_STRIP. */
  var native: Boolean = js.native
  
  /** The width (thickness) of any lines drawn. */
  var width: Double = js.native
}
