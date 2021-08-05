package typings.mediumEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Major extends StObject {
    
    var major: Double
    
    var minor: Double
    
    var preRelease: String
    
    var revision: Double
  }
  object Major {
    
    inline def apply(major: Double, minor: Double, preRelease: String, revision: Double): Major = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], preRelease = preRelease.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
      __obj.asInstanceOf[Major]
    }
    
    extension [Self <: Major](x: Self) {
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setPreRelease(value: String): Self = StObject.set(x, "preRelease", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prop extends StObject {
    
    var prop: String
    
    var value: String
  }
  object Prop {
    
    inline def apply(prop: String, value: String): Prop = {
      val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prop]
    }
    
    extension [Self <: Prop](x: Self) {
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
