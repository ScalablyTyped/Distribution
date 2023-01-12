package typings.ngPackagr

import org.scalablytyped.runtime.StringDictionary
import typings.ngPackagr.libStylesStylesheetProcessorMod.CssUrl
import typings.ngPackagr.ngPackageDotschemaMod.NgPackageConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageEntryPointEntryPointMod {
  
  @JSImport("ng-packagr/lib/ng-package/entry-point/entry-point", "NgEntryPoint")
  @js.native
  open class NgEntryPoint protected () extends StObject {
    def this(
      /** Values from the `package.json` file of this entry point. */
    packageJson: Record[String, Any],
      /** Values from either the `ngPackage` option (from `package.json`) or values from `ng-package.json`. */
    ngPackageJson: NgPackageConfig,
      /** Absolute directory path of this entry point's `package.json` location. */
    basePath: String
    ) = this()
    def this(
      /** Values from the `package.json` file of this entry point. */
    packageJson: Record[String, Any],
      /** Values from either the `ngPackage` option (from `package.json`) or values from `ng-package.json`. */
    ngPackageJson: NgPackageConfig,
      /** Absolute directory path of this entry point's `package.json` location. */
    basePath: String,
      /** XX: additional auto-configured data passed for secondary entry point's. Needs better docs. */
    secondaryData: StringDictionary[Any]
    ) = this()
    
    @JSName("$get")
    def $get(key: String): Any = js.native
    
    /** Absolute directory path of this entry point's `package.json` location. */
    val basePath: String = js.native
    
    def cssUrl: CssUrl = js.native
    
    def destinationFiles: DestinationFiles = js.native
    
    /** Absolute directory path of this entry point's 'package.json'. */
    def destinationPath: String = js.native
    
    def entryFile: String = js.native
    
    /** Absolute file path of the entry point's source code entry file. */
    def entryFilePath: String = js.native
    
    def flatModuleFile: String = js.native
    
    /* private */ var flattenModuleId: Any = js.native
    
    /** Whether or not the entrypoint is secondary */
    def isSecondaryEntryPoint: Boolean = js.native
    
    /**
      * The module ID is an "identifier of a module used in the import statements, e.g.
      * '@angular/core'. The ID often maps directly to a path on the filesystem, but this
      * is not always the case due to various module resolution strategies."
      */
    def moduleId: String = js.native
    
    /** Values from either the `ngPackage` option (from `package.json`) or values from `ng-package.json`. */
    val ngPackageJson: NgPackageConfig = js.native
    
    /** Values from the `package.json` file of this entry point. */
    val packageJson: Record[String, Any] = js.native
    
    /** XX: additional auto-configured data passed for secondary entry point's. Needs better docs. */
    /* private */ val secondaryData: Any = js.native
    
    def styleIncludePaths: js.Array[String] = js.native
  }
  
  trait DestinationFiles extends StObject {
    
    /** Absolute path of this entry point `declarations` */
    var declarations: String
    
    /** Sub path of entrypoint distributable. */
    var directory: String
    
    /** Absolute path of this entry point `ESM2020` module */
    var esm2020: String
    
    /** Absolute path of this entry point `FESM2015` module */
    var fesm2015: String
    
    /** Absolute path of this entry point `FESM2020` module */
    var fesm2020: String
  }
  object DestinationFiles {
    
    inline def apply(declarations: String, directory: String, esm2020: String, fesm2015: String, fesm2020: String): DestinationFiles = {
      val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], esm2020 = esm2020.asInstanceOf[js.Any], fesm2015 = fesm2015.asInstanceOf[js.Any], fesm2020 = fesm2020.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestinationFiles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestinationFiles] (val x: Self) extends AnyVal {
      
      inline def setDeclarations(value: String): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setEsm2020(value: String): Self = StObject.set(x, "esm2020", value.asInstanceOf[js.Any])
      
      inline def setFesm2015(value: String): Self = StObject.set(x, "fesm2015", value.asInstanceOf[js.Any])
      
      inline def setFesm2020(value: String): Self = StObject.set(x, "fesm2020", value.asInstanceOf[js.Any])
    }
  }
}
