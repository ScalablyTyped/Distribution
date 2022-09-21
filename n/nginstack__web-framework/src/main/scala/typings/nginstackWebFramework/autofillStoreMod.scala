package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autofillStoreMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/autofill/AutofillStore", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AutofillStore {
    
    /* CompleteClass */
    override def deleteEntry(entry: AutofillRecordKey): Unit = js.native
    
    /* private */ /* CompleteClass */
    var ds_ : Any = js.native
    
    /* CompleteClass */
    override def findEntry(entry: AutofillRecordKey): AutofillRecord = js.native
    
    /* private */ /* CompleteClass */
    var findEntry_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var formatFilePath_ : Any = js.native
    
    /* CompleteClass */
    override def isModified(): Boolean = js.native
    
    /* CompleteClass */
    override def load(): typings.nginstackEngine.dataSetMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var modified_ : Any = js.native
    
    /* CompleteClass */
    override def newEntry(entry: AutofillRecord): Unit = js.native
    
    /* private */ /* CompleteClass */
    var newProfileDataSet_ : Any = js.native
    
    /* CompleteClass */
    override def save(): Unit = js.native
    
    /* CompleteClass */
    override def setAsModified(): Unit = js.native
    
    /* CompleteClass */
    override def updateEntry(entry: AutofillRecord): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/autofill/AutofillStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): AutofillStore = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[AutofillStore]
  
  trait AutofillRecord extends StObject {
    
    var dateFieldContent: js.Date
    
    var fieldName: String
    
    var fieldType: String
    
    var gridName: String
    
    var interactionName: String
    
    var nullFieldContent: Double
    
    var numFieldContent: Double
    
    var processKey: Double
    
    var strFieldContent: String
  }
  object AutofillRecord {
    
    inline def apply(
      dateFieldContent: js.Date,
      fieldName: String,
      fieldType: String,
      gridName: String,
      interactionName: String,
      nullFieldContent: Double,
      numFieldContent: Double,
      processKey: Double,
      strFieldContent: String
    ): AutofillRecord = {
      val __obj = js.Dynamic.literal(dateFieldContent = dateFieldContent.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], gridName = gridName.asInstanceOf[js.Any], interactionName = interactionName.asInstanceOf[js.Any], nullFieldContent = nullFieldContent.asInstanceOf[js.Any], numFieldContent = numFieldContent.asInstanceOf[js.Any], processKey = processKey.asInstanceOf[js.Any], strFieldContent = strFieldContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutofillRecord]
    }
    
    extension [Self <: AutofillRecord](x: Self) {
      
      inline def setDateFieldContent(value: js.Date): Self = StObject.set(x, "dateFieldContent", value.asInstanceOf[js.Any])
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
      
      inline def setGridName(value: String): Self = StObject.set(x, "gridName", value.asInstanceOf[js.Any])
      
      inline def setInteractionName(value: String): Self = StObject.set(x, "interactionName", value.asInstanceOf[js.Any])
      
      inline def setNullFieldContent(value: Double): Self = StObject.set(x, "nullFieldContent", value.asInstanceOf[js.Any])
      
      inline def setNumFieldContent(value: Double): Self = StObject.set(x, "numFieldContent", value.asInstanceOf[js.Any])
      
      inline def setProcessKey(value: Double): Self = StObject.set(x, "processKey", value.asInstanceOf[js.Any])
      
      inline def setStrFieldContent(value: String): Self = StObject.set(x, "strFieldContent", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutofillRecordKey extends StObject {
    
    var fieldName: String
    
    var fieldType: String
    
    var gridName: String
    
    var interactionName: String
    
    var processKey: Double
  }
  object AutofillRecordKey {
    
    inline def apply(
      fieldName: String,
      fieldType: String,
      gridName: String,
      interactionName: String,
      processKey: Double
    ): AutofillRecordKey = {
      val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], gridName = gridName.asInstanceOf[js.Any], interactionName = interactionName.asInstanceOf[js.Any], processKey = processKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutofillRecordKey]
    }
    
    extension [Self <: AutofillRecordKey](x: Self) {
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
      
      inline def setGridName(value: String): Self = StObject.set(x, "gridName", value.asInstanceOf[js.Any])
      
      inline def setInteractionName(value: String): Self = StObject.set(x, "interactionName", value.asInstanceOf[js.Any])
      
      inline def setProcessKey(value: Double): Self = StObject.set(x, "processKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutofillStore extends StObject {
    
    def deleteEntry(entry: AutofillRecordKey): Unit
    
    /* private */ var ds_ : Any
    
    def findEntry(entry: AutofillRecordKey): AutofillRecord
    
    /* private */ var findEntry_ : Any
    
    /* private */ var formatFilePath_ : Any
    
    def isModified(): Boolean
    
    def load(): typings.nginstackEngine.dataSetMod.^
    
    /* private */ var logger_ : Any
    
    /* private */ var modified_ : Any
    
    def newEntry(entry: AutofillRecord): Unit
    
    /* private */ var newProfileDataSet_ : Any
    
    def save(): Unit
    
    def setAsModified(): Unit
    
    def updateEntry(entry: AutofillRecord): Unit
  }
  object AutofillStore {
    
    inline def apply(
      deleteEntry: AutofillRecordKey => Unit,
      ds_ : Any,
      findEntry: AutofillRecordKey => AutofillRecord,
      findEntry_ : Any,
      formatFilePath_ : Any,
      isModified: () => Boolean,
      load: () => typings.nginstackEngine.dataSetMod.^,
      logger_ : Any,
      modified_ : Any,
      newEntry: AutofillRecord => Unit,
      newProfileDataSet_ : Any,
      save: () => Unit,
      setAsModified: () => Unit,
      updateEntry: AutofillRecord => Unit
    ): AutofillStore = {
      val __obj = js.Dynamic.literal(deleteEntry = js.Any.fromFunction1(deleteEntry), ds_ = ds_.asInstanceOf[js.Any], findEntry = js.Any.fromFunction1(findEntry), findEntry_ = findEntry_.asInstanceOf[js.Any], formatFilePath_ = formatFilePath_.asInstanceOf[js.Any], isModified = js.Any.fromFunction0(isModified), load = js.Any.fromFunction0(load), logger_ = logger_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], newEntry = js.Any.fromFunction1(newEntry), newProfileDataSet_ = newProfileDataSet_.asInstanceOf[js.Any], save = js.Any.fromFunction0(save), setAsModified = js.Any.fromFunction0(setAsModified), updateEntry = js.Any.fromFunction1(updateEntry))
      __obj.asInstanceOf[AutofillStore]
    }
    
    extension [Self <: AutofillStore](x: Self) {
      
      inline def setDeleteEntry(value: AutofillRecordKey => Unit): Self = StObject.set(x, "deleteEntry", js.Any.fromFunction1(value))
      
      inline def setDs_(value: Any): Self = StObject.set(x, "ds_", value.asInstanceOf[js.Any])
      
      inline def setFindEntry(value: AutofillRecordKey => AutofillRecord): Self = StObject.set(x, "findEntry", js.Any.fromFunction1(value))
      
      inline def setFindEntry_(value: Any): Self = StObject.set(x, "findEntry_", value.asInstanceOf[js.Any])
      
      inline def setFormatFilePath_(value: Any): Self = StObject.set(x, "formatFilePath_", value.asInstanceOf[js.Any])
      
      inline def setIsModified(value: () => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction0(value))
      
      inline def setLoad(value: () => typings.nginstackEngine.dataSetMod.^): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setModified_(value: Any): Self = StObject.set(x, "modified_", value.asInstanceOf[js.Any])
      
      inline def setNewEntry(value: AutofillRecord => Unit): Self = StObject.set(x, "newEntry", js.Any.fromFunction1(value))
      
      inline def setNewProfileDataSet_(value: Any): Self = StObject.set(x, "newProfileDataSet_", value.asInstanceOf[js.Any])
      
      inline def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      inline def setSetAsModified(value: () => Unit): Self = StObject.set(x, "setAsModified", js.Any.fromFunction0(value))
      
      inline def setUpdateEntry(value: AutofillRecord => Unit): Self = StObject.set(x, "updateEntry", js.Any.fromFunction1(value))
    }
  }
}
