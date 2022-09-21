package typings.mfiles.global.MFiles

import typings.mfiles.IMFilesVersion
import typings.mfiles.MFiles.MFSoftwarePlatformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.MFilesVersion")
@js.native
open class MFilesVersion ()
  extends StObject
     with IMFilesVersion {
  
  /* CompleteClass */
  var Build: Double = js.native
  
  /* CompleteClass */
  override def Clone(): IMFilesVersion = js.native
  
  /* CompleteClass */
  override def CompareTo(RightSide: IMFilesVersion): Double = js.native
  
  /* CompleteClass */
  override val Display: String = js.native
  
  /* CompleteClass */
  var Major: Double = js.native
  
  /* CompleteClass */
  var Minor: Double = js.native
  
  /* CompleteClass */
  var Patch: Double = js.native
  
  /* CompleteClass */
  var SoftwarePlatform: MFSoftwarePlatformType = js.native
}
