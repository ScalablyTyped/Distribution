package typings.mfiles.global.MFiles

import typings.mfiles.IObjectClassAdmin
import typings.mfiles.IObjectClassesAdmin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectClassesAdmin")
@js.native
open class ObjectClassesAdmin ()
  extends StObject
     with IObjectClassesAdmin {
  
  /* CompleteClass */
  override def Add(Index: Double, ObjectClassAdmin: IObjectClassAdmin): Unit = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IObjectClassAdmin = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
