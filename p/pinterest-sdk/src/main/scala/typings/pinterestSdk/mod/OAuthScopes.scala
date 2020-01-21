package typings.pinterestSdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OAuthScopes extends js.Object

@JSImport("pinterest-sdk", "OAuthScopes")
@js.native
object OAuthScopes extends js.Object {
  @js.native
  sealed trait read_public extends OAuthScopes
  
  @js.native
  sealed trait read_relationships extends OAuthScopes
  
  @js.native
  sealed trait write_public extends OAuthScopes
  
  @js.native
  sealed trait write_relationships extends OAuthScopes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OAuthScopes with Double] = js.native
  /* 0 */ @js.native
  object read_public extends TopLevel[read_public with Double]
  
  /* 2 */ @js.native
  object read_relationships extends TopLevel[read_relationships with Double]
  
  /* 1 */ @js.native
  object write_public extends TopLevel[write_public with Double]
  
  /* 3 */ @js.native
  object write_relationships extends TopLevel[write_relationships with Double]
  
}

