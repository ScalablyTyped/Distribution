package typings.node

import typings.node.NodeJS.TypedArray
import typings.node.streamMod.Readable
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v8Mod {
  
  @JSImport("v8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A subclass of `Serializer` that serializes `TypedArray` (in particular `Buffer`) and `DataView` objects as host objects,
    * and only stores the part of their underlying `ArrayBuffers` that they are referring to.
    */
  @JSImport("v8", "DefaultDeserializer")
  @js.native
  class DefaultDeserializer protected () extends Deserializer {
    def this(data: TypedArray) = this()
  }
  
  /**
    * A subclass of `Serializer` that serializes `TypedArray` (in particular `Buffer`) and `DataView` objects as host objects,
    * and only stores the part of their underlying `ArrayBuffers` that they are referring to.
    */
  @JSImport("v8", "DefaultSerializer")
  @js.native
  class DefaultSerializer () extends Serializer
  
  @JSImport("v8", "Deserializer")
  @js.native
  class Deserializer protected () extends StObject {
    def this(data: TypedArray) = this()
    
    /**
      * Reads the underlying wire format version.
      * Likely mostly to be useful to legacy code reading old wire format versions.
      * May not be called before .readHeader().
      */
    def getWireFormatVersion(): Double = js.native
    
    /**
      * Read a JS number value.
      */
    def readDouble(): Double = js.native
    
    /**
      * Reads and validates a header (including the format version).
      * May, for example, reject an invalid or unsupported wire format.
      * In that case, an Error is thrown.
      */
    def readHeader(): Boolean = js.native
    
    /**
      * Read raw bytes from the deserializer’s internal buffer.
      * The length parameter must correspond to the length of the buffer that was passed to serializer.writeRawBytes().
      */
    def readRawBytes(length: Double): Buffer = js.native
    
    /**
      * Read a raw 32-bit unsigned integer and return it.
      */
    def readUint32(): Double = js.native
    
    /**
      * Read a raw 64-bit unsigned integer and return it as an array [hi, lo] with two 32-bit unsigned integer entries.
      */
    def readUint64(): js.Tuple2[Double, Double] = js.native
    
    /**
      * Deserializes a JavaScript value from the buffer and returns it.
      */
    def readValue(): js.Any = js.native
    
    /**
      * Marks an ArrayBuffer as having its contents transferred out of band.
      * Pass the corresponding `ArrayBuffer` in the serializing context to serializer.transferArrayBuffer()
      * (or return the id from serializer._getSharedArrayBufferId() in the case of SharedArrayBuffers).
      */
    def transferArrayBuffer(id: Double, arrayBuffer: ArrayBuffer): Unit = js.native
  }
  
  @JSImport("v8", "Serializer")
  @js.native
  class Serializer () extends StObject {
    
    /**
      * Returns the stored internal buffer.
      * This serializer should not be used once the buffer is released.
      * Calling this method results in undefined behavior if a previous write has failed.
      */
    def releaseBuffer(): Buffer = js.native
    
    /**
      * Marks an ArrayBuffer as having its contents transferred out of band.\
      * Pass the corresponding ArrayBuffer in the deserializing context to deserializer.transferArrayBuffer().
      */
    def transferArrayBuffer(id: Double, arrayBuffer: ArrayBuffer): Unit = js.native
    
    /**
      * Write a JS number value.
      */
    def writeDouble(value: Double): Unit = js.native
    
    /**
      * Writes out a header, which includes the serialization format version.
      */
    def writeHeader(): Unit = js.native
    
    /**
      * Write raw bytes into the serializer’s internal buffer.
      * The deserializer will require a way to compute the length of the buffer.
      */
    def writeRawBytes(buffer: TypedArray): Unit = js.native
    
    /**
      * Write a raw 32-bit unsigned integer.
      */
    def writeUint32(value: Double): Unit = js.native
    
    /**
      * Write a raw 64-bit unsigned integer, split into high and low 32-bit parts.
      */
    def writeUint64(hi: Double, lo: Double): Unit = js.native
    
    /**
      * Serializes a JavaScript value and adds the serialized representation to the internal buffer.
      * This throws an error if value cannot be serialized.
      */
    def writeValue(`val`: js.Any): Boolean = js.native
  }
  
  /**
    * Returns an integer representing a "version tag" derived from the V8 version, command line flags and detected CPU features.
    * This is useful for determining whether a vm.Script cachedData buffer is compatible with this instance of V8.
    */
  @scala.inline
  def cachedDataVersionTag(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cachedDataVersionTag")().asInstanceOf[Double]
  
  /**
    * Uses a `DefaultDeserializer` with default options to read a JS value from a buffer.
    */
  @scala.inline
  def deserialize(data: TypedArray): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getHeapCodeStatistics(): HeapCodeStatistics = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapCodeStatistics")().asInstanceOf[HeapCodeStatistics]
  
  /**
    * Generates a snapshot of the current V8 heap and returns a Readable
    * Stream that may be used to read the JSON serialized representation.
    * This conversation was marked as resolved by joyeecheung
    * This JSON stream format is intended to be used with tools such as
    * Chrome DevTools. The JSON schema is undocumented and specific to the
    * V8 engine, and may change from one version of V8 to the next.
    */
  @scala.inline
  def getHeapSnapshot(): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapSnapshot")().asInstanceOf[Readable]
  
  @scala.inline
  def getHeapSpaceStatistics(): js.Array[HeapSpaceInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapSpaceStatistics")().asInstanceOf[js.Array[HeapSpaceInfo]]
  
  @scala.inline
  def getHeapStatistics(): HeapInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapStatistics")().asInstanceOf[HeapInfo]
  
  /**
    * Uses a `DefaultSerializer` to serialize value into a buffer.
    */
  @scala.inline
  def serialize(value: js.Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def setFlagsFromString(flags: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFlagsFromString")(flags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    *
    * @param fileName The file path where the V8 heap snapshot is to be
    * saved. If not specified, a file name with the pattern
    * `'Heap-${yyyymmdd}-${hhmmss}-${pid}-${thread_id}.heapsnapshot'` will be
    * generated, where `{pid}` will be the PID of the Node.js process,
    * `{thread_id}` will be `0` when `writeHeapSnapshot()` is called from
    * the main Node.js thread or the id of a worker thread.
    */
  @scala.inline
  def writeHeapSnapshot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeHeapSnapshot")().asInstanceOf[java.lang.String]
  @scala.inline
  def writeHeapSnapshot(fileName: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeHeapSnapshot")(fileName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  // ** Signifies if the --zap_code_space option is enabled or not.  1 == enabled, 0 == disabled. */
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeNumbers.`0`
    - typings.node.nodeNumbers.`1`
  */
  trait DoesZapCodeSpaceFlag extends StObject
  object DoesZapCodeSpaceFlag {
    
    @scala.inline
    def `0`: typings.node.nodeNumbers.`0` = 0.asInstanceOf[typings.node.nodeNumbers.`0`]
    
    @scala.inline
    def `1`: typings.node.nodeNumbers.`1` = 1.asInstanceOf[typings.node.nodeNumbers.`1`]
  }
  
  trait HeapCodeStatistics extends StObject {
    
    var bytecode_and_metadata_size: Double
    
    var code_and_metadata_size: Double
    
    var external_script_source_size: Double
  }
  object HeapCodeStatistics {
    
    @scala.inline
    def apply(
      bytecode_and_metadata_size: Double,
      code_and_metadata_size: Double,
      external_script_source_size: Double
    ): HeapCodeStatistics = {
      val __obj = js.Dynamic.literal(bytecode_and_metadata_size = bytecode_and_metadata_size.asInstanceOf[js.Any], code_and_metadata_size = code_and_metadata_size.asInstanceOf[js.Any], external_script_source_size = external_script_source_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapCodeStatistics]
    }
    
    @scala.inline
    implicit class HeapCodeStatisticsMutableBuilder[Self <: HeapCodeStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytecode_and_metadata_size(value: Double): Self = StObject.set(x, "bytecode_and_metadata_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode_and_metadata_size(value: Double): Self = StObject.set(x, "code_and_metadata_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_script_source_size(value: Double): Self = StObject.set(x, "external_script_source_size", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapInfo extends StObject {
    
    var does_zap_garbage: DoesZapCodeSpaceFlag
    
    var heap_size_limit: Double
    
    var malloced_memory: Double
    
    var number_of_detached_contexts: Double
    
    var number_of_native_contexts: Double
    
    var peak_malloced_memory: Double
    
    var total_available_size: Double
    
    var total_heap_size: Double
    
    var total_heap_size_executable: Double
    
    var total_physical_size: Double
    
    var used_heap_size: Double
  }
  object HeapInfo {
    
    @scala.inline
    def apply(
      does_zap_garbage: DoesZapCodeSpaceFlag,
      heap_size_limit: Double,
      malloced_memory: Double,
      number_of_detached_contexts: Double,
      number_of_native_contexts: Double,
      peak_malloced_memory: Double,
      total_available_size: Double,
      total_heap_size: Double,
      total_heap_size_executable: Double,
      total_physical_size: Double,
      used_heap_size: Double
    ): HeapInfo = {
      val __obj = js.Dynamic.literal(does_zap_garbage = does_zap_garbage.asInstanceOf[js.Any], heap_size_limit = heap_size_limit.asInstanceOf[js.Any], malloced_memory = malloced_memory.asInstanceOf[js.Any], number_of_detached_contexts = number_of_detached_contexts.asInstanceOf[js.Any], number_of_native_contexts = number_of_native_contexts.asInstanceOf[js.Any], peak_malloced_memory = peak_malloced_memory.asInstanceOf[js.Any], total_available_size = total_available_size.asInstanceOf[js.Any], total_heap_size = total_heap_size.asInstanceOf[js.Any], total_heap_size_executable = total_heap_size_executable.asInstanceOf[js.Any], total_physical_size = total_physical_size.asInstanceOf[js.Any], used_heap_size = used_heap_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapInfo]
    }
    
    @scala.inline
    implicit class HeapInfoMutableBuilder[Self <: HeapInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoes_zap_garbage(value: DoesZapCodeSpaceFlag): Self = StObject.set(x, "does_zap_garbage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeap_size_limit(value: Double): Self = StObject.set(x, "heap_size_limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMalloced_memory(value: Double): Self = StObject.set(x, "malloced_memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber_of_detached_contexts(value: Double): Self = StObject.set(x, "number_of_detached_contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber_of_native_contexts(value: Double): Self = StObject.set(x, "number_of_native_contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeak_malloced_memory(value: Double): Self = StObject.set(x, "peak_malloced_memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_available_size(value: Double): Self = StObject.set(x, "total_available_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_heap_size(value: Double): Self = StObject.set(x, "total_heap_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_heap_size_executable(value: Double): Self = StObject.set(x, "total_heap_size_executable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_physical_size(value: Double): Self = StObject.set(x, "total_physical_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsed_heap_size(value: Double): Self = StObject.set(x, "used_heap_size", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapSpaceInfo extends StObject {
    
    var physical_space_size: Double
    
    var space_available_size: Double
    
    var space_name: java.lang.String
    
    var space_size: Double
    
    var space_used_size: Double
  }
  object HeapSpaceInfo {
    
    @scala.inline
    def apply(
      physical_space_size: Double,
      space_available_size: Double,
      space_name: java.lang.String,
      space_size: Double,
      space_used_size: Double
    ): HeapSpaceInfo = {
      val __obj = js.Dynamic.literal(physical_space_size = physical_space_size.asInstanceOf[js.Any], space_available_size = space_available_size.asInstanceOf[js.Any], space_name = space_name.asInstanceOf[js.Any], space_size = space_size.asInstanceOf[js.Any], space_used_size = space_used_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapSpaceInfo]
    }
    
    @scala.inline
    implicit class HeapSpaceInfoMutableBuilder[Self <: HeapSpaceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPhysical_space_size(value: Double): Self = StObject.set(x, "physical_space_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_available_size(value: Double): Self = StObject.set(x, "space_available_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_name(value: java.lang.String): Self = StObject.set(x, "space_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_size(value: Double): Self = StObject.set(x, "space_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace_used_size(value: Double): Self = StObject.set(x, "space_used_size", value.asInstanceOf[js.Any])
    }
  }
}
