package typings.objectHash

import org.scalablytyped.runtime.Shortcut
import typings.objectHash.mod.ObjectHash.Hash
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("object-hash", JSImport.Namespace)
  @js.native
  val ^ : Hash = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.objectHash.objectHashStrings.ascii
    - typings.objectHash.objectHashStrings.utf8
    - typings.objectHash.objectHashStrings.`utf-8`
    - typings.objectHash.objectHashStrings.utf16le
    - typings.objectHash.objectHashStrings.ucs2
    - typings.objectHash.objectHashStrings.`ucs-2`
    - typings.objectHash.objectHashStrings.base64
    - typings.objectHash.objectHashStrings.latin1
    - typings.objectHash.objectHashStrings.binary
    - typings.objectHash.objectHashStrings.hex
  */
  trait BufferEncoding extends StObject
  object BufferEncoding {
    
    inline def ascii: typings.objectHash.objectHashStrings.ascii = "ascii".asInstanceOf[typings.objectHash.objectHashStrings.ascii]
    
    inline def base64: typings.objectHash.objectHashStrings.base64 = "base64".asInstanceOf[typings.objectHash.objectHashStrings.base64]
    
    inline def binary: typings.objectHash.objectHashStrings.binary = "binary".asInstanceOf[typings.objectHash.objectHashStrings.binary]
    
    inline def hex: typings.objectHash.objectHashStrings.hex = "hex".asInstanceOf[typings.objectHash.objectHashStrings.hex]
    
    inline def latin1: typings.objectHash.objectHashStrings.latin1 = "latin1".asInstanceOf[typings.objectHash.objectHashStrings.latin1]
    
    inline def `ucs-2`: typings.objectHash.objectHashStrings.`ucs-2` = "ucs-2".asInstanceOf[typings.objectHash.objectHashStrings.`ucs-2`]
    
    inline def ucs2: typings.objectHash.objectHashStrings.ucs2 = "ucs2".asInstanceOf[typings.objectHash.objectHashStrings.ucs2]
    
    inline def `utf-8`: typings.objectHash.objectHashStrings.`utf-8` = "utf-8".asInstanceOf[typings.objectHash.objectHashStrings.`utf-8`]
    
    inline def utf16le: typings.objectHash.objectHashStrings.utf16le = "utf16le".asInstanceOf[typings.objectHash.objectHashStrings.utf16le]
    
    inline def utf8: typings.objectHash.objectHashStrings.utf8 = "utf8".asInstanceOf[typings.objectHash.objectHashStrings.utf8]
  }
  
  trait IStream extends StObject {
    
    var update: js.UndefOr[
        js.Function3[
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var write: js.UndefOr[
        js.Function3[
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object IStream {
    
    inline def apply(): IStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStream]
    }
    
    extension [Self <: IStream](x: Self) {
      
      inline def setUpdate(
        value: (/* chunk */ js.Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setWrite(
        value: (/* chunk */ js.Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  object ObjectHash {
    
    @js.native
    trait Hash extends StObject {
      
      def apply(`object`: js.Any): String = js.native
      def apply(`object`: js.Any, options: IOptions): String = js.native
      
      def MD5(`object`: js.Any): String = js.native
      
      def keys(`object`: js.Any): String = js.native
      
      def keysMD5(`object`: js.Any): String = js.native
      
      def sha1(`object`: js.Any): String = js.native
      
      def writeToStream(value: js.Any, options: IOptions, stream: IStream): Unit = js.native
      def writeToStream(value: js.Any, stream: IStream): Unit = js.native
    }
    
    trait IOptions extends StObject {
      
      var algorithm: js.UndefOr[String] = js.undefined
      
      var encoding: js.UndefOr[String] = js.undefined
      
      var excludeKeys: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.undefined
      
      var excludeValues: js.UndefOr[Boolean] = js.undefined
      
      var ignoreUnknown: js.UndefOr[Boolean] = js.undefined
      
      var replacer: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
      
      var respectFunctionNames: js.UndefOr[Boolean] = js.undefined
      
      var respectFunctionProperties: js.UndefOr[Boolean] = js.undefined
      
      var respectType: js.UndefOr[Boolean] = js.undefined
      
      var unorderedArrays: js.UndefOr[Boolean] = js.undefined
      
      var unorderedObjects: js.UndefOr[Boolean] = js.undefined
      
      var unorderedSets: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
        
        inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
        
        inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        inline def setExcludeKeys(value: /* key */ String => Boolean): Self = StObject.set(x, "excludeKeys", js.Any.fromFunction1(value))
        
        inline def setExcludeKeysUndefined: Self = StObject.set(x, "excludeKeys", js.undefined)
        
        inline def setExcludeValues(value: Boolean): Self = StObject.set(x, "excludeValues", value.asInstanceOf[js.Any])
        
        inline def setExcludeValuesUndefined: Self = StObject.set(x, "excludeValues", js.undefined)
        
        inline def setIgnoreUnknown(value: Boolean): Self = StObject.set(x, "ignoreUnknown", value.asInstanceOf[js.Any])
        
        inline def setIgnoreUnknownUndefined: Self = StObject.set(x, "ignoreUnknown", js.undefined)
        
        inline def setReplacer(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "replacer", js.Any.fromFunction1(value))
        
        inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
        
        inline def setRespectFunctionNames(value: Boolean): Self = StObject.set(x, "respectFunctionNames", value.asInstanceOf[js.Any])
        
        inline def setRespectFunctionNamesUndefined: Self = StObject.set(x, "respectFunctionNames", js.undefined)
        
        inline def setRespectFunctionProperties(value: Boolean): Self = StObject.set(x, "respectFunctionProperties", value.asInstanceOf[js.Any])
        
        inline def setRespectFunctionPropertiesUndefined: Self = StObject.set(x, "respectFunctionProperties", js.undefined)
        
        inline def setRespectType(value: Boolean): Self = StObject.set(x, "respectType", value.asInstanceOf[js.Any])
        
        inline def setRespectTypeUndefined: Self = StObject.set(x, "respectType", js.undefined)
        
        inline def setUnorderedArrays(value: Boolean): Self = StObject.set(x, "unorderedArrays", value.asInstanceOf[js.Any])
        
        inline def setUnorderedArraysUndefined: Self = StObject.set(x, "unorderedArrays", js.undefined)
        
        inline def setUnorderedObjects(value: Boolean): Self = StObject.set(x, "unorderedObjects", value.asInstanceOf[js.Any])
        
        inline def setUnorderedObjectsUndefined: Self = StObject.set(x, "unorderedObjects", js.undefined)
        
        inline def setUnorderedSets(value: Boolean): Self = StObject.set(x, "unorderedSets", value.asInstanceOf[js.Any])
        
        inline def setUnorderedSetsUndefined: Self = StObject.set(x, "unorderedSets", js.undefined)
      }
    }
  }
  
  type _To = Hash
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Hash = ^
}
