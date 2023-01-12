package typings.meteorTypings.anon

import typings.meteorTypings.meteorMongoMod.Mongo.FieldSpecifier
import typings.meteorTypings.meteorMongoMod.Mongo.SortSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reactive extends StObject {
  
  var fields: js.UndefOr[FieldSpecifier] = js.undefined
  
  var reactive: js.UndefOr[Boolean] = js.undefined
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[SortSpecifier] = js.undefined
  
  var transform: js.UndefOr[js.Function] = js.undefined
}
object Reactive {
  
  inline def apply(): Reactive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reactive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reactive] (val x: Self) extends AnyVal {
    
    inline def setFields(value: FieldSpecifier): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setReactive(value: Boolean): Self = StObject.set(x, "reactive", value.asInstanceOf[js.Any])
    
    inline def setReactiveUndefined: Self = StObject.set(x, "reactive", js.undefined)
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSort(value: SortSpecifier): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
