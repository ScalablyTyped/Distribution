package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListSeparators extends js.Object
/**
  * Defines which separator style will be applied for the items.
  */
@JSGlobal("sap.m.ListSeparators")
@js.native
object ListSeparators extends js.Object {
  
  @js.native
  sealed trait All extends ListSeparators
  
  @js.native
  sealed trait Inner extends ListSeparators
  
  @js.native
  sealed trait None extends ListSeparators
}
