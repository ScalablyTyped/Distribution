package typings.octokitPluginPaginateRest.anon

import typings.octokitPluginPaginateRest.typesMod.GetResultsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataGetResultsType[T] extends StObject {
  
  var data: GetResultsType[T] = js.native
}
object DataGetResultsType {
  
  @scala.inline
  def apply[T](data: GetResultsType[T]): DataGetResultsType[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGetResultsType[T]]
  }
  
  @scala.inline
  implicit class DataGetResultsTypeMutableBuilder[Self <: DataGetResultsType[_], T] (val x: Self with DataGetResultsType[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: GetResultsType[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
