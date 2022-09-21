package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSetManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/DataSetManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSetManager
  @JSImport("@nginstack/engine/lib/dataset/DataSetManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait DataSetManager extends StObject {
    
    /* private */ var _dataSets: Any = js.native
    
    /* private */ var _executeQueries: Any = js.native
    
    /* private */ var _executeQuerys: Any = js.native
    
    /* private */ var _getDataSetNameFromStream: Any = js.native
    
    def addDataSet(dataSetName: String, dataSet: typings.nginstackEngine.dataSetMod.^): Unit = js.native
    
    def addDataSetQuery(dataSetName: String, query: String): Unit = js.native
    def addDataSetQuery(dataSetName: String, query: String, union: Boolean): Unit = js.native
    
    def clearAll(): Unit = js.native
    
    def clearDataSets(): Unit = js.native
    
    def dataSetNameExists(dataSetName: String): Boolean = js.native
    
    def delDataSets(names: Any): Unit = js.native
    
    def executeAllQueries(): Unit = js.native
    
    /* private */ var executeAllQuerys: Any = js.native
    
    def executePendingQueries(): Unit = js.native
    
    /* private */ var executePendingQuerys: Any = js.native
    
    def getDataSet(dataSetName: String): typings.nginstackEngine.dataSetMod.^ = js.native
    
    def getDataSetNames(): js.Array[Any] = js.native
    
    def getQuery(dataSetName: String): String | js.Array[Any] = js.native
    
    def loadFromStream(stream: File): Unit = js.native
    def loadFromStream(stream: MemoryStream): Unit = js.native
    
    def saveToStream(stream: Any): Unit = js.native
    
    def setDataSet(dataSetName: String, dataSet: typings.nginstackEngine.dataSetMod.^): Unit = js.native
    
    def setDataSetQuery(dataSetName: String, query: String, keepDataSet: Any, union: Any): Unit = js.native
  }
  
  type File = typings.nginstackEngine.fileMod.^
  
  type MemoryStream = typings.nginstackEngine.memoryStreamMod.^
}
