package typings.mfiles.global.MFiles

import typings.mfiles.IExpression
import typings.mfiles.ISearchCondition
import typings.mfiles.ITypedValue
import typings.mfiles.MFiles.MFConditionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SearchCondition")
@js.native
class SearchCondition ()
  extends StObject
     with ISearchCondition {
  
  /* CompleteClass */
  override def Clone(): ISearchCondition = js.native
  
  /* CompleteClass */
  var ConditionType: MFConditionType = js.native
  
  /* CompleteClass */
  var Expression: IExpression = js.native
  
  /* CompleteClass */
  override def Set(Expression: IExpression, ConditionType: MFConditionType, TypedValue: ITypedValue): Unit = js.native
  
  /* CompleteClass */
  var TypedValue: ITypedValue = js.native
}
