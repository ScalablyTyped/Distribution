package typings.nivoScales.mod

import typings.nivoScales.nivoScalesStrings.linear
import typings.nivoScales.nivoScalesStrings.log
import typings.nivoScales.nivoScalesStrings.point
import typings.nivoScales.nivoScalesStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nivoScales.mod.LinearScale
  - typings.nivoScales.mod.PointScale
  - typings.nivoScales.mod.TimeScale
  - typings.nivoScales.mod.TimeScaleFormatted
  - typings.nivoScales.mod.LogScale
*/
trait Scale extends js.Object

object Scale {
  @scala.inline
  def LinearScale(`type`: linear): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def LogScale(`type`: log): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def PointScale(`type`: point): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def TimeScale(`type`: time): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def TimeScaleFormatted(format: String, `type`: time): Scale = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

