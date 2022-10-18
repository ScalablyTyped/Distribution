package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetDataSetStatesMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetStates", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSetStates
  @JSImport("@nginstack/engine/lib/dataset/DataSetStates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetStates", "BROWSE")
  @js.native
  val BROWSE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetStates", "EDIT")
  @js.native
  val EDIT: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetStates", "INACTIVE")
  @js.native
  val INACTIVE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetStates", "INSERT")
  @js.native
  val INSERT: Double = js.native
  
  trait DataSetStates extends StObject
}
