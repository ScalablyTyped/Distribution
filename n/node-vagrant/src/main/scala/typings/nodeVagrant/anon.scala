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
    
    inline def apply(currentVersion: String, latestVersion: String, name: String, status: String): CurrentVersion = {
      val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentVersion]
    }
    
    extension [Self <: CurrentVersion](x: Self) {
      
      inline def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      inline def setLatestVersion(value: String): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cwd extends StObject {
    
    var cwd: String
    
    var pwd: ProcessEnv
  }
  object Cwd {
    
    inline def apply(cwd: String, pwd: ProcessEnv): Cwd = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], pwd = pwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cwd]
    }
    
    extension [Self <: Cwd](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setPwd(value: ProcessEnv): Self = StObject.set(x, "pwd", value.asInstanceOf[js.Any])
    }
  }
  
  trait Env extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[ProcessEnv] = js.undefined
  }
  object Env {
    
    inline def apply(): Env = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Env]
    }
    
    extension [Self <: Env](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
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
    
    inline def apply(): Host = {
      val __obj = js.Dynamic.literal(host = null, hostname = null, port = null, private_key = null, user = null)
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setPrivate_keyNull: Self = StObject.set(x, "private_key", null)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var name: String
    
    var provider: String
    
    var state: String
  }
  object Id {
    
    inline def apply(id: String, name: String, provider: String, state: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Major extends StObject {
    
    var major: Double
    
    var minor: Double
    
    var patch: Double
    
    var status: String
  }
  object Major {
    
    inline def apply(major: Double, minor: Double, patch: Double, status: String): Major = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Major]
    }
    
    extension [Self <: Major](x: Self) {
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var provider: String
    
    var version: String
  }
  object Name {
    
    inline def apply(name: String, provider: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Provider extends StObject {
    
    var provider: String
    
    var status: String
  }
  object Provider {
    
    inline def apply(provider: String, status: String): Provider = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    extension [Self <: Provider](x: Self) {
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
