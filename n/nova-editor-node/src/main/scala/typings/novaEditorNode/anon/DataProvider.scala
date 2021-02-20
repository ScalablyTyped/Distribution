package typings.novaEditorNode.anon

import typings.novaEditorNode.TreeDataProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProvider[E] extends StObject {
  
  var dataProvider: TreeDataProvider[E] = js.native
}
object DataProvider {
  
  @scala.inline
  def apply[E](dataProvider: TreeDataProvider[E]): DataProvider[E] = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProvider[E]]
  }
  
  @scala.inline
  implicit class DataProviderMutableBuilder[Self <: DataProvider[_], E] (val x: Self with DataProvider[E]) extends AnyVal {
    
    @scala.inline
    def setDataProvider(value: TreeDataProvider[E]): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
  }
}
