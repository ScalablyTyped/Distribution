package typings.msgpackr

import typings.msgpackr.anon.AllowHalfOpen
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("msgpackr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("msgpackr", "Decoder")
  @js.native
  open class Decoder () extends Unpackr {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr", "Encoder")
  @js.native
  open class Encoder () extends Packr {
    def this(options: Options) = this()
  }
  
  @js.native
  sealed trait FLOAT32_OPTIONS extends StObject
  @JSImport("msgpackr", "FLOAT32_OPTIONS")
  @js.native
  object FLOAT32_OPTIONS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FLOAT32_OPTIONS & Double] = js.native
    
    @js.native
    sealed trait ALWAYS
      extends StObject
         with FLOAT32_OPTIONS
    /* 1 */ val ALWAYS: typings.msgpackr.mod.FLOAT32_OPTIONS.ALWAYS & Double = js.native
    
    @js.native
    sealed trait DECIMAL_FIT
      extends StObject
         with FLOAT32_OPTIONS
    /* 4 */ val DECIMAL_FIT: typings.msgpackr.mod.FLOAT32_OPTIONS.DECIMAL_FIT & Double = js.native
    
    @js.native
    sealed trait DECIMAL_ROUND
      extends StObject
         with FLOAT32_OPTIONS
    /* 3 */ val DECIMAL_ROUND: typings.msgpackr.mod.FLOAT32_OPTIONS.DECIMAL_ROUND & Double = js.native
    
    @js.native
    sealed trait NEVER
      extends StObject
         with FLOAT32_OPTIONS
    /* 0 */ val NEVER: typings.msgpackr.mod.FLOAT32_OPTIONS.NEVER & Double = js.native
  }
  
  @JSImport("msgpackr", "Packr")
  @js.native
  open class Packr () extends Unpackr {
    def this(options: Options) = this()
    
    def encode(value: Any): Buffer = js.native
    
    def pack(value: Any): Buffer = js.native
  }
  
  @JSImport("msgpackr", "PackrStream")
  @js.native
  open class PackrStream () extends Transform {
    def this(options: AllowHalfOpen) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr", "Unpackr")
  @js.native
  open class Unpackr () extends StObject {
    def this(options: Options) = this()
    
    def decode(messagePack: js.typedarray.Uint8Array): Any = js.native
    def decode(messagePack: Buffer): Any = js.native
    
    def unpack(messagePack: js.typedarray.Uint8Array): Any = js.native
    def unpack(messagePack: Buffer): Any = js.native
    
    def unpackMultiple(messagePack: js.typedarray.Uint8Array): js.Array[Any] = js.native
    def unpackMultiple(messagePack: js.typedarray.Uint8Array, forEach: js.Function1[/* value */ Any, Any]): Unit = js.native
    def unpackMultiple(messagePack: Buffer): js.Array[Any] = js.native
    def unpackMultiple(messagePack: Buffer, forEach: js.Function1[/* value */ Any, Any]): Unit = js.native
  }
  
  @JSImport("msgpackr", "UnpackrStream")
  @js.native
  open class UnpackrStream () extends Transform {
    def this(options: AllowHalfOpen) = this()
    def this(options: Options) = this()
  }
  
  inline def addExtension(`extension`: Extension): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearSource(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSource")().asInstanceOf[Unit]
  
  inline def decode(messagePack: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(messagePack: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def encode(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @JSImport("msgpackr", "isNativeAccelerationEnabled")
  @js.native
  def isNativeAccelerationEnabled: Boolean = js.native
  inline def isNativeAccelerationEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNativeAccelerationEnabled")(x.asInstanceOf[js.Any])
  
  inline def pack(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def roundFloat32(float32Number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roundFloat32")(float32Number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def unpack(messagePack: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def unpack(messagePack: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def unpackMultiple(messagePack: js.typedarray.Uint8Array): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def unpackMultiple(messagePack: js.typedarray.Uint8Array, forEach: js.Function1[/* value */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any], forEach.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpackMultiple(messagePack: Buffer): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def unpackMultiple(messagePack: Buffer, forEach: js.Function1[/* value */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any], forEach.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Extension extends StObject {
    
    var Class: js.Function
    
    var pack: js.UndefOr[js.Function1[/* value */ Any, Buffer | js.typedarray.Uint8Array]] = js.undefined
    
    var read: js.UndefOr[js.Function1[/* datum */ Any, Any]] = js.undefined
    
    var `type`: Double
    
    var unpack: js.UndefOr[js.Function1[/* messagePack */ Buffer | js.typedarray.Uint8Array, Any]] = js.undefined
    
    var write: js.UndefOr[js.Function1[/* instance */ Any, Any]] = js.undefined
  }
  object Extension {
    
    inline def apply(Class: js.Function, `type`: Double): Extension = {
      val __obj = js.Dynamic.literal(Class = Class.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      inline def setClass(value: js.Function): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
      
      inline def setPack(value: /* value */ Any => Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "pack", js.Any.fromFunction1(value))
      
      inline def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
      
      inline def setRead(value: /* datum */ Any => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnpack(value: /* messagePack */ Buffer | js.typedarray.Uint8Array => Any): Self = StObject.set(x, "unpack", js.Any.fromFunction1(value))
      
      inline def setUnpackUndefined: Self = StObject.set(x, "unpack", js.undefined)
      
      inline def setWrite(value: /* instance */ Any => Any): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var bundleStrings: js.UndefOr[Boolean] = js.undefined
    
    var copyBuffers: js.UndefOr[Boolean] = js.undefined
    
    var encodeUndefinedAsNil: js.UndefOr[Boolean] = js.undefined
    
    var getStructures: js.UndefOr[js.Function0[js.Array[js.Object]]] = js.undefined
    
    var int64AsNumber: js.UndefOr[Boolean] = js.undefined
    
    var largeBigIntToFloat: js.UndefOr[Boolean] = js.undefined
    
    var mapsAsObjects: js.UndefOr[Boolean] = js.undefined
    
    var maxOwnStructures: js.UndefOr[Double] = js.undefined
    
    var maxSharedStructures: js.UndefOr[Double] = js.undefined
    
    var moreTypes: js.UndefOr[Boolean] = js.undefined
    
    var onInvalidDate: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var saveStructures: js.UndefOr[js.Function1[/* structures */ js.Array[js.Object], Boolean | Unit]] = js.undefined
    
    var shouldShareStructure: js.UndefOr[js.Function1[/* keys */ js.Array[String], Boolean]] = js.undefined
    
    var structuredClone: js.UndefOr[Boolean] = js.undefined
    
    var structures: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var useFloat32: js.UndefOr[FLOAT32_OPTIONS] = js.undefined
    
    var useRecords: js.UndefOr[Boolean] = js.undefined
    
    var useTimestamp32: js.UndefOr[Boolean] = js.undefined
    
    var variableMapSize: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBundleStrings(value: Boolean): Self = StObject.set(x, "bundleStrings", value.asInstanceOf[js.Any])
      
      inline def setBundleStringsUndefined: Self = StObject.set(x, "bundleStrings", js.undefined)
      
      inline def setCopyBuffers(value: Boolean): Self = StObject.set(x, "copyBuffers", value.asInstanceOf[js.Any])
      
      inline def setCopyBuffersUndefined: Self = StObject.set(x, "copyBuffers", js.undefined)
      
      inline def setEncodeUndefinedAsNil(value: Boolean): Self = StObject.set(x, "encodeUndefinedAsNil", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefinedAsNilUndefined: Self = StObject.set(x, "encodeUndefinedAsNil", js.undefined)
      
      inline def setGetStructures(value: () => js.Array[js.Object]): Self = StObject.set(x, "getStructures", js.Any.fromFunction0(value))
      
      inline def setGetStructuresUndefined: Self = StObject.set(x, "getStructures", js.undefined)
      
      inline def setInt64AsNumber(value: Boolean): Self = StObject.set(x, "int64AsNumber", value.asInstanceOf[js.Any])
      
      inline def setInt64AsNumberUndefined: Self = StObject.set(x, "int64AsNumber", js.undefined)
      
      inline def setLargeBigIntToFloat(value: Boolean): Self = StObject.set(x, "largeBigIntToFloat", value.asInstanceOf[js.Any])
      
      inline def setLargeBigIntToFloatUndefined: Self = StObject.set(x, "largeBigIntToFloat", js.undefined)
      
      inline def setMapsAsObjects(value: Boolean): Self = StObject.set(x, "mapsAsObjects", value.asInstanceOf[js.Any])
      
      inline def setMapsAsObjectsUndefined: Self = StObject.set(x, "mapsAsObjects", js.undefined)
      
      inline def setMaxOwnStructures(value: Double): Self = StObject.set(x, "maxOwnStructures", value.asInstanceOf[js.Any])
      
      inline def setMaxOwnStructuresUndefined: Self = StObject.set(x, "maxOwnStructures", js.undefined)
      
      inline def setMaxSharedStructures(value: Double): Self = StObject.set(x, "maxSharedStructures", value.asInstanceOf[js.Any])
      
      inline def setMaxSharedStructuresUndefined: Self = StObject.set(x, "maxSharedStructures", js.undefined)
      
      inline def setMoreTypes(value: Boolean): Self = StObject.set(x, "moreTypes", value.asInstanceOf[js.Any])
      
      inline def setMoreTypesUndefined: Self = StObject.set(x, "moreTypes", js.undefined)
      
      inline def setOnInvalidDate(value: () => Any): Self = StObject.set(x, "onInvalidDate", js.Any.fromFunction0(value))
      
      inline def setOnInvalidDateUndefined: Self = StObject.set(x, "onInvalidDate", js.undefined)
      
      inline def setSaveStructures(value: /* structures */ js.Array[js.Object] => Boolean | Unit): Self = StObject.set(x, "saveStructures", js.Any.fromFunction1(value))
      
      inline def setSaveStructuresUndefined: Self = StObject.set(x, "saveStructures", js.undefined)
      
      inline def setShouldShareStructure(value: /* keys */ js.Array[String] => Boolean): Self = StObject.set(x, "shouldShareStructure", js.Any.fromFunction1(value))
      
      inline def setShouldShareStructureUndefined: Self = StObject.set(x, "shouldShareStructure", js.undefined)
      
      inline def setStructuredClone(value: Boolean): Self = StObject.set(x, "structuredClone", value.asInstanceOf[js.Any])
      
      inline def setStructuredCloneUndefined: Self = StObject.set(x, "structuredClone", js.undefined)
      
      inline def setStructures(value: js.Array[js.Object]): Self = StObject.set(x, "structures", value.asInstanceOf[js.Any])
      
      inline def setStructuresUndefined: Self = StObject.set(x, "structures", js.undefined)
      
      inline def setStructuresVarargs(value: js.Object*): Self = StObject.set(x, "structures", js.Array(value*))
      
      inline def setUseFloat32(value: FLOAT32_OPTIONS): Self = StObject.set(x, "useFloat32", value.asInstanceOf[js.Any])
      
      inline def setUseFloat32Undefined: Self = StObject.set(x, "useFloat32", js.undefined)
      
      inline def setUseRecords(value: Boolean): Self = StObject.set(x, "useRecords", value.asInstanceOf[js.Any])
      
      inline def setUseRecordsUndefined: Self = StObject.set(x, "useRecords", js.undefined)
      
      inline def setUseTimestamp32(value: Boolean): Self = StObject.set(x, "useTimestamp32", value.asInstanceOf[js.Any])
      
      inline def setUseTimestamp32Undefined: Self = StObject.set(x, "useTimestamp32", js.undefined)
      
      inline def setVariableMapSize(value: Boolean): Self = StObject.set(x, "variableMapSize", value.asInstanceOf[js.Any])
      
      inline def setVariableMapSizeUndefined: Self = StObject.set(x, "variableMapSize", js.undefined)
    }
  }
}
