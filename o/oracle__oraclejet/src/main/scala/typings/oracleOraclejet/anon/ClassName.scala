package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName[K, D] extends StObject {
  
  var className: js.UndefOr[
    (js.Function1[
      /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
      String | Unit | Null
    ]) | String | Null
  ] = js.native
  
  var renderer: js.UndefOr[
    (js.Function1[
      /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
      `1` | Unit | Null
    ]) | Null
  ] = js.native
  
  var style: js.UndefOr[
    (js.Function1[
      /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
      String | Unit | Null
    ]) | String | Null
  ] = js.native
}
object ClassName {
  
  @scala.inline
  def apply[K, D](): ClassName[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassName[K, D]]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName[_, _], K, D] (val x: Self with (ClassName[K, D])) extends AnyVal {
    
    @scala.inline
    def setClassName(
      value: (js.Function1[
          /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
          String | Unit | Null
        ]) | String
    ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameFunction1(
      value: /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D] => String | Unit | Null
    ): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClassNameNull: Self = StObject.set(x, "className", null)
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setRenderer(
      value: /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D] => `1` | Unit | Null
    ): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setStyle(
      value: (js.Function1[
          /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D], 
          String | Unit | Null
        ]) | String
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction1(
      value: /* context */ typings.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext[K, D] => String | Unit | Null
    ): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
