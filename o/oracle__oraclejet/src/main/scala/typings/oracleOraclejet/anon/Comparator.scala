package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmodelMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comparator
  extends /* key */ StringDictionary[js.Any] {
  
  var comparator: js.UndefOr[
    Null | String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])
  ] = js.native
  
  var fetchSize: js.UndefOr[Double] = js.native
  
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[Model], /* options */ js.Object, Unit]] = js.native
  
  var model: js.UndefOr[Model] = js.native
  
  var modelLimit: js.UndefOr[Double] = js.native
  
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Comparator {
  
  @scala.inline
  def apply(): Comparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comparator]
  }
  
  @scala.inline
  implicit class ComparatorMutableBuilder[Self <: Comparator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorFunction2(value: (/* model1 */ Model, /* model2 */ js.UndefOr[Model]) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComparatorNull: Self = StObject.set(x, "comparator", null)
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
    
    @scala.inline
    def setInitialize(value: (/* models */ js.Array[Model], /* options */ js.Object) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelLimit(value: Double): Self = StObject.set(x, "modelLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelLimitUndefined: Self = StObject.set(x, "modelLimit", js.undefined)
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setParse(value: /* data */ js.Any => _): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
