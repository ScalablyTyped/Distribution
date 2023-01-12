package typings.npmcliMapWorkspaces

import typings.glob.mod.IOptions
import typings.npmcliArborist.mod.PackageLock
import typings.npmcliPackageJson.mod.PackageJson
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Options): js.Promise[Map[String, String]] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, String]]]
  
  @JSImport("@npmcli/map-workspaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def virtual(opts: VirtualOptions): Map[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("virtual")(opts.asInstanceOf[js.Any]).asInstanceOf[Map[String, String]]
  
  trait Options
    extends StObject
       with IOptions {
    
    @JSName("ignore")
    var ignore_Options: js.UndefOr[js.Array[String]] = js.undefined
    
    var pkg: PackageJson
  }
  object Options {
    
    inline def apply(pkg: PackageJson): Options = {
      val __obj = js.Dynamic.literal(pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setPkg(value: PackageJson): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    }
  }
  
  trait VirtualOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var lockfile: PackageLock
  }
  object VirtualOptions {
    
    inline def apply(lockfile: PackageLock): VirtualOptions = {
      val __obj = js.Dynamic.literal(lockfile = lockfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualOptions] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setLockfile(value: PackageLock): Self = StObject.set(x, "lockfile", value.asInstanceOf[js.Any])
    }
  }
}
