package typings.mfiles.global.MFiles

import typings.mfiles.IAutomaticPermissions
import typings.mfiles.INamedACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AutomaticPermissions")
@js.native
open class AutomaticPermissions ()
  extends StObject
     with IAutomaticPermissions {
  
  /* CompleteClass */
  var CanDeactivate: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): IAutomaticPermissions = js.native
  
  /* CompleteClass */
  override val IsBasedOnObjectACL: Boolean = js.native
  
  /* CompleteClass */
  override val IsDefault: Boolean = js.native
  
  /* CompleteClass */
  override val NamedACL: INamedACL = js.native
  
  /* CompleteClass */
  override def SetBasedOnObjectACL(): Unit = js.native
  
  /* CompleteClass */
  override def SetNamedACL(NamedACL: INamedACL): Unit = js.native
}
