package typings.objectHash

import typings.node.bufferMod.global.Buffer
import typings.objectHash.objectHashStrings.base64
import typings.objectHash.objectHashStrings.binary
import typings.objectHash.objectHashStrings.buffer
import typings.objectHash.objectHashStrings.hex
import typings.objectHash.objectHashStrings.md5
import typings.objectHash.objectHashStrings.passthrough
import typings.objectHash.objectHashStrings.sha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @see https://github.com/puleos/object-hash#hashvalue-options
    */
  inline def apply(`object`: NotUndefined): String = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(`object`: NotUndefined, options: NormalOption): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(`object`: NotUndefined, options: WithBufferOption): Buffer = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("object-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see https://github.com/puleos/object-hash#hashmd5value
    */
  inline def MD5(`object`: NotUndefined): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MD5")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @see https://github.com/puleos/object-hash#hashkeysvalue
    */
  inline def keys(`object`: NotUndefined): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @see https://github.com/puleos/object-hash#hashkeysmd5value
    */
  inline def keysMD5(`object`: NotUndefined): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keysMD5")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @see https://github.com/puleos/object-hash#hashsha1value
    */
  inline def sha1(`object`: NotUndefined): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def writeToStream(value: Any, options: Options, stream: Stream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * @see https://github.com/puleos/object-hash#hashwritetostreamvalue-options-stream
    */
  inline def writeToStream(value: Any, stream: Stream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(value.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BaseOptions extends StObject {
    
    /**
      * @default 'sha1'
      */
    var algorithm: js.UndefOr[sha1 | md5 | passthrough] = js.undefined
    
    var excludeKeys: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.undefined
    
    /**
      * @default false
      */
    var excludeValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var ignoreUnknown: js.UndefOr[Boolean] = js.undefined
    
    var replacer: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
    
    /**
      * @default true
      */
    var respectFunctionNames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var respectFunctionProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var respectType: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var unorderedArrays: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var unorderedObjects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var unorderedSets: js.UndefOr[Boolean] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: sha1 | md5 | passthrough): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setExcludeKeys(value: /* key */ String => Boolean): Self = StObject.set(x, "excludeKeys", js.Any.fromFunction1(value))
      
      inline def setExcludeKeysUndefined: Self = StObject.set(x, "excludeKeys", js.undefined)
      
      inline def setExcludeValues(value: Boolean): Self = StObject.set(x, "excludeValues", value.asInstanceOf[js.Any])
      
      inline def setExcludeValuesUndefined: Self = StObject.set(x, "excludeValues", js.undefined)
      
      inline def setIgnoreUnknown(value: Boolean): Self = StObject.set(x, "ignoreUnknown", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnknownUndefined: Self = StObject.set(x, "ignoreUnknown", js.undefined)
      
      inline def setReplacer(value: /* value */ Any => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction1(value))
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.objectHash.objectHashStrings.ascii
    - typings.objectHash.objectHashStrings.base64
    - typings.objectHash.objectHashStrings.binary
    - typings.objectHash.objectHashStrings.hex
    - typings.objectHash.objectHashStrings.latin1
    - typings.objectHash.objectHashStrings.`ucs-2`
    - typings.objectHash.objectHashStrings.ucs2
    - typings.objectHash.objectHashStrings.`utf-8`
    - typings.objectHash.objectHashStrings.utf16le
    - typings.objectHash.objectHashStrings.utf8
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
  
  trait NormalOption
    extends StObject
       with BaseOptions
       with Options {
    
    /**
      * @default 'hex'
      */
    var encoding: js.UndefOr[hex | binary | base64] = js.undefined
  }
  object NormalOption {
    
    inline def apply(): NormalOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalOption] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: hex | binary | base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NotUndefined = object | string | number | boolean | null | std.Array<object-hash.object-hash.NotUndefined>
  }}}
  to avoid circular code involving: 
  - object-hash.object-hash.NotUndefined
  */
  type NotUndefined = js.Object | String | Double | Boolean | Null | js.Array[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.objectHash.mod.NormalOption
    - typings.objectHash.mod.WithBufferOption
  */
  trait Options extends StObject
  object Options {
    
    inline def NormalOption(): typings.objectHash.mod.NormalOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.objectHash.mod.NormalOption]
    }
    
    inline def WithBufferOption(): typings.objectHash.mod.WithBufferOption = {
      val __obj = js.Dynamic.literal(encoding = "buffer")
      __obj.asInstanceOf[typings.objectHash.mod.WithBufferOption]
    }
  }
  
  trait Stream extends StObject {
    
    var update: js.UndefOr[
        js.Function3[
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var write: js.UndefOr[
        js.Function3[
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object Stream {
    
    inline def apply(): Stream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      inline def setUpdate(
        value: (/* chunk */ Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setWrite(
        value: (/* chunk */ Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  trait WithBufferOption
    extends StObject
       with BaseOptions
       with Options {
    
    var encoding: buffer
  }
  object WithBufferOption {
    
    inline def apply(): WithBufferOption = {
      val __obj = js.Dynamic.literal(encoding = "buffer")
      __obj.asInstanceOf[WithBufferOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithBufferOption] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}
