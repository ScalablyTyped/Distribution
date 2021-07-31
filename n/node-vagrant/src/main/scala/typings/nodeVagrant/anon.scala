package typings.nodeVagrant

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.nodeVagrant.mod.ErrorArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cb extends StObject {
    
    def cb(err: ErrorArg): Unit = js.native
    def cb(err: ErrorArg, out: js.Any): Unit = js.native
    
    var command: String = js.native
  }
  
  trait CurrentVersion extends StObject {
    
    var currentVersion: String
    
    var latestVersion: String
    
    var name: String
    
    var status: String
  }
  object CurrentVersion {
    
    @scala.inline
    def apply(currentVersion: String, latestVersion: String, name: String, status: String): CurrentVersion = {
      val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentVersion]
    }
    
    @scala.inline
    implicit class CurrentVersionMutableBuilder[Self <: CurrentVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestVersion(value: String): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cwd extends StObject {
    
    var cwd: String
    
    var pwd: ProcessEnv
  }
  object Cwd {
    
    @scala.inline
    def apply(cwd: String, pwd: ProcessEnv): Cwd = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], pwd = pwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cwd]
    }
    
    @scala.inline
    implicit class CwdMutableBuilder[Self <: Cwd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPwd(value: ProcessEnv): Self = StObject.set(x, "pwd", value.asInstanceOf[js.Any])
    }
  }
  
  trait Env extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
  }
  object Env {
    
    @scala.inline
    def apply(): Env = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Env]
    }
    
    @scala.inline
    implicit class EnvMutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  trait Host extends StObject {
    
    var host: String | Null
    
    var hostname: String | Null
    
    var port: String | Null
    
    var private_key: String | Null
    
    var user: String | Null
  }
  object Host {
    
    @scala.inline
    def apply(): Host = {
      val __obj = js.Dynamic.literal(host = null, hostname = null, port = null, private_key = null, user = null)
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_keyNull: Self = StObject.set(x, "private_key", null)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var name: String
    
    var provider: String
    
    var state: String
  }
  object Id {
    
    @scala.inline
    def apply(id: String, name: String, provider: String, state: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Major extends StObject {
    
    var major: Double
    
    var minor: Double
    
    var patch: Double
    
    var status: String
  }
  object Major {
    
    @scala.inline
    def apply(major: Double, minor: Double, patch: Double, status: String): Major = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Major]
    }
    
    @scala.inline
    implicit class MajorMutableBuilder[Self <: Major] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var provider: String
    
    var version: String
  }
  object Name {
    
    @scala.inline
    def apply(name: String, provider: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Provider extends StObject {
    
    var provider: String
    
    var status: String
  }
  object Provider {
    
    @scala.inline
    def apply(provider: String, status: String): Provider = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
