package typings.mfiles.global.MFiles

import typings.mfiles.IObjectTypeColumnMapping
import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjTypeColumnMapping")
@js.native
class ObjTypeColumnMapping ()
  extends StObject
     with IObjectTypeColumnMapping {
  
  /* CompleteClass */
  override def Clone(): IObjectTypeColumnMapping = js.native
  
  /* CompleteClass */
  var ObjectType: MFBuiltInObjectType | Double = js.native
  
  /* CompleteClass */
  var Ordinal: Double = js.native
  
  /* CompleteClass */
  var PartOfInsert: Boolean = js.native
  
  /* CompleteClass */
  var PartOfUpdate: Boolean = js.native
  
  /* CompleteClass */
  var SourceField: String = js.native
  
  /* CompleteClass */
  var TargetPropertyDef: Double = js.native
  
  /* CompleteClass */
  var Type: Double = js.native
}
