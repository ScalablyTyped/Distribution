package typings.mfiles.global.MFiles

import typings.mfiles.ISearchConditions
import typings.mfiles.ISearchCriteria
import typings.mfiles.ITemporarySearchView
import typings.mfiles.IView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.TemporarySearchView")
@js.native
open class TemporarySearchView ()
  extends StObject
     with ITemporarySearchView {
  
  /* CompleteClass */
  override val BaseSearchConditions: ISearchConditions = js.native
  
  /* CompleteClass */
  var SearchCriteria: ISearchCriteria = js.native
  
  /* CompleteClass */
  override val View: IView = js.native
}
