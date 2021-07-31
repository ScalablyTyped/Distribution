package typings.mfiles.global.MFiles

import typings.mfiles.IIndirectPropertyID
import typings.mfiles.IIndirectPropertyIDLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.IndirectPropertyID")
@js.native
class IndirectPropertyID ()
  extends StObject
     with IIndirectPropertyID {
  
  /* CompleteClass */
  override def Add(Index: Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IIndirectPropertyID = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def EqualTo(IndirectPropertyID: IIndirectPropertyID): Boolean = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IIndirectPropertyIDLevel = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
  
  /* CompleteClass */
  override def ToJSON(): String = js.native
}
