package typings.pixiAssets

import org.scalablytyped.runtime.StringDictionary
import typings.pixiAssets.anon.Name
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolverTypesMod {
  
  trait PreferOrder extends StObject {
    
    var params: StringDictionary[Any]
    
    /** the importance order of the params */
    var priority: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PreferOrder {
    
    inline def apply(params: StringDictionary[Any]): PreferOrder = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreferOrder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreferOrder] (val x: Self) extends AnyVal {
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: js.Array[String]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setPriorityVarargs(value: String*): Self = StObject.set(x, "priority", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait ResolveAsset extends StObject {
    
    var alias: js.UndefOr[js.Array[String]] = js.undefined
    
    var src: String
  }
  object ResolveAsset {
    
    inline def apply(src: String): ResolveAsset = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveAsset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveAsset] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value*))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveURLParser extends StObject {
    
    /** A config to adjust the parser */
    var config: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `extension`: js.UndefOr[ExtensionMetadata] = js.undefined
    
    /** the function that will convert the url into an object */
    def parse(value: String): ResolveAsset
    
    /** the test to perform on the url to determin if it should be parsed */
    def test(url: String): Boolean
  }
  object ResolveURLParser {
    
    inline def apply(parse: String => ResolveAsset, test: String => Boolean): ResolveURLParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[ResolveURLParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveURLParser] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setExtension(value: ExtensionMetadata): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setParse(value: String => ResolveAsset): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setTest(value: String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
  
  type ResolverAssetsArray = js.Array[Name]
  
  type ResolverAssetsObject = Record[String, String | ResolveAsset]
  
  trait ResolverBundle extends StObject {
    
    var assets: ResolverAssetsArray | ResolverAssetsObject
    
    var name: String
  }
  object ResolverBundle {
    
    inline def apply(assets: ResolverAssetsArray | ResolverAssetsObject, name: String): ResolverBundle = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverBundle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolverBundle] (val x: Self) extends AnyVal {
      
      inline def setAssets(value: ResolverAssetsArray | ResolverAssetsObject): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: Name*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolverManifest extends StObject {
    
    var bundles: js.Array[ResolverBundle]
  }
  object ResolverManifest {
    
    inline def apply(bundles: js.Array[ResolverBundle]): ResolverManifest = {
      val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverManifest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolverManifest] (val x: Self) extends AnyVal {
      
      inline def setBundles(value: js.Array[ResolverBundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      
      inline def setBundlesVarargs(value: ResolverBundle*): Self = StObject.set(x, "bundles", js.Array(value*))
    }
  }
}
