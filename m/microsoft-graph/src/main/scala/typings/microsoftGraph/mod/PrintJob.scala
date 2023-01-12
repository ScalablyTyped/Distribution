package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintJob
  extends StObject
     with Entity {
  
  // A group of settings that a printer should use to print a job.
  var configuration: js.UndefOr[PrintJobConfiguration] = js.undefined
  
  var createdBy: js.UndefOr[NullableOption[UserIdentity]] = js.undefined
  
  // The DateTimeOffset when the job was created. Read-only.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  var documents: js.UndefOr[NullableOption[js.Array[PrintDocument]]] = js.undefined
  
  // If true, document can be fetched by printer.
  var isFetchable: js.UndefOr[Boolean] = js.undefined
  
  // Contains the source job URL, if the job has been redirected from another printer.
  var redirectedFrom: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Contains the destination job URL, if the job has been redirected to another printer.
  var redirectedTo: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The status of the print job. Read-only.
  var status: js.UndefOr[PrintJobStatus] = js.undefined
  
  // A list of printTasks that were triggered by this print job.
  var tasks: js.UndefOr[NullableOption[js.Array[PrintTask]]] = js.undefined
}
object PrintJob {
  
  inline def apply(): PrintJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintJob] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: PrintJobConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[UserIdentity]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDocuments(value: NullableOption[js.Array[PrintDocument]]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsNull: Self = StObject.set(x, "documents", null)
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: PrintDocument*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setIsFetchable(value: Boolean): Self = StObject.set(x, "isFetchable", value.asInstanceOf[js.Any])
    
    inline def setIsFetchableUndefined: Self = StObject.set(x, "isFetchable", js.undefined)
    
    inline def setRedirectedFrom(value: NullableOption[String]): Self = StObject.set(x, "redirectedFrom", value.asInstanceOf[js.Any])
    
    inline def setRedirectedFromNull: Self = StObject.set(x, "redirectedFrom", null)
    
    inline def setRedirectedFromUndefined: Self = StObject.set(x, "redirectedFrom", js.undefined)
    
    inline def setRedirectedTo(value: NullableOption[String]): Self = StObject.set(x, "redirectedTo", value.asInstanceOf[js.Any])
    
    inline def setRedirectedToNull: Self = StObject.set(x, "redirectedTo", null)
    
    inline def setRedirectedToUndefined: Self = StObject.set(x, "redirectedTo", js.undefined)
    
    inline def setStatus(value: PrintJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTasks(value: NullableOption[js.Array[PrintTask]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksNull: Self = StObject.set(x, "tasks", null)
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: PrintTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
