package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait reasonForRevocation extends js.Object
/**
  * {@link https://tools.ietf.org/html/rfc4880#section-5.2.3.23|RFC4880, section 5.2.3.23}
  */
@JSImport("openpgp", "enums.reasonForRevocation")
@js.native
object reasonForRevocation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reasonForRevocation with Double] = js.native
  
  /**
    * Key material has been comPromise<any>d (key revocations)
    */
  @js.native
  sealed trait key_comPromised extends reasonForRevocation
  /* 2 */ @js.native
  object key_comPromised extends TopLevel[key_comPromised with Double]
  
  /**
    * Key is retired and no longer used (key revocations)
    */
  @js.native
  sealed trait key_retired extends reasonForRevocation
  /* 3 */ @js.native
  object key_retired extends TopLevel[key_retired with Double]
  
  /**
    * Key is superseded (key revocations)
    */
  @js.native
  sealed trait key_superseded extends reasonForRevocation
  /* 1 */ @js.native
  object key_superseded extends TopLevel[key_superseded with Double]
  
  /**
    * No reason specified (key revocations or cert revocations)
    */
  @js.native
  sealed trait no_reason extends reasonForRevocation
  /* 0 */ @js.native
  object no_reason extends TopLevel[no_reason with Double]
  
  /**
    * User ID information is no longer valid (cert revocations)
    */
  @js.native
  sealed trait userid_invalid extends reasonForRevocation
  /* 32 */ @js.native
  object userid_invalid extends TopLevel[userid_invalid with Double]
}
