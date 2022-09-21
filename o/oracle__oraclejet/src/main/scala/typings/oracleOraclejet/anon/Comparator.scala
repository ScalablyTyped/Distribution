package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmodelMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comparator
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var comparator: js.UndefOr[
    Null | String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])
  ] = js.undefined
  
  var fetchSize: js.UndefOr[Double] = js.undefined
  
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[Model], /* options */ js.Object, Unit]] = js.undefined
  
  var model: js.UndefOr[Model] = js.undefined
  
  var modelLimit: js.UndefOr[Double] = js.undefined
  
  var parse: js.UndefOr[js.Function1[/* data */ Any, Any]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Comparator {
  
  inline def apply(): Comparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comparator]
  }
  
  extension [Self <: Comparator](x: Self) {
    
    inline def setComparator(value: String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorFunction2(value: (/* model1 */ Model, /* model2 */ js.UndefOr[Model]) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    
    inline def setComparatorNull: Self = StObject.set(x, "comparator", null)
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    inline def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
    
    inline def setInitialize(value: (/* models */ js.Array[Model], /* options */ js.Object) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelLimit(value: Double): Self = StObject.set(x, "modelLimit", value.asInstanceOf[js.Any])
    
    inline def setModelLimitUndefined: Self = StObject.set(x, "modelLimit", js.undefined)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setParse(value: /* data */ Any => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
