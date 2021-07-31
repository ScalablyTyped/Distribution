package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredQuery extends StObject {
  
  /** A end point for the query results. */
  var endAt: js.UndefOr[Cursor] = js.undefined
  
  /** The collections to query. */
  var from: js.UndefOr[js.Array[CollectionSelector]] = js.undefined
  
  /** The maximum number of results to return. Applies after all other constraints. Must be >= 0 if specified. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** The number of results to skip. Applies before limit, but after all other constraints. Must be >= 0 if specified. */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The order to apply to the query results. Firestore guarantees a stable ordering through the following rules: * Any field required to appear in `order_by`, that is not already
    * specified in `order_by`, is appended to the order in field name order by default. * If an order on `__name__` is not specified, it is appended by default. Fields are appended with
    * the same sort direction as the last order specified, or 'ASCENDING' if no order was specified. For example: * `SELECT * FROM Foo ORDER BY A` becomes `SELECT * FROM Foo ORDER BY A,
    * __name__` * `SELECT * FROM Foo ORDER BY A DESC` becomes `SELECT * FROM Foo ORDER BY A DESC, __name__ DESC` * `SELECT * FROM Foo WHERE A > 1` becomes `SELECT * FROM Foo WHERE A > 1
    * ORDER BY A, __name__`
    */
  var orderBy: js.UndefOr[js.Array[Order]] = js.undefined
  
  /** The projection to return. */
  var select: js.UndefOr[Projection] = js.undefined
  
  /** A starting point for the query results. */
  var startAt: js.UndefOr[Cursor] = js.undefined
  
  /** The filter to apply. */
  var where: js.UndefOr[Filter] = js.undefined
}
object StructuredQuery {
  
  @scala.inline
  def apply(): StructuredQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredQuery]
  }
  
  @scala.inline
  implicit class StructuredQueryMutableBuilder[Self <: StructuredQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndAt(value: Cursor): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
    
    @scala.inline
    def setFrom(value: js.Array[CollectionSelector]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFromVarargs(value: CollectionSelector*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrderBy(value: js.Array[Order]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setOrderByVarargs(value: Order*): Self = StObject.set(x, "orderBy", js.Array(value :_*))
    
    @scala.inline
    def setSelect(value: Projection): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setStartAt(value: Cursor): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    @scala.inline
    def setWhere(value: Filter): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
