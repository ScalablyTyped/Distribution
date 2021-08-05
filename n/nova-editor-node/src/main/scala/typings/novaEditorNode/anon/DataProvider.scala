package typings.novaEditorNode.anon

import typings.novaEditorNode.TreeDataProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProvider[E] extends StObject {
  
  var dataProvider: TreeDataProvider[E]
}
object DataProvider {
  
  inline def apply[E](dataProvider: TreeDataProvider[E]): DataProvider[E] = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProvider[E]]
  }
  
  extension [Self <: DataProvider[?], E](x: Self & DataProvider[E]) {
    
    inline def setDataProvider(value: TreeDataProvider[E]): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
  }
}
