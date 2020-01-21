package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[literal with Double] = js.native
  /* 98 */ @js.native
  object binary extends TopLevel[binary with Double]
  
  /* 109 */ @js.native
  object mime extends TopLevel[mime with Double]
  
  /* 116 */ @js.native
  object text extends TopLevel[text with Double]
  
  /* 117 */ @js.native
  object utf8 extends TopLevel[utf8 with Double]
  
}

