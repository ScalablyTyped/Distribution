package typings.mfiles.global.MFiles

import typings.mfiles.IEventHandler
import typings.mfiles.IEventHandlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.EventHandlers")
@js.native
open class EventHandlers ()
  extends StObject
     with IEventHandlers {
  
  /* CompleteClass */
  override def Add(Index: Double, EventHandler: IEventHandler): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IEventHandlers = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetIndexByGUID(EventHandlerGUID: String): Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IEventHandler = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
