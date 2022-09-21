package typings.mfiles.global.MFiles

import typings.mfiles.IObjIDs
import typings.mfiles.IObjVer
import typings.mfiles.IObjVers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjVers")
@js.native
open class ObjVers ()
  extends StObject
     with IObjVers {
  
  /* CompleteClass */
  override def Add(Index: Double, ObjVer: IObjVer): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IObjVers = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetAllDistinctObjIDs(): IObjIDs = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IObjVer = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
  
  /* CompleteClass */
  override def ToJSON(): String = js.native
}
