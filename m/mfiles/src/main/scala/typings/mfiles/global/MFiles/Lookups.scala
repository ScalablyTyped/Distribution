package typings.mfiles.global.MFiles

import typings.mfiles.ILookup
import typings.mfiles.ILookups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.Lookups")
@js.native
class Lookups ()
  extends StObject
     with ILookups {
  
  /* CompleteClass */
  override def Add(Index: Double, Lookup: ILookup): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): ILookups = js.native
  
  /* CompleteClass */
  override def CloneFrom(Lookups: ILookups): Unit = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetLookupByItem(Item: Double): ILookup = js.native
  
  /* CompleteClass */
  override def GetLookupIndexByItem(Item: Double): Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): ILookup = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
