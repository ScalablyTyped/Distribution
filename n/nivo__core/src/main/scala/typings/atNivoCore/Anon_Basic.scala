package typings.atNivoCore

import typings.react.reactMod.CSSProperties
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basic extends js.Object {
  var basic: Partial[CSSProperties]
  var chip: Partial[CSSProperties]
  var container: Partial[CSSProperties]
  var table: Partial[CSSProperties]
  var tableCell: Partial[CSSProperties]
}

object Anon_Basic {
  @scala.inline
  def apply(
    basic: Partial[CSSProperties],
    chip: Partial[CSSProperties],
    container: Partial[CSSProperties],
    table: Partial[CSSProperties],
    tableCell: Partial[CSSProperties]
  ): Anon_Basic = {
    val __obj = js.Dynamic.literal(basic = basic, chip = chip, container = container, table = table, tableCell = tableCell)
  
    __obj.asInstanceOf[Anon_Basic]
  }
}

