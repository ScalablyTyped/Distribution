package typings.mfiles.global.MFiles

import typings.mfiles.IImpersonation
import typings.mfiles.MFiles.MFImpersonationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.Impersonation")
@js.native
open class Impersonation ()
  extends StObject
     with IImpersonation {
  
  /* CompleteClass */
  var Account: String = js.native
  
  /* CompleteClass */
  override def Clone(): IImpersonation = js.native
  
  /* CompleteClass */
  var ImpersonationType: MFImpersonationType = js.native
  
  /* CompleteClass */
  var Password: String = js.native
}
