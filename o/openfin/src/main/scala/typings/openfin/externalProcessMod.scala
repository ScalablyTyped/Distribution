package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalProcessMod {
  
  trait CertificationInfo extends StObject {
    
    var publickey: js.UndefOr[String] = js.undefined
    
    var serial: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var thumbprint: js.UndefOr[String] = js.undefined
    
    var trusted: js.UndefOr[Boolean] = js.undefined
  }
  object CertificationInfo {
    
    inline def apply(): CertificationInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificationInfo]
    }
    
    extension [Self <: CertificationInfo](x: Self) {
      
      inline def setPublickey(value: String): Self = StObject.set(x, "publickey", value.asInstanceOf[js.Any])
      
      inline def setPublickeyUndefined: Self = StObject.set(x, "publickey", js.undefined)
      
      inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      inline def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
      
      inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      
      inline def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
    }
  }
  
  trait ExitCode extends StObject {
    
    var exitCode: Double
    
    var topic: String
    
    var uuid: String
  }
  object ExitCode {
    
    inline def apply(exitCode: Double, topic: String, uuid: String): ExitCode = {
      val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitCode]
    }
    
    extension [Self <: ExitCode](x: Self) {
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalConnection extends StObject {
    
    var token: String
    
    var uuid: String
  }
  object ExternalConnection {
    
    inline def apply(token: String, uuid: String): ExternalConnection = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalConnection]
    }
    
    extension [Self <: ExternalConnection](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalProcessInfo extends StObject {
    
    var listener: js.UndefOr[LaunchExternalProcessListener] = js.undefined
    
    var pid: Double
  }
  object ExternalProcessInfo {
    
    inline def apply(pid: Double): ExternalProcessInfo = {
      val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalProcessInfo]
    }
    
    extension [Self <: ExternalProcessInfo](x: Self) {
      
      inline def setListener(value: /* code */ ExitCode => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalProcessRequestType extends StObject {
    
    var alias: js.UndefOr[String] = js.undefined
    
    var arguments: js.UndefOr[String] = js.undefined
    
    var certificate: js.UndefOr[CertificationInfo] = js.undefined
    
    var lifetime: js.UndefOr[String] = js.undefined
    
    var listener: js.UndefOr[LaunchExternalProcessListener] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object ExternalProcessRequestType {
    
    inline def apply(): ExternalProcessRequestType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalProcessRequestType]
    }
    
    extension [Self <: ExternalProcessRequestType](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setCertificate(value: CertificationInfo): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      inline def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      inline def setListener(value: /* code */ ExitCode => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  type LaunchExternalProcessListener = js.Function1[/* code */ ExitCode, Unit]
  
  trait ServiceConfiguration extends StObject {
    
    var config: js.Object
    
    var name: String
  }
  object ServiceConfiguration {
    
    inline def apply(config: js.Object, name: String): ServiceConfiguration = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfiguration]
    }
    
    extension [Self <: ServiceConfiguration](x: Self) {
      
      inline def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TerminateExternalRequestType extends StObject {
    
    var killTree: Boolean
    
    var timeout: Double
    
    var uuid: String
  }
  object TerminateExternalRequestType {
    
    inline def apply(killTree: Boolean, timeout: Double, uuid: String): TerminateExternalRequestType = {
      val __obj = js.Dynamic.literal(killTree = killTree.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TerminateExternalRequestType]
    }
    
    extension [Self <: TerminateExternalRequestType](x: Self) {
      
      inline def setKillTree(value: Boolean): Self = StObject.set(x, "killTree", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
