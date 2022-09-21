package typings.mfiles.global.MFiles

import typings.mfiles.ISearchCondition
import typings.mfiles.ISearchConditionEx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SearchConditionEx")
@js.native
open class SearchConditionEx ()
  extends StObject
     with ISearchConditionEx {
  
  /* CompleteClass */
  override def Clone(): ISearchConditionEx = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  var Ignored: Boolean = js.native
  
  /* CompleteClass */
  var SearchCondition: ISearchCondition = js.native
  
  /* CompleteClass */
  override def Set(SearchCondition: ISearchCondition, Enabled: Boolean, SpecialNULL: Boolean, Ignored: Boolean): Unit = js.native
  
  /* CompleteClass */
  var SpecialNULL: Boolean = js.native
}
