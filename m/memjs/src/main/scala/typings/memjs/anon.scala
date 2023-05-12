package typings.memjs

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Extras extends StObject {
    
    var extras: Buffer
    
    var value: String | Buffer
  }
  object Extras {
    
    inline def apply(extras: Buffer, value: String | Buffer): Extras = {
      val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extras]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extras] (val x: Self) extends AnyVal {
      
      inline def setExtras(value: Buffer): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Flags[TOut] extends StObject {
    
    var flags: Buffer | Null
    
    var value: TOut
  }
  object Flags {
    
    inline def apply[TOut](value: TOut): Flags[TOut] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], flags = null)
      __obj.asInstanceOf[Flags[TOut]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flags[?], TOut] (val x: Self & Flags[TOut]) extends AnyVal {
      
      inline def setFlags(value: Buffer): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsNull: Self = StObject.set(x, "flags", null)
      
      inline def setValue(value: TOut): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<memjs.memjs.Header> */
  trait RequiredHeader extends StObject {
    
    var cas: Buffer
    
    var dataType: Double
    
    var extrasLength: Double
    
    var keyLength: Double
    
    var magic: Double
    
    var opaque: Double
    
    var opcode: Double
    
    var status: Double
    
    var totalBodyLength: Double
  }
  object RequiredHeader {
    
    inline def apply(
      cas: Buffer,
      dataType: Double,
      extrasLength: Double,
      keyLength: Double,
      magic: Double,
      opaque: Double,
      opcode: Double,
      status: Double,
      totalBodyLength: Double
    ): RequiredHeader = {
      val __obj = js.Dynamic.literal(cas = cas.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], extrasLength = extrasLength.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], magic = magic.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], opcode = opcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], totalBodyLength = totalBodyLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredHeader] (val x: Self) extends AnyVal {
      
      inline def setCas(value: Buffer): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: Double): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setExtrasLength(value: Double): Self = StObject.set(x, "extrasLength", value.asInstanceOf[js.Any])
      
      inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      inline def setMagic(value: Double): Self = StObject.set(x, "magic", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Double): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpcode(value: Double): Self = StObject.set(x, "opcode", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTotalBodyLength(value: Double): Self = StObject.set(x, "totalBodyLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait Success extends StObject {
    
    var success: Boolean
    
    var value: js.UndefOr[Double | Null] = js.undefined
  }
  object Success {
    
    inline def apply(success: Boolean): Success = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Success]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Value[TOut] extends StObject {
    
    var extras: Buffer
    
    var value: TOut
  }
  object Value {
    
    inline def apply[TOut](extras: Buffer, value: TOut): Value[TOut] = {
      val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[TOut]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?], TOut] (val x: Self & Value[TOut]) extends AnyVal {
      
      inline def setExtras(value: Buffer): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TOut): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
