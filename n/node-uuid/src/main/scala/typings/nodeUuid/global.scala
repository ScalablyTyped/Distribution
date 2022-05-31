package typings.nodeUuid

import typings.node.Buffer
import typings.nodeUuid.mod.UUIDOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object uuid {
    
    @JSGlobal("uuid")
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
  }
}
