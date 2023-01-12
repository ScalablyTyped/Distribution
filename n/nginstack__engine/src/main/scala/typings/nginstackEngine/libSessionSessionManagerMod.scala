package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSessionSessionManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/session/SessionManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SessionManager {
    
    /* CompleteClass */
    override def abortSession(sid: String): Unit = js.native
    
    /* CompleteClass */
    override def dropSession(sid: String): Unit = js.native
    
    /* CompleteClass */
    override def dropStatefulSession(sid: String): Unit = js.native
    
    /* CompleteClass */
    override def dropStatelessSession(sid: String): Unit = js.native
    
    /* CompleteClass */
    override def getSessionThreadId(sid: String): Double = js.native
    
    /* CompleteClass */
    override def getStatistics(): DataSet = js.native
    
    /* CompleteClass */
    var inUseSessionsCount: Double = js.native
    
    /* CompleteClass */
    var maxStatefulSessionsCount: Double = js.native
    
    /* CompleteClass */
    var maxStatelessSessionsCount: Double = js.native
    
    /* CompleteClass */
    var sessionsCount: Double = js.native
    
    /* CompleteClass */
    var standaloneSessionsCount: Double = js.native
    
    /* CompleteClass */
    var statefulSessionsCount: Double = js.native
    
    /* CompleteClass */
    var statelessSessionsCount: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/session/SessionManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  trait SessionManager extends StObject {
    
    def abortSession(sid: String): Unit
    
    def dropSession(sid: String): Unit
    
    def dropStatefulSession(sid: String): Unit
    
    def dropStatelessSession(sid: String): Unit
    
    def getSessionThreadId(sid: String): Double
    
    def getStatistics(): DataSet
    
    var inUseSessionsCount: Double
    
    var maxStatefulSessionsCount: Double
    
    var maxStatelessSessionsCount: Double
    
    var sessionsCount: Double
    
    var standaloneSessionsCount: Double
    
    var statefulSessionsCount: Double
    
    var statelessSessionsCount: Double
  }
  object SessionManager {
    
    inline def apply(
      abortSession: String => Unit,
      dropSession: String => Unit,
      dropStatefulSession: String => Unit,
      dropStatelessSession: String => Unit,
      getSessionThreadId: String => Double,
      getStatistics: () => DataSet,
      inUseSessionsCount: Double,
      maxStatefulSessionsCount: Double,
      maxStatelessSessionsCount: Double,
      sessionsCount: Double,
      standaloneSessionsCount: Double,
      statefulSessionsCount: Double,
      statelessSessionsCount: Double
    ): SessionManager = {
      val __obj = js.Dynamic.literal(abortSession = js.Any.fromFunction1(abortSession), dropSession = js.Any.fromFunction1(dropSession), dropStatefulSession = js.Any.fromFunction1(dropStatefulSession), dropStatelessSession = js.Any.fromFunction1(dropStatelessSession), getSessionThreadId = js.Any.fromFunction1(getSessionThreadId), getStatistics = js.Any.fromFunction0(getStatistics), inUseSessionsCount = inUseSessionsCount.asInstanceOf[js.Any], maxStatefulSessionsCount = maxStatefulSessionsCount.asInstanceOf[js.Any], maxStatelessSessionsCount = maxStatelessSessionsCount.asInstanceOf[js.Any], sessionsCount = sessionsCount.asInstanceOf[js.Any], standaloneSessionsCount = standaloneSessionsCount.asInstanceOf[js.Any], statefulSessionsCount = statefulSessionsCount.asInstanceOf[js.Any], statelessSessionsCount = statelessSessionsCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionManager] (val x: Self) extends AnyVal {
      
      inline def setAbortSession(value: String => Unit): Self = StObject.set(x, "abortSession", js.Any.fromFunction1(value))
      
      inline def setDropSession(value: String => Unit): Self = StObject.set(x, "dropSession", js.Any.fromFunction1(value))
      
      inline def setDropStatefulSession(value: String => Unit): Self = StObject.set(x, "dropStatefulSession", js.Any.fromFunction1(value))
      
      inline def setDropStatelessSession(value: String => Unit): Self = StObject.set(x, "dropStatelessSession", js.Any.fromFunction1(value))
      
      inline def setGetSessionThreadId(value: String => Double): Self = StObject.set(x, "getSessionThreadId", js.Any.fromFunction1(value))
      
      inline def setGetStatistics(value: () => DataSet): Self = StObject.set(x, "getStatistics", js.Any.fromFunction0(value))
      
      inline def setInUseSessionsCount(value: Double): Self = StObject.set(x, "inUseSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setMaxStatefulSessionsCount(value: Double): Self = StObject.set(x, "maxStatefulSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setMaxStatelessSessionsCount(value: Double): Self = StObject.set(x, "maxStatelessSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setSessionsCount(value: Double): Self = StObject.set(x, "sessionsCount", value.asInstanceOf[js.Any])
      
      inline def setStandaloneSessionsCount(value: Double): Self = StObject.set(x, "standaloneSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setStatefulSessionsCount(value: Double): Self = StObject.set(x, "statefulSessionsCount", value.asInstanceOf[js.Any])
      
      inline def setStatelessSessionsCount(value: Double): Self = StObject.set(x, "statelessSessionsCount", value.asInstanceOf[js.Any])
    }
  }
}
