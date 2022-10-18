package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetSetEmptyRangeMod {
  
  inline def apply(ds: DataSet): Unit = ^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/setEmptyRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/setEmptyRange", "NUMERIC_EMPTY_RANGE_END_")
  @js.native
  def NUMERIC_EMPTY_RANGE_END_ : Double = js.native
  inline def NUMERIC_EMPTY_RANGE_END__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMERIC_EMPTY_RANGE_END_")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dataset/setEmptyRange", "NUMERIC_EMPTY_RANGE_START_")
  @js.native
  def NUMERIC_EMPTY_RANGE_START_ : Double = js.native
  inline def NUMERIC_EMPTY_RANGE_START__=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMERIC_EMPTY_RANGE_START_")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dataset/setEmptyRange", "STRING_EMPTY_RANGE_END_")
  @js.native
  def STRING_EMPTY_RANGE_END_ : String = js.native
  inline def STRING_EMPTY_RANGE_END__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING_EMPTY_RANGE_END_")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dataset/setEmptyRange", "STRING_EMPTY_RANGE_START_")
  @js.native
  def STRING_EMPTY_RANGE_START_ : String = js.native
  inline def STRING_EMPTY_RANGE_START__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING_EMPTY_RANGE_START_")(x.asInstanceOf[js.Any])
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
