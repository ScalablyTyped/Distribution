package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaDumperMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", "DELTA_ALL")
  @js.native
  val DELTA_ALL: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", "DELTA_DELETED")
  @js.native
  val DELTA_DELETED: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", "DELTA_INSERTED")
  @js.native
  val DELTA_INSERTED: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaDumper", "DELTA_UPDATED")
  @js.native
  val DELTA_UPDATED: Double = js.native
  
  inline def getDeltaDump(ds: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeltaDump")(ds.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getDeltaDump(ds: Any, deltaKind: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeltaDump")(ds.asInstanceOf[js.Any], deltaKind.asInstanceOf[js.Any])).asInstanceOf[Any]
}
