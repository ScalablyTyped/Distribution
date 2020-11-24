package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait literal extends js.Object
/**
  * Data types in the literal packet
  */
@JSImport("openpgp", "enums.literal")
@js.native
object literal extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[literal with String] = js.native
  
  /**
    * Binary data 'b'
    */
  @js.native
  sealed trait binary extends literal
  /* "" */ @js.native
  object binary extends TopLevel[binary with String]
  
  /**
    * MIME message body part 'm'
    */
  @js.native
  sealed trait mime extends literal
  /* "" */ @js.native
  object mime extends TopLevel[mime with String]
  
  /**
    * Text data 't'
    */
  @js.native
  sealed trait text extends literal
  /* "" */ @js.native
  object text extends TopLevel[text with String]
  
  /**
    * Utf8 data 'u'
    */
  @js.native
  sealed trait utf8 extends literal
  /* "" */ @js.native
  object utf8 extends TopLevel[utf8 with String]
}
