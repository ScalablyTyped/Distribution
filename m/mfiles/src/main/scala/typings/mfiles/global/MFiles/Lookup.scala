package typings.mfiles.global.MFiles

import typings.mfiles.ILookup
import typings.mfiles.MFiles.MFBuiltInObjectType
import typings.mfiles.MFiles.MFSpecialObjectFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.Lookup")
@js.native
open class Lookup ()
  extends StObject
     with ILookup {
  
  /* CompleteClass */
  override def Clone(): ILookup = js.native
  
  /* CompleteClass */
  override def CloneFrom(Lookup: ILookup): Unit = js.native
  
  /* CompleteClass */
  var Deleted: Boolean = js.native
  
  /* CompleteClass */
  override val DisplayID: String = js.native
  
  /* CompleteClass */
  override val DisplayIDAvailable: Boolean = js.native
  
  /* CompleteClass */
  var DisplayValue: String = js.native
  
  /* CompleteClass */
  override def GetFormattedDisplayValue(Localized: Boolean, EmptyLookupDispValuesAsHidden: Boolean, AddDeletedSuffixIfDeleted: Boolean): String = js.native
  
  /* CompleteClass */
  override val Hidden: Boolean = js.native
  
  /* CompleteClass */
  var Item: Double = js.native
  
  /* CompleteClass */
  var ItemGUID: String = js.native
  
  /* CompleteClass */
  override val ObjectFlags: MFSpecialObjectFlag = js.native
  
  /* CompleteClass */
  var ObjectType: MFBuiltInObjectType | Double = js.native
  
  /* CompleteClass */
  var Version: Double = js.native
}
