package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultReducer extends StObject {
  
  def fields(state: js.Object, action: Action): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object
  @JSName("fields")
  var fields_Original: Reducer[js.Object]
  
  def unset(state: js.Array[String], action: Action): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object
  @JSName("unset")
  var unset_Original: Reducer[js.Array[String]]
}
object DefaultReducer {
  
  @scala.inline
  def apply(
    fields: (js.Object, /* action */ Action) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object,
    unset: (js.Array[String], /* action */ Action) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object
  ): DefaultReducer = {
    val __obj = js.Dynamic.literal(fields = js.Any.fromFunction2(fields), unset = js.Any.fromFunction2(unset))
    __obj.asInstanceOf[DefaultReducer]
  }
  
  @scala.inline
  implicit class DefaultReducerMutableBuilder[Self <: DefaultReducer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(
      value: (js.Object, /* action */ Action) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object
    ): Self = StObject.set(x, "fields", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnset(
      value: (js.Array[String], /* action */ Action) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object
    ): Self = StObject.set(x, "unset", js.Any.fromFunction2(value))
  }
}
