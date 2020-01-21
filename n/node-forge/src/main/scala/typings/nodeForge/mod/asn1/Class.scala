package typings.nodeForge.mod.asn1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Class extends js.Object

@JSImport("node-forge", "asn1.Class")
@js.native
object Class extends js.Object {
  @js.native
  sealed trait APPLICATION extends Class
  
  @js.native
  sealed trait CONTEXT_SPECIFIC extends Class
  
  @js.native
  sealed trait PRIVATE extends Class
  
  @js.native
  sealed trait UNIVERSAL extends Class
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Class with Double] = js.native
  /* 0x40 */ @js.native
  object APPLICATION extends TopLevel[APPLICATION with Double]
  
  /* 0x80 */ @js.native
  object CONTEXT_SPECIFIC extends TopLevel[CONTEXT_SPECIFIC with Double]
  
  /* 0xC0 */ @js.native
  object PRIVATE extends TopLevel[PRIVATE with Double]
  
  /* 0x00 */ @js.native
  object UNIVERSAL extends TopLevel[UNIVERSAL with Double]
  
}

