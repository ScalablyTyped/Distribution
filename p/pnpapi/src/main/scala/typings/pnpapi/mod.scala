package typings.pnpapi

import typings.pnpapi.anon.ConsiderBuiltins
import typings.pnpapi.anon.Extensions
import typings.pnpapi.anon.`0`
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pnpapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("pnpapi", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pnpapi", "VERSIONS.std")
    @js.native
    def std: Double = js.native
    inline def std_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("std")(x.asInstanceOf[js.Any])
  }
  
  inline def findPackageLocator(location: String): PackageLocator | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findPackageLocator")(location.asInstanceOf[js.Any]).asInstanceOf[PackageLocator | Null]
  
  inline def getPackageInformation(locator: PackageLocator): PackageInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageInformation")(locator.asInstanceOf[js.Any]).asInstanceOf[PackageInformation]
  
  inline def resolveRequest(request: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRequest")(request.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def resolveRequest(request: String, issuer: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRequest")(request.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def resolveRequest(request: String, issuer: String, opts: ConsiderBuiltins): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRequest")(request.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def resolveRequest(request: String, issuer: Null, opts: ConsiderBuiltins): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRequest")(request.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def resolveToUnqualified(request: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveToUnqualified")(request.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def resolveToUnqualified(request: String, issuer: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveToUnqualified")(request.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def resolveToUnqualified(request: String, issuer: String, opts: `0`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveToUnqualified")(request.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def resolveToUnqualified(request: String, issuer: Null, opts: `0`): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveToUnqualified")(request.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def resolveUnqualified(unqualified: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUnqualified")(unqualified.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def resolveUnqualified(unqualified: String, opts: Extensions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveUnqualified")(unqualified.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  
  object topLevel {
    
    @JSImport("pnpapi", "topLevel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pnpapi", "topLevel.name")
    @js.native
    def name: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def name_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("pnpapi", "topLevel.reference")
    @js.native
    def reference: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def reference_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reference")(x.asInstanceOf[js.Any])
  }
  
  trait PackageInformation extends StObject {
    
    var packageDependencies: Map[String, String | (js.Tuple2[String, String])]
    
    var packageLocation: String
  }
  object PackageInformation {
    
    inline def apply(packageDependencies: Map[String, String | (js.Tuple2[String, String])], packageLocation: String): PackageInformation = {
      val __obj = js.Dynamic.literal(packageDependencies = packageDependencies.asInstanceOf[js.Any], packageLocation = packageLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageInformation]
    }
    
    extension [Self <: PackageInformation](x: Self) {
      
      inline def setPackageDependencies(value: Map[String, String | (js.Tuple2[String, String])]): Self = StObject.set(x, "packageDependencies", value.asInstanceOf[js.Any])
      
      inline def setPackageLocation(value: String): Self = StObject.set(x, "packageLocation", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pnpapi.mod.PhysicalPackageLocator
    - typings.pnpapi.mod.TopLevelPackageLocator
  */
  trait PackageLocator extends StObject
  object PackageLocator {
    
    inline def PhysicalPackageLocator(name: String, reference: String): typings.pnpapi.mod.PhysicalPackageLocator = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pnpapi.mod.PhysicalPackageLocator]
    }
    
    inline def TopLevelPackageLocator(name: Null, reference: Null): typings.pnpapi.mod.TopLevelPackageLocator = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pnpapi.mod.TopLevelPackageLocator]
    }
  }
  
  trait PhysicalPackageLocator
    extends StObject
       with PackageLocator {
    
    var name: String
    
    var reference: String
  }
  object PhysicalPackageLocator {
    
    inline def apply(name: String, reference: String): PhysicalPackageLocator = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhysicalPackageLocator]
    }
    
    extension [Self <: PhysicalPackageLocator](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopLevelPackageLocator
    extends StObject
       with PackageLocator {
    
    var name: Null
    
    var reference: Null
  }
  object TopLevelPackageLocator {
    
    inline def apply(name: Null, reference: Null): TopLevelPackageLocator = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopLevelPackageLocator]
    }
    
    extension [Self <: TopLevelPackageLocator](x: Self) {
      
      inline def setName(value: Null): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReference(value: Null): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object NodeJS {
      
      trait ProcessVersions extends StObject {
        
        var pnp: js.UndefOr[String] = js.undefined
      }
      object ProcessVersions {
        
        inline def apply(): ProcessVersions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProcessVersions]
        }
        
        extension [Self <: ProcessVersions](x: Self) {
          
          inline def setPnp(value: String): Self = StObject.set(x, "pnp", value.asInstanceOf[js.Any])
          
          inline def setPnpUndefined: Self = StObject.set(x, "pnp", js.undefined)
        }
      }
    }
  }
}
