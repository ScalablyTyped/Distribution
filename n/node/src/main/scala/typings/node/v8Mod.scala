package typings.node

import typings.node.NodeJS.TypedArray
import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonstreamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v8Mod {
  
  @JSImport("v8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A subclass of `Deserializer` corresponding to the format written by `DefaultSerializer`.
    * @since v8.0.0
    */
  @JSImport("v8", "DefaultDeserializer")
  @js.native
  open class DefaultDeserializer protected () extends Deserializer {
    def this(data: TypedArray) = this()
  }
  
  /**
    * A subclass of `Serializer` that serializes `TypedArray`(in particular `Buffer`) and `DataView` objects as host objects, and only
    * stores the part of their underlying `ArrayBuffer`s that they are referring to.
    * @since v8.0.0
    */
  @JSImport("v8", "DefaultSerializer")
  @js.native
  open class DefaultSerializer () extends Serializer
  
  /**
    * @since v8.0.0
    */
  @JSImport("v8", "Deserializer")
  @js.native
  open class Deserializer protected () extends StObject {
    def this(data: TypedArray) = this()
    
    /**
      * Reads the underlying wire format version. Likely mostly to be useful to
      * legacy code reading old wire format versions. May not be called before`.readHeader()`.
      */
    def getWireFormatVersion(): Double = js.native
    
    /**
      * Read a JS `number` value.
      * For use inside of a custom `deserializer._readHostObject()`.
      */
    def readDouble(): Double = js.native
    
    /**
      * Reads and validates a header (including the format version).
      * May, for example, reject an invalid or unsupported wire format. In that case,
      * an `Error` is thrown.
      */
    def readHeader(): Boolean = js.native
    
    /**
      * Read raw bytes from the deserializer’s internal buffer. The `length` parameter
      * must correspond to the length of the buffer that was passed to `serializer.writeRawBytes()`.
      * For use inside of a custom `deserializer._readHostObject()`.
      */
    def readRawBytes(length: Double): Buffer = js.native
    
    /**
      * Read a raw 32-bit unsigned integer and return it.
      * For use inside of a custom `deserializer._readHostObject()`.
      */
    def readUint32(): Double = js.native
    
    /**
      * Read a raw 64-bit unsigned integer and return it as an array `[hi, lo]`with two 32-bit unsigned integer entries.
      * For use inside of a custom `deserializer._readHostObject()`.
      */
    def readUint64(): js.Tuple2[Double, Double] = js.native
    
    /**
      * Deserializes a JavaScript value from the buffer and returns it.
      */
    def readValue(): Any = js.native
    
    /**
      * Marks an `ArrayBuffer` as having its contents transferred out of band.
      * Pass the corresponding `ArrayBuffer` in the serializing context to `serializer.transferArrayBuffer()` (or return the `id` from `serializer._getSharedArrayBufferId()` in the case of
      * `SharedArrayBuffer`s).
      * @param id A 32-bit unsigned integer.
      * @param arrayBuffer An `ArrayBuffer` instance.
      */
    def transferArrayBuffer(id: Double, arrayBuffer: js.typedarray.ArrayBuffer): Unit = js.native
  }
  
  /**
    * @since v8.0.0
    */
  @JSImport("v8", "Serializer")
  @js.native
  open class Serializer () extends StObject {
    
    /**
      * Returns the stored internal buffer. This serializer should not be used once
      * the buffer is released. Calling this method results in undefined behavior
      * if a previous write has failed.
      */
    def releaseBuffer(): Buffer = js.native
    
    /**
      * Marks an `ArrayBuffer` as having its contents transferred out of band.
      * Pass the corresponding `ArrayBuffer` in the deserializing context to `deserializer.transferArrayBuffer()`.
      * @param id A 32-bit unsigned integer.
      * @param arrayBuffer An `ArrayBuffer` instance.
      */
    def transferArrayBuffer(id: Double, arrayBuffer: js.typedarray.ArrayBuffer): Unit = js.native
    
    /**
      * Write a JS `number` value.
      * For use inside of a custom `serializer._writeHostObject()`.
      */
    def writeDouble(value: Double): Unit = js.native
    
    /**
      * Writes out a header, which includes the serialization format version.
      */
    def writeHeader(): Unit = js.native
    
    /**
      * Write raw bytes into the serializer’s internal buffer. The deserializer
      * will require a way to compute the length of the buffer.
      * For use inside of a custom `serializer._writeHostObject()`.
      */
    def writeRawBytes(buffer: TypedArray): Unit = js.native
    
    /**
      * Write a raw 32-bit unsigned integer.
      * For use inside of a custom `serializer._writeHostObject()`.
      */
    def writeUint32(value: Double): Unit = js.native
    
    /**
      * Write a raw 64-bit unsigned integer, split into high and low 32-bit parts.
      * For use inside of a custom `serializer._writeHostObject()`.
      */
    def writeUint64(hi: Double, lo: Double): Unit = js.native
    
    /**
      * Serializes a JavaScript value and adds the serialized representation to the
      * internal buffer.
      *
      * This throws an error if `value` cannot be serialized.
      */
    def writeValue(`val`: Any): Boolean = js.native
  }
  
  /**
    * Returns an integer representing a version tag derived from the V8 version,
    * command-line flags, and detected CPU features. This is useful for determining
    * whether a `vm.Script` `cachedData` buffer is compatible with this instance
    * of V8.
    *
    * ```js
    * console.log(v8.cachedDataVersionTag()); // 3947234607
    * // The value returned by v8.cachedDataVersionTag() is derived from the V8
    * // version, command-line flags, and detected CPU features. Test that the value
    * // does indeed update when flags are toggled.
    * v8.setFlagsFromString('--allow_natives_syntax');
    * console.log(v8.cachedDataVersionTag()); // 183726201
    * ```
    * @since v8.0.0
    */
  inline def cachedDataVersionTag(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cachedDataVersionTag")().asInstanceOf[Double]
  
  /**
    * Uses a `DefaultDeserializer` with default options to read a JS value
    * from a buffer.
    * @since v8.0.0
    * @param buffer A buffer returned by {@link serialize}.
    */
  inline def deserialize(buffer: TypedArray): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns an object with the following properties:
    *
    * ```js
    * {
    *   code_and_metadata_size: 212208,
    *   bytecode_and_metadata_size: 161368,
    *   external_script_source_size: 1410794
    * }
    * ```
    * @since v12.8.0
    */
  inline def getHeapCodeStatistics(): HeapCodeStatistics = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapCodeStatistics")().asInstanceOf[HeapCodeStatistics]
  
  /**
    * Generates a snapshot of the current V8 heap and returns a Readable
    * Stream that may be used to read the JSON serialized representation.
    * This JSON stream format is intended to be used with tools such as
    * Chrome DevTools. The JSON schema is undocumented and specific to the
    * V8 engine. Therefore, the schema may change from one version of V8 to the next.
    *
    * Creating a heap snapshot requires memory about twice the size of the heap at
    * the time the snapshot is created. This results in the risk of OOM killers
    * terminating the process.
    *
    * Generating a snapshot is a synchronous operation which blocks the event loop
    * for a duration depending on the heap size.
    *
    * ```js
    * // Print heap snapshot to the console
    * const v8 = require('v8');
    * const stream = v8.getHeapSnapshot();
    * stream.pipe(process.stdout);
    * ```
    * @since v11.13.0
    * @return A Readable Stream containing the V8 heap snapshot
    */
  inline def getHeapSnapshot(): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapSnapshot")().asInstanceOf[Readable]
  
  /**
    * Returns statistics about the V8 heap spaces, i.e. the segments which make up
    * the V8 heap. Neither the ordering of heap spaces, nor the availability of a
    * heap space can be guaranteed as the statistics are provided via the
    * V8[`GetHeapSpaceStatistics`](https://v8docs.nodesource.com/node-13.2/d5/dda/classv8_1_1_isolate.html#ac673576f24fdc7a33378f8f57e1d13a4) function and may change from one V8 version to the
    * next.
    *
    * The value returned is an array of objects containing the following properties:
    *
    * ```json
    * [
    *   {
    *     "space_name": "new_space",
    *     "space_size": 2063872,
    *     "space_used_size": 951112,
    *     "space_available_size": 80824,
    *     "physical_space_size": 2063872
    *   },
    *   {
    *     "space_name": "old_space",
    *     "space_size": 3090560,
    *     "space_used_size": 2493792,
    *     "space_available_size": 0,
    *     "physical_space_size": 3090560
    *   },
    *   {
    *     "space_name": "code_space",
    *     "space_size": 1260160,
    *     "space_used_size": 644256,
    *     "space_available_size": 960,
    *     "physical_space_size": 1260160
    *   },
    *   {
    *     "space_name": "map_space",
    *     "space_size": 1094160,
    *     "space_used_size": 201608,
    *     "space_available_size": 0,
    *     "physical_space_size": 1094160
    *   },
    *   {
    *     "space_name": "large_object_space",
    *     "space_size": 0,
    *     "space_used_size": 0,
    *     "space_available_size": 1490980608,
    *     "physical_space_size": 0
    *   }
    * ]
    * ```
    * @since v6.0.0
    */
  inline def getHeapSpaceStatistics(): js.Array[HeapSpaceInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapSpaceStatistics")().asInstanceOf[js.Array[HeapSpaceInfo]]
  
  /**
    * Returns an object with the following properties:
    *
    * `does_zap_garbage` is a 0/1 boolean, which signifies whether the`--zap_code_space` option is enabled or not. This makes V8 overwrite heap
    * garbage with a bit pattern. The RSS footprint (resident set size) gets bigger
    * because it continuously touches all heap pages and that makes them less likely
    * to get swapped out by the operating system.
    *
    * `number_of_native_contexts` The value of native\_context is the number of the
    * top-level contexts currently active. Increase of this number over time indicates
    * a memory leak.
    *
    * `number_of_detached_contexts` The value of detached\_context is the number
    * of contexts that were detached and not yet garbage collected. This number
    * being non-zero indicates a potential memory leak.
    *
    * ```js
    * {
    *   total_heap_size: 7326976,
    *   total_heap_size_executable: 4194304,
    *   total_physical_size: 7326976,
    *   total_available_size: 1152656,
    *   used_heap_size: 3476208,
    *   heap_size_limit: 1535115264,
    *   malloced_memory: 16384,
    *   peak_malloced_memory: 1127496,
    *   does_zap_garbage: 0,
    *   number_of_native_contexts: 1,
    *   number_of_detached_contexts: 0
    * }
    * ```
    * @since v1.0.0
    */
  inline def getHeapStatistics(): HeapInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapStatistics")().asInstanceOf[HeapInfo]
  
  /**
    * Uses a `DefaultSerializer` to serialize `value` into a buffer.
    *
    * `ERR_BUFFER_TOO_LARGE` will be thrown when trying to
    * serialize a huge object which requires buffer
    * larger than `buffer.constants.MAX_LENGTH`.
    * @since v8.0.0
    */
  inline def serialize(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * The `v8.setFlagsFromString()` method can be used to programmatically set
    * V8 command-line flags. This method should be used with care. Changing settings
    * after the VM has started may result in unpredictable behavior, including
    * crashes and data loss; or it may simply do nothing.
    *
    * The V8 options available for a version of Node.js may be determined by running`node --v8-options`.
    *
    * Usage:
    *
    * ```js
    * // Print GC events to stdout for one minute.
    * const v8 = require('v8');
    * v8.setFlagsFromString('--trace_gc');
    * setTimeout(() => { v8.setFlagsFromString('--notrace_gc'); }, 60e3);
    * ```
    * @since v1.0.0
    */
  inline def setFlagsFromString(flags: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFlagsFromString")(flags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * The `v8.stopCoverage()` method allows the user to stop the coverage collection
    * started by `NODE_V8_COVERAGE`, so that V8 can release the execution count
    * records and optimize code. This can be used in conjunction with {@link takeCoverage} if the user wants to collect the coverage on demand.
    * @since v15.1.0, v14.18.0, v12.22.0
    */
  inline def stopCoverage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopCoverage")().asInstanceOf[Unit]
  
  /**
    * The `v8.takeCoverage()` method allows the user to write the coverage started by `NODE_V8_COVERAGE` to disk on demand. This method can be invoked multiple
    * times during the lifetime of the process. Each time the execution counter will
    * be reset and a new coverage report will be written to the directory specified
    * by `NODE_V8_COVERAGE`.
    *
    * When the process is about to exit, one last coverage will still be written to
    * disk unless {@link stopCoverage} is invoked before the process exits.
    * @since v15.1.0, v14.18.0, v12.22.0
    */
  inline def takeCoverage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("takeCoverage")().asInstanceOf[Unit]
  
  /**
    * Generates a snapshot of the current V8 heap and writes it to a JSON
    * file. This file is intended to be used with tools such as Chrome
    * DevTools. The JSON schema is undocumented and specific to the V8
    * engine, and may change from one version of V8 to the next.
    *
    * A heap snapshot is specific to a single V8 isolate. When using `worker threads`, a heap snapshot generated from the main thread will
    * not contain any information about the workers, and vice versa.
    *
    * Creating a heap snapshot requires memory about twice the size of the heap at
    * the time the snapshot is created. This results in the risk of OOM killers
    * terminating the process.
    *
    * Generating a snapshot is a synchronous operation which blocks the event loop
    * for a duration depending on the heap size.
    *
    * ```js
    * const { writeHeapSnapshot } = require('v8');
    * const {
    *   Worker,
    *   isMainThread,
    *   parentPort
    * } = require('worker_threads');
    *
    * if (isMainThread) {
    *   const worker = new Worker(__filename);
    *
    *   worker.once('message', (filename) => {
    *     console.log(`worker heapdump: ${filename}`);
    *     // Now get a heapdump for the main thread.
    *     console.log(`main thread heapdump: ${writeHeapSnapshot()}`);
    *   });
    *
    *   // Tell the worker to create a heapdump.
    *   worker.postMessage('heapdump');
    * } else {
    *   parentPort.once('message', (message) => {
    *     if (message === 'heapdump') {
    *       // Generate a heapdump for the worker
    *       // and return the filename to the parent.
    *       parentPort.postMessage(writeHeapSnapshot());
    *     }
    *   });
    * }
    * ```
    * @since v11.13.0
    * @param filename The file path where the V8 heap snapshot is to be saved. If not specified, a file name with the pattern `'Heap-${yyyymmdd}-${hhmmss}-${pid}-${thread_id}.heapsnapshot'` will be
    * generated, where `{pid}` will be the PID of the Node.js process, `{thread_id}` will be `0` when `writeHeapSnapshot()` is called from the main Node.js thread or the id of a
    * worker thread.
    * @return The filename where the snapshot was saved.
    */
  inline def writeHeapSnapshot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeHeapSnapshot")().asInstanceOf[String]
  inline def writeHeapSnapshot(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeHeapSnapshot")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  
  // ** Signifies if the --zap_code_space option is enabled or not.  1 == enabled, 0 == disabled. */
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeInts.`0`
    - typings.node.nodeInts.`1`
  */
  trait DoesZapCodeSpaceFlag extends StObject
  object DoesZapCodeSpaceFlag {
    
    inline def `0`: typings.node.nodeInts.`0` = 0.asInstanceOf[typings.node.nodeInts.`0`]
    
    inline def `1`: typings.node.nodeInts.`1` = 1.asInstanceOf[typings.node.nodeInts.`1`]
  }
  
  trait HeapCodeStatistics extends StObject {
    
    var bytecode_and_metadata_size: Double
    
    var code_and_metadata_size: Double
    
    var external_script_source_size: Double
  }
  object HeapCodeStatistics {
    
    inline def apply(
      bytecode_and_metadata_size: Double,
      code_and_metadata_size: Double,
      external_script_source_size: Double
    ): HeapCodeStatistics = {
      val __obj = js.Dynamic.literal(bytecode_and_metadata_size = bytecode_and_metadata_size.asInstanceOf[js.Any], code_and_metadata_size = code_and_metadata_size.asInstanceOf[js.Any], external_script_source_size = external_script_source_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapCodeStatistics]
    }
    
    extension [Self <: HeapCodeStatistics](x: Self) {
      
      inline def setBytecode_and_metadata_size(value: Double): Self = StObject.set(x, "bytecode_and_metadata_size", value.asInstanceOf[js.Any])
      
      inline def setCode_and_metadata_size(value: Double): Self = StObject.set(x, "code_and_metadata_size", value.asInstanceOf[js.Any])
      
      inline def setExternal_script_source_size(value: Double): Self = StObject.set(x, "external_script_source_size", value.asInstanceOf[js.Any])
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
    
    inline def apply(
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
    
    extension [Self <: HeapInfo](x: Self) {
      
      inline def setDoes_zap_garbage(value: DoesZapCodeSpaceFlag): Self = StObject.set(x, "does_zap_garbage", value.asInstanceOf[js.Any])
      
      inline def setHeap_size_limit(value: Double): Self = StObject.set(x, "heap_size_limit", value.asInstanceOf[js.Any])
      
      inline def setMalloced_memory(value: Double): Self = StObject.set(x, "malloced_memory", value.asInstanceOf[js.Any])
      
      inline def setNumber_of_detached_contexts(value: Double): Self = StObject.set(x, "number_of_detached_contexts", value.asInstanceOf[js.Any])
      
      inline def setNumber_of_native_contexts(value: Double): Self = StObject.set(x, "number_of_native_contexts", value.asInstanceOf[js.Any])
      
      inline def setPeak_malloced_memory(value: Double): Self = StObject.set(x, "peak_malloced_memory", value.asInstanceOf[js.Any])
      
      inline def setTotal_available_size(value: Double): Self = StObject.set(x, "total_available_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_heap_size(value: Double): Self = StObject.set(x, "total_heap_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_heap_size_executable(value: Double): Self = StObject.set(x, "total_heap_size_executable", value.asInstanceOf[js.Any])
      
      inline def setTotal_physical_size(value: Double): Self = StObject.set(x, "total_physical_size", value.asInstanceOf[js.Any])
      
      inline def setUsed_heap_size(value: Double): Self = StObject.set(x, "used_heap_size", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapSpaceInfo extends StObject {
    
    var physical_space_size: Double
    
    var space_available_size: Double
    
    var space_name: String
    
    var space_size: Double
    
    var space_used_size: Double
  }
  object HeapSpaceInfo {
    
    inline def apply(
      physical_space_size: Double,
      space_available_size: Double,
      space_name: String,
      space_size: Double,
      space_used_size: Double
    ): HeapSpaceInfo = {
      val __obj = js.Dynamic.literal(physical_space_size = physical_space_size.asInstanceOf[js.Any], space_available_size = space_available_size.asInstanceOf[js.Any], space_name = space_name.asInstanceOf[js.Any], space_size = space_size.asInstanceOf[js.Any], space_used_size = space_used_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapSpaceInfo]
    }
    
    extension [Self <: HeapSpaceInfo](x: Self) {
      
      inline def setPhysical_space_size(value: Double): Self = StObject.set(x, "physical_space_size", value.asInstanceOf[js.Any])
      
      inline def setSpace_available_size(value: Double): Self = StObject.set(x, "space_available_size", value.asInstanceOf[js.Any])
      
      inline def setSpace_name(value: String): Self = StObject.set(x, "space_name", value.asInstanceOf[js.Any])
      
      inline def setSpace_size(value: Double): Self = StObject.set(x, "space_size", value.asInstanceOf[js.Any])
      
      inline def setSpace_used_size(value: Double): Self = StObject.set(x, "space_used_size", value.asInstanceOf[js.Any])
    }
  }
}
