package typings.pnpapi

import typings.pnpapi.anon.ConsiderBuiltins
import typings.pnpapi.anon.ConsiderBuiltinsExtensions
import typings.pnpapi.anon.Extensions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object VERSIONS {
    
    @JSImport("pnpapi", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pnpapi", "VERSIONS.std")
    @js.native
    def std: Double = js.native
    @scala.inline
    def std_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("std")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("pnpapi", "findPackageLocator")
  @js.native
  def findPackageLocator(location: String): PackageLocator | Null = js.native
  
  @JSImport("pnpapi", "getPackageInformation")
  @js.native
  def getPackageInformation(locator: PackageLocator): PackageInformation = js.native
  
  @JSImport("pnpapi", "resolveRequest")
  @js.native
  def resolveRequest(request: String): String | Null = js.native
  @JSImport("pnpapi", "resolveRequest")
  @js.native
  def resolveRequest(request: String, issuer: String): String | Null = js.native
  @JSImport("pnpapi", "resolveRequest")
  @js.native
  def resolveRequest(request: String, issuer: String, opts: ConsiderBuiltinsExtensions): String | Null = js.native
  @JSImport("pnpapi", "resolveRequest")
  @js.native
  def resolveRequest(request: String, issuer: Null, opts: ConsiderBuiltinsExtensions): String | Null = js.native
  
  @JSImport("pnpapi", "resolveToUnqualified")
  @js.native
  def resolveToUnqualified(request: String): String | Null = js.native
  @JSImport("pnpapi", "resolveToUnqualified")
  @js.native
  def resolveToUnqualified(request: String, issuer: String): String | Null = js.native
  @JSImport("pnpapi", "resolveToUnqualified")
  @js.native
  def resolveToUnqualified(request: String, issuer: String, opts: ConsiderBuiltins): String | Null = js.native
  @JSImport("pnpapi", "resolveToUnqualified")
  @js.native
  def resolveToUnqualified(request: String, issuer: Null, opts: ConsiderBuiltins): String | Null = js.native
  
  @JSImport("pnpapi", "resolveUnqualified")
  @js.native
  def resolveUnqualified(unqualified: String): String = js.native
  @JSImport("pnpapi", "resolveUnqualified")
  @js.native
  def resolveUnqualified(unqualified: String, opts: Extensions): String = js.native
  
  @JSImport("pnpapi", "setup")
  @js.native
  def setup(): Unit = js.native
  
  object topLevel {
    
    @JSImport("pnpapi", "topLevel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pnpapi", "topLevel.name")
    @js.native
    def name: Null = js.native
    @scala.inline
    def name_=(x: Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("pnpapi", "topLevel.reference")
    @js.native
    def reference: Null = js.native
    @scala.inline
    def reference_=(x: Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reference")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PackageInformation extends StObject {
    
    var packageDependencies: Map[String, String | (js.Tuple2[String, String])] = js.native
    
    var packageLocation: String = js.native
  }
  object PackageInformation {
    
    @scala.inline
    def apply(packageDependencies: Map[String, String | (js.Tuple2[String, String])], packageLocation: String): PackageInformation = {
      val __obj = js.Dynamic.literal(packageDependencies = packageDependencies.asInstanceOf[js.Any], packageLocation = packageLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageInformation]
    }
    
    @scala.inline
    implicit class PackageInformationMutableBuilder[Self <: PackageInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPackageDependencies(value: Map[String, String | (js.Tuple2[String, String])]): Self = StObject.set(x, "packageDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageLocation(value: String): Self = StObject.set(x, "packageLocation", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pnpapi.mod.PhysicalPackageLocator
    - typings.pnpapi.mod.TopLevelPackageLocator
  */
  trait PackageLocator extends StObject
  object PackageLocator {
    
    @scala.inline
    def PhysicalPackageLocator(name: String, reference: String): typings.pnpapi.mod.PhysicalPackageLocator = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pnpapi.mod.PhysicalPackageLocator]
    }
    
    @scala.inline
    def TopLevelPackageLocator(name: Null, reference: Null): typings.pnpapi.mod.TopLevelPackageLocator = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pnpapi.mod.TopLevelPackageLocator]
    }
  }
  
  @js.native
  trait PhysicalPackageLocator extends PackageLocator {
    
    var name: String = js.native
    
    var reference: String = js.native
  }
  object PhysicalPackageLocator {
    
    @scala.inline
    def apply(name: String, reference: String): PhysicalPackageLocator = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicalPackageLocator]
    }
    
    @scala.inline
    implicit class PhysicalPackageLocatorMutableBuilder[Self <: PhysicalPackageLocator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TopLevelPackageLocator extends PackageLocator {
    
    var name: Null = js.native
    
    var reference: Null = js.native
  }
  object TopLevelPackageLocator {
    
    @scala.inline
    def apply(name: Null, reference: Null): TopLevelPackageLocator = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelPackageLocator]
    }
    
    @scala.inline
    implicit class TopLevelPackageLocatorMutableBuilder[Self <: TopLevelPackageLocator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Null): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference(value: Null): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait ProcessVersions extends StObject {
        
        var pnp: js.UndefOr[String] = js.native
      }
      object ProcessVersions {
        
        @scala.inline
        def apply(): ProcessVersions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProcessVersions]
        }
        
        @scala.inline
        implicit class ProcessVersionsMutableBuilder[Self <: ProcessVersions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setPnp(value: String): Self = StObject.set(x, "pnp", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPnpUndefined: Self = StObject.set(x, "pnp", js.undefined)
        }
      }
    }
  }
}
