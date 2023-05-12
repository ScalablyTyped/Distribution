package typings.pixiAssets

import typings.pixiAssets.libResolverTypesMod.ResolveAsset
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var name: String | js.Array[String]
    
    var srcs: String | ResolveAsset | (js.Array[String | ResolveAsset])
  }
  object Data {
    
    inline def apply(name: String | js.Array[String], srcs: String | ResolveAsset | (js.Array[String | ResolveAsset])): Data = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], srcs = srcs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setSrcs(value: String | ResolveAsset | (js.Array[String | ResolveAsset])): Self = StObject.set(x, "srcs", value.asInstanceOf[js.Any])
      
      inline def setSrcsVarargs(value: (String | ResolveAsset)*): Self = StObject.set(x, "srcs", js.Array(value*))
    }
  }
  
  trait Format extends StObject {
    
    /** the formats you prefer, by default this will be:  ['avif', 'webp', 'png', 'jpg', 'jpeg'] */
    var format: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** the resolution order you prefer, can be an array (priority order - first is prefered) or a single resolutions  */
    var resolution: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String | js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value*))
      
      inline def setResolution(value: Double | js.Array[Double]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setResolutionVarargs(value: Double*): Self = StObject.set(x, "resolution", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@pixi/assets.@pixi/assets/lib/detections.FormatDetectionParser> */
  trait PartialFormatDetectionPar extends StObject {
    
    var add: js.UndefOr[js.Function1[/* formats */ js.Array[String], js.Promise[js.Array[String]]]] = js.undefined
    
    var `extension`: js.UndefOr[ExtensionMetadata] = js.undefined
    
    var remove: js.UndefOr[js.Function1[/* formats */ js.Array[String], js.Promise[js.Array[String]]]] = js.undefined
    
    var test: js.UndefOr[js.Function0[js.Promise[Boolean]]] = js.undefined
  }
  object PartialFormatDetectionPar {
    
    inline def apply(): PartialFormatDetectionPar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFormatDetectionPar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFormatDetectionPar] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: /* formats */ js.Array[String] => js.Promise[js.Array[String]]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setExtension(value: ExtensionMetadata): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setRemove(value: /* formats */ js.Array[String] => js.Promise[js.Array[String]]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setTest(value: () => js.Promise[Boolean]): Self = StObject.set(x, "test", js.Any.fromFunction0(value))
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@pixi/assets.@pixi/assets/lib/resolver.ResolveURLParser> */
  trait PartialResolveURLParser extends StObject {
    
    var config: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `extension`: js.UndefOr[ExtensionMetadata] = js.undefined
    
    var parse: js.UndefOr[js.Function1[/* value */ String, ResolveAsset]] = js.undefined
    
    var test: js.UndefOr[js.Function1[/* url */ String, Boolean]] = js.undefined
  }
  object PartialResolveURLParser {
    
    inline def apply(): PartialResolveURLParser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialResolveURLParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialResolveURLParser] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setExtension(value: ExtensionMetadata): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setParse(value: /* value */ String => ResolveAsset): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setTest(value: /* url */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
}
