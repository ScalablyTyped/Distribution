package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetDeltaDumperMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", "DELTA_ALL")
  @js.native
  def DELTA_ALL: Double = js.native
  inline def DELTA_ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELTA_ALL")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", "DELTA_DELETED")
  @js.native
  def DELTA_DELETED: Double = js.native
  inline def DELTA_DELETED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELTA_DELETED")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", "DELTA_INSERTED")
  @js.native
  def DELTA_INSERTED: Double = js.native
  inline def DELTA_INSERTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELTA_INSERTED")(x.asInstanceOf[js.Any])
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", "DELTA_UPDATED")
  @js.native
  def DELTA_UPDATED: Double = js.native
  inline def DELTA_UPDATED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELTA_UPDATED")(x.asInstanceOf[js.Any])
  
  inline def getDeltaDump(ds: DataSet): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeltaDump")(ds.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getDeltaDump(ds: DataSet, deltaKind: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeltaDump")(ds.asInstanceOf[js.Any], deltaKind.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
