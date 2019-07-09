package typings
package atNivoSankeyLib.atNivoSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyLinkProps extends js.Object {
  var color: java.lang.String
  var source: atNivoSankeyLib.Anon_Id
  var target: atNivoSankeyLib.Anon_Id
  var thickness: scala.Double
  var value: scala.Double
}

object SankeyLinkProps {
  @scala.inline
  def apply(
    color: java.lang.String,
    source: atNivoSankeyLib.Anon_Id,
    target: atNivoSankeyLib.Anon_Id,
    thickness: scala.Double,
    value: scala.Double
  ): SankeyLinkProps = {
    val __obj = js.Dynamic.literal(color = color, source = source, target = target, thickness = thickness, value = value)
  
    __obj.asInstanceOf[SankeyLinkProps]
  }
}

