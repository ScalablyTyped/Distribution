package typings.mfiles.global.MFiles

import typings.mfiles.IObjID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjID")
@js.native
open class ObjID ()
  extends StObject
     with IObjID {
  
  /* CompleteClass */
  override def Clone(): IObjID = js.native
  
  /* CompleteClass */
  override def CloneFrom(ObjID: IObjID): Unit = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  override def Serialize(): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def SetIDs(ObjType: Double, ID: Double): Unit = js.native
  
  /* CompleteClass */
  override def ToJSON(): String = js.native
  
  /* CompleteClass */
  var Type: Double = js.native
  
  /* CompleteClass */
  override def Unserialize(Bytes: js.Array[Double]): Unit = js.native
}
