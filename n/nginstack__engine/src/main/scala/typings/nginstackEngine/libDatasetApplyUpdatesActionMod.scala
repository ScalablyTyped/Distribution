package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetApplyUpdatesActionMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/ApplyUpdatesAction", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ApplyUpdatesAction
  @JSImport("@nginstack/engine/lib/dataset/ApplyUpdatesAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/ApplyUpdatesAction", "DELETE")
  @js.native
  val DELETE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/ApplyUpdatesAction", "FORCED_UPDATE")
  @js.native
  val FORCED_UPDATE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/ApplyUpdatesAction", "INSERT")
  @js.native
  val INSERT: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/ApplyUpdatesAction", "NONE")
  @js.native
  val NONE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/ApplyUpdatesAction", "UPDATE")
  @js.native
  val UPDATE: Double = js.native
  
  trait ApplyUpdatesAction extends StObject
}
