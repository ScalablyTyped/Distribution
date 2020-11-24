package typings.officeUiFabricReact.buttonTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ButtonType")
@js.native
object ButtonType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonType with Double] = js.native
  
  @js.native
  sealed trait command extends ButtonType
  /* 4 */ @js.native
  object command extends TopLevel[command with Double]
  
  @js.native
  sealed trait compound extends ButtonType
  /* 3 */ @js.native
  object compound extends TopLevel[compound with Double]
  
  @js.native
  sealed trait default extends ButtonType
  /* 6 */ @js.native
  object default extends TopLevel[default with Double]
  
  @js.native
  sealed trait hero extends ButtonType
  /* 2 */ @js.native
  object hero extends TopLevel[hero with Double]
  
  @js.native
  sealed trait icon extends ButtonType
  /* 5 */ @js.native
  object icon extends TopLevel[icon with Double]
  
  @js.native
  sealed trait normal extends ButtonType
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  @js.native
  sealed trait primary extends ButtonType
  /* 1 */ @js.native
  object primary extends TopLevel[primary with Double]
}
