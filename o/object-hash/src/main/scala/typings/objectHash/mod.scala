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
    
    @scala.inline
    def ascii: typings.objectHash.objectHashStrings.ascii = "ascii".asInstanceOf[typings.objectHash.objectHashStrings.ascii]
    
    @scala.inline
    def base64: typings.objectHash.objectHashStrings.base64 = "base64".asInstanceOf[typings.objectHash.objectHashStrings.base64]
    
    @scala.inline
    def binary: typings.objectHash.objectHashStrings.binary = "binary".asInstanceOf[typings.objectHash.objectHashStrings.binary]
    
    @scala.inline
    def hex: typings.objectHash.objectHashStrings.hex = "hex".asInstanceOf[typings.objectHash.objectHashStrings.hex]
    
    @scala.inline
    def latin1: typings.objectHash.objectHashStrings.latin1 = "latin1".asInstanceOf[typings.objectHash.objectHashStrings.latin1]
    
    @scala.inline
    def `ucs-2`: typings.objectHash.objectHashStrings.`ucs-2` = "ucs-2".asInstanceOf[typings.objectHash.objectHashStrings.`ucs-2`]
    
    @scala.inline
    def ucs2: typings.objectHash.objectHashStrings.ucs2 = "ucs2".asInstanceOf[typings.objectHash.objectHashStrings.ucs2]
    
    @scala.inline
    def `utf-8`: typings.objectHash.objectHashStrings.`utf-8` = "utf-8".asInstanceOf[typings.objectHash.objectHashStrings.`utf-8`]
    
    @scala.inline
    def utf16le: typings.objectHash.objectHashStrings.utf16le = "utf16le".asInstanceOf[typings.objectHash.objectHashStrings.utf16le]
    
    @scala.inline
    def utf8: typings.objectHash.objectHashStrings.utf8 = "utf8".asInstanceOf[typings.objectHash.objectHashStrings.utf8]
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
    
    @scala.inline
    def apply(): IStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStream]
    }
    
    @scala.inline
    implicit class IStreamMutableBuilder[Self <: IStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdate(
        value: (/* chunk */ js.Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setWrite(
        value: (/* chunk */ js.Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
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
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
        
        @scala.inline
        def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        @scala.inline
        def setExcludeKeys(value: /* key */ String => Boolean): Self = StObject.set(x, "excludeKeys", js.Any.fromFunction1(value))
        
        @scala.inline
        def setExcludeKeysUndefined: Self = StObject.set(x, "excludeKeys", js.undefined)
        
        @scala.inline
        def setExcludeValues(value: Boolean): Self = StObject.set(x, "excludeValues", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExcludeValuesUndefined: Self = StObject.set(x, "excludeValues", js.undefined)
        
        @scala.inline
        def setIgnoreUnknown(value: Boolean): Self = StObject.set(x, "ignoreUnknown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreUnknownUndefined: Self = StObject.set(x, "ignoreUnknown", js.undefined)
        
        @scala.inline
        def setReplacer(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "replacer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
        
        @scala.inline
        def setRespectFunctionNames(value: Boolean): Self = StObject.set(x, "respectFunctionNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRespectFunctionNamesUndefined: Self = StObject.set(x, "respectFunctionNames", js.undefined)
        
        @scala.inline
        def setRespectFunctionProperties(value: Boolean): Self = StObject.set(x, "respectFunctionProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRespectFunctionPropertiesUndefined: Self = StObject.set(x, "respectFunctionProperties", js.undefined)
        
        @scala.inline
        def setRespectType(value: Boolean): Self = StObject.set(x, "respectType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRespectTypeUndefined: Self = StObject.set(x, "respectType", js.undefined)
        
        @scala.inline
        def setUnorderedArrays(value: Boolean): Self = StObject.set(x, "unorderedArrays", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnorderedArraysUndefined: Self = StObject.set(x, "unorderedArrays", js.undefined)
        
        @scala.inline
        def setUnorderedObjects(value: Boolean): Self = StObject.set(x, "unorderedObjects", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnorderedObjectsUndefined: Self = StObject.set(x, "unorderedObjects", js.undefined)
        
        @scala.inline
        def setUnorderedSets(value: Boolean): Self = StObject.set(x, "unorderedSets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnorderedSetsUndefined: Self = StObject.set(x, "unorderedSets", js.undefined)
      }
    }
  }
  
  type _To = Hash
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Hash = ^
}
