package typings.nginstackOrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dataSets: js.Array[DataSet]): Double = ^.asInstanceOf[js.Dynamic].apply(dataSets.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(dataSets: DataSet): Double = ^.asInstanceOf[js.Dynamic].apply(dataSets.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@nginstack/orm/lib/persistDataSets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.dataSetMod.^
}
