package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSetManagerErrorMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetManagerError", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSetManagerError {
    def this(args: Any*) = this()
    
    /* private */ /* CompleteClass */
    var _name: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/dataset/DataSetManagerError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetManagerError", "DATASET_ALREADY_EXISTS")
  @js.native
  val DATASET_ALREADY_EXISTS: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetManagerError", "DATASET_NOT_FOUND")
  @js.native
  val DATASET_NOT_FOUND: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetManagerError", "INVALID_QUERY")
  @js.native
  val INVALID_QUERY: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetManagerError", "PENDING_DATASET")
  @js.native
  val PENDING_DATASET: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetManagerError", "PENDING_DATASET_EXISTS")
  @js.native
  val PENDING_DATASET_EXISTS: Double = js.native
  
  trait DataSetManagerError extends StObject {
    
    /* private */ var _name: Any
  }
  object DataSetManagerError {
    
    inline def apply(_name: Any): DataSetManagerError = {
      val __obj = js.Dynamic.literal(_name = _name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSetManagerError]
    }
    
    extension [Self <: DataSetManagerError](x: Self) {
      
      inline def set_name(value: Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
