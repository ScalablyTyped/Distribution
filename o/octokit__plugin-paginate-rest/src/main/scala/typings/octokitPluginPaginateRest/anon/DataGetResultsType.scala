package typings.octokitPluginPaginateRest.anon

import typings.octokitPluginPaginateRest.distTypesTypesMod.GetResultsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataGetResultsType[T] extends StObject {
  
  var data: GetResultsType[T]
}
object DataGetResultsType {
  
  inline def apply[T](data: GetResultsType[T]): DataGetResultsType[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGetResultsType[T]]
  }
  
  extension [Self <: DataGetResultsType[?], T](x: Self & DataGetResultsType[T]) {
    
    inline def setData(value: GetResultsType[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
