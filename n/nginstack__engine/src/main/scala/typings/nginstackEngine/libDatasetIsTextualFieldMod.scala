package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetIsTextualFieldMod {
  
  inline def apply(ds: DataSet, fieldName: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], fieldName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@nginstack/engine/lib/dataset/isTextualField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
