package typings.openui5.sap.ui.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundDesign extends js.Object
/**
  * Available Background Design.
  */
@JSGlobal("sap.ui.layout.BackgroundDesign")
@js.native
object BackgroundDesign extends js.Object {
  
  @js.native
  sealed trait Solid extends BackgroundDesign
  
  @js.native
  sealed trait Translucent extends BackgroundDesign
  
  @js.native
  sealed trait Transparent extends BackgroundDesign
}
