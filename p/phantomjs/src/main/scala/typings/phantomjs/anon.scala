package typings.phantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Architecture extends StObject {
    
    var architecture: String
    
    var name: String
    
    var version: String
  }
  object Architecture {
    
    inline def apply(architecture: String, name: String, version: String): Architecture = {
      val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Architecture]
    }
    
    extension [Self <: Architecture](x: Self) {
      
      inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Charset extends StObject {
    
    var charset: js.UndefOr[String] = js.undefined
    
    var mode: String
  }
  object Charset {
    
    inline def apply(mode: String): Charset = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Charset]
    }
    
    extension [Self <: Charset](x: Self) {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Major extends StObject {
    
    var major: Double
    
    var minor: Double
    
    var patch: Double
  }
  object Major {
    
    inline def apply(major: Double, minor: Double, patch: Double): Major = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Major]
    }
    
    extension [Self <: Major](x: Self) {
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    }
  }
}
