package typings.openpgp.openpgpMod.enums

import org.scalablytyped.runtime.TopLevel
import typings.openpgp.openpgpMod.enums.reasonForRevocation.key_comPromised
import typings.openpgp.openpgpMod.enums.reasonForRevocation.key_retired
import typings.openpgp.openpgpMod.enums.reasonForRevocation.key_superseded
import typings.openpgp.openpgpMod.enums.reasonForRevocation.no_reason
import typings.openpgp.openpgpMod.enums.reasonForRevocation.userid_invalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait reasonForRevocation extends js.Object

/**
  * {@link https://tools.ietf.org/html/rfc4880#section-5.2.3.23|RFC4880, section 5.2.3.23}
  */
@JSImport("openpgp", "enums.reasonForRevocation")
@js.native
object reasonForRevocation extends js.Object {
  /**
    * Key material has been comPromise<any>d (key revocations)
    */
  @js.native
  sealed trait key_comPromised extends reasonForRevocation
  
  /**
    * Key is retired and no longer used (key revocations)
    */
  @js.native
  sealed trait key_retired extends reasonForRevocation
  
  /**
    * Key is superseded (key revocations)
    */
  @js.native
  sealed trait key_superseded extends reasonForRevocation
  
  /**
    * No reason specified (key revocations or cert revocations)
    */
  @js.native
  sealed trait no_reason extends reasonForRevocation
  
  /**
    * User ID information is no longer valid (cert revocations)
    */
  @js.native
  sealed trait userid_invalid extends reasonForRevocation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reasonForRevocation with Double] = js.native
  /* 2 */ @js.native
  object key_comPromised extends TopLevel[key_comPromised with Double]
  
  /* 3 */ @js.native
  object key_retired extends TopLevel[key_retired with Double]
  
  /* 1 */ @js.native
  object key_superseded extends TopLevel[key_superseded with Double]
  
  /* 0 */ @js.native
  object no_reason extends TopLevel[no_reason with Double]
  
  /* 32 */ @js.native
  object userid_invalid extends TopLevel[userid_invalid with Double]
  
}

