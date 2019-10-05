package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait literal extends js.Object

/**
  * Data types in the literal packet
  */
@JSImport("openpgp", "enums.literal")
@js.native
object literal extends js.Object {
  /**
    * Binary data 'b'
    */
  @js.native
  sealed trait binary extends literal
  
  /**
    * MIME message body part 'm'
    */
  @js.native
  sealed trait mime extends literal
  
  /**
    * Text data 't'
    */
  @js.native
  sealed trait text extends literal
  
  /**
    * Utf8 data 'u'
    */
  @js.native
  sealed trait utf8 extends literal
  
  /* 98 */ val binary: typings.openpgp.openpgpMod.enums.literal.binary with Double = js.native
  /* 109 */ val mime: typings.openpgp.openpgpMod.enums.literal.mime with Double = js.native
  /* 116 */ val text: typings.openpgp.openpgpMod.enums.literal.text with Double = js.native
  /* 117 */ val utf8: typings.openpgp.openpgpMod.enums.literal.utf8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[literal with Double] = js.native
}

