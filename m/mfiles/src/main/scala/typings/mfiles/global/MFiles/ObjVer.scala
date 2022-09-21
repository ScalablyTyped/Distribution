package typings.mfiles.global.MFiles

import typings.mfiles.IObjID
import typings.mfiles.IObjVer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjVer")
@js.native
open class ObjVer ()
  extends StObject
     with IObjVer {
  
  /* CompleteClass */
  override def Clone(): IObjVer = js.native
  
  /* CompleteClass */
  override def CloneFrom(ObjVer: IObjVer): Unit = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var ObjID: IObjID = js.native
  
  /* CompleteClass */
  override def Serialize(): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def SetIDs(ObjType: Double, ID: Double, Version: Double): Unit = js.native
  
  /* CompleteClass */
  override def SetObjIDAndVersion(ObjID: IObjID, Version: Double): Unit = js.native
  
  /* CompleteClass */
  override def ToJSON(): String = js.native
  
  /* CompleteClass */
  var Type: Double = js.native
  
  /* CompleteClass */
  override def Unserialize(Bytes: js.Array[Double]): Unit = js.native
  
  /* CompleteClass */
  var Version: Double = js.native
}
