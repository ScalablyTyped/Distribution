package typings.pixiAssets

import typings.pixiAssets.libLoaderLoaderMod.Loader
import typings.pixiAssets.libLoaderTypesMod.LoadAsset
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoaderParsersLoaderParserMod {
  
  @js.native
  sealed trait LoaderParserPriority extends StObject
  @JSImport("@pixi/assets/lib/loader/parsers/LoaderParser", "LoaderParserPriority")
  @js.native
  object LoaderParserPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LoaderParserPriority & Double] = js.native
    
    /** Specific texture types: svg, png, ktx, dds, basis */
    @js.native
    sealed trait High
      extends StObject
         with LoaderParserPriority
    /* 2 */ val High: typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority.High & Double = js.native
    
    /** Generic parsers: txt, json, webfonts */
    @js.native
    sealed trait Low
      extends StObject
         with LoaderParserPriority
    /* 0 */ val Low: typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority.Low & Double = js.native
    
    /** PixiJS assets with generic extensions: spritesheets, bitmapfonts  */
    @js.native
    sealed trait Normal
      extends StObject
         with LoaderParserPriority
    /* 1 */ val Normal: typings.pixiAssets.libLoaderParsersLoaderParserMod.LoaderParserPriority.Normal & Double = js.native
  }
  
  trait LoaderParser[ASSET, META_DATA] extends StObject {
    
    /** A config to adjust the parser */
    var config: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `extension`: js.UndefOr[ExtensionMetadata] = js.undefined
    
    /**
      * This is the promise that loads the URL provided
      * resolves with a loaded asset if returned by the parser.
      * @param url - The URL to load
      * @param loadAsset - Any custom additional information relevant to the asset being loaded
      * @param loader - The loader instance
      */
    var load: js.UndefOr[
        js.Function3[
          /* url */ String, 
          /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], 
          /* loader */ js.UndefOr[Loader], 
          js.Promise[Any]
        ]
      ] = js.undefined
    
    /**
      * Gets called on the asset it testParse passes. Useful to convert a raw asset into something more useful than
      * @param asset - The loaded asset data
      * @param loadAsset - Any custom additional information relevant to the asset being loaded
      * @param loader - The loader instance
      */
    var parse: js.UndefOr[
        js.Function3[
          /* asset */ ASSET, 
          /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], 
          /* loader */ js.UndefOr[Loader], 
          js.Promise[Any]
        ]
      ] = js.undefined
    
    /**
      * each URL to load will be tested here,
      * if the test is passed the assets are loaded using the load function below.
      * Good place to test for things like file extensions!
      * @param url - The URL to test
      * @param loadAsset - Any custom additional information relevant to the asset being loaded
      * @param loader - The loader instance
      */
    var test: js.UndefOr[
        js.Function3[
          /* url */ String, 
          /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], 
          /* loader */ js.UndefOr[Loader], 
          Boolean
        ]
      ] = js.undefined
    
    /**
      * This function is used to test if the parse function should be run on the asset
      * If this returns true then parse is called with the asset
      * @param asset - The loaded asset data
      * @param loadAsset - Any custom additional information relevant to the asset being loaded
      * @param loader - The loader instance
      */
    var testParse: js.UndefOr[
        js.Function3[
          /* asset */ ASSET, 
          /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], 
          /* loader */ js.UndefOr[Loader], 
          js.Promise[Boolean]
        ]
      ] = js.undefined
    
    /**
      * If an asset is parsed using this parser, the unload function will be called when the user requests an asset
      * to be unloaded. This is useful for things like sounds or textures that can be unloaded from memory
      * @param asset - The asset to unload/destroy
      * @param loadAsset - Any custom additional information relevant to the asset being loaded
      * @param loader - The loader instance
      */
    var unload: js.UndefOr[
        js.Function3[
          /* asset */ ASSET, 
          /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], 
          /* loader */ js.UndefOr[Loader], 
          Unit
        ]
      ] = js.undefined
  }
  object LoaderParser {
    
    inline def apply[ASSET, META_DATA](): LoaderParser[ASSET, META_DATA] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderParser[ASSET, META_DATA]]
    }
    
    extension [Self <: LoaderParser[?, ?], ASSET, META_DATA](x: Self & (LoaderParser[ASSET, META_DATA])) {
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setExtension(value: ExtensionMetadata): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setLoad(
        value: (/* url */ String, /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], /* loader */ js.UndefOr[Loader]) => js.Promise[Any]
      ): Self = StObject.set(x, "load", js.Any.fromFunction3(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setParse(
        value: (/* asset */ ASSET, /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], /* loader */ js.UndefOr[Loader]) => js.Promise[Any]
      ): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setTest(
        value: (/* url */ String, /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], /* loader */ js.UndefOr[Loader]) => Boolean
      ): Self = StObject.set(x, "test", js.Any.fromFunction3(value))
      
      inline def setTestParse(
        value: (/* asset */ ASSET, /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], /* loader */ js.UndefOr[Loader]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "testParse", js.Any.fromFunction3(value))
      
      inline def setTestParseUndefined: Self = StObject.set(x, "testParse", js.undefined)
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setUnload(
        value: (/* asset */ ASSET, /* loadAsset */ js.UndefOr[LoadAsset[META_DATA]], /* loader */ js.UndefOr[Loader]) => Unit
      ): Self = StObject.set(x, "unload", js.Any.fromFunction3(value))
      
      inline def setUnloadUndefined: Self = StObject.set(x, "unload", js.undefined)
    }
  }
}
