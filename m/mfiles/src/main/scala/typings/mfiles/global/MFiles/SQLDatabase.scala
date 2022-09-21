package typings.mfiles.global.MFiles

import typings.mfiles.IImpersonation
import typings.mfiles.ISQLDatabase
import typings.mfiles.MFiles.MFDBEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SQLDatabase")
@js.native
open class SQLDatabase ()
  extends StObject
     with ISQLDatabase {
  
  /* CompleteClass */
  var AdminUser: IImpersonation = js.native
  
  /* CompleteClass */
  var BasicUser: IImpersonation = js.native
  
  /* CompleteClass */
  override def Clone(): ISQLDatabase = js.native
  
  /* CompleteClass */
  var Engine: MFDBEngine = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var Server: String = js.native
}
