package typings.parcelPackageManager

import typings.parcelPackageManager.anon.Range
import typings.std.FileSystem
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait InstallOptions extends StObject {
    
    var installPeers: js.UndefOr[Boolean] = js.undefined
    
    var packageInstaller: js.UndefOr[PackageInstaller | Null] = js.undefined
    
    var saveDev: js.UndefOr[Boolean] = js.undefined
  }
  object InstallOptions {
    
    inline def apply(): InstallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstallOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstallOptions] (val x: Self) extends AnyVal {
      
      inline def setInstallPeers(value: Boolean): Self = StObject.set(x, "installPeers", value.asInstanceOf[js.Any])
      
      inline def setInstallPeersUndefined: Self = StObject.set(x, "installPeers", js.undefined)
      
      inline def setPackageInstaller(value: PackageInstaller): Self = StObject.set(x, "packageInstaller", value.asInstanceOf[js.Any])
      
      inline def setPackageInstallerNull: Self = StObject.set(x, "packageInstaller", null)
      
      inline def setPackageInstallerUndefined: Self = StObject.set(x, "packageInstaller", js.undefined)
      
      inline def setSaveDev(value: Boolean): Self = StObject.set(x, "saveDev", value.asInstanceOf[js.Any])
      
      inline def setSaveDevUndefined: Self = StObject.set(x, "saveDev", js.undefined)
    }
  }
  
  trait InstallerOptions extends StObject {
    
    var cwd: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    
    var fs: FileSystem
    
    var modules: js.Array[ModuleRequest]
    
    var packagePath: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any) | Null
      ] = js.undefined
    
    var saveDev: js.UndefOr[Boolean] = js.undefined
  }
  object InstallerOptions {
    
    inline def apply(
      cwd: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      fs: FileSystem,
      modules: js.Array[ModuleRequest]
    ): InstallerOptions = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstallerOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setFs(value: FileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setModules(value: js.Array[ModuleRequest]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: ModuleRequest*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setPackagePath(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
      
      inline def setPackagePathNull: Self = StObject.set(x, "packagePath", null)
      
      inline def setPackagePathUndefined: Self = StObject.set(x, "packagePath", js.undefined)
      
      inline def setSaveDev(value: Boolean): Self = StObject.set(x, "saveDev", value.asInstanceOf[js.Any])
      
      inline def setSaveDevUndefined: Self = StObject.set(x, "saveDev", js.undefined)
    }
  }
  
  trait Invalidations extends StObject {
    
    var invalidateOnFileChange: Set[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ]
    
    var invalidateOnFileCreate: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileCreateInvalidation */ Any
      ]
  }
  object Invalidations {
    
    inline def apply(
      invalidateOnFileChange: Set[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
        ],
      invalidateOnFileCreate: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileCreateInvalidation */ Any
        ]
    ): Invalidations = {
      val __obj = js.Dynamic.literal(invalidateOnFileChange = invalidateOnFileChange.asInstanceOf[js.Any], invalidateOnFileCreate = invalidateOnFileCreate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invalidations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Invalidations] (val x: Self) extends AnyVal {
      
      inline def setInvalidateOnFileChange(
        value: Set[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
            ]
      ): Self = StObject.set(x, "invalidateOnFileChange", value.asInstanceOf[js.Any])
      
      inline def setInvalidateOnFileCreate(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileCreateInvalidation */ Any
            ]
      ): Self = StObject.set(x, "invalidateOnFileCreate", value.asInstanceOf[js.Any])
      
      inline def setInvalidateOnFileCreateVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileCreateInvalidation */ Any)*
      ): Self = StObject.set(x, "invalidateOnFileCreate", js.Array(value*))
    }
  }
  
  trait ModuleRequest extends StObject {
    
    val name: String
    
    val range: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SemverRange */ Any) | Null
      ] = js.undefined
  }
  object ModuleRequest {
    
    inline def apply(name: String): ModuleRequest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleRequest] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRange(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SemverRange */ Any
      ): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeNull: Self = StObject.set(x, "range", null)
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  trait PackageInstaller extends StObject {
    
    def install(opts: InstallerOptions): js.Promise[Unit]
  }
  object PackageInstaller {
    
    inline def apply(install: InstallerOptions => js.Promise[Unit]): PackageInstaller = {
      val __obj = js.Dynamic.literal(install = js.Any.fromFunction1(install))
      __obj.asInstanceOf[PackageInstaller]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageInstaller] (val x: Self) extends AnyVal {
      
      inline def setInstall(value: InstallerOptions => js.Promise[Unit]): Self = StObject.set(x, "install", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PackageManager extends StObject {
    
    def getInvalidations(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DependencySpecifier */ Any,
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): Invalidations = js.native
    
    def invalidate(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DependencySpecifier */ Any,
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): Unit = js.native
    
    def require(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DependencySpecifier */ Any,
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[Any] = js.native
    def require(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DependencySpecifier */ Any,
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      arg2: Range
    ): js.Promise[Any] = js.native
    
    def resolve(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DependencySpecifier */ Any,
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[ResolveResult] = js.native
    def resolve(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DependencySpecifier */ Any,
      from: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      arg2: Range
    ): js.Promise[ResolveResult] = js.native
  }
  
  trait ResolveResult extends StObject {
    
    var invalidateOnFileChange: Set[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ]
    
    var invalidateOnFileCreate: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileCreateInvalidation */ Any
      ]
    
    var pkg: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJSON */ Any) | Null
      ] = js.undefined
    
    var resolved: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
  }
  object ResolveResult {
    
    inline def apply(
      invalidateOnFileChange: Set[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
        ],
      invalidateOnFileCreate: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileCreateInvalidation */ Any
        ],
      resolved: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): ResolveResult = {
      val __obj = js.Dynamic.literal(invalidateOnFileChange = invalidateOnFileChange.asInstanceOf[js.Any], invalidateOnFileCreate = invalidateOnFileCreate.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveResult] (val x: Self) extends AnyVal {
      
      inline def setInvalidateOnFileChange(
        value: Set[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
            ]
      ): Self = StObject.set(x, "invalidateOnFileChange", value.asInstanceOf[js.Any])
      
      inline def setInvalidateOnFileCreate(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileCreateInvalidation */ Any
            ]
      ): Self = StObject.set(x, "invalidateOnFileCreate", value.asInstanceOf[js.Any])
      
      inline def setInvalidateOnFileCreateVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileCreateInvalidation */ Any)*
      ): Self = StObject.set(x, "invalidateOnFileCreate", js.Array(value*))
      
      inline def setPkg(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageJSON */ Any
      ): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgNull: Self = StObject.set(x, "pkg", null)
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setResolved(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
}
