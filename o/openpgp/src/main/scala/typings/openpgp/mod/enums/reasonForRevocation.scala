package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait reasonForRevocation extends StObject
/**
  * {@link https://tools.ietf.org/html/rfc4880#section-5.2.3.23|RFC4880, section 5.2.3.23}
  */
@JSImport("openpgp", "enums.reasonForRevocation")
@js.native
object reasonForRevocation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reasonForRevocation with Double] = js.native
  
  /**
    * Key material has been comPromise<any>d (key revocations)
    */
  @js.native
  sealed trait key_comPromised extends reasonForRevocation
  /* 2 */ val key_comPromised: typings.openpgp.mod.enums.reasonForRevocation.key_comPromised with Double = js.native
  
  /**
    * Key is retired and no longer used (key revocations)
    */
  @js.native
  sealed trait key_retired extends reasonForRevocation
  /* 3 */ val key_retired: typings.openpgp.mod.enums.reasonForRevocation.key_retired with Double = js.native
  
  /**
    * Key is superseded (key revocations)
    */
  @js.native
  sealed trait key_superseded extends reasonForRevocation
  /* 1 */ val key_superseded: typings.openpgp.mod.enums.reasonForRevocation.key_superseded with Double = js.native
  
  /**
    * No reason specified (key revocations or cert revocations)
    */
  @js.native
  sealed trait no_reason extends reasonForRevocation
  /* 0 */ val no_reason: typings.openpgp.mod.enums.reasonForRevocation.no_reason with Double = js.native
  
  /**
    * User ID information is no longer valid (cert revocations)
    */
  @js.native
  sealed trait userid_invalid extends reasonForRevocation
  /* 32 */ val userid_invalid: typings.openpgp.mod.enums.reasonForRevocation.userid_invalid with Double = js.native
}
