package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MenuButtonMode extends StObject
/**
  * Different mode for a MenuButton (predefined types)
  */
@JSGlobal("sap.m.MenuButtonMode")
@js.native
object MenuButtonMode extends StObject {
  
  @js.native
  sealed trait Regular
    extends StObject
       with MenuButtonMode
  
  @js.native
  sealed trait Split
    extends StObject
       with MenuButtonMode
}
