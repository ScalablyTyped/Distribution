package typings.nodeUuid

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-uuid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(id: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def parse(id: String, buffer: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def parse(id: String, buffer: js.Array[Double], offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def parse(id: String, buffer: Unit, offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def parse(id: String, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def parse(id: String, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def parse_Buffer(id: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def parse_Buffer(id: String, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(id.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def unparse(buffer: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unparse(buffer: js.Array[Double], offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def unparse(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unparse(buffer: Buffer, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def v1(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")().asInstanceOf[String]
  inline def v1(options: Unit, buffer: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v1(options: Unit, buffer: js.Array[Double], offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v1(options: Unit, buffer: Unit, offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v1(options: Unit, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def v1(options: Unit, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def v1(options: UUIDOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v1(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v1(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v1(options: UUIDOptions, buffer: Unit, offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v1(options: UUIDOptions, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def v1(options: UUIDOptions, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def v1_Array(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")().asInstanceOf[js.Array[Double]]
  inline def v1_Array(options: UUIDOptions): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def v1_Buffer(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")().asInstanceOf[Buffer]
  inline def v1_Buffer(options: Unit, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def v1_Buffer(options: UUIDOptions): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def v1_Buffer(options: UUIDOptions, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def v4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[String]
  inline def v4(options: Unit, buffer: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v4(options: Unit, buffer: js.Array[Double], offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v4(options: Unit, buffer: Unit, offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v4(options: Unit, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def v4(options: Unit, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def v4(options: UUIDOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def v4(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v4(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v4(options: UUIDOptions, buffer: Unit, offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def v4(options: UUIDOptions, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def v4(options: UUIDOptions, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def v4_Array(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[js.Array[Double]]
  inline def v4_Array(options: UUIDOptions): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def v4_Buffer(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[Buffer]
  inline def v4_Buffer(options: Unit, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def v4_Buffer(options: UUIDOptions): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def v4_Buffer(options: UUIDOptions, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @js.native
  trait UUID extends StObject {
    
    def parse(id: String): js.Array[Double] = js.native
    def parse(id: String, buffer: js.Array[Double]): js.Array[Double] = js.native
    def parse(id: String, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def parse(id: String, buffer: Unit, offset: Double): js.Array[Double] = js.native
    
    def unparse(buffer: js.Array[Double]): String = js.native
    def unparse(buffer: js.Array[Double], offset: Double): String = js.native
    
    def v1(): String = js.native
    def v1(options: Unit, buffer: js.Array[Double]): js.Array[Double] = js.native
    def v1(options: Unit, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def v1(options: Unit, buffer: Unit, offset: Double): js.Array[Double] = js.native
    def v1(options: UUIDOptions): String = js.native
    def v1(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
    def v1(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def v1(options: UUIDOptions, buffer: Unit, offset: Double): js.Array[Double] = js.native
    @JSName("v1")
    def v1_Array(): js.Array[Double] = js.native
    @JSName("v1")
    def v1_Array(options: UUIDOptions): js.Array[Double] = js.native
    
    def v4(): String = js.native
    def v4(options: Unit, buffer: js.Array[Double]): js.Array[Double] = js.native
    def v4(options: Unit, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def v4(options: Unit, buffer: Unit, offset: Double): js.Array[Double] = js.native
    def v4(options: UUIDOptions): String = js.native
    def v4(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
    def v4(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def v4(options: UUIDOptions, buffer: Unit, offset: Double): js.Array[Double] = js.native
    @JSName("v4")
    def v4_Array(): js.Array[Double] = js.native
    @JSName("v4")
    def v4_Array(options: UUIDOptions): js.Array[Double] = js.native
  }
  
  trait UUIDOptions extends StObject {
    
    /**
      * (Number between 0 - 0x3fff) RFC clock sequence.
      * Default: An internally maintained clockseq is used.
      */
    var clockseq: js.UndefOr[Double] = js.undefined
    
    /**
      * (Number | Date) Time in milliseconds since unix Epoch.
      * Default: The current time is used.
      */
    var msecs: js.UndefOr[Double | js.Date] = js.undefined
    
    /**
      * Node id as Array of 6 bytes (per 4.1.6).
      * Default: Randomly generated ID. See note 1.
      */
    var node: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * (Number between 0-9999) additional time, in 100-nanosecond units. Ignored if msecs is unspecified.
      * Default: internal uuid counter is used, as per 4.2.1.2.
      */
    var nsecs: js.UndefOr[Double] = js.undefined
  }
  object UUIDOptions {
    
    inline def apply(): UUIDOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UUIDOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UUIDOptions] (val x: Self) extends AnyVal {
      
      inline def setClockseq(value: Double): Self = StObject.set(x, "clockseq", value.asInstanceOf[js.Any])
      
      inline def setClockseqUndefined: Self = StObject.set(x, "clockseq", js.undefined)
      
      inline def setMsecs(value: Double | js.Date): Self = StObject.set(x, "msecs", value.asInstanceOf[js.Any])
      
      inline def setMsecsUndefined: Self = StObject.set(x, "msecs", js.undefined)
      
      inline def setNode(value: js.Array[Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setNodeVarargs(value: Any*): Self = StObject.set(x, "node", js.Array(value*))
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setNsecsUndefined: Self = StObject.set(x, "nsecs", js.undefined)
    }
  }
}
