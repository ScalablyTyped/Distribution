package typings.nrwlDevkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppsDir extends StObject {
    
    var appsDir: String
    
    var libsDir: String
    
    var npmScope: String
    
    var standaloneAsDefault: Boolean
  }
  object AppsDir {
    
    inline def apply(appsDir: String, libsDir: String, npmScope: String, standaloneAsDefault: Boolean): AppsDir = {
      val __obj = js.Dynamic.literal(appsDir = appsDir.asInstanceOf[js.Any], libsDir = libsDir.asInstanceOf[js.Any], npmScope = npmScope.asInstanceOf[js.Any], standaloneAsDefault = standaloneAsDefault.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppsDir]
    }
    
    extension [Self <: AppsDir](x: Self) {
      
      inline def setAppsDir(value: String): Self = StObject.set(x, "appsDir", value.asInstanceOf[js.Any])
      
      inline def setLibsDir(value: String): Self = StObject.set(x, "libsDir", value.asInstanceOf[js.Any])
      
      inline def setNpmScope(value: String): Self = StObject.set(x, "npmScope", value.asInstanceOf[js.Any])
      
      inline def setStandaloneAsDefault(value: Boolean): Self = StObject.set(x, "standaloneAsDefault", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassName extends StObject {
    
    var className: String
    
    var constantName: String
    
    var fileName: String
    
    var name: String
    
    var propertyName: String
  }
  object ClassName {
    
    inline def apply(className: String, constantName: String, fileName: String, name: String, propertyName: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], constantName = constantName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setConstantName(value: String): Self = StObject.set(x, "constantName", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectRoot extends StObject {
    
    var projectRoot: String
  }
  object ProjectRoot {
    
    inline def apply(projectRoot: String): ProjectRoot = {
      val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectRoot]
    }
    
    extension [Self <: ProjectRoot](x: Self) {
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    }
  }
}
