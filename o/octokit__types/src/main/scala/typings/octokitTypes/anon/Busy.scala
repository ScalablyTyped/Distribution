package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Busy extends StObject {
  
  var busy: Boolean
  
  var id: Double
  
  var labels: js.Array[Id]
  
  var name: String
  
  var os: String
  
  var status: String
}
object Busy {
  
  @scala.inline
  def apply(busy: Boolean, id: Double, labels: js.Array[Id], name: String, os: String, status: String): Busy = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Busy]
  }
  
  @scala.inline
  implicit class BusyMutableBuilder[Self <: Busy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[Id]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: Id*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
