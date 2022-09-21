package typings.mfiles.global.MFiles

import typings.mfiles.IFileVer
import typings.mfiles.IObjVer
import typings.mfiles.ISharedLinkInfo
import typings.mfiles.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SharedLinkInfo")
@js.native
open class SharedLinkInfo ()
  extends StObject
     with ISharedLinkInfo {
  
  /* CompleteClass */
  override val AccessKey: String = js.native
  
  /* CompleteClass */
  override def Clone(): ISharedLinkInfo = js.native
  
  /* CompleteClass */
  override val CreatedByUser: Double = js.native
  
  /* CompleteClass */
  override val CreationTime: ITimestamp = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* CompleteClass */
  var ExpirationTime: ITimestamp = js.native
  
  /* CompleteClass */
  var FileVer: IFileVer = js.native
  
  /* CompleteClass */
  var ObjVer: IObjVer = js.native
  
  /* CompleteClass */
  override def Set(ObjVer: IObjVer, FileVer: IFileVer): Unit = js.native
}
