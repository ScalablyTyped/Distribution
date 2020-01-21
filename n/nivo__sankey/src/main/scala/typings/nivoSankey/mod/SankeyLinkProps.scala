package typings.nivoSankey.mod

import typings.nivoSankey.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyLinkProps extends js.Object {
  var color: String
  var source: AnonId
  var target: AnonId
  var thickness: Double
  var value: Double
}

object SankeyLinkProps {
  @scala.inline
  def apply(color: String, source: AnonId, target: AnonId, thickness: Double, value: Double): SankeyLinkProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SankeyLinkProps]
  }
}

