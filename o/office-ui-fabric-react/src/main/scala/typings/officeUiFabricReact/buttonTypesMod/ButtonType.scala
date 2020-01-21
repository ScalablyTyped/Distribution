package typings.officeUiFabricReact.buttonTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ButtonType")
@js.native
object ButtonType extends js.Object {
  @js.native
  sealed trait command extends ButtonType
  
  @js.native
  sealed trait compound extends ButtonType
  
  @js.native
  sealed trait default extends ButtonType
  
  @js.native
  sealed trait hero extends ButtonType
  
  @js.native
  sealed trait icon extends ButtonType
  
  @js.native
  sealed trait normal extends ButtonType
  
  @js.native
  sealed trait primary extends ButtonType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonType with Double] = js.native
  /* 4 */ @js.native
  object command extends TopLevel[command with Double]
  
  /* 3 */ @js.native
  object compound extends TopLevel[compound with Double]
  
  /* 6 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 2 */ @js.native
  object hero extends TopLevel[hero with Double]
  
  /* 5 */ @js.native
  object icon extends TopLevel[icon with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object primary extends TopLevel[primary with Double]
  
}

