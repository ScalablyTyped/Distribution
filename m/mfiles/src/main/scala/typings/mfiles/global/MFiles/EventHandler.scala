package typings.mfiles.global.MFiles

import typings.mfiles.IEventHandler
import typings.mfiles.MFiles.MFEventHandlerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.EventHandler")
@js.native
open class EventHandler ()
  extends StObject
     with IEventHandler {
  
  /* CompleteClass */
  var Active: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): IEventHandler = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* CompleteClass */
  var EventType: MFEventHandlerType = js.native
  
  /* CompleteClass */
  override val GUID: String = js.native
  
  /* CompleteClass */
  override def GetID(): Double = js.native
  
  /* CompleteClass */
  var VBScript: String = js.native
}
