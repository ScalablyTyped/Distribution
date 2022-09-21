package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatrixData extends StObject {
  
  def getCols(): Double
  
  def getLayout(): Layout
  
  def getPackedDataList(): js.Array[Double]
  
  def getRows(): Double
}
object MatrixData {
  
  inline def apply(
    getCols: () => Double,
    getLayout: () => Layout,
    getPackedDataList: () => js.Array[Double],
    getRows: () => Double
  ): MatrixData = {
    val __obj = js.Dynamic.literal(getCols = js.Any.fromFunction0(getCols), getLayout = js.Any.fromFunction0(getLayout), getPackedDataList = js.Any.fromFunction0(getPackedDataList), getRows = js.Any.fromFunction0(getRows))
    __obj.asInstanceOf[MatrixData]
  }
  
  extension [Self <: MatrixData](x: Self) {
    
    inline def setGetCols(value: () => Double): Self = StObject.set(x, "getCols", js.Any.fromFunction0(value))
    
    inline def setGetLayout(value: () => Layout): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    inline def setGetPackedDataList(value: () => js.Array[Double]): Self = StObject.set(x, "getPackedDataList", js.Any.fromFunction0(value))
    
    inline def setGetRows(value: () => Double): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
  }
}
