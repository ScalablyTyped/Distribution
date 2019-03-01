package typings
package atOracleOraclejetLib.ojmessagesMod.ojMessagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Position extends js.Object {
  var at: js.UndefOr[PositionAlign] = js.undefined
  var collision: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.flip | atOracleOraclejetLib.atOracleOraclejetLibStrings.fit | atOracleOraclejetLib.atOracleOraclejetLibStrings.flipfit | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.undefined
  var my: js.UndefOr[PositionAlign] = js.undefined
  var of: js.UndefOr[java.lang.String | PositionPoint] = js.undefined
  var offset: js.UndefOr[PositionPoint] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    at: PositionAlign = null,
    collision: atOracleOraclejetLib.atOracleOraclejetLibStrings.flip | atOracleOraclejetLib.atOracleOraclejetLibStrings.fit | atOracleOraclejetLib.atOracleOraclejetLibStrings.flipfit | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = null,
    my: PositionAlign = null,
    of: java.lang.String | PositionPoint = null,
    offset: PositionPoint = null
  ): Position = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at)
    if (collision != null) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my)
    if (of != null) __obj.updateDynamic("of")(of.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Position]
  }
}

