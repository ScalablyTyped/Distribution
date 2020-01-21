package typings.officeUiFabricReact.ikeytiptransitionkeyMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeytipTransitionModifier extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/keytips/IKeytipTransitionKey", "KeytipTransitionModifier")
@js.native
object KeytipTransitionModifier extends js.Object {
  @js.native
  sealed trait alt extends KeytipTransitionModifier
  
  @js.native
  sealed trait ctrl extends KeytipTransitionModifier
  
  @js.native
  sealed trait meta extends KeytipTransitionModifier
  
  @js.native
  sealed trait shift extends KeytipTransitionModifier
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeytipTransitionModifier with Double] = js.native
  /* 2 */ @js.native
  object alt extends TopLevel[alt with Double]
  
  /* 1 */ @js.native
  object ctrl extends TopLevel[ctrl with Double]
  
  /* 3 */ @js.native
  object meta extends TopLevel[meta with Double]
  
  /* 0 */ @js.native
  object shift extends TopLevel[shift with Double]
  
}

