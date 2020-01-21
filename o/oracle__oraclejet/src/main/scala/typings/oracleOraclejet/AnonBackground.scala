package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: AnonDataTypesDragEnter
  var links: AnonDataTypesDragEnter
  var nodes: AnonDataTypesDragEnter
  var ports: AnonDataTypesDragEnterDragLeave
}

object AnonBackground {
  @scala.inline
  def apply(
    background: AnonDataTypesDragEnter,
    links: AnonDataTypesDragEnter,
    nodes: AnonDataTypesDragEnter,
    ports: AnonDataTypesDragEnterDragLeave
  ): AnonBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackground]
  }
}

