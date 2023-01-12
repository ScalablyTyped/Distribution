package typings.nginstackWebFramework

import org.scalablytyped.runtime.StringDictionary
import typings.nginstackWebFramework.anon.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvVisualizationSchedulerJobMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationSchedulerJob", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with VisualizationSchedulerJob {
    
    /* CompleteClass */
    var filters: StringDictionary[Any] = js.native
    
    /* CompleteClass */
    var key: Double = js.native
    
    /* CompleteClass */
    override def loadFromEnvironment(): Unit = js.native
    
    /* CompleteClass */
    override def loadFromKey(key: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var loadFromParametersField_ : Any = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    /* CompleteClass */
    var recipients: js.Array[Address] = js.native
    
    /* CompleteClass */
    var report: Double = js.native
    
    /* CompleteClass */
    override def run(): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationSchedulerJob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatParametersField(jobKey: Double, dsvKey: Double, filters: Any, recipients: js.Array[Address]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatParametersField")(jobKey.asInstanceOf[js.Any], dsvKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], recipients.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getServer(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getServer")().asInstanceOf[Double]
  
  inline def parseParametersField(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseParametersField")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def syncServerScheduler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncServerScheduler")().asInstanceOf[Unit]
  
  inline def tryGetServer(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tryGetServer")().asInstanceOf[Double]
  
  trait VisualizationSchedulerJob extends StObject {
    
    var filters: StringDictionary[Any]
    
    var key: Double
    
    def loadFromEnvironment(): Unit
    
    def loadFromKey(key: Double): Unit
    
    /* private */ var loadFromParametersField_ : Any
    
    val name: String
    
    var recipients: js.Array[Address]
    
    var report: Double
    
    def run(): Unit
  }
  object VisualizationSchedulerJob {
    
    inline def apply(
      filters: StringDictionary[Any],
      key: Double,
      loadFromEnvironment: () => Unit,
      loadFromKey: Double => Unit,
      loadFromParametersField_ : Any,
      name: String,
      recipients: js.Array[Address],
      report: Double,
      run: () => Unit
    ): VisualizationSchedulerJob = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loadFromEnvironment = js.Any.fromFunction0(loadFromEnvironment), loadFromKey = js.Any.fromFunction1(loadFromKey), loadFromParametersField_ = loadFromParametersField_.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[VisualizationSchedulerJob]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisualizationSchedulerJob] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: StringDictionary[Any]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLoadFromEnvironment(value: () => Unit): Self = StObject.set(x, "loadFromEnvironment", js.Any.fromFunction0(value))
      
      inline def setLoadFromKey(value: Double => Unit): Self = StObject.set(x, "loadFromKey", js.Any.fromFunction1(value))
      
      inline def setLoadFromParametersField_(value: Any): Self = StObject.set(x, "loadFromParametersField_", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRecipients(value: js.Array[Address]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsVarargs(value: Address*): Self = StObject.set(x, "recipients", js.Array(value*))
      
      inline def setReport(value: Double): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    }
  }
}
