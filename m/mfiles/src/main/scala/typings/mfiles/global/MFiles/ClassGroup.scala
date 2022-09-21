package typings.mfiles.global.MFiles

import typings.mfiles.IClassGroup
import typings.mfiles.IIDs
import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ClassGroup")
@js.native
open class ClassGroup ()
  extends StObject
     with IClassGroup {
  
  /* CompleteClass */
  override def AddMember(Member: Double): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IClassGroup = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Members: IIDs = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var ObjectType: MFBuiltInObjectType | Double = js.native
  
  /* CompleteClass */
  override def RemoveMember(Member: Double): Unit = js.native
}
