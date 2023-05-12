package typings.node

import typings.node.NodeJS.TypedArray
import typings.node.anon.AfterGC
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
      * Read raw bytes from the deserializer's internal buffer. The `length` parameter
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
    * This API collects GC data in current thread.
    * @since v19.6.0, v18.15.0
    */
  @JSImport("v8", "GCProfiler")
  @js.native
  open class GCProfiler () extends StObject {
    
    /**
      * Start collecting GC data.
      * @since v19.6.0, v18.15.0
      */
    def start(): Unit = js.native
    
    /**
      * Stop collecting GC data and return an object.The content of object
      * is as follows.
      *
      * ```json
      * {
      *   "version": 1,
      *   "startTime": 1674059033862,
      *   "statistics": [
      *     {
      *       "gcType": "Scavenge",
      *       "beforeGC": {
      *         "heapStatistics": {
      *           "totalHeapSize": 5005312,
      *           "totalHeapSizeExecutable": 524288,
      *           "totalPhysicalSize": 5226496,
      *           "totalAvailableSize": 4341325216,
      *           "totalGlobalHandlesSize": 8192,
      *           "usedGlobalHandlesSize": 2112,
      *           "usedHeapSize": 4883840,
      *           "heapSizeLimit": 4345298944,
      *           "mallocedMemory": 254128,
      *           "externalMemory": 225138,
      *           "peakMallocedMemory": 181760
      *         },
      *         "heapSpaceStatistics": [
      *           {
      *             "spaceName": "read_only_space",
      *             "spaceSize": 0,
      *             "spaceUsedSize": 0,
      *             "spaceAvailableSize": 0,
      *             "physicalSpaceSize": 0
      *           }
      *         ]
      *       },
      *       "cost": 1574.14,
      *       "afterGC": {
      *         "heapStatistics": {
      *           "totalHeapSize": 6053888,
      *           "totalHeapSizeExecutable": 524288,
      *           "totalPhysicalSize": 5500928,
      *           "totalAvailableSize": 4341101384,
      *           "totalGlobalHandlesSize": 8192,
      *           "usedGlobalHandlesSize": 2112,
      *           "usedHeapSize": 4059096,
      *           "heapSizeLimit": 4345298944,
      *           "mallocedMemory": 254128,
      *           "externalMemory": 225138,
      *           "peakMallocedMemory": 181760
      *         },
      *         "heapSpaceStatistics": [
      *           {
      *             "spaceName": "read_only_space",
      *             "spaceSize": 0,
      *             "spaceUsedSize": 0,
      *             "spaceAvailableSize": 0,
      *             "physicalSpaceSize": 0
      *           }
      *         ]
      *       }
      *     }
      *   ],
      *   "endTime": 1674059036865
      * }
      * ```
      *
      * Here's an example.
      *
      * ```js
      * const { GCProfiler } = require('v8');
      * const profiler = new GCProfiler();
      * profiler.start();
      * setTimeout(() => {
      *   console.log(profiler.stop());
      * }, 1000);
      * ```
      * @since v19.6.0, v18.15.0
      */
    def stop(): GCProfilerResult = js.native
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
      * Write raw bytes into the serializer's internal buffer. The deserializer
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
    * Get statistics about code and its metadata in the heap, see
    * V8[`GetHeapCodeAndMetadataStatistics`](https://v8docs.nodesource.com/node-13.2/d5/dda/classv8_1_1_isolate.html#a6079122af17612ef54ef3348ce170866) API. Returns an object with the
    * following properties:
    *
    * ```js
    * {
    *   code_and_metadata_size: 212208,
    *   bytecode_and_metadata_size: 161368,
    *   external_script_source_size: 1410794,
    *   cpu_profiler_metadata_size: 0,
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
    * const v8 = require('node:v8');
    * const stream = v8.getHeapSnapshot();
    * stream.pipe(process.stdout);
    * ```
    * @since v11.13.0
    * @return A Readable containing the V8 heap snapshot.
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
    * `total_global_handles_size` The value of total\_global\_handles\_size is the
    * total memory size of V8 global handles.
    *
    * `used_global_handles_size` The value of used\_global\_handles\_size is the
    * used memory size of V8 global handles.
    *
    * `external_memory` The value of external\_memory is the memory size of array
    * buffers and external strings.
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
    *   number_of_detached_contexts: 0,
    *   total_global_handles_size: 8192,
    *   used_global_handles_size: 3296,
    *   external_memory: 318824
    * }
    * ```
    * @since v1.0.0
    */
  inline def getHeapStatistics(): HeapInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapStatistics")().asInstanceOf[HeapInfo]
  
  /**
    * The `promiseHooks` interface can be used to track promise lifecycle events.
    * @since v17.1.0, v16.14.0
    */
  @JSImport("v8", "promiseHooks")
  @js.native
  val promiseHooks: PromiseHooks_ = js.native
  
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
    * const v8 = require('node:v8');
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
    * const { writeHeapSnapshot } = require('node:v8');
    * const {
    *   Worker,
    *   isMainThread,
    *   parentPort,
    * } = require('node:worker_threads');
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
  
  /**
    * Called immediately after a promise continuation executes. This may be after a `then()`, `catch()`, or `finally()` handler or before an await after another await.
    * @since v17.1.0, v16.14.0
    */
  type After = js.Function1[/* promise */ js.Promise[Any], Unit]
  
  /**
    * Called before a promise continuation executes. This can be in the form of `then()`, `catch()`, or `finally()` handlers or an await resuming.
    *
    * The before callback will be called 0 to N times. The before callback will typically be called 0 times if no continuation was ever made for the promise.
    * The before callback may be called many times in the case where many continuations have been made from the same promise.
    * @since v17.1.0, v16.14.0
    */
  type Before = js.Function1[/* promise */ js.Promise[Any], Unit]
  
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
  
  trait GCProfilerResult extends StObject {
    
    var endTime: Double
    
    var startTime: Double
    
    var statistics: js.Array[AfterGC]
    
    var version: Double
  }
  object GCProfilerResult {
    
    inline def apply(endTime: Double, startTime: Double, statistics: js.Array[AfterGC], version: Double): GCProfilerResult = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[GCProfilerResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GCProfilerResult] (val x: Self) extends AnyVal {
      
      inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStatistics(value: js.Array[AfterGC]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
      
      inline def setStatisticsVarargs(value: AfterGC*): Self = StObject.set(x, "statistics", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeapCodeStatistics] (val x: Self) extends AnyVal {
      
      inline def setBytecode_and_metadata_size(value: Double): Self = StObject.set(x, "bytecode_and_metadata_size", value.asInstanceOf[js.Any])
      
      inline def setCode_and_metadata_size(value: Double): Self = StObject.set(x, "code_and_metadata_size", value.asInstanceOf[js.Any])
      
      inline def setExternal_script_source_size(value: Double): Self = StObject.set(x, "external_script_source_size", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapInfo extends StObject {
    
    var does_zap_garbage: DoesZapCodeSpaceFlag
    
    var external_memory: Double
    
    var heap_size_limit: Double
    
    var malloced_memory: Double
    
    var number_of_detached_contexts: Double
    
    var number_of_native_contexts: Double
    
    var peak_malloced_memory: Double
    
    var total_available_size: Double
    
    var total_global_handles_size: Double
    
    var total_heap_size: Double
    
    var total_heap_size_executable: Double
    
    var total_physical_size: Double
    
    var used_global_handles_size: Double
    
    var used_heap_size: Double
  }
  object HeapInfo {
    
    inline def apply(
      does_zap_garbage: DoesZapCodeSpaceFlag,
      external_memory: Double,
      heap_size_limit: Double,
      malloced_memory: Double,
      number_of_detached_contexts: Double,
      number_of_native_contexts: Double,
      peak_malloced_memory: Double,
      total_available_size: Double,
      total_global_handles_size: Double,
      total_heap_size: Double,
      total_heap_size_executable: Double,
      total_physical_size: Double,
      used_global_handles_size: Double,
      used_heap_size: Double
    ): HeapInfo = {
      val __obj = js.Dynamic.literal(does_zap_garbage = does_zap_garbage.asInstanceOf[js.Any], external_memory = external_memory.asInstanceOf[js.Any], heap_size_limit = heap_size_limit.asInstanceOf[js.Any], malloced_memory = malloced_memory.asInstanceOf[js.Any], number_of_detached_contexts = number_of_detached_contexts.asInstanceOf[js.Any], number_of_native_contexts = number_of_native_contexts.asInstanceOf[js.Any], peak_malloced_memory = peak_malloced_memory.asInstanceOf[js.Any], total_available_size = total_available_size.asInstanceOf[js.Any], total_global_handles_size = total_global_handles_size.asInstanceOf[js.Any], total_heap_size = total_heap_size.asInstanceOf[js.Any], total_heap_size_executable = total_heap_size_executable.asInstanceOf[js.Any], total_physical_size = total_physical_size.asInstanceOf[js.Any], used_global_handles_size = used_global_handles_size.asInstanceOf[js.Any], used_heap_size = used_heap_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeapInfo] (val x: Self) extends AnyVal {
      
      inline def setDoes_zap_garbage(value: DoesZapCodeSpaceFlag): Self = StObject.set(x, "does_zap_garbage", value.asInstanceOf[js.Any])
      
      inline def setExternal_memory(value: Double): Self = StObject.set(x, "external_memory", value.asInstanceOf[js.Any])
      
      inline def setHeap_size_limit(value: Double): Self = StObject.set(x, "heap_size_limit", value.asInstanceOf[js.Any])
      
      inline def setMalloced_memory(value: Double): Self = StObject.set(x, "malloced_memory", value.asInstanceOf[js.Any])
      
      inline def setNumber_of_detached_contexts(value: Double): Self = StObject.set(x, "number_of_detached_contexts", value.asInstanceOf[js.Any])
      
      inline def setNumber_of_native_contexts(value: Double): Self = StObject.set(x, "number_of_native_contexts", value.asInstanceOf[js.Any])
      
      inline def setPeak_malloced_memory(value: Double): Self = StObject.set(x, "peak_malloced_memory", value.asInstanceOf[js.Any])
      
      inline def setTotal_available_size(value: Double): Self = StObject.set(x, "total_available_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_global_handles_size(value: Double): Self = StObject.set(x, "total_global_handles_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_heap_size(value: Double): Self = StObject.set(x, "total_heap_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_heap_size_executable(value: Double): Self = StObject.set(x, "total_heap_size_executable", value.asInstanceOf[js.Any])
      
      inline def setTotal_physical_size(value: Double): Self = StObject.set(x, "total_physical_size", value.asInstanceOf[js.Any])
      
      inline def setUsed_global_handles_size(value: Double): Self = StObject.set(x, "used_global_handles_size", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeapSpaceInfo] (val x: Self) extends AnyVal {
      
      inline def setPhysical_space_size(value: Double): Self = StObject.set(x, "physical_space_size", value.asInstanceOf[js.Any])
      
      inline def setSpace_available_size(value: Double): Self = StObject.set(x, "space_available_size", value.asInstanceOf[js.Any])
      
      inline def setSpace_name(value: String): Self = StObject.set(x, "space_name", value.asInstanceOf[js.Any])
      
      inline def setSpace_size(value: Double): Self = StObject.set(x, "space_size", value.asInstanceOf[js.Any])
      
      inline def setSpace_used_size(value: Double): Self = StObject.set(x, "space_used_size", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapSpaceStatistics extends StObject {
    
    var physicalSpaceSize: Double
    
    var spaceAvailableSize: Double
    
    var spaceName: String
    
    var spaceSize: Double
    
    var spaceUsedSize: Double
  }
  object HeapSpaceStatistics {
    
    inline def apply(
      physicalSpaceSize: Double,
      spaceAvailableSize: Double,
      spaceName: String,
      spaceSize: Double,
      spaceUsedSize: Double
    ): HeapSpaceStatistics = {
      val __obj = js.Dynamic.literal(physicalSpaceSize = physicalSpaceSize.asInstanceOf[js.Any], spaceAvailableSize = spaceAvailableSize.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any], spaceSize = spaceSize.asInstanceOf[js.Any], spaceUsedSize = spaceUsedSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapSpaceStatistics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeapSpaceStatistics] (val x: Self) extends AnyVal {
      
      inline def setPhysicalSpaceSize(value: Double): Self = StObject.set(x, "physicalSpaceSize", value.asInstanceOf[js.Any])
      
      inline def setSpaceAvailableSize(value: Double): Self = StObject.set(x, "spaceAvailableSize", value.asInstanceOf[js.Any])
      
      inline def setSpaceName(value: String): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
      
      inline def setSpaceSize(value: Double): Self = StObject.set(x, "spaceSize", value.asInstanceOf[js.Any])
      
      inline def setSpaceUsedSize(value: Double): Self = StObject.set(x, "spaceUsedSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeapStatistics extends StObject {
    
    var externalMemory: Double
    
    var heapSizeLimit: Double
    
    var mallocedMemory: Double
    
    var peakMallocedMemory: Double
    
    var totalAvailableSize: Double
    
    var totalGlobalHandlesSize: Double
    
    var totalHeapSize: Double
    
    var totalHeapSizeExecutable: Double
    
    var totalPhysicalSize: Double
    
    var usedGlobalHandlesSize: Double
    
    var usedHeapSize: Double
  }
  object HeapStatistics {
    
    inline def apply(
      externalMemory: Double,
      heapSizeLimit: Double,
      mallocedMemory: Double,
      peakMallocedMemory: Double,
      totalAvailableSize: Double,
      totalGlobalHandlesSize: Double,
      totalHeapSize: Double,
      totalHeapSizeExecutable: Double,
      totalPhysicalSize: Double,
      usedGlobalHandlesSize: Double,
      usedHeapSize: Double
    ): HeapStatistics = {
      val __obj = js.Dynamic.literal(externalMemory = externalMemory.asInstanceOf[js.Any], heapSizeLimit = heapSizeLimit.asInstanceOf[js.Any], mallocedMemory = mallocedMemory.asInstanceOf[js.Any], peakMallocedMemory = peakMallocedMemory.asInstanceOf[js.Any], totalAvailableSize = totalAvailableSize.asInstanceOf[js.Any], totalGlobalHandlesSize = totalGlobalHandlesSize.asInstanceOf[js.Any], totalHeapSize = totalHeapSize.asInstanceOf[js.Any], totalHeapSizeExecutable = totalHeapSizeExecutable.asInstanceOf[js.Any], totalPhysicalSize = totalPhysicalSize.asInstanceOf[js.Any], usedGlobalHandlesSize = usedGlobalHandlesSize.asInstanceOf[js.Any], usedHeapSize = usedHeapSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapStatistics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeapStatistics] (val x: Self) extends AnyVal {
      
      inline def setExternalMemory(value: Double): Self = StObject.set(x, "externalMemory", value.asInstanceOf[js.Any])
      
      inline def setHeapSizeLimit(value: Double): Self = StObject.set(x, "heapSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setMallocedMemory(value: Double): Self = StObject.set(x, "mallocedMemory", value.asInstanceOf[js.Any])
      
      inline def setPeakMallocedMemory(value: Double): Self = StObject.set(x, "peakMallocedMemory", value.asInstanceOf[js.Any])
      
      inline def setTotalAvailableSize(value: Double): Self = StObject.set(x, "totalAvailableSize", value.asInstanceOf[js.Any])
      
      inline def setTotalGlobalHandlesSize(value: Double): Self = StObject.set(x, "totalGlobalHandlesSize", value.asInstanceOf[js.Any])
      
      inline def setTotalHeapSize(value: Double): Self = StObject.set(x, "totalHeapSize", value.asInstanceOf[js.Any])
      
      inline def setTotalHeapSizeExecutable(value: Double): Self = StObject.set(x, "totalHeapSizeExecutable", value.asInstanceOf[js.Any])
      
      inline def setTotalPhysicalSize(value: Double): Self = StObject.set(x, "totalPhysicalSize", value.asInstanceOf[js.Any])
      
      inline def setUsedGlobalHandlesSize(value: Double): Self = StObject.set(x, "usedGlobalHandlesSize", value.asInstanceOf[js.Any])
      
      inline def setUsedHeapSize(value: Double): Self = StObject.set(x, "usedHeapSize", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Key events in the lifetime of a promise have been categorized into four areas: creation of a promise, before/after a continuation handler is called or
    * around an await, and when the promise resolves or rejects.
    *
    * Because promises are asynchronous resources whose lifecycle is tracked via the promise hooks mechanism, the `init()`, `before()`, `after()`, and
    * `settled()` callbacks must not be async functions as they create more promises which would produce an infinite loop.
    * @since v17.1.0, v16.14.0
    */
  trait HookCallbacks extends StObject {
    
    var after: js.UndefOr[After] = js.undefined
    
    var before: js.UndefOr[Before] = js.undefined
    
    var init: js.UndefOr[Init] = js.undefined
    
    var settled: js.UndefOr[Settled] = js.undefined
  }
  object HookCallbacks {
    
    inline def apply(): HookCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HookCallbacks] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: /* promise */ js.Promise[Any] => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: /* promise */ js.Promise[Any] => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setInit(value: (/* promise */ js.Promise[Any], /* parent */ js.Promise[Any]) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setSettled(value: /* promise */ js.Promise[Any] => Unit): Self = StObject.set(x, "settled", js.Any.fromFunction1(value))
      
      inline def setSettledUndefined: Self = StObject.set(x, "settled", js.undefined)
    }
  }
  
  /**
    * Called when a promise is constructed. This does not mean that corresponding before/after events will occur, only that the possibility exists. This will
    * happen if a promise is created without ever getting a continuation.
    * @since v17.1.0, v16.14.0
    * @param promise The promise being created.
    * @param parent The promise continued from, if applicable.
    */
  type Init = js.Function2[/* promise */ js.Promise[Any], /* parent */ js.Promise[Any], Unit]
  
  trait PromiseHooks_ extends StObject {
    
    /**
      * Registers functions to be called for different lifetime events of each promise.
      * The callbacks `init()`/`before()`/`after()`/`settled()` are called for the respective events during a promise's lifetime.
      * All callbacks are optional. For example, if only promise creation needs to be tracked, then only the init callback needs to be passed.
      * The hook callbacks must be plain functions. Providing async functions will throw as it would produce an infinite microtask loop.
      * @since v17.1.0, v16.14.0
      * @param callbacks The {@link HookCallbacks | Hook Callbacks} to register
      * @return Used for disabling hooks
      */
    def createHook(callbacks: HookCallbacks): js.Function
    
    /**
      * The `after` hook must be a plain function. Providing an async function will throw as it would produce an infinite microtask loop.
      * @since v17.1.0, v16.14.0
      * @param after The {@link After | `after` callback} to call after a promise continuation executes.
      * @return Call to stop the hook.
      */
    def onAfter(after: After): js.Function
    
    /**
      * The `before` hook must be a plain function. Providing an async function will throw as it would produce an infinite microtask loop.
      * @since v17.1.0, v16.14.0
      * @param before The {@link Before | `before` callback} to call before a promise continuation executes.
      * @return Call to stop the hook.
      */
    def onBefore(before: Before): js.Function
    
    /**
      * The `init` hook must be a plain function. Providing an async function will throw as it would produce an infinite microtask loop.
      * @since v17.1.0, v16.14.0
      * @param init The {@link Init | `init` callback} to call when a promise is created.
      * @return Call to stop the hook.
      */
    def onInit(init: Init): js.Function
    
    /**
      * The `settled` hook must be a plain function. Providing an async function will throw as it would produce an infinite microtask loop.
      * @since v17.1.0, v16.14.0
      * @param settled The {@link Settled | `settled` callback} to call when a promise is created.
      * @return Call to stop the hook.
      */
    def onSettled(settled: Settled): js.Function
  }
  object PromiseHooks_ {
    
    inline def apply(
      createHook: HookCallbacks => js.Function,
      onAfter: After => js.Function,
      onBefore: Before => js.Function,
      onInit: Init => js.Function,
      onSettled: Settled => js.Function
    ): PromiseHooks_ = {
      val __obj = js.Dynamic.literal(createHook = js.Any.fromFunction1(createHook), onAfter = js.Any.fromFunction1(onAfter), onBefore = js.Any.fromFunction1(onBefore), onInit = js.Any.fromFunction1(onInit), onSettled = js.Any.fromFunction1(onSettled))
      __obj.asInstanceOf[PromiseHooks_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseHooks_] (val x: Self) extends AnyVal {
      
      inline def setCreateHook(value: HookCallbacks => js.Function): Self = StObject.set(x, "createHook", js.Any.fromFunction1(value))
      
      inline def setOnAfter(value: After => js.Function): Self = StObject.set(x, "onAfter", js.Any.fromFunction1(value))
      
      inline def setOnBefore(value: Before => js.Function): Self = StObject.set(x, "onBefore", js.Any.fromFunction1(value))
      
      inline def setOnInit(value: Init => js.Function): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      inline def setOnSettled(value: Settled => js.Function): Self = StObject.set(x, "onSettled", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Called when the promise receives a resolution or rejection value. This may occur synchronously in the case of {@link Promise.resolve()} or
    * {@link Promise.reject()}.
    * @since v17.1.0, v16.14.0
    */
  type Settled = js.Function1[/* promise */ js.Promise[Any], Unit]
}
