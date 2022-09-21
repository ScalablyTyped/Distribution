package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlList
import typings.mfiles.INamedACL
import typings.mfiles.MFiles.MFNamedACLType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.NamedACL")
@js.native
open class NamedACL ()
  extends StObject
     with INamedACL {
  
  /* CompleteClass */
  var AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  override def Clone(): INamedACL = js.native
  
  /* CompleteClass */
  override val GUID: String = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val NamedACLType: MFNamedACLType = js.native
}
