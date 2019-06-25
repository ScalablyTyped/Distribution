package typings
package olLib.styleAtlasManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtlasManager extends js.Object {
  def add(
    id: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    renderCallback: js.Function3[
      /* param0 */ stdLib.CanvasRenderingContext2D, 
      /* param1 */ scala.Double, 
      /* param2 */ scala.Double, 
      scala.Unit
    ]
  ): AtlasManagerInfo = js.native
  def add(
    id: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    renderCallback: js.Function3[
      /* param0 */ stdLib.CanvasRenderingContext2D, 
      /* param1 */ scala.Double, 
      /* param2 */ scala.Double, 
      scala.Unit
    ],
    opt_renderHitCallback: js.Function0[scala.Unit]
  ): AtlasManagerInfo = js.native
  def add(
    id: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    renderCallback: js.Function3[
      /* param0 */ stdLib.CanvasRenderingContext2D, 
      /* param1 */ scala.Double, 
      /* param2 */ scala.Double, 
      scala.Unit
    ],
    opt_renderHitCallback: js.Function0[scala.Unit],
    opt_this: js.Any
  ): AtlasManagerInfo = js.native
  def getInfo(id: java.lang.String): AtlasManagerInfo = js.native
}

