package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalProcessMod {
  
  @js.native
  trait CertificationInfo extends StObject {
    
    var publickey: js.UndefOr[String] = js.native
    
    var serial: js.UndefOr[String] = js.native
    
    var subject: js.UndefOr[String] = js.native
    
    var thumbprint: js.UndefOr[String] = js.native
    
    var trusted: js.UndefOr[Boolean] = js.native
  }
  object CertificationInfo {
    
    @scala.inline
    def apply(): CertificationInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificationInfo]
    }
    
    @scala.inline
    implicit class CertificationInfoMutableBuilder[Self <: CertificationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublickey(value: String): Self = StObject.set(x, "publickey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublickeyUndefined: Self = StObject.set(x, "publickey", js.undefined)
      
      @scala.inline
      def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
      
      @scala.inline
      def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
    }
  }
  
  @js.native
  trait ExitCode extends StObject {
    
    var exitCode: Double = js.native
    
    var topic: String = js.native
    
    var uuid: String = js.native
  }
  object ExitCode {
    
    @scala.inline
    def apply(exitCode: Double, topic: String, uuid: String): ExitCode = {
      val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitCode]
    }
    
    @scala.inline
    implicit class ExitCodeMutableBuilder[Self <: ExitCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExternalConnection extends StObject {
    
    var token: String = js.native
    
    var uuid: String = js.native
  }
  object ExternalConnection {
    
    @scala.inline
    def apply(token: String, uuid: String): ExternalConnection = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalConnection]
    }
    
    @scala.inline
    implicit class ExternalConnectionMutableBuilder[Self <: ExternalConnection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExternalProcessInfo extends StObject {
    
    var listener: js.UndefOr[LaunchExternalProcessListener] = js.native
    
    var pid: Double = js.native
  }
  object ExternalProcessInfo {
    
    @scala.inline
    def apply(pid: Double): ExternalProcessInfo = {
      val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalProcessInfo]
    }
    
    @scala.inline
    implicit class ExternalProcessInfoMutableBuilder[Self <: ExternalProcessInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListener(value: /* code */ ExitCode => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExternalProcessRequestType extends StObject {
    
    var alias: js.UndefOr[String] = js.native
    
    var arguments: js.UndefOr[String] = js.native
    
    var certificate: js.UndefOr[CertificationInfo] = js.native
    
    var lifetime: js.UndefOr[String] = js.native
    
    var listener: js.UndefOr[LaunchExternalProcessListener] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var uuid: js.UndefOr[String] = js.native
  }
  object ExternalProcessRequestType {
    
    @scala.inline
    def apply(): ExternalProcessRequestType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExternalProcessRequestType]
    }
    
    @scala.inline
    implicit class ExternalProcessRequestTypeMutableBuilder[Self <: ExternalProcessRequestType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      @scala.inline
      def setCertificate(value: CertificationInfo): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      @scala.inline
      def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
      
      @scala.inline
      def setListener(value: /* code */ ExitCode => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  type LaunchExternalProcessListener = js.Function1[/* code */ ExitCode, Unit]
  
  @js.native
  trait ServiceConfiguration extends StObject {
    
    var config: js.Object = js.native
    
    var name: String = js.native
  }
  object ServiceConfiguration {
    
    @scala.inline
    def apply(config: js.Object, name: String): ServiceConfiguration = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfiguration]
    }
    
    @scala.inline
    implicit class ServiceConfigurationMutableBuilder[Self <: ServiceConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Object): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TerminateExternalRequestType extends StObject {
    
    var killTree: Boolean = js.native
    
    var timeout: Double = js.native
    
    var uuid: String = js.native
  }
  object TerminateExternalRequestType {
    
    @scala.inline
    def apply(killTree: Boolean, timeout: Double, uuid: String): TerminateExternalRequestType = {
      val __obj = js.Dynamic.literal(killTree = killTree.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TerminateExternalRequestType]
    }
    
    @scala.inline
    implicit class TerminateExternalRequestTypeMutableBuilder[Self <: TerminateExternalRequestType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKillTree(value: Boolean): Self = StObject.set(x, "killTree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
