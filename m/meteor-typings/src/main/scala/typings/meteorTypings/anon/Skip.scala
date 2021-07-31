package typings.meteorTypings.anon

import typings.meteorTypings.Mongo.FieldSpecifier
import typings.meteorTypings.Mongo.SortSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Skip extends StObject {
  
  var fields: js.UndefOr[FieldSpecifier] = js.undefined
  
  var reactive: js.UndefOr[Boolean] = js.undefined
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[SortSpecifier] = js.undefined
  
  var transform: js.UndefOr[js.Function] = js.undefined
}
object Skip {
  
  @scala.inline
  def apply(): Skip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skip]
  }
  
  @scala.inline
  implicit class SkipMutableBuilder[Self <: Skip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: FieldSpecifier): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setReactive(value: Boolean): Self = StObject.set(x, "reactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactiveUndefined: Self = StObject.set(x, "reactive", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSort(value: SortSpecifier): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
