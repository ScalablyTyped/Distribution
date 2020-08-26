package typings.nivoSankey.mod

import typings.nivoCore.mod.MotionProps
import typings.nivoSankey.anon.Links
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedProps
  extends Data
     with MotionProps
     with SankeyProps

object SharedProps {
  @scala.inline
  def apply(data: Links): SharedProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
}

