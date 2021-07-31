package typings.mfiles.global.MFiles

import typings.mfiles.IIDRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.IDRange")
@js.native
class IDRange ()
  extends StObject
     with IIDRange {
  
  /* CompleteClass */
  override def Clone(): IIDRange = js.native
  
  /* CompleteClass */
  var MaxID: Double = js.native
  
  /* CompleteClass */
  var MaxID_32bit: String = js.native
  
  /* CompleteClass */
  var MinID: Double = js.native
  
  /* CompleteClass */
  var MinID_32bit: String = js.native
  
  /* CompleteClass */
  override def SetIDs(MinID: Double, MaxID: Double): Unit = js.native
  
  /* CompleteClass */
  override def SetIDs_32bit(MinID: String, MaxID: String): Unit = js.native
}
