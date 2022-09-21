package typings.mfiles.global.MFiles

import typings.mfiles.IActionSendNotification
import typings.mfiles.IUserOrUserGroupIDExs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ActionSendNotification")
@js.native
open class ActionSendNotification ()
  extends StObject
     with IActionSendNotification {
  
  /* CompleteClass */
  override def Clone(): IActionSendNotification = js.native
  
  /* CompleteClass */
  var Message: String = js.native
  
  /* CompleteClass */
  var RecipientsEx: IUserOrUserGroupIDExs = js.native
  
  /* CompleteClass */
  var Subject: String = js.native
}
