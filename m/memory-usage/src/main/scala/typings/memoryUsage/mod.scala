package typings.memoryUsage

import typings.node.NodeJS.ReadableStream
import typings.node.processMod.global.NodeJS.MemoryUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a readable stream that samples and emits memory usage over time.
    *
    * The stream emits samples in the form of JavaScript objects:
    *
    * ```
    * {
    *   rss: 4935680,       // Resident set size: Memory assigned to the process in bytes
    *   heapTotal: 1826816, // V8 heap memory allocated in bytes
    *   heapUsed: 650472,   // V8 heap memory used in bytes
    *   ts: 1479179912921,  // UNIX epoch timestamp for sample in milliseconds (only present if `options.ts` is `true`)
    *   gc: null            // Indicates if sample was taken after a garbage collection run (only present if `options.gc` is `true`)
    * }
    * ```
    *
    * @example
    * import * as fs from 'fs'
    * import csvWriter = require('csv-write-stream')
    * import memoryUsage = require('memory-usage')
    *
    * memoryUsage(2000)
    *   .pipe(csvWriter())
    *   .pipe(fs.createWriteStream('memory.csv'))
    */
  inline def apply(): ReadableStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadableStream]
  inline def apply(opts: Double): ReadableStream = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def apply(opts: Options): ReadableStream = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  @JSImport("memory-usage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type GCType = typings.gcProfiler.mod.GCType
  
  trait Options extends StObject {
    
    /**
      * The sampling frequency in milliseconds.
      *
      * @default 5000
      */
    var freq: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether garbage collection should be profiled and logged along with the memory samples.
      *
      * @default false
      */
    var gc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether a timestamp should be outputtet along with the memory samples.
      *
      * @default false
      */
    var ts: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
      
      inline def setGc(value: Boolean): Self = StObject.set(x, "gc", value.asInstanceOf[js.Any])
      
      inline def setGcUndefined: Self = StObject.set(x, "gc", js.undefined)
      
      inline def setTs(value: Boolean): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    }
  }
  
  trait Sample
    extends StObject
       with MemoryUsage {
    
    /**
      * Indicates if sample was taken after a garbage collection run (only present if `options.gc` is `true`).
      *
      * If the `gc` property is `null`, it means that the sample wasn't taken
      * after a garbage collection run. If the value is a string, it will
      * indicate the type of garbage collection run.
      *
      * Note that samples indicating a garbage collection run might be a few
      * hundred milliseconds delayed. This means that you might see a regular
      * timed sample appear prior in the stream with reduced memory usage, even
      * though there's no official indication of a garbage collection run yet.
      */
    var gc: js.UndefOr[GCType | Null] = js.undefined
    
    /**
      * UNIX epoch timestamp for sample in milliseconds (only present if `options.ts` is `true`).
      */
    var ts: js.UndefOr[Double] = js.undefined
  }
  object Sample {
    
    inline def apply(arrayBuffers: Double, external: Double, heapTotal: Double, heapUsed: Double, rss: Double): Sample = {
      val __obj = js.Dynamic.literal(arrayBuffers = arrayBuffers.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], heapTotal = heapTotal.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sample]
    }
    
    extension [Self <: Sample](x: Self) {
      
      inline def setGc(value: GCType): Self = StObject.set(x, "gc", value.asInstanceOf[js.Any])
      
      inline def setGcNull: Self = StObject.set(x, "gc", null)
      
      inline def setGcUndefined: Self = StObject.set(x, "gc", js.undefined)
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    }
  }
}
