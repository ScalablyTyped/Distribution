package typings.mfiles.global.MFiles

import typings.mfiles.IAssociatedPropertyDef
import typings.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AssociatedPropertyDef")
@js.native
class AssociatedPropertyDef ()
  extends StObject
     with IAssociatedPropertyDef {
  
  /* CompleteClass */
  override def Clone(): IAssociatedPropertyDef = js.native
  
  /* CompleteClass */
  var PropertyDef: MFBuiltInPropertyDef | Double = js.native
  
  /* CompleteClass */
  var Required: Boolean = js.native
}
