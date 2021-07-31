package typings.mfiles.global.MFiles

import typings.mfiles.IAdditionalClassInfo
import typings.mfiles.IAssignmentClassInfo
import typings.mfiles.MFiles.MFAdditionalClassInfoType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AdditionalClassInfo")
@js.native
class AdditionalClassInfo ()
  extends StObject
     with IAdditionalClassInfo {
  
  /* CompleteClass */
  var AssignmentClassInfo: IAssignmentClassInfo = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IAdditionalClassInfo = js.native
  
  /* CompleteClass */
  override val InfoType: MFAdditionalClassInfoType = js.native
}
