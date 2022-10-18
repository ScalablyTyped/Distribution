package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseKeysUtilitiesMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/KeysUtilities", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with KeysUtilities
  @JSImport("@nginstack/engine/lib/database/KeysUtilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): KeysUtilities = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[KeysUtilities]
  
  @js.native
  trait KeysUtilities extends StObject {
    
    def copyKeys(keys: String, startPosition: Double, count: Double): String = js.native
    
    def extract(keysForExtract: Any, keys: Any): String = js.native
    def extract(keysForExtract: Any, keys: Any, separator: String): String = js.native
    
    def getChildrenFromClassesKeys(keys: String): String = js.native
    def getChildrenFromClassesKeys(keys: String, userKey: Double): String = js.native
    
    def getDistinctKeys(keys: String): String = js.native
    
    def getIntersectKeys(keys1: String, keys2: String): String = js.native
    
    def getIntersectKeysFromKeyList(keys: js.Array[Any]): js.Array[Any] = js.native
    
    def getKeysCount(keys: String): Double = js.native
    
    def getKeysFromCode(classKey: Any, code: String): String = js.native
    def getKeysFromCode(classKey: Any, code: String, classesFilter: String): String = js.native
    def getKeysFromCode(
      classKey: Any,
      code: String,
      classesFilter: String,
      ds: typings.nginstackEngine.libDatasetDataSetMod.^
    ): String = js.native
    def getKeysFromCode(
      classKey: Any,
      code: String,
      classesFilter: Unit,
      ds: typings.nginstackEngine.libDatasetDataSetMod.^
    ): String = js.native
    
    def getKeysFromField(dataSet: typings.nginstackEngine.libDatasetDataSetMod.^, fieldName: String, distinct: Boolean): String = js.native
    
    def getKeysFromIncompleteCode(classKey: Any, code: String): String = js.native
    def getKeysFromIncompleteCode(classKey: Any, code: String, classesFilter: String): String = js.native
    def getKeysFromIncompleteCode(
      classKey: Any,
      code: String,
      classesFilter: String,
      ds: typings.nginstackEngine.libDatasetDataSetMod.^
    ): String = js.native
    def getKeysFromIncompleteCode(
      classKey: Any,
      code: String,
      classesFilter: Unit,
      ds: typings.nginstackEngine.libDatasetDataSetMod.^
    ): String = js.native
    
    var getKeysFromLocate: Any = js.native
    
    def getKeysFromLocateKeys(classKey: Any, fieldName: String, keys: String): String = js.native
    def getKeysFromLocateKeys(classKey: Any, fieldName: String, keys: String, filter: String): String = js.native
    
    def getKeysFromMultipleCode(classKey: Any, code: String): String = js.native
    def getKeysFromMultipleCode(classKey: Any, code: String, filter: String): String = js.native
    def getKeysFromMultipleCode(classKey: Any, code: String, filter: String, ds: typings.nginstackEngine.libDatasetDataSetMod.^): String = js.native
    def getKeysFromMultipleCode(classKey: Any, code: String, filter: Unit, ds: typings.nginstackEngine.libDatasetDataSetMod.^): String = js.native
    
    def getNoIntersectKeys(keys1: String, keys2: String, returnArray: Any): String = js.native
    
    def getUnionKeys(keys1: String, keys2: String): String = js.native
    
    def getUrl(classKey: Double, name: String): String = js.native
    
    def hierarchicalClass(startClass: Double, endClass: Double): String = js.native
    def hierarchicalClass(startClass: Double, endClass: Double, level: Double): String = js.native
    
    def keyInKeysList(key: Any, keysList: Any): Boolean = js.native
  }
}
