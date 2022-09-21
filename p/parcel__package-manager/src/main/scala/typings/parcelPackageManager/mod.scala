package typings.parcelPackageManager

import typings.parcelPackageManager.typesMod.InstallerOptions
import typings.parcelPackageManager.typesMod.PackageInstaller
import typings.parcelPackageManager.typesMod.PackageManager
import typings.std.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/package-manager", "MockPackageInstaller")
  @js.native
  open class MockPackageInstaller ()
    extends StObject
       with PackageInstaller {
    
    /* CompleteClass */
    override def install(opts: InstallerOptions): js.Promise[Unit] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/package-manager", "NodePackageManager")
  @js.native
  open class NodePackageManager protected ()
    extends StObject
       with PackageManager {
    def this(
      fs: FileSystem,
      projectRoot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ) = this()
    def this(
      fs: FileSystem,
      projectRoot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      installer: PackageInstaller
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/package-manager", "Npm")
  @js.native
  open class Npm ()
    extends StObject
       with PackageInstaller {
    
    /* CompleteClass */
    override def install(opts: InstallerOptions): js.Promise[Unit] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/package-manager", "Pnpm")
  @js.native
  open class Pnpm ()
    extends StObject
       with PackageInstaller {
    
    /* CompleteClass */
    override def install(opts: InstallerOptions): js.Promise[Unit] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/package-manager", "Yarn")
  @js.native
  open class Yarn ()
    extends StObject
       with PackageInstaller {
    
    /* CompleteClass */
    override def install(opts: InstallerOptions): js.Promise[Unit] = js.native
  }
}
