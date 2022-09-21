package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionConfigurationMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/SessionConfiguration", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SessionConfiguration {
    
    /* CompleteClass */
    var application: DBKey | Double = js.native
    
    /* CompleteClass */
    var cleanupEnvironment: Boolean = js.native
    
    /* CompleteClass */
    var clientTrackingEnabled: Boolean = js.native
    
    /* CompleteClass */
    override def duplicate(): SessionConfiguration = js.native
    
    /* private */ /* CompleteClass */
    var duplicating_ : Any = js.native
    
    /* CompleteClass */
    var environmentType: Boolean = js.native
    
    /* CompleteClass */
    var httpCompressionEnabled: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    var maxEnvironmentInactiveTime: Double = js.native
    
    /* CompleteClass */
    var maxEnvironmentLifeTime: Double = js.native
    
    /* CompleteClass */
    var maxSessionInactiveTime: Double = js.native
    
    /* CompleteClass */
    var persistence: Boolean = js.native
    
    /* CompleteClass */
    var realm: String = js.native
    
    /* CompleteClass */
    var sessionTrackingEnabled: Boolean = js.native
    
    /* CompleteClass */
    var timeout: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/SessionConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DBKey = typings.nginstackEngine.dbkeyMod.^
  
  trait SessionConfiguration extends StObject {
    
    var application: DBKey | Double
    
    var cleanupEnvironment: Boolean
    
    var clientTrackingEnabled: Boolean
    
    def duplicate(): SessionConfiguration
    
    /* private */ var duplicating_ : Any
    
    var environmentType: Boolean
    
    var httpCompressionEnabled: Boolean
    
    /* private */ var logger_ : Any
    
    var maxEnvironmentInactiveTime: Double
    
    var maxEnvironmentLifeTime: Double
    
    var maxSessionInactiveTime: Double
    
    var persistence: Boolean
    
    var realm: String
    
    var sessionTrackingEnabled: Boolean
    
    var timeout: Double
  }
  object SessionConfiguration {
    
    inline def apply(
      application: DBKey | Double,
      cleanupEnvironment: Boolean,
      clientTrackingEnabled: Boolean,
      duplicate: () => SessionConfiguration,
      duplicating_ : Any,
      environmentType: Boolean,
      httpCompressionEnabled: Boolean,
      logger_ : Any,
      maxEnvironmentInactiveTime: Double,
      maxEnvironmentLifeTime: Double,
      maxSessionInactiveTime: Double,
      persistence: Boolean,
      realm: String,
      sessionTrackingEnabled: Boolean,
      timeout: Double
    ): SessionConfiguration = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cleanupEnvironment = cleanupEnvironment.asInstanceOf[js.Any], clientTrackingEnabled = clientTrackingEnabled.asInstanceOf[js.Any], duplicate = js.Any.fromFunction0(duplicate), duplicating_ = duplicating_.asInstanceOf[js.Any], environmentType = environmentType.asInstanceOf[js.Any], httpCompressionEnabled = httpCompressionEnabled.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], maxEnvironmentInactiveTime = maxEnvironmentInactiveTime.asInstanceOf[js.Any], maxEnvironmentLifeTime = maxEnvironmentLifeTime.asInstanceOf[js.Any], maxSessionInactiveTime = maxSessionInactiveTime.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], sessionTrackingEnabled = sessionTrackingEnabled.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionConfiguration]
    }
    
    extension [Self <: SessionConfiguration](x: Self) {
      
      inline def setApplication(value: DBKey | Double): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setCleanupEnvironment(value: Boolean): Self = StObject.set(x, "cleanupEnvironment", value.asInstanceOf[js.Any])
      
      inline def setClientTrackingEnabled(value: Boolean): Self = StObject.set(x, "clientTrackingEnabled", value.asInstanceOf[js.Any])
      
      inline def setDuplicate(value: () => SessionConfiguration): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
      
      inline def setDuplicating_(value: Any): Self = StObject.set(x, "duplicating_", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentType(value: Boolean): Self = StObject.set(x, "environmentType", value.asInstanceOf[js.Any])
      
      inline def setHttpCompressionEnabled(value: Boolean): Self = StObject.set(x, "httpCompressionEnabled", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setMaxEnvironmentInactiveTime(value: Double): Self = StObject.set(x, "maxEnvironmentInactiveTime", value.asInstanceOf[js.Any])
      
      inline def setMaxEnvironmentLifeTime(value: Double): Self = StObject.set(x, "maxEnvironmentLifeTime", value.asInstanceOf[js.Any])
      
      inline def setMaxSessionInactiveTime(value: Double): Self = StObject.set(x, "maxSessionInactiveTime", value.asInstanceOf[js.Any])
      
      inline def setPersistence(value: Boolean): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setSessionTrackingEnabled(value: Boolean): Self = StObject.set(x, "sessionTrackingEnabled", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
