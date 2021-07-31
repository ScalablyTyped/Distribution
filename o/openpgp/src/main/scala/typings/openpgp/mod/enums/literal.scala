package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait literal extends StObject
/**
  * Data types in the literal packet
  */
@JSImport("openpgp", "enums.literal")
@js.native
object literal extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[literal & String] = js.native
  
  /**
    * Binary data 'b'
    */
  @js.native
  sealed trait binary
    extends StObject
       with literal
  /* "" */ val binary: typings.openpgp.mod.enums.literal.binary & String = js.native
  
  /**
    * MIME message body part 'm'
    */
  @js.native
  sealed trait mime
    extends StObject
       with literal
  /* "" */ val mime: typings.openpgp.mod.enums.literal.mime & String = js.native
  
  /**
    * Text data 't'
    */
  @js.native
  sealed trait text
    extends StObject
       with literal
  /* "" */ val text: typings.openpgp.mod.enums.literal.text & String = js.native
  
  /**
    * Utf8 data 'u'
    */
  @js.native
  sealed trait utf8
    extends StObject
       with literal
  /* "" */ val utf8: typings.openpgp.mod.enums.literal.utf8 & String = js.native
}
