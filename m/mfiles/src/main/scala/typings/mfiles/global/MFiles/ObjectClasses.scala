package typings.mfiles.global.MFiles

import typings.mfiles.IObjectClass
import typings.mfiles.IObjectClasses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectClasses")
@js.native
open class ObjectClasses ()
  extends StObject
     with IObjectClasses {
  
  /* CompleteClass */
  override def Add(Index: Double, ObjectClass: IObjectClass): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IObjectClasses = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IObjectClass = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
