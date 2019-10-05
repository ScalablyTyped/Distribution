package typings.openpgp.openpgpMod.enums

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
  
  /* 2 */ val key_comPromised: typings.openpgp.openpgpMod.enums.reasonForRevocation.key_comPromised with Double = js.native
  /* 3 */ val key_retired: typings.openpgp.openpgpMod.enums.reasonForRevocation.key_retired with Double = js.native
  /* 1 */ val key_superseded: typings.openpgp.openpgpMod.enums.reasonForRevocation.key_superseded with Double = js.native
  /* 0 */ val no_reason: typings.openpgp.openpgpMod.enums.reasonForRevocation.no_reason with Double = js.native
  /* 32 */ val userid_invalid: typings.openpgp.openpgpMod.enums.reasonForRevocation.userid_invalid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reasonForRevocation with Double] = js.native
}

