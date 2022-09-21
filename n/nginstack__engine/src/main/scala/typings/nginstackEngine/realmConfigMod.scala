package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realmConfigMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/http/RealmConfig", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RealmConfig {
    
    /* CompleteClass */
    var application: typings.nginstackEngine.dbkeyMod.^ | Double = js.native
    
    /* CompleteClass */
    var cleanupEnvironment: Boolean = js.native
    
    /* CompleteClass */
    var clientTrackingEnabled: Boolean = js.native
    
    /* CompleteClass */
    var environmentType: String = js.native
    
    /* CompleteClass */
    var httpCompressionEnabled: Boolean = js.native
    
    /* CompleteClass */
    var maxInactiveTime: Double = js.native
    
    /* CompleteClass */
    var maxLifeTime: Double = js.native
    
    /* CompleteClass */
    var runtime: String = js.native
    
    /* CompleteClass */
    var sessionTrackingEnabled: Boolean = js.native
  }
  @JSImport("@nginstack/engine/lib/http/RealmConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromKey(directory: Double): RealmConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKey")(directory.asInstanceOf[js.Any]).asInstanceOf[RealmConfig]
  
  inline def fromName(name: String): RealmConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[RealmConfig]
  
  trait RealmConfig extends StObject {
    
    var application: typings.nginstackEngine.dbkeyMod.^ | Double
    
    var cleanupEnvironment: Boolean
    
    var clientTrackingEnabled: Boolean
    
    var environmentType: String
    
    var httpCompressionEnabled: Boolean
    
    var maxInactiveTime: Double
    
    var maxLifeTime: Double
    
    var runtime: String
    
    var sessionTrackingEnabled: Boolean
  }
  object RealmConfig {
    
    inline def apply(
      application: typings.nginstackEngine.dbkeyMod.^ | Double,
      cleanupEnvironment: Boolean,
      clientTrackingEnabled: Boolean,
      environmentType: String,
      httpCompressionEnabled: Boolean,
      maxInactiveTime: Double,
      maxLifeTime: Double,
      runtime: String,
      sessionTrackingEnabled: Boolean
    ): RealmConfig = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cleanupEnvironment = cleanupEnvironment.asInstanceOf[js.Any], clientTrackingEnabled = clientTrackingEnabled.asInstanceOf[js.Any], environmentType = environmentType.asInstanceOf[js.Any], httpCompressionEnabled = httpCompressionEnabled.asInstanceOf[js.Any], maxInactiveTime = maxInactiveTime.asInstanceOf[js.Any], maxLifeTime = maxLifeTime.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sessionTrackingEnabled = sessionTrackingEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[RealmConfig]
    }
    
    extension [Self <: RealmConfig](x: Self) {
      
      inline def setApplication(value: typings.nginstackEngine.dbkeyMod.^ | Double): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setCleanupEnvironment(value: Boolean): Self = StObject.set(x, "cleanupEnvironment", value.asInstanceOf[js.Any])
      
      inline def setClientTrackingEnabled(value: Boolean): Self = StObject.set(x, "clientTrackingEnabled", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentType(value: String): Self = StObject.set(x, "environmentType", value.asInstanceOf[js.Any])
      
      inline def setHttpCompressionEnabled(value: Boolean): Self = StObject.set(x, "httpCompressionEnabled", value.asInstanceOf[js.Any])
      
      inline def setMaxInactiveTime(value: Double): Self = StObject.set(x, "maxInactiveTime", value.asInstanceOf[js.Any])
      
      inline def setMaxLifeTime(value: Double): Self = StObject.set(x, "maxLifeTime", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setSessionTrackingEnabled(value: Boolean): Self = StObject.set(x, "sessionTrackingEnabled", value.asInstanceOf[js.Any])
    }
  }
}
