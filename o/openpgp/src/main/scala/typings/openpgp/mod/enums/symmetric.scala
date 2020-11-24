package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait symmetric extends js.Object
/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.2|RFC4880, section 9.2}
  */
@JSImport("openpgp", "enums.symmetric")
@js.native
object symmetric extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[symmetric with Double] = js.native
  
  @js.native
  sealed trait `3des` extends symmetric
  /* 2 */ @js.native
  object `3des` extends TopLevel[`3des` with Double]
  
  @js.native
  sealed trait aes128 extends symmetric
  /* 7 */ @js.native
  object aes128 extends TopLevel[aes128 with Double]
  
  @js.native
  sealed trait aes192 extends symmetric
  /* 8 */ @js.native
  object aes192 extends TopLevel[aes192 with Double]
  
  @js.native
  sealed trait aes256 extends symmetric
  /* 9 */ @js.native
  object aes256 extends TopLevel[aes256 with Double]
  
  @js.native
  sealed trait blowfish extends symmetric
  /* 4 */ @js.native
  object blowfish extends TopLevel[blowfish with Double]
  
  @js.native
  sealed trait cast5 extends symmetric
  /* 3 */ @js.native
  object cast5 extends TopLevel[cast5 with Double]
  
  /**
    * Not implemented!
    */
  @js.native
  sealed trait idea extends symmetric
  /* 1 */ @js.native
  object idea extends TopLevel[idea with Double]
  
  @js.native
  sealed trait plaintext extends symmetric
  /* 0 */ @js.native
  object plaintext extends TopLevel[plaintext with Double]
  
  @js.native
  sealed trait tripledes extends symmetric
  /* 2 */ @js.native
  object tripledes extends TopLevel[tripledes with Double]
  
  @js.native
  sealed trait twofish extends symmetric
  /* 10 */ @js.native
  object twofish extends TopLevel[twofish with Double]
}
