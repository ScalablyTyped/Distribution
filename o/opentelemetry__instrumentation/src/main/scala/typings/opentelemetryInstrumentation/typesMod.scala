package typings.opentelemetryInstrumentation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait InstrumentationModuleDefinition[T] extends StObject {
    
    /** Module internal files to be patched  */
    var files: js.Array[InstrumentationModuleFile[Any]]
    
    /** If set to true, the includePrerelease check will be included when calling semver.satisfies */
    var includePrerelease: js.UndefOr[Boolean] = js.undefined
    
    var moduleExports: js.UndefOr[T] = js.undefined
    
    /** Instrumented module version */
    var moduleVersion: js.UndefOr[String] = js.undefined
    
    /** Module name or path  */
    var name: String
    
    /** Method to patch the instrumentation  */
    var patch: js.UndefOr[js.Function2[/* moduleExports */ T, /* moduleVersion */ js.UndefOr[String], T]] = js.undefined
    
    /** Supported version of module  */
    var supportedVersions: js.Array[String]
    
    /** Method to unpatch the instrumentation  */
    var unpatch: js.UndefOr[
        js.Function2[/* moduleExports */ T, /* moduleVersion */ js.UndefOr[String], Unit]
      ] = js.undefined
  }
  object InstrumentationModuleDefinition {
    
    inline def apply[T](files: js.Array[InstrumentationModuleFile[Any]], name: String, supportedVersions: js.Array[String]): InstrumentationModuleDefinition[T] = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedVersions = supportedVersions.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstrumentationModuleDefinition[T]]
    }
    
    extension [Self <: InstrumentationModuleDefinition[?], T](x: Self & InstrumentationModuleDefinition[T]) {
      
      inline def setFiles(value: js.Array[InstrumentationModuleFile[Any]]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: InstrumentationModuleFile[Any]*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setIncludePrerelease(value: Boolean): Self = StObject.set(x, "includePrerelease", value.asInstanceOf[js.Any])
      
      inline def setIncludePrereleaseUndefined: Self = StObject.set(x, "includePrerelease", js.undefined)
      
      inline def setModuleExports(value: T): Self = StObject.set(x, "moduleExports", value.asInstanceOf[js.Any])
      
      inline def setModuleExportsUndefined: Self = StObject.set(x, "moduleExports", js.undefined)
      
      inline def setModuleVersion(value: String): Self = StObject.set(x, "moduleVersion", value.asInstanceOf[js.Any])
      
      inline def setModuleVersionUndefined: Self = StObject.set(x, "moduleVersion", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPatch(value: (/* moduleExports */ T, /* moduleVersion */ js.UndefOr[String]) => T): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setSupportedVersions(value: js.Array[String]): Self = StObject.set(x, "supportedVersions", value.asInstanceOf[js.Any])
      
      inline def setSupportedVersionsVarargs(value: String*): Self = StObject.set(x, "supportedVersions", js.Array(value*))
      
      inline def setUnpatch(value: (/* moduleExports */ T, /* moduleVersion */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "unpatch", js.Any.fromFunction2(value))
      
      inline def setUnpatchUndefined: Self = StObject.set(x, "unpatch", js.undefined)
    }
  }
  
  @js.native
  trait InstrumentationModuleFile[T] extends StObject {
    
    var moduleExports: js.UndefOr[T] = js.native
    
    /** Name of file to be patched with relative path */
    var name: String = js.native
    
    /** Method to patch the instrumentation  */
    def patch(moduleExports: T): T = js.native
    def patch(moduleExports: T, moduleVersion: String): T = js.native
    
    /** Supported version this file */
    var supportedVersions: js.Array[String] = js.native
    
    /** Method to patch the instrumentation  */
    /** Method to unpatch the instrumentation  */
    def unpatch(): Unit = js.native
    def unpatch(moduleExports: T): Unit = js.native
    def unpatch(moduleExports: T, moduleVersion: String): Unit = js.native
    def unpatch(moduleExports: Unit, moduleVersion: String): Unit = js.native
  }
}
