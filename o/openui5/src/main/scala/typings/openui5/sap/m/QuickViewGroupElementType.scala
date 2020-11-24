package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QuickViewGroupElementType extends js.Object
/**
  * QuickViewGroupElement is a combination of one label and another control (Link or Text) associated to
  * this label
  */
@JSGlobal("sap.m.QuickViewGroupElementType")
@js.native
object QuickViewGroupElementType extends js.Object {
  
  @js.native
  sealed trait email extends QuickViewGroupElementType
  
  @js.native
  sealed trait link extends QuickViewGroupElementType
  
  @js.native
  sealed trait mobile extends QuickViewGroupElementType
  
  @js.native
  sealed trait pageLink extends QuickViewGroupElementType
  
  @js.native
  sealed trait phone extends QuickViewGroupElementType
  
  @js.native
  sealed trait text extends QuickViewGroupElementType
}
