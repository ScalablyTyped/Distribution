package typings.metro

import org.scalablytyped.runtime.StringDictionary
import typings.metro.deltaBundlerTypesMod.TransformResultDependency
import typings.metro.metroStrings.concrete
import typings.metro.metroStrings.linked
import typings.metroSourceMap.mod.BasicSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleGraphTypesMod {
  
  trait ConcreteTransformResult
    extends StObject
       with TransformResult {
    
    var code: String
    
    var dependencies: js.Array[TransformResultDependency]
    
    // NOTE: requireName, importNames and dependencyMapName are only used by the
    // optimizer. They are deleted when the transform result is serialized to
    // JSON.
    var dependencyMapName: js.UndefOr[String] = js.undefined
    
    var importNames: js.UndefOr[ImportNames] = js.undefined
    
    var map: js.UndefOr[BasicSourceMap] = js.undefined
    
    var requireName: js.UndefOr[String] = js.undefined
    
    var soundResources: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: concrete
  }
  object ConcreteTransformResult {
    
    inline def apply(code: String, dependencies: js.Array[TransformResultDependency]): ConcreteTransformResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("concrete")
      __obj.asInstanceOf[ConcreteTransformResult]
    }
    
    extension [Self <: ConcreteTransformResult](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[TransformResultDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: TransformResultDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setDependencyMapName(value: String): Self = StObject.set(x, "dependencyMapName", value.asInstanceOf[js.Any])
      
      inline def setDependencyMapNameUndefined: Self = StObject.set(x, "dependencyMapName", js.undefined)
      
      inline def setImportNames(value: ImportNames): Self = StObject.set(x, "importNames", value.asInstanceOf[js.Any])
      
      inline def setImportNamesUndefined: Self = StObject.set(x, "importNames", js.undefined)
      
      inline def setMap(value: BasicSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setRequireName(value: String): Self = StObject.set(x, "requireName", value.asInstanceOf[js.Any])
      
      inline def setRequireNameUndefined: Self = StObject.set(x, "requireName", js.undefined)
      
      inline def setSoundResources(value: js.Array[String]): Self = StObject.set(x, "soundResources", value.asInstanceOf[js.Any])
      
      inline def setSoundResourcesUndefined: Self = StObject.set(x, "soundResources", js.undefined)
      
      inline def setSoundResourcesVarargs(value: String*): Self = StObject.set(x, "soundResources", js.Array(value*))
      
      inline def setType(value: concrete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportNames extends StObject {
    
    var default: String
    
    var all: String
  }
  object ImportNames {
    
    inline def apply(all: String, default: String): ImportNames = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportNames]
    }
    
    extension [Self <: ImportNames](x: Self) {
      
      inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  type :'linked',   sourceVariantName :string}> */
  trait LinkedTransformResult
    extends StObject
       with TransformResult {
    
    val sourceVariantName: String
    
    val `type`: linked
  }
  object LinkedTransformResult {
    
    inline def apply(sourceVariantName: String): LinkedTransformResult = {
      val __obj = js.Dynamic.literal(sourceVariantName = sourceVariantName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("linked")
      __obj.asInstanceOf[LinkedTransformResult]
    }
    
    extension [Self <: LinkedTransformResult](x: Self) {
      
      inline def setSourceVariantName(value: String): Self = StObject.set(x, "sourceVariantName", value.asInstanceOf[js.Any])
      
      inline def setType(value: linked): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metro.moduleGraphTypesMod.ConcreteTransformResult
    - typings.metro.moduleGraphTypesMod.LinkedTransformResult
  */
  trait TransformResult extends StObject
  object TransformResult {
    
    inline def ConcreteTransformResult(code: String, dependencies: js.Array[TransformResultDependency]): typings.metro.moduleGraphTypesMod.ConcreteTransformResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("concrete")
      __obj.asInstanceOf[typings.metro.moduleGraphTypesMod.ConcreteTransformResult]
    }
    
    inline def LinkedTransformResult(sourceVariantName: String): typings.metro.moduleGraphTypesMod.LinkedTransformResult = {
      val __obj = js.Dynamic.literal(sourceVariantName = sourceVariantName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("linked")
      __obj.asInstanceOf[typings.metro.moduleGraphTypesMod.LinkedTransformResult]
    }
  }
  
  type TransformVariants = StringDictionary[Any]
}
