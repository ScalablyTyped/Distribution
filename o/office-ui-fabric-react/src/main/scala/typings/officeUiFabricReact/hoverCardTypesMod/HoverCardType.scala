package typings.officeUiFabricReact.hoverCardTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HoverCardType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.types", "HoverCardType")
@js.native
object HoverCardType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HoverCardType with String] = js.native
  
  /**
    * File card consisting of two parts: compact and expanded. Has some default sizes if not specified.
    */
  @js.native
  sealed trait expanding extends HoverCardType
  /* "ExpandingCard" */ @js.native
  object expanding extends TopLevel[expanding with String]
  
  /**
    * Plain card consisting of one part responsive to the size of content.
    */
  @js.native
  sealed trait plain extends HoverCardType
  /* "PlainCard" */ @js.native
  object plain extends TopLevel[plain with String]
}
