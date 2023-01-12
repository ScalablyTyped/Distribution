package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.module
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageJSON extends StObject {
  
  var alias: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @parcel/types.@parcel/types.PackageName | @parcel/types.@parcel/types.FilePath | @parcel/types.@parcel/types.Glob ]:? @parcel/types.@parcel/types.PackageName | @parcel/types.@parcel/types.FilePath | {  global :string}} */ js.Any
  ] = js.undefined
  
  var bin: js.UndefOr[String | (Record[String, FilePath])] = js.undefined
  
  var browser: js.UndefOr[FilePath | (Record[FilePath, FilePath | Boolean])] = js.undefined
  
  var browserslist: js.UndefOr[js.Array[String] | (Record[String, js.Array[String]])] = js.undefined
  
  var dependencies: js.UndefOr[PackageDependencies] = js.undefined
  
  var devDependencies: js.UndefOr[PackageDependencies] = js.undefined
  
  var engines: js.UndefOr[Engines] = js.undefined
  
  var main: js.UndefOr[FilePath] = js.undefined
  
  var module: js.UndefOr[FilePath] = js.undefined
  
  var name: PackageName
  
  var peerDependencies: js.UndefOr[PackageDependencies] = js.undefined
  
  var sideEffects: js.UndefOr[Boolean | FilePath | js.Array[FilePath]] = js.undefined
  
  var source: js.UndefOr[FilePath | js.Array[FilePath]] = js.undefined
  
  var targets: js.UndefOr[Record[String, PackageTargetDescriptor]] = js.undefined
  
  var `type`: js.UndefOr[module] = js.undefined
  
  var types: js.UndefOr[FilePath] = js.undefined
  
  var version: Semver
}
object PackageJSON {
  
  inline def apply(name: PackageName, version: Semver): PackageJSON = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageJSON] (val x: Self) extends AnyVal {
    
    inline def setAlias(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in @parcel/types.@parcel/types.PackageName | @parcel/types.@parcel/types.FilePath | @parcel/types.@parcel/types.Glob ]:? @parcel/types.@parcel/types.PackageName | @parcel/types.@parcel/types.FilePath | {  global :string}} */ js.Any
    ): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setBin(value: String | (Record[String, FilePath])): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    
    inline def setBrowser(value: FilePath | (Record[FilePath, FilePath | Boolean])): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setBrowserslist(value: js.Array[String] | (Record[String, js.Array[String]])): Self = StObject.set(x, "browserslist", value.asInstanceOf[js.Any])
    
    inline def setBrowserslistUndefined: Self = StObject.set(x, "browserslist", js.undefined)
    
    inline def setBrowserslistVarargs(value: String*): Self = StObject.set(x, "browserslist", js.Array(value*))
    
    inline def setDependencies(value: PackageDependencies): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDevDependencies(value: PackageDependencies): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
    
    inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
    
    inline def setEngines(value: Engines): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
    
    inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
    
    inline def setMain(value: FilePath): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setModule(value: FilePath): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setName(value: PackageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeerDependencies(value: PackageDependencies): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
    
    inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
    
    inline def setSideEffects(value: Boolean | FilePath | js.Array[FilePath]): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    inline def setSideEffectsVarargs(value: FilePath*): Self = StObject.set(x, "sideEffects", js.Array(value*))
    
    inline def setSource(value: FilePath | js.Array[FilePath]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: FilePath*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setTargets(value: Record[String, PackageTargetDescriptor]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setType(value: module): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypes(value: FilePath): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setVersion(value: Semver): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
