package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: Anon_DataTypesDragEnter
  var links: Anon_DataTypesDragEnter
  var nodes: Anon_DataTypesDragEnter
  var ports: Anon_DataTypesDragEnterDragLeave
}

object Anon_Background {
  @scala.inline
  def apply(
    background: Anon_DataTypesDragEnter,
    links: Anon_DataTypesDragEnter,
    nodes: Anon_DataTypesDragEnter,
    ports: Anon_DataTypesDragEnterDragLeave
  ): Anon_Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Background]
  }
}

